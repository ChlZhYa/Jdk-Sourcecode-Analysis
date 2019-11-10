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

/**
 * @author Harold Carr
 */
public interface InboundConnectionCache
    extends ConnectionCache
{
    Connection get(Acceptor acceptor); // REVISIT

    void put(Acceptor acceptor, Connection connection);

    void remove(Connection connection);

    Acceptor getAcceptor();
}

// End of file.
