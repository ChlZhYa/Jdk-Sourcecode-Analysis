/*
 * Copyright (c) 2007, 2019, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
/*
 * Copyright 2000-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sun.org.apache.xerces.internal.xni;

/**
 * <p> This represents the basic physical description of the location of any
 * XML resource (a Schema grammar, a DTD, a general entity etc.) </p>
 *
 * @author Neil Graham, IBM
 */

public interface XMLResourceIdentifier {

    /** Sets the public identifier. */
    void setPublicId(String publicId);

    /** Returns the public identifier. */
    String getPublicId();

    /** Sets the expanded system identifier. */
    void setExpandedSystemId(String systemId);

    /** Returns the expanded system identifier. */
    String getExpandedSystemId();

    /** Sets the literal system identifier. */
    void setLiteralSystemId(String systemId);

    /** Returns the literal system identifier. */
    String getLiteralSystemId();

    /** Setsthe base URI against which the literal SystemId is to be
        resolved.*/
    void setBaseSystemId(String systemId);

    /** <p> Returns the base URI against which the literal SystemId is to be
        resolved. </p> */
    String getBaseSystemId();

    /** Sets the namespace of the resource. */
    void setNamespace(String namespace);

    /** Returns the namespace of the resource. */
    String getNamespace();

} // XMLResourceIdentifier
