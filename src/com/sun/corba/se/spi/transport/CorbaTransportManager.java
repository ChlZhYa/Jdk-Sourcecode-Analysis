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

package com.sun.corba.se.spi.transport;

import java.util.Collection;

import com.sun.corba.se.pept.transport.TransportManager;
import com.sun.corba.se.spi.ior.IORTemplate;
import com.sun.corba.se.spi.ior.ObjectAdapterId;

// REVISIT - impl/poa specific:
import com.sun.corba.se.impl.oa.poa.Policies;

/**
 * @author Harold Carr
 */
public interface CorbaTransportManager
    extends
        TransportManager
{
    String SOCKET_OR_CHANNEL_CONNECTION_CACHE =
        "SocketOrChannelConnectionCache";

    Collection getAcceptors(String objectAdapterManagerId,
            ObjectAdapterId objectAdapterId);

    // REVISIT - POA specific policies
    void addToIORTemplate(IORTemplate iorTemplate,
            Policies policies,
            String codebase,
            String objectAdapterManagerId,
            ObjectAdapterId objectAdapterId);
}

// End of file.
