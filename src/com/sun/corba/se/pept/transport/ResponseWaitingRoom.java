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

package com.sun.corba.se.pept.transport;

import com.sun.corba.se.pept.protocol.MessageMediator;
import com.sun.corba.se.pept.encoding.InputObject;

/**
 * @author Harold Carr
 */
public interface ResponseWaitingRoom
{
    void registerWaiter(MessageMediator messageMediator);

    // REVISIT: maybe return void (or MessageMediator).
    InputObject waitForResponse(MessageMediator messageMediator);

    void responseReceived(InputObject inputObject);

    void unregisterWaiter(MessageMediator messageMediator);

    int numberRegistered();
}

// End of file.
