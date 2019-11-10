/*
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
 * Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 */

package javax.xml.stream.events;
/**
 * An interface for the start document event
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
public interface StartDocument extends XMLEvent {

  /**
   * Returns the system ID of the XML data
   * @return the system ID, defaults to ""
   */
  String getSystemId();

  /**
   * Returns the encoding style of the XML data
   * @return the character encoding, defaults to "UTF-8"
   */
  String getCharacterEncodingScheme();

  /**
   * Returns true if CharacterEncodingScheme was set in
   * the encoding declaration of the document
   */
  boolean encodingSet();

  /**
   * Returns if this XML is standalone
   * @return the standalone state of XML, defaults to "no"
   */
  boolean isStandalone();

  /**
   * Returns true if the standalone attribute was set in
   * the encoding declaration of the document.
   */
  boolean standaloneSet();

  /**
   * Returns the version of XML of this XML stream
   * @return the version of XML, defaults to "1.0"
   */
  String getVersion();
}
