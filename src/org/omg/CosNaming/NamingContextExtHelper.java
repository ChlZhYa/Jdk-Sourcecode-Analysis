package org.omg.CosNaming;


/**
* org/omg/CosNaming/NamingContextExtHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u231/13620/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Saturday, October 5, 2019 3:17:52 AM PDT
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
abstract public class NamingContextExtHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/NamingContextExt:1.0";

  public static void insert (org.omg.CORBA.Any a, org.omg.CosNaming.NamingContextExt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.omg.CosNaming.NamingContextExt extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.CosNaming.NamingContextExtHelper.id (), "NamingContextExt");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.omg.CosNaming.NamingContextExt read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NamingContextExtStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CosNaming.NamingContextExt value)
  {
    ostream.write_Object (value);
  }

  public static org.omg.CosNaming.NamingContextExt narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CosNaming.NamingContextExt)
      return (org.omg.CosNaming.NamingContextExt)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CosNaming._NamingContextExtStub stub = new org.omg.CosNaming._NamingContextExtStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.omg.CosNaming.NamingContextExt unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.omg.CosNaming.NamingContextExt)
      return (org.omg.CosNaming.NamingContextExt)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.omg.CosNaming._NamingContextExtStub stub = new org.omg.CosNaming._NamingContextExtStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
