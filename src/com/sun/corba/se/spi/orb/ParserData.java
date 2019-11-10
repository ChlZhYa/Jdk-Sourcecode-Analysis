/*
 * Copyright (c) 2002, Oracle and/or its affiliates. All rights reserved.
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

import java.util.Properties ;

public interface ParserData {
    String  getPropertyName() ;

    Operation getOperation() ;

    String getFieldName() ;

    Object getDefaultValue() ;

    Object getTestValue() ;

    void addToParser(PropertyParser parser) ;

    void addToProperties(Properties props) ;
}
