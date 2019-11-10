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

package com.sun.corba.se.spi.orb ;

import java.lang.reflect.Field ;

import java.util.Map ;
import java.util.Set ;
import java.util.Iterator ;
import java.util.Properties ;

import org.omg.PortableInterceptor.ORBInitializer ;

import com.sun.corba.se.pept.transport.Acceptor;

import com.sun.corba.se.spi.ior.iiop.GIOPVersion ;
import com.sun.corba.se.spi.transport.CorbaContactInfoListFactory;
import com.sun.corba.se.spi.transport.IORToSocketInfo;
import com.sun.corba.se.spi.transport.IIOPPrimaryToContactInfo;
import com.sun.corba.se.spi.transport.ReadTimeouts;

import com.sun.corba.se.impl.legacy.connection.USLPort;
import com.sun.corba.se.impl.encoding.CodeSetComponentInfo ;

public interface ORBData {
    String getORBInitialHost() ;

    int getORBInitialPort() ;

    String getORBServerHost() ;

    int getORBServerPort() ;

    String getListenOnAllInterfaces();

    com.sun.corba.se.spi.legacy.connection.ORBSocketFactory getLegacySocketFactory() ;

    com.sun.corba.se.spi.transport.ORBSocketFactory getSocketFactory();

    USLPort[] getUserSpecifiedListenPorts() ;

    IORToSocketInfo getIORToSocketInfo();

    IIOPPrimaryToContactInfo getIIOPPrimaryToContactInfo();

    String getORBId() ;

    boolean getORBServerIdPropertySpecified() ;

    boolean isLocalOptimizationAllowed() ;

    GIOPVersion getGIOPVersion() ;

    int getHighWaterMark() ;

    int getLowWaterMark() ;

    int getNumberToReclaim() ;

    int getGIOPFragmentSize() ;

    int getGIOPBufferSize() ;

    int getGIOPBuffMgrStrategy(GIOPVersion gv) ;

    /**
     * @return the GIOP Target Addressing preference of the ORB.
     * This ORB by default supports all addressing dispositions unless specified
     * otherwise via a java system property ORBConstants.GIOP_TARGET_ADDRESSING
     */
    short getGIOPTargetAddressPreference() ;

    short getGIOPAddressDisposition() ;

    boolean useByteOrderMarkers() ;

    boolean useByteOrderMarkersInEncapsulations() ;

    boolean alwaysSendCodeSetServiceContext() ;

    boolean getPersistentPortInitialized() ;

    int getPersistentServerPort();

    boolean getPersistentServerIdInitialized() ;

    /** Return the persistent-server-id of this server. This id is the same
     *  across multiple activations of this server. This is in contrast to
     *  com.sun.corba.se.impl.iiop.ORB.getTransientServerId() which
     *  returns a transient id that is guaranteed to be different
     *  across multiple activations of
     *  this server. The user/environment is required to supply the
     *  persistent-server-id every time this server is started, in
     *  the ORBServerId parameter, System properties, or other means.
     *  The user is also required to ensure that no two persistent servers
     *  on the same host have the same server-id.
     */
    int getPersistentServerId();

    boolean getServerIsORBActivated() ;

    Class getBadServerIdHandler();

    /**
    * Get the prefered code sets for connections. Should the client send the
    * code set service context on every request?
    */
    CodeSetComponentInfo getCodeSetComponentInfo() ;

    ORBInitializer[] getORBInitializers();

    StringPair[] getORBInitialReferences();

    String getORBDefaultInitialReference() ;

    String[] getORBDebugFlags();

    Acceptor[] getAcceptors();

    CorbaContactInfoListFactory getCorbaContactInfoListFactory();

    String acceptorSocketType();
    boolean acceptorSocketUseSelectThreadToWait();
    boolean acceptorSocketUseWorkerThreadForEvent();
    String connectionSocketType();
    boolean connectionSocketUseSelectThreadToWait();
    boolean connectionSocketUseWorkerThreadForEvent();

    ReadTimeouts getTransportTCPReadTimeouts();
    boolean disableDirectByteBufferUse() ;
    boolean isJavaSerializationEnabled();
    boolean useRepId();
}

// End of file.
