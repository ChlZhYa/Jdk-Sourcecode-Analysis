package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/SYSTEM_EXCEPTION.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u231/13620/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Saturday, October 5, 2019 3:17:54 AM PDT
*/

public interface SYSTEM_EXCEPTION
{

  /**
     * Indicates a SystemException reply status. One possible value for 
     * <code>RequestInfo.reply_status</code>.
     * @see RequestInfo#reply_status
     * @see SUCCESSFUL
     * @see USER_EXCEPTION
     * @see LOCATION_FORWARD
     * @see TRANSPORT_RETRY
     */
  short value = (short)(1);
}
