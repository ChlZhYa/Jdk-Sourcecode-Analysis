/*
 * Copyright (c) 2003, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.corba.se.pept.transport;

import java.util.Collection;

import com.sun.corba.se.pept.transport.Acceptor;
import com.sun.corba.se.pept.transport.ByteBufferPool;
import com.sun.corba.se.pept.transport.ConnectionCache;
import com.sun.corba.se.pept.transport.Selector;

/**
 * @author Harold Carr
 */
public interface TransportManager
{
    ByteBufferPool getByteBufferPool(int id);

    OutboundConnectionCache getOutboundConnectionCache(
            ContactInfo contactInfo);

    Collection getOutboundConnectionCaches();

    InboundConnectionCache getInboundConnectionCache(Acceptor acceptor);

    Collection getInboundConnectionCaches();

    Selector getSelector(int id);

    void registerAcceptor(Acceptor acceptor);

    Collection getAcceptors();

    void unregisterAcceptor(Acceptor acceptor);

    void close();
}

// End of file.
