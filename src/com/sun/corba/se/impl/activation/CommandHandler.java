/*
 * Copyright (c) 1997, 2002, Oracle and/or its affiliates. All rights reserved.
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
package com.sun.corba.se.impl.activation;

import org.omg.CORBA.ORB;

import java.io.PrintStream;

/**
 * @author Rohit Garg
 * @since JDK1.2
 */

public interface CommandHandler {

    String getCommandName();

    boolean shortHelp = true;
    boolean longHelp = false;

    void printCommandHelp(PrintStream out, boolean helpType);

    boolean parseError = true;
    boolean commandDone = false;

    boolean processCommand(String[] cmd, ORB orb, PrintStream out);
}
