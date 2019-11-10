/*
 * Copyright (c) 2002, 2004, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.corba.se.spi.protocol;

import java.nio.ByteBuffer;

import org.omg.CORBA.INTERNAL;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ResponseHandler;
import org.omg.CORBA.portable.UnknownException;
import org.omg.CORBA_2_3.portable.InputStream;
import org.omg.CORBA_2_3.portable.OutputStream;

import com.sun.corba.se.pept.broker.Broker;
import com.sun.corba.se.pept.protocol.MessageMediator;
import com.sun.corba.se.pept.encoding.InputObject;
import com.sun.corba.se.pept.encoding.OutputObject;
import com.sun.corba.se.pept.protocol.ProtocolHandler;
import com.sun.corba.se.pept.transport.Connection;

import com.sun.corba.se.spi.ior.IOR;
import com.sun.corba.se.spi.ior.ObjectKey;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import com.sun.corba.se.spi.protocol.CorbaProtocolHandler;
import com.sun.corba.se.spi.servicecontext.ServiceContexts;

import com.sun.corba.se.impl.protocol.giopmsgheaders.LocateReplyMessage;
import com.sun.corba.se.impl.protocol.giopmsgheaders.LocateReplyOrReplyMessage;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.corba.se.impl.protocol.giopmsgheaders.MessageBase;
import com.sun.corba.se.impl.protocol.giopmsgheaders.MessageHandler;
import com.sun.corba.se.impl.protocol.giopmsgheaders.ReplyMessage;
import com.sun.corba.se.impl.protocol.giopmsgheaders.ReplyMessage_1_0;
import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;
import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage_1_0;

/**
 * @author Harold Carr
 */
public interface CorbaMessageMediator
    extends
        MessageMediator,
        ResponseHandler
{
    void setReplyHeader(LocateReplyOrReplyMessage header);
    LocateReplyMessage getLocateReplyHeader();
    ReplyMessage getReplyHeader();
    void setReplyExceptionDetailMessage(String message);
    RequestMessage getRequestHeader();
    GIOPVersion getGIOPVersion();
    byte getEncodingVersion();
    int getRequestId();
    Integer getRequestIdInteger();
    boolean isOneWay();
    short getAddrDisposition();
    String getOperationName();
    ServiceContexts getRequestServiceContexts();
    ServiceContexts getReplyServiceContexts();
    Message getDispatchHeader();
    void setDispatchHeader(Message msg);
    ByteBuffer getDispatchBuffer();
    void setDispatchBuffer(ByteBuffer byteBuffer);
    int getThreadPoolToUse();
    byte getStreamFormatVersion(); // REVIST name ForRequest?
    byte getStreamFormatVersionForReply();

    // REVISIT - not sure if the final fragment and DII stuff should
    // go here.

    void sendCancelRequestIfFinalFragmentNotSent();

    void setDIIInfo(org.omg.CORBA.Request request);
    boolean isDIIRequest();
    Exception unmarshalDIIUserException(String repoId,
            InputStream inputStream);
    void setDIIException(Exception exception);
    void handleDIIReply(InputStream inputStream);


    boolean isSystemExceptionReply();
    boolean isUserExceptionReply();
    boolean isLocationForwardReply();
    boolean isDifferentAddrDispositionRequestedReply();
    short getAddrDispositionReply();
    IOR getForwardedIOR();
    SystemException getSystemExceptionReply();

    ////////////////////////////////////////////////////
    //
    // Server side
    //

    ObjectKey getObjectKey();
    void setProtocolHandler(CorbaProtocolHandler protocolHandler);
    CorbaProtocolHandler getProtocolHandler();

    ////////////////////////////////////////////////////
    //
    // ResponseHandler
    //

    org.omg.CORBA.portable.OutputStream createReply();
    org.omg.CORBA.portable.OutputStream createExceptionReply();

    ////////////////////////////////////////////////////
    //
    // from core.ServerRequest
    //

    boolean executeReturnServantInResponseConstructor();

    void setExecuteReturnServantInResponseConstructor(boolean b);

    boolean executeRemoveThreadInfoInResponseConstructor();

    void setExecuteRemoveThreadInfoInResponseConstructor(boolean b);

    boolean executePIInResponseConstructor();

    void setExecutePIInResponseConstructor(boolean b);
}

// End of file.
