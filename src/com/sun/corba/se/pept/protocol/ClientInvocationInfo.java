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

package com.sun.corba.se.pept.protocol;

import com.sun.corba.se.pept.protocol.MessageMediator;
import com.sun.corba.se.pept.protocol.ClientRequestDispatcher;
import java.util.Iterator;

/**
 * @author Harold Carr
 */
public interface ClientInvocationInfo
{
    Iterator getContactInfoListIterator();

    void setContactInfoListIterator(Iterator contactInfoListIterator);

    boolean isRetryInvocation();

    void setIsRetryInvocation(boolean isRetryInvocation);

    int getEntryCount();

    void incrementEntryCount();

    void decrementEntryCount();

    void setClientRequestDispatcher(ClientRequestDispatcher clientRequestDispatcher);

    ClientRequestDispatcher getClientRequestDispatcher();

    void setMessageMediator(MessageMediator messageMediator);

    MessageMediator getMessageMediator();
}

// End of file.
