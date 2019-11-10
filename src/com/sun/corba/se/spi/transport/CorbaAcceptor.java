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

import com.sun.corba.se.pept.transport.Acceptor;

import com.sun.corba.se.spi.ior.IORTemplate;

// REVISIT - impl/poa specific:
import com.sun.corba.se.impl.oa.poa.Policies;

/**
 * @author Harold Carr
 */
public interface CorbaAcceptor
    extends
        Acceptor
{
    String getObjectAdapterId();
    String getObjectAdapterManagerId();
    void addToIORTemplate(IORTemplate iorTemplate, Policies policies,
            String codebase);
    String getMonitoringName();
}

// End of file.
