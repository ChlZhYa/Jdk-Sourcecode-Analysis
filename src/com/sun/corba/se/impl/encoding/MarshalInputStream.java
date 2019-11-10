/*
 * Copyright (c) 1998, 2003, Oracle and/or its affiliates. All rights reserved.
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
package com.sun.corba.se.impl.encoding;

import org.omg.CORBA.TypeCode;
import org.omg.CORBA.Principal;
import org.omg.CORBA.Any;

public interface MarshalInputStream {

    boolean read_boolean();

    char read_char();

    char read_wchar();

    byte read_octet();

    short read_short();

    short read_ushort();

    int read_long();

    int read_ulong();

    long read_longlong();

    long read_ulonglong();

    float read_float();

    double read_double();

    String read_string();

    String read_wstring();

    void read_boolean_array(boolean[] value, int offset, int length);

    void read_char_array(char[] value, int offset, int length);

    void read_wchar_array(char[] value, int offset, int length);

    void read_octet_array(byte[] value, int offset, int length);

    void read_short_array(short[] value, int offset, int length);

    void read_ushort_array(short[] value, int offset, int length);

    void read_long_array(int[] value, int offset, int length);

    void read_ulong_array(int[] value, int offset, int length);

    void read_longlong_array(long[] value, int offset, int length);

    void read_ulonglong_array(long[] value, int offset, int length);

    void read_float_array(float[] value, int offset, int length);

    void read_double_array(double[] value, int offset, int length);

    org.omg.CORBA.Object read_Object();

    TypeCode read_TypeCode();

    Any read_any();

    Principal read_Principal();

    /*
     * The methods necessary to support RMI
     */
    org.omg.CORBA.Object read_Object(Class stubClass);

    java.io.Serializable read_value() throws Exception;

    /*
     * Additional Methods
     */
    void consumeEndian();

    // Determines the current byte stream position
    // (also handles fragmented streams)
    int getPosition();

    // mark/reset from java.io.InputStream
    void mark(int readAheadLimit);

    void reset();

    /**
     * This must be called once before unmarshaling valuetypes or anything
     * that uses repository IDs.  The ORB's version should be set
     * to the desired value prior to calling.
     */
    void performORBVersionSpecificInit();

    /**
     * Tells the input stream to null any code set converter
     * references, forcing it to reacquire them if it needs
     * converters again.  This is used when the server
     * input stream needs to switch the connection's char code set
     * converter to something different after reading the
     * code set service context for the first time.  Initially,
     * we use ISO8859-1 to read the operation name (it can't
     * be more than ASCII).
     */
    void resetCodeSetConverters();
}
