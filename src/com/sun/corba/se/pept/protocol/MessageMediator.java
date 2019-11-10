/*
 * Copyright (c) 2001, 2004, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.corba.se.pept.protocol;

import com.sun.corba.se.pept.broker.Broker;
import com.sun.corba.se.pept.encoding.InputObject;
import com.sun.corba.se.pept.encoding.OutputObject;
import com.sun.corba.se.pept.transport.Connection;
import com.sun.corba.se.pept.transport.ContactInfo;

import java.io.IOException;

/**
 * <code>MessageMediator</code> is a central repository for artifacts
 * associated with an individual message.
 *
 * @author Harold Carr
 */
public interface MessageMediator
{
    /**
     * The {@link com.sun.corba.se.pept.broker.Broker Broker} associated
     * with an invocation.
     *
     * @return {@link com.sun.corba.se.pept.broker.Broker Broker}
     */
    Broker getBroker();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * which created this <code>MessageMediator</code>.
     *
     * @return
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     */
    ContactInfo getContactInfo();

    /**
     * Get the
     * {@link com.sun.corba.se.pept.transport.Connection Connection}
     * on which this message is sent or received.
     */
    Connection getConnection();

    /**
     * Used to initialize message headers.
     *
     * Note: this should be moved to a <code>RequestDispatcher</code>.
     */
    void initializeMessage();

    /**
     * Used to send the message (or its last fragment).
     *
     * Note: this should be moved to a <code>RequestDispatcher</code>.
     */
    void finishSendingRequest();

    /**
     * Used to wait for a response for synchronous messages.
     *
     * @deprecated
     */
    @Deprecated
    InputObject waitForResponse();

    /**
     * Used to set the
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * used for the message.
     *
     * @param outputObject
     */
    void setOutputObject(OutputObject outputObject);

    /**
     * Used to get the
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     * used for the message.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.OutputObject OutputObject}
     */
    OutputObject getOutputObject();

    /**
     * Used to set the
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     * used for the message.
     *
     * @param inputObject
     */
    void setInputObject(InputObject inputObject);

    /**
     * Used to get the
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     * used for the message.
     *
     * @return
     * {@link com.sun.corba.se.pept.encoding.InputObject InputObject}
     */
    InputObject getInputObject();
}

// End of file.
