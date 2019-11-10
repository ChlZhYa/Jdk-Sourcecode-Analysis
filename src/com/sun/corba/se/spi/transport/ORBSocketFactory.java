/*
 * Copyright (c) 2004, Oracle and/or its affiliates. All rights reserved.
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

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.ServerSocket;

import com.sun.corba.se.pept.transport.Acceptor;
import com.sun.corba.se.spi.orb.ORB;

/**
 * @author Harold Carr
 */
public interface ORBSocketFactory
{
    void setORB(ORB orb);

    ServerSocket createServerSocket(String type,
            InetSocketAddress inetSocketAddress)
        throws IOException;

    Socket createSocket(String type,
            InetSocketAddress inetSocketAddress)
        throws IOException;

    void setAcceptedSocketOptions(Acceptor acceptor,
            ServerSocket serverSocket,
            Socket socket)
        throws SocketException;

}

// End of file.
