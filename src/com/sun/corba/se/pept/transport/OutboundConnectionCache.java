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
public interface OutboundConnectionCache
    extends ConnectionCache
{
    Connection get(ContactInfo contactInfo);

    void put(ContactInfo contactInfo, Connection connection);

    void remove(ContactInfo contactInfo);
}

// End of file.
