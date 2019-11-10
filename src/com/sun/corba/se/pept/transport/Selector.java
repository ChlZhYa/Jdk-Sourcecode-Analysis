/*
 * Copyright (c) 2003, 2004, Oracle and/or its affiliates. All rights reserved.
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
public interface Selector
{
    void setTimeout(long timeout);
    long getTimeout();
    void registerInterestOps(EventHandler eventHandler);
    void registerForEvent(EventHandler eventHander);
    void unregisterForEvent(EventHandler eventHandler);
    void close();
}

// End of file.
