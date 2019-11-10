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

package com.sun.corba.se.impl.naming.namingutil;

/**
 * INS URL is a generic interface for two different types of URL's specified
 * in INS spec.
 *
 * @Author Hemanth
 */
public interface INSURL {
    boolean getRIRFlag();

    // There can be one or more Endpoint's in the URL, so the return value is
    // a List
    java.util.List getEndpointInfo();

    String getKeyString();

    String getStringifiedName();

    // This method will return true only in CorbanameURL, It is provided because
    // corbaname: URL needs special handling.
    boolean isCorbanameURL();

    // A debug method, which is not required for normal operation
    void dPrint();
}
