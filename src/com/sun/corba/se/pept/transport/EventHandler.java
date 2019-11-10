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

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

/**
 * @author Harold Carr
 *
 * This should only be registered with ONE selector.
 */
public interface EventHandler
{
    void setUseSelectThreadToWait(boolean x);
    boolean shouldUseSelectThreadToWait();

    SelectableChannel getChannel();

    int getInterestOps();

    void setSelectionKey(SelectionKey selectionKey);
    SelectionKey getSelectionKey();

    void handleEvent();

    // NOTE: if there is more than one interest op this does not
    // allow discrimination between different ops and how threading
    // is handled.
    void setUseWorkerThreadForEvent(boolean x);
    boolean shouldUseWorkerThreadForEvent();

    void setWork(Work work);
    Work getWork();

    // REVISIT: need base class with two derived.
    Acceptor getAcceptor();
    Connection getConnection();

}

// End of file.
