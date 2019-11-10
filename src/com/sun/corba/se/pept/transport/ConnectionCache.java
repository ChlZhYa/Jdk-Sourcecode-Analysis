/*
 * Copyright (c) 2001, 2010, Oracle and/or its affiliates. All rights reserved.
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
public interface ConnectionCache
{
    String getCacheType();

    void stampTime(Connection connection);

    long numberOfConnections();

    long numberOfIdleConnections();

    long numberOfBusyConnections();

    boolean reclaim();

    /** Close all connections in the connection cache.
     * This is used as a final cleanup, and will result
     * in abrupt termination of any pending communications.
     */
    void close();
}

// End of file.
