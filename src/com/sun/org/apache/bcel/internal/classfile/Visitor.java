/*
 * Copyright (c) 2007, 2019, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.sun.org.apache.bcel.internal.classfile;

/* ====================================================================
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 2001 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Apache" and "Apache Software Foundation" and
 *    "Apache BCEL" must not be used to endorse or promote products
 *    derived from this software without prior written permission. For
 *    written permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    "Apache BCEL", nor may "Apache" appear in their name, without
 *    prior written permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */

/**
 * Interface to make use of the Visitor pattern programming style.
 * I.e. a class that implements this interface can traverse the contents of
 * a Java class just by calling the `accept' method which all classes have.
 *
 * Implemented by wish of
 * <A HREF="http://www.inf.fu-berlin.de/~bokowski">Boris Bokowski</A>.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
public interface Visitor {
  void visitCode(Code obj);
  void visitCodeException(CodeException obj);
  void visitConstantClass(ConstantClass obj);
  void visitConstantDouble(ConstantDouble obj);
  void visitConstantFieldref(ConstantFieldref obj);
  void visitConstantFloat(ConstantFloat obj);
  void visitConstantInteger(ConstantInteger obj);
  void visitConstantInterfaceMethodref(ConstantInterfaceMethodref obj);
  void visitConstantLong(ConstantLong obj);
  void visitConstantMethodref(ConstantMethodref obj);
  void visitConstantNameAndType(ConstantNameAndType obj);
  void visitConstantPool(ConstantPool obj);
  void visitConstantString(ConstantString obj);
  void visitConstantUtf8(ConstantUtf8 obj);
  void visitConstantValue(ConstantValue obj);
  void visitDeprecated(Deprecated obj);
  void visitExceptionTable(ExceptionTable obj);
  void visitField(Field obj);
  void visitInnerClass(InnerClass obj);
  void visitInnerClasses(InnerClasses obj);
  void visitJavaClass(JavaClass obj);
  void visitLineNumber(LineNumber obj);
  void visitLineNumberTable(LineNumberTable obj);
  void visitLocalVariable(LocalVariable obj);
  void visitLocalVariableTable(LocalVariableTable obj);
  void visitLocalVariableTypeTable(LocalVariableTypeTable obj);
  void visitMethod(Method obj);
  void visitSignature(Signature obj);
  void visitSourceFile(SourceFile obj);
  void visitSynthetic(Synthetic obj);
  void visitUnknown(Unknown obj);
  void visitStackMap(StackMap obj);
  void visitStackMapEntry(StackMapEntry obj);
}
