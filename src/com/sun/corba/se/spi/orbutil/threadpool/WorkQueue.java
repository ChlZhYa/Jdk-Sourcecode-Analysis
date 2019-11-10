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

package com.sun.corba.se.spi.orbutil.threadpool;

public interface WorkQueue
{

    /**
    * This method is used to add work to the WorkQueue
    */
    void addWork(Work aWorkItem);

    /**
    * This method will return the name of the WorkQueue.
    */
    String getName();

    /**
    * Returns the total number of Work items added to the Queue.
    */
    long totalWorkItemsAdded();

    /**
    * Returns the total number of Work items in the Queue to be processed.
    */
    int workItemsInQueue();

    /**
    * Returns the average time a work item is waiting in the queue before
    * getting processed.
    */
    long averageTimeInQueue();

    /**
     * Set the ThreadPool instance servicing this WorkQueue
     */
    void setThreadPool(ThreadPool aThreadPool);

    /**
     * Get the ThreadPool instance servicing this WorkQueue
     */
    ThreadPool getThreadPool();
}

// End of file.
