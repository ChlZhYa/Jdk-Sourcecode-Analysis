/*
 * Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.io;

/**
 * Constants written into the Object Serialization Stream.
 *
 * @author  unascribed
 * @since JDK 1.1
 */
public interface ObjectStreamConstants {

    /**
     * Magic number that is written to the stream header.
     */
    short STREAM_MAGIC = (short)0xaced;

    /**
     * Version number that is written to the stream header.
     */
    short STREAM_VERSION = 5;

    /* Each item in the stream is preceded by a tag
     */

    /**
     * First tag value.
     */
    byte TC_BASE = 0x70;

    /**
     * Null object reference.
     */
    byte TC_NULL =         (byte)0x70;

    /**
     * Reference to an object already written into the stream.
     */
    byte TC_REFERENCE =    (byte)0x71;

    /**
     * new Class Descriptor.
     */
    byte TC_CLASSDESC =    (byte)0x72;

    /**
     * new Object.
     */
    byte TC_OBJECT =       (byte)0x73;

    /**
     * new String.
     */
    byte TC_STRING =       (byte)0x74;

    /**
     * new Array.
     */
    byte TC_ARRAY =        (byte)0x75;

    /**
     * Reference to Class.
     */
    byte TC_CLASS =        (byte)0x76;

    /**
     * Block of optional data. Byte following tag indicates number
     * of bytes in this block data.
     */
    byte TC_BLOCKDATA =    (byte)0x77;

    /**
     * End of optional block data blocks for an object.
     */
    byte TC_ENDBLOCKDATA = (byte)0x78;

    /**
     * Reset stream context. All handles written into stream are reset.
     */
    byte TC_RESET =        (byte)0x79;

    /**
     * long Block data. The long following the tag indicates the
     * number of bytes in this block data.
     */
    byte TC_BLOCKDATALONG= (byte)0x7A;

    /**
     * Exception during write.
     */
    byte TC_EXCEPTION =    (byte)0x7B;

    /**
     * Long string.
     */
    byte TC_LONGSTRING =   (byte)0x7C;

    /**
     * new Proxy Class Descriptor.
     */
    byte TC_PROXYCLASSDESC =       (byte)0x7D;

    /**
     * new Enum constant.
     * @since 1.5
     */
    byte TC_ENUM =         (byte)0x7E;

    /**
     * Last tag value.
     */
    byte TC_MAX =          (byte)0x7E;

    /**
     * First wire handle to be assigned.
     */
    int baseWireHandle = 0x7e0000;


    /******************************************************/
    /* Bit masks for ObjectStreamClass flag.*/

    /**
     * Bit mask for ObjectStreamClass flag. Indicates a Serializable class
     * defines its own writeObject method.
     */
    byte SC_WRITE_METHOD = 0x01;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates Externalizable data
     * written in Block Data mode.
     * Added for PROTOCOL_VERSION_2.
     *
     * @see #PROTOCOL_VERSION_2
     * @since 1.2
     */
    byte SC_BLOCK_DATA = 0x08;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates class is Serializable.
     */
    byte SC_SERIALIZABLE = 0x02;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates class is Externalizable.
     */
    byte SC_EXTERNALIZABLE = 0x04;

    /**
     * Bit mask for ObjectStreamClass flag. Indicates class is an enum type.
     * @since 1.5
     */
    byte SC_ENUM = 0x10;


    /* *******************************************************************/
    /* Security permissions */

    /**
     * Enable substitution of one object for another during
     * serialization/deserialization.
     *
     * @see java.io.ObjectOutputStream#enableReplaceObject(boolean)
     * @see java.io.ObjectInputStream#enableResolveObject(boolean)
     * @since 1.2
     */
    SerializablePermission SUBSTITUTION_PERMISSION =
                           new SerializablePermission("enableSubstitution");

    /**
     * Enable overriding of readObject and writeObject.
     *
     * @see java.io.ObjectOutputStream#writeObjectOverride(Object)
     * @see java.io.ObjectInputStream#readObjectOverride()
     * @since 1.2
     */
    SerializablePermission SUBCLASS_IMPLEMENTATION_PERMISSION =
                    new SerializablePermission("enableSubclassImplementation");
   /**
    * A Stream Protocol Version. <p>
    *
    * All externalizable data is written in JDK 1.1 external data
    * format after calling this method. This version is needed to write
    * streams containing Externalizable data that can be read by
    * pre-JDK 1.1.6 JVMs.
    *
    * @see java.io.ObjectOutputStream#useProtocolVersion(int)
    * @since 1.2
    */
   int PROTOCOL_VERSION_1 = 1;


   /**
    * A Stream Protocol Version. <p>
    *
    * This protocol is written by JVM 1.2.
    *
    * Externalizable data is written in block data mode and is
    * terminated with TC_ENDBLOCKDATA. Externalizable class descriptor
    * flags has SC_BLOCK_DATA enabled. JVM 1.1.6 and greater can
    * read this format change.
    *
    * Enables writing a nonSerializable class descriptor into the
    * stream. The serialVersionUID of a nonSerializable class is
    * set to 0L.
    *
    * @see java.io.ObjectOutputStream#useProtocolVersion(int)
    * @see #SC_BLOCK_DATA
    * @since 1.2
    */
   int PROTOCOL_VERSION_2 = 2;
}
