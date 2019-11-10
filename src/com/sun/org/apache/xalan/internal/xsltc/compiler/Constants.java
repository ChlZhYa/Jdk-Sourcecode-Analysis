/*
 * Copyright (c) 2007, 2019, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * $Id: Constants.java,v 1.7 2006/06/19 19:49:04 spericas Exp $
 */

package com.sun.org.apache.xalan.internal.xsltc.compiler;

import com.sun.org.apache.bcel.internal.generic.InstructionConstants;

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 */
public interface Constants extends InstructionConstants {

    // Error categories used to report errors to Parser.reportError()

    // Unexpected internal errors, such as null-ptr exceptions, etc.
    // Immediately terminates compilation, no translet produced
    int INTERNAL        = 0;
    // XSLT elements that are not implemented and unsupported ext.
    // Immediately terminates compilation, no translet produced
    int UNSUPPORTED     = 1;
    // Fatal error in the stylesheet input (parsing or content)
    // Immediately terminates compilation, no translet produced
    int FATAL           = 2;
    // Other error in the stylesheet input (parsing or content)
    // Does not terminate compilation, no translet produced
    int ERROR           = 3;
    // Other error in the stylesheet input (content errors only)
    // Does not terminate compilation, a translet is produced
    int WARNING         = 4;

    String EMPTYSTRING = "";

    String NAMESPACE_FEATURE =
        "http://xml.org/sax/features/namespaces";

    String TRANSLET_INTF
        = "com.sun.org.apache.xalan.internal.xsltc.Translet";
    String TRANSLET_INTF_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/Translet;";

    String ATTRIBUTES_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/runtime/Attributes;";
    String NODE_ITERATOR_SIG
        = "Lcom/sun/org/apache/xml/internal/dtm/DTMAxisIterator;";
    String DOM_INTF_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/DOM;";
    String DOM_IMPL_CLASS
        = "com/sun/org/apache/xalan/internal/xsltc/DOM"; // xml/dtm/ref/DTMDefaultBaseIterators"; //xalan/xsltc/dom/DOMImpl";
        String SAX_IMPL_CLASS
        = "com/sun/org/apache/xalan/internal/xsltc/DOM/SAXImpl";
    String DOM_IMPL_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl;"; //xml/dtm/ref/DTMDefaultBaseIterators"; //xalan/xsltc/dom/DOMImpl;";
        String SAX_IMPL_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/SAXImpl;";
    String DOM_ADAPTER_CLASS
        = "com/sun/org/apache/xalan/internal/xsltc/dom/DOMAdapter";
    String DOM_ADAPTER_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/DOMAdapter;";
    String MULTI_DOM_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.dom.MultiDOM";
    String MULTI_DOM_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/MultiDOM;";

    String STRING
        = "java.lang.String";

    int ACC_PUBLIC
        = com.sun.org.apache.bcel.internal.Constants.ACC_PUBLIC;
    int ACC_SUPER
        = com.sun.org.apache.bcel.internal.Constants.ACC_SUPER;
    int ACC_FINAL
        = com.sun.org.apache.bcel.internal.Constants.ACC_FINAL;
    int ACC_PRIVATE
        = com.sun.org.apache.bcel.internal.Constants.ACC_PRIVATE;
    int ACC_PROTECTED
        = com.sun.org.apache.bcel.internal.Constants.ACC_PROTECTED;
    int ACC_STATIC
        = com.sun.org.apache.bcel.internal.Constants.ACC_STATIC;

    String STRING_SIG
        = "Ljava/lang/String;";
    String STRING_BUFFER_SIG
        = "Ljava/lang/StringBuffer;";
    String OBJECT_SIG
        = "Ljava/lang/Object;";
    String DOUBLE_SIG
        = "Ljava/lang/Double;";
    String INTEGER_SIG
        = "Ljava/lang/Integer;";
    String COLLATOR_CLASS
        = "java/text/Collator";
    String COLLATOR_SIG
        = "Ljava/text/Collator;";

    String NODE
        = "int";
    String NODE_ITERATOR
        = "com.sun.org.apache.xml.internal.dtm.DTMAxisIterator";
    String NODE_ITERATOR_BASE
        = "com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIteratorBase";
    String SORT_ITERATOR
        = "com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator";
    String SORT_ITERATOR_SIG
        = "Lcom.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;";
    String NODE_SORT_RECORD
        = "com.sun.org.apache.xalan.internal.xsltc.dom.NodeSortRecord";
    String NODE_SORT_FACTORY
        = "com/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecordFactory";
    String NODE_SORT_RECORD_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecord;";
    String NODE_SORT_FACTORY_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/NodeSortRecordFactory;";
    String LOCALE_CLASS
        = "java.util.Locale";
    String LOCALE_SIG
        = "Ljava/util/Locale;";
    String STRING_VALUE_HANDLER
        = "com.sun.org.apache.xalan.internal.xsltc.runtime.StringValueHandler";
    String STRING_VALUE_HANDLER_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/runtime/StringValueHandler;";
    String OUTPUT_HANDLER
        = "com/sun/org/apache/xml/internal/serializer/SerializationHandler";
    String OUTPUT_HANDLER_SIG
        = "Lcom/sun/org/apache/xml/internal/serializer/SerializationHandler;";
    String FILTER_INTERFACE
        = "com.sun.org.apache.xalan.internal.xsltc.dom.Filter";
    String FILTER_INTERFACE_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/Filter;";
    String UNION_ITERATOR_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.dom.UnionIterator";
    String STEP_ITERATOR_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.dom.StepIterator";
    String CACHED_NODE_LIST_ITERATOR_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.dom.CachedNodeListIterator";
    String NTH_ITERATOR_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.dom.NthIterator";
    String ABSOLUTE_ITERATOR
        = "com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator";
    String DUP_FILTERED_ITERATOR
        = "com.sun.org.apache.xalan.internal.xsltc.dom.DupFilterIterator";
    String CURRENT_NODE_LIST_ITERATOR
        = "com.sun.org.apache.xalan.internal.xsltc.dom.CurrentNodeListIterator";
    String CURRENT_NODE_LIST_FILTER
        = "com.sun.org.apache.xalan.internal.xsltc.dom.CurrentNodeListFilter";
    String CURRENT_NODE_LIST_ITERATOR_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListIterator;";
    String CURRENT_NODE_LIST_FILTER_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/CurrentNodeListFilter;";
    String FILTER_STEP_ITERATOR
        = "com.sun.org.apache.xalan.internal.xsltc.dom.FilteredStepIterator";
    String FILTER_ITERATOR
        = "com.sun.org.apache.xalan.internal.xsltc.dom.FilterIterator";
    String SINGLETON_ITERATOR
        = "com.sun.org.apache.xalan.internal.xsltc.dom.SingletonIterator";
    String MATCHING_ITERATOR
        = "com.sun.org.apache.xalan.internal.xsltc.dom.MatchingIterator";
    String NODE_SIG
        = "I";
    String GET_PARENT
        = "getParent";
    String GET_PARENT_SIG
        = "(" + NODE_SIG + ")" + NODE_SIG;
    String NEXT_SIG
        = "()" + NODE_SIG;
    String NEXT
        = "next";
        String NEXTID
        = "nextNodeID";
    String MAKE_NODE
        = "makeNode";
    String MAKE_NODE_LIST
        = "makeNodeList";
    String GET_UNPARSED_ENTITY_URI
        = "getUnparsedEntityURI";
    String STRING_TO_REAL
        = "stringToReal";
    String STRING_TO_REAL_SIG
        = "(" + STRING_SIG + ")D";
    String STRING_TO_INT
        = "stringToInt";
    String STRING_TO_INT_SIG
        = "(" + STRING_SIG + ")I";

    String XSLT_PACKAGE
        = "com.sun.org.apache.xalan.internal.xsltc";
    String COMPILER_PACKAGE
        = XSLT_PACKAGE + ".compiler";
    String RUNTIME_PACKAGE
        = XSLT_PACKAGE + ".runtime";
    String TRANSLET_CLASS
        = RUNTIME_PACKAGE + ".AbstractTranslet";

    String TRANSLET_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/runtime/AbstractTranslet;";
    String UNION_ITERATOR_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/UnionIterator;";
    String TRANSLET_OUTPUT_SIG
        = "Lcom/sun/org/apache/xml/internal/serializer/SerializationHandler;";
    String MAKE_NODE_SIG
        = "(I)Lorg/w3c/dom/Node;";
    String MAKE_NODE_SIG2
        = "(" + NODE_ITERATOR_SIG + ")Lorg/w3c/dom/Node;";
    String MAKE_NODE_LIST_SIG
        = "(I)Lorg/w3c/dom/NodeList;";
    String MAKE_NODE_LIST_SIG2
        = "(" + NODE_ITERATOR_SIG + ")Lorg/w3c/dom/NodeList;";

    String STREAM_XML_OUTPUT
    = "com.sun.org.apache.xml.internal.serializer.ToXMLStream";

    String OUTPUT_BASE
    = "com.sun.org.apache.xml.internal.serializer.SerializerBase";

    String LOAD_DOCUMENT_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.dom.LoadDocument";

    String KEY_INDEX_CLASS
        = "com/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex";
    String KEY_INDEX_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex;";

    String KEY_INDEX_ITERATOR_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/KeyIndex$KeyIndexIterator;";
    String DOM_INTF
        = "com.sun.org.apache.xalan.internal.xsltc.DOM";
    String DOM_IMPL
        = "com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl";
        String SAX_IMPL
        = "com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl";
    String STRING_CLASS
        = "java.lang.String";
    String OBJECT_CLASS
        = "java.lang.Object";
    String BOOLEAN_CLASS
        = "java.lang.Boolean";
    String STRING_BUFFER_CLASS
        = "java.lang.StringBuffer";
    String STRING_WRITER
        = "java.io.StringWriter";
    String WRITER_SIG
        = "Ljava/io/Writer;";

    String TRANSLET_OUTPUT_BASE
        = "com.sun.org.apache.xalan.internal.xsltc.TransletOutputBase";
    // output interface
    String TRANSLET_OUTPUT_INTERFACE
        = "com.sun.org.apache.xml.internal.serializer.SerializationHandler";
    String BASIS_LIBRARY_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary";
    String ATTRIBUTE_LIST_IMPL_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.runtime.AttributeListImpl";
    String DOUBLE_CLASS
        = "java.lang.Double";
    String INTEGER_CLASS
        = "java.lang.Integer";
    String RUNTIME_NODE_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.runtime.Node";
    String MATH_CLASS
        = "java.lang.Math";

    String BOOLEAN_VALUE
        = "booleanValue";
    String BOOLEAN_VALUE_SIG
        = "()Z";
    String INT_VALUE
        = "intValue";
    String INT_VALUE_SIG
        = "()I";
    String DOUBLE_VALUE
        = "doubleValue";
    String DOUBLE_VALUE_SIG
        = "()D";

    String DOM_PNAME
  = "dom";
    String NODE_PNAME
        = "node";
    String TRANSLET_OUTPUT_PNAME
        = "handler";
    String ITERATOR_PNAME
        = "iterator";
    String DOCUMENT_PNAME
        = "document";
    String TRANSLET_PNAME
        = "translet";

    String INVOKE_METHOD
        = "invokeMethod";
    String GET_NODE_NAME
        = "getNodeNameX";
    String CHARACTERSW
        = "characters";
    String GET_CHILDREN
        = "getChildren";
    String GET_TYPED_CHILDREN
        = "getTypedChildren";
    String CHARACTERS
        = "characters";
    String APPLY_TEMPLATES
        = "applyTemplates";
    String GET_NODE_TYPE
        = "getNodeType";
    String GET_NODE_VALUE
        = "getStringValueX";
    String GET_ELEMENT_VALUE
        = "getElementValue";
    String GET_ATTRIBUTE_VALUE
        = "getAttributeValue";
    String HAS_ATTRIBUTE
        = "hasAttribute";
    String ADD_ITERATOR
        = "addIterator";
    String SET_START_NODE
        = "setStartNode";
    String RESET
        = "reset";

    String ATTR_SET_SIG
        = "(" + DOM_INTF_SIG  + NODE_ITERATOR_SIG + TRANSLET_OUTPUT_SIG + "I)V";

    String GET_NODE_NAME_SIG
        = "(" + NODE_SIG + ")" + STRING_SIG;
    String CHARACTERSW_SIG
        = "("  + STRING_SIG + TRANSLET_OUTPUT_SIG + ")V";
    String CHARACTERS_SIG
        = "(" + NODE_SIG + TRANSLET_OUTPUT_SIG + ")V";
    String GET_CHILDREN_SIG
        = "(" + NODE_SIG +")" + NODE_ITERATOR_SIG;
    String GET_TYPED_CHILDREN_SIG
        = "(I)" + NODE_ITERATOR_SIG;
    String GET_NODE_TYPE_SIG
        = "()S";
    String GET_NODE_VALUE_SIG
        = "(I)" + STRING_SIG;
    String GET_ELEMENT_VALUE_SIG
        = "(I)" + STRING_SIG;
    String GET_ATTRIBUTE_VALUE_SIG
        = "(II)" + STRING_SIG;
    String HAS_ATTRIBUTE_SIG
        = "(II)Z";
    String GET_ITERATOR_SIG
        = "()" + NODE_ITERATOR_SIG;

    String NAMES_INDEX
        = "namesArray";
    String NAMES_INDEX_SIG
        = "[" + STRING_SIG;
    String URIS_INDEX
       = "urisArray";
    String URIS_INDEX_SIG
       = "[" + STRING_SIG;
    String TYPES_INDEX
       = "typesArray";
    String TYPES_INDEX_SIG
       = "[I";
    String NAMESPACE_INDEX
        = "namespaceArray";
    String NAMESPACE_INDEX_SIG
        = "[" + STRING_SIG;
    String HASIDCALL_INDEX
        = "_hasIdCall";
    String HASIDCALL_INDEX_SIG
        = "Z";
    String TRANSLET_VERSION_INDEX
        = "transletVersion";
    String TRANSLET_VERSION_INDEX_SIG
        = "I";

    String DOM_FIELD
        = "_dom";
    String STATIC_NAMES_ARRAY_FIELD
        = "_sNamesArray";
    String STATIC_URIS_ARRAY_FIELD
        = "_sUrisArray";
    String STATIC_TYPES_ARRAY_FIELD
        = "_sTypesArray";
    String STATIC_NAMESPACE_ARRAY_FIELD
        = "_sNamespaceArray";
    String STATIC_CHAR_DATA_FIELD
        = "_scharData";
    String STATIC_CHAR_DATA_FIELD_SIG
        = "[C";
    String FORMAT_SYMBOLS_FIELD
        = "format_symbols";

    String ITERATOR_FIELD_SIG
        = NODE_ITERATOR_SIG;
    String NODE_FIELD
        = "node";
    String NODE_FIELD_SIG
        = "I";

    String EMPTYATTR_FIELD
        = "EmptyAttributes";
    String ATTRIBUTE_LIST_FIELD
        = "attributeList";
    String CLEAR_ATTRIBUTES
        = "clear";
    String ADD_ATTRIBUTE
        = "addAttribute";
    String ATTRIBUTE_LIST_IMPL_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/runtime/AttributeListImpl;";
    String CLEAR_ATTRIBUTES_SIG
        = "()" + ATTRIBUTE_LIST_IMPL_SIG;
    String ADD_ATTRIBUTE_SIG
        = "(" + STRING_SIG + STRING_SIG + ")" + ATTRIBUTE_LIST_IMPL_SIG;

    String ADD_ITERATOR_SIG
        = "(" + NODE_ITERATOR_SIG +")" + UNION_ITERATOR_SIG;

    String ORDER_ITERATOR
        = "orderNodes";
    String ORDER_ITERATOR_SIG
        = "("+NODE_ITERATOR_SIG+"I)"+NODE_ITERATOR_SIG;

    String SET_START_NODE_SIG
        = "(" + NODE_SIG + ")" + NODE_ITERATOR_SIG;

    String NODE_COUNTER
        = "com.sun.org.apache.xalan.internal.xsltc.dom.NodeCounter";
    String NODE_COUNTER_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/NodeCounter;";
    String DEFAULT_NODE_COUNTER
        = "com.sun.org.apache.xalan.internal.xsltc.dom.DefaultNodeCounter";
    String DEFAULT_NODE_COUNTER_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/dom/DefaultNodeCounter;";
    String TRANSLET_FIELD
        = "translet";
    String TRANSLET_FIELD_SIG
        = TRANSLET_SIG;

    String RESET_SIG
        = "()" + NODE_ITERATOR_SIG;
    String GET_PARAMETER
        = "getParameter";
    String ADD_PARAMETER
        = "addParameter";
    String PUSH_PARAM_FRAME
        = "pushParamFrame";
    String PUSH_PARAM_FRAME_SIG
        = "()V";
    String POP_PARAM_FRAME
        = "popParamFrame";
    String POP_PARAM_FRAME_SIG
        = "()V";
    String GET_PARAMETER_SIG
        = "(" + STRING_SIG + ")" + OBJECT_SIG;
    String ADD_PARAMETER_SIG
        = "(" + STRING_SIG + OBJECT_SIG + "Z)" + OBJECT_SIG;

    String STRIP_SPACE
        = "stripSpace";
    String STRIP_SPACE_INTF
        = "com/sun/org/apache/xalan/internal/xsltc/StripFilter";
    String STRIP_SPACE_SIG
        = "Lcom/sun/org/apache/xalan/internal/xsltc/StripFilter;";
    String STRIP_SPACE_PARAMS
        = "(Lcom/sun/org/apache/xalan/internal/xsltc/DOM;II)Z";

    String GET_NODE_VALUE_ITERATOR
        = "getNodeValueIterator";
    String GET_NODE_VALUE_ITERATOR_SIG
        = "("+NODE_ITERATOR_SIG+"I"+STRING_SIG+"Z)"+NODE_ITERATOR_SIG;

    String GET_UNPARSED_ENTITY_URI_SIG
        = "("+STRING_SIG+")"+STRING_SIG;

    int POSITION_INDEX = 2;
    int LAST_INDEX     = 3;

    String XMLNS_PREFIX = "xmlns";
    String XMLNS_STRING = "xmlns:";
    String XMLNS_URI
        = "http://www.w3.org/2000/xmlns/";
    String XSLT_URI
        = "http://www.w3.org/1999/XSL/Transform";
    String XHTML_URI
        = "http://www.w3.org/1999/xhtml";
    String TRANSLET_URI
        = "http://xml.apache.org/xalan/xsltc";
    String REDIRECT_URI
        = "http://xml.apache.org/xalan/redirect";
    String FALLBACK_CLASS
        = "com.sun.org.apache.xalan.internal.xsltc.compiler.Fallback";

    int RTF_INITIAL_SIZE = 32;
}
