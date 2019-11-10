/*
 * Copyright (c) 2002, 2010, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.corba.se.spi.transport;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

import org.omg.CORBA.SystemException;

import com.sun.org.omg.SendingContext.CodeBase;

import com.sun.corba.se.pept.encoding.InputObject;
import com.sun.corba.se.pept.encoding.OutputObject;
import com.sun.corba.se.pept.protocol.MessageMediator;
import com.sun.corba.se.pept.transport.Connection;
import com.sun.corba.se.pept.transport.ResponseWaitingRoom;

import com.sun.corba.se.spi.ior.IOR ;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import com.sun.corba.se.spi.orb.ORB;
import com.sun.corba.se.spi.protocol.CorbaMessageMediator;

import com.sun.corba.se.impl.encoding.CodeSetComponentInfo;
import com.sun.corba.se.impl.logging.ORBUtilSystemException;

/**
 * @author Harold Carr
 */
public interface CorbaConnection
    extends
        Connection,
        com.sun.corba.se.spi.legacy.connection.Connection
{
    boolean shouldUseDirectByteBuffers();

    boolean shouldReadGiopHeaderOnly();

    ByteBuffer read(int size, int offset, int length, long max_wait_time)
        throws IOException;

    ByteBuffer read(ByteBuffer byteBuffer, int offset,
            int length, long max_wait_time) throws IOException;

    void write(ByteBuffer byteBuffer)
        throws IOException;

    void dprint(String msg);

    //
    // From iiop.Connection.java
    //

    int getNextRequestId();
    ORB getBroker();
    CodeSetComponentInfo.CodeSetContext getCodeSetContext();
    void setCodeSetContext(CodeSetComponentInfo.CodeSetContext csc);

    //
    // from iiop.IIOPConnection.java
    //

    // Facade to ResponseWaitingRoom.
    MessageMediator clientRequestMapGet(int requestId);

    void clientReply_1_1_Put(MessageMediator x);
    MessageMediator clientReply_1_1_Get();
    void clientReply_1_1_Remove();

    void serverRequest_1_1_Put(MessageMediator x);
    MessageMediator serverRequest_1_1_Get();
    void serverRequest_1_1_Remove();

    boolean isPostInitialContexts();

    // Can never be unset...
    void setPostInitialContexts();

    void purgeCalls(SystemException systemException,
            boolean die, boolean lockHeld);

    //
    // Connection status
    //
    int OPENING = 1;
    int ESTABLISHED = 2;
    int CLOSE_SENT = 3;
    int CLOSE_RECVD = 4;
    int ABORT = 5;

    // Begin Code Base methods ---------------------------------------
    //
    // Set this connection's code base IOR.  The IOR comes from the
    // SendingContext.  This is an optional service context, but all
    // JavaSoft ORBs send it.
    //
    // The set and get methods don't need to be synchronized since the
    // first possible get would occur during reading a valuetype, and
    // that would be after the set.

    // Sets this connection's code base IOR.  This is done after
    // getting the IOR out of the SendingContext service context.
    // Our ORBs always send this, but it's optional in CORBA.

    void setCodeBaseIOR(IOR ior);

    IOR getCodeBaseIOR();

    // Get a CodeBase stub to use in unmarshaling.  The CachedCodeBase
    // won't connect to the remote codebase unless it's necessary.
    CodeBase getCodeBase();

    // End Code Base methods -----------------------------------------

    void sendCloseConnection(GIOPVersion giopVersion)
        throws IOException;

    void sendMessageError(GIOPVersion giopVersion)
        throws IOException;

    void sendCancelRequest(GIOPVersion giopVersion, int requestId)
        throws
            IOException;

    void sendCancelRequestWithLock(GIOPVersion giopVersion,
            int requestId)
        throws
            IOException;

    ResponseWaitingRoom getResponseWaitingRoom();

    void serverRequestMapPut(int requestId,
            CorbaMessageMediator messageMediator);
    CorbaMessageMediator serverRequestMapGet(int requestId);
    void serverRequestMapRemove(int requestId);

    // REVISIT: WRONG: should not expose sockets here.
    SocketChannel getSocketChannel();

    // REVISIT - MessageMediator parameter?
    void serverRequestProcessingBegins();
    void serverRequestProcessingEnds();

    /** Clean up all connection resources.  Used when shutting down an ORB.
     */
    void closeConnectionResources();
}

// End of file.
