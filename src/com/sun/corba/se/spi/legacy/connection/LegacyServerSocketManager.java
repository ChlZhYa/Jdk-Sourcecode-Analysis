/*
 * Copyright (c) 1998, 2003, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.corba.se.spi.legacy.connection;

import java.util.Collection;

import com.sun.corba.se.spi.legacy.connection.LegacyServerSocketEndPointInfo;
import com.sun.corba.se.spi.transport.SocketOrChannelAcceptor;

/**
 * @author Harold Carr
 */
public interface LegacyServerSocketManager
{
    int legacyGetTransientServerPort(String type);
    int legacyGetPersistentServerPort(String socketType);
    int legacyGetTransientOrPersistentServerPort(String socketType);

    LegacyServerSocketEndPointInfo legacyGetEndpoint(String name);

    boolean legacyIsLocalServerPort(int port);
}

// End of file.
