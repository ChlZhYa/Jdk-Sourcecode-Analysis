/*
 * Copyright (c) 2002, 2003, Oracle and/or its affiliates. All rights reserved.
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
import com.sun.corba.se.spi.ior.iiop.IIOPProfile;

import com.sun.corba.se.pept.transport.ContactInfo ;

/**
 * @author Harold Carr
 */
public interface CorbaContactInfo
    extends
        ContactInfo
{
    IOR getTargetIOR();
    IOR getEffectiveTargetIOR();
    IIOPProfile getEffectiveProfile(); // REVISIT - type
    void setAddressingDisposition(short addressingDisposition);
    short getAddressingDisposition();
    String getMonitoringName();
}

// End of file.
