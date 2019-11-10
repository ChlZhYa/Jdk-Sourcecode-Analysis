/*
 * Copyright (c) 2002, 2004, Oracle and/or its affiliates. All rights reserved.
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

import com.sun.corba.se.spi.ior.IOR ;

import com.sun.corba.se.spi.protocol.LocalClientRequestDispatcher ;

import com.sun.corba.se.pept.transport.ContactInfoList ;

/**
 * @author Harold Carr
 */
public interface CorbaContactInfoList
    extends
        ContactInfoList
{
    void setTargetIOR(IOR ior);
    IOR getTargetIOR();

    void setEffectiveTargetIOR(IOR locatedIor);
    IOR getEffectiveTargetIOR();

    LocalClientRequestDispatcher getLocalClientRequestDispatcher();

    int hashCode();
}

// End of file.
