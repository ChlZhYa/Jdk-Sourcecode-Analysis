/*
 * Copyright (c) 2000, 2004, Oracle and/or its affiliates. All rights reserved.
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

public interface SocketInfo
{
    // Endpoint types known in advance.
    // If you change the value of this constant then update
    // activation.idl accordingly.  It has a duplicate definition
    // to avoid a compilation dependency.

    String IIOP_CLEAR_TEXT = "IIOP_CLEAR_TEXT";


    String getType();

    String getHost();

    int    getPort();
}
