/*
 * Copyright (c) 2001, 2003, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.corba.se.pept.broker;

import com.sun.corba.se.pept.protocol.ClientInvocationInfo;
import com.sun.corba.se.pept.transport.TransportManager;

/**
 * @author Harold Carr
 */
public interface Broker
{
    ClientInvocationInfo createOrIncrementInvocationInfo();
    ClientInvocationInfo getInvocationInfo();
    void releaseOrDecrementInvocationInfo();

    TransportManager getTransportManager();
}

// End of file.
