/*
 * Copyright (c) 1998, 2001, Oracle and/or its affiliates. All rights reserved.
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
/*
 * Licensed Materials - Property of IBM
 * RMI-IIOP v1.0
 * Copyright IBM Corp. 1998 1999  All Rights Reserved
 *
 */

package org.omg.CORBA;

/**
* The Helper for <tt>StringValue</tt>.  For more information on
* Helper files, see <a href="doc-files/generatedfiles.html#helper">
* "Generated Files: Helper Files"</a>.<P>
* org/omg/CORBA/StringValueHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from orb.idl
* 31 May 1999 22:27:30 o'clock GMT+00:00
*
* The class definition has been modified to conform to the following
* OMG specifications :
*   <ul>
*       <li> ORB core as defined by CORBA 2.3.1
*       (<a href="http://cgi.omg.org/cgi-bin/doc?formal/99-10-07">formal/99-10-07</a>)
*       </li>
*
*       <li> IDL/Java Language Mapping as defined in
*       <a href="http://cgi.omg.org/cgi-bin/doc?ptc/00-01-08">ptc/00-01-08</a>
*       </li>
*   </ul>
*/

public class StringValueHelper implements org.omg.CORBA.portable.BoxedValueHelper
{
    private static String  _id = "IDL:omg.org/CORBA/StringValue:1.0";

  private static StringValueHelper _instance = new StringValueHelper ();

    public static void insert (org.omg.CORBA.Any a, String that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static String extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    private static boolean __active = false;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
            {
                synchronized (org.omg.CORBA.TypeCode.class)
                    {
                        if (__typeCode == null)
                            {
                                if (__active)
                                    {
                                        return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
                                    }
                                __active = true;
                                __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
                                __typeCode = org.omg.CORBA.ORB.init ().create_value_box_tc (_id, "StringValue", __typeCode);
                                __active = false;
                            }
                    }
            }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static String read (org.omg.CORBA.portable.InputStream istream)
    {
    if (!(istream instanceof org.omg.CORBA_2_3.portable.InputStream)) {
      throw new org.omg.CORBA.BAD_PARAM(); }
    return (String) ((org.omg.CORBA_2_3.portable.InputStream) istream).read_value (_instance);
    }

  public java.io.Serializable read_value (org.omg.CORBA.portable.InputStream istream)
    {
    String tmp;
    tmp = istream.read_string ();
    return tmp;
    }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String value)
    {
    if (!(ostream instanceof org.omg.CORBA_2_3.portable.OutputStream)) {
      throw new org.omg.CORBA.BAD_PARAM(); }
    ((org.omg.CORBA_2_3.portable.OutputStream) ostream).write_value (value, _instance);
    }

    public void write_value (org.omg.CORBA.portable.OutputStream ostream, java.io.Serializable value)
    {
    if (!(value instanceof String)) {
      throw new org.omg.CORBA.MARSHAL(); }
    String valueType = (String) value;
    ostream.write_string (valueType);
    }

    public String get_id ()
    {
        return _id;
    }

}
