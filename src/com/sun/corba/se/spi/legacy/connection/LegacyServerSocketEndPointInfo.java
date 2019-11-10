/*
 * Copyright (c) 1998, 2004, Oracle and/or its affiliates. All rights reserved.
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

/**
 * LegacyServerSocketEndPointInfo is an abstraction of a port.
 */
public interface LegacyServerSocketEndPointInfo
{
    /**
     * e.g.: "CLEAR_TEXT", "SSL", ...
     */
    String getType();


    /**
     * Get the host name of this end point. Subcontracts must use this
     * instead of InetAddress.getHostName() because this would take
     * into account the value of the ORBServerHost property.
     */
    String getHostName();

    int getPort();

    /**
     * The ORBD's proxy port of this end point.
     * Note: Pre-ORT "port-exchange" model.
     */
    int getLocatorPort();
    void setLocatorPort(int port);

    // NAME is used while we still have a "port-exchange" ORBD
    // to get what used to be called "default" or "bootstrap" endpoints.

    String DEFAULT_ENDPOINT = "DEFAULT_ENDPOINT";
    String BOOT_NAMING = "BOOT_NAMING";
    String NO_NAME = "NO_NAME";

    String getName();
}

// End of file.
