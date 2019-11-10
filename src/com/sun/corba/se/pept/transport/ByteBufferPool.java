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

import java.nio.ByteBuffer;

/**
 * @author Charlie Hunt
 */
public interface ByteBufferPool
{
    ByteBuffer getByteBuffer(int theSize);
    void releaseByteBuffer(ByteBuffer thebb);
    int activeCount();
}

// End of file.
