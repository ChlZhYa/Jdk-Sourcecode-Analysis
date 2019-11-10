/*
 *
 * Copyright (c) 2007, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
// Copyright (c) 1995-96 by Cisco Systems, Inc.

package com.sun.jmx.snmp;

/**
 * Contains SNMP data type constants.
 * All members are static and can be used by any application.
 *
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */

public interface SnmpDataTypeEnums  {

  // ASN1 Type definitions.
  //-----------------------

  /**
   * ASN.1 tag for representing the boolean type.
   */
  int BooleanTag= 1;

  /**
   * ASN.1 tag for representing the integer type.
   */
  int IntegerTag= 2;

   /**
   * ASN.1 tag for representing the bit string type.
   */
   int BitStringTag= 2;

   /**
   * ASN.1 tag for representing the octet string type.
   */
   int OctetStringTag= 4;

   /**
   * ASN.1 tag for representing the null type.
   */
   int NullTag= 5;

   /**
   * ASN.1 tag for representing the Object Identifier type.
   */
   int ObjectIdentiferTag= 6;


 /**
  * Represents a unknown syntax type. No meaning in an ASN.1 context.
  */
 int  UnknownSyntaxTag     =  0xFF ;

 /**
  * ASN.1 tag for a <CODE>SEQUENCE</CODE> or <CODE>SEQUENCE OF</CODE>.
  */
 int  SequenceTag     =  0x30 ;

 /**
  * Represents an SNMP table. No meaning in an ASN.1 context.
  */
 int  TableTag     =  0xFE ;

  // SNMP definitions.
  //------------------

  /**
   * ASN.1 Tag for application context.
   */
  int ApplFlag = 64 ;

 /**
  * ASN.1 tag for implicit context.
  */
 int CtxtFlag = 128 ;

  /**
   * ASN.1 tag for representing an IP address as defined in RFC 1155.
   */
  int IpAddressTag  = ApplFlag | 0 ;

  /**
   * ASN.1 tag for representing a <CODE>Counter32</CODE> as defined in RFC 1155.
   */
  int CounterTag    = ApplFlag | 1 ;

  /**
   * ASN.1 tag for representing a <CODE>Gauge32</CODE> as defined in RFC 1155.
   */
  int GaugeTag      = ApplFlag | 2 ;

  /**
   * ASN.1 tag for representing a <CODE>Timeticks</CODE> as defined in RFC 1155.
   */
  int TimeticksTag  = ApplFlag | 3 ;

  /**
   * ASN.1 tag for representing an <CODE>Opaque</CODE> type as defined in RFC 1155.
   */
  int OpaqueTag     = ApplFlag | 4 ;

  /**
   * ASN.1 tag for representing a <CODE>Counter64</CODE> as defined in RFC 1155.
   */
  int Counter64Tag  = ApplFlag | 6 ;

  /**
   * ASN.1 tag for representing an <CODE>Nsap</CODE> as defined in RFC 1902.
   */
  int NsapTag       = ApplFlag | 5 ;

  /**
   * ASN.1 tag for representing an <CODE>Unsigned32</CODE> integer as defined in RFC 1902.
   */
  int UintegerTag      = ApplFlag | 7 ;

  /**
   * ASN.1 tag for representing a <CODE>NoSuchObject</CODE> as defined in RFC 1902.
   */
  int errNoSuchObjectTag    = CtxtFlag | 0 ;

   /**
   * ASN.1 tag for representing a <CODE>NoSuchInstance</CODE> as defined in RFC 1902.
   */
   int errNoSuchInstanceTag  = CtxtFlag | 1 ;

  /**
   * ASN.1 tag for representing an <CODE>EndOfMibView</CODE> as defined in RFC 1902.
   */
  int errEndOfMibViewTag    = CtxtFlag | 2 ;


}
