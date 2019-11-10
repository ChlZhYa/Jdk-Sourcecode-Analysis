/*
 * Copyright (c) 2007, 2019, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.sun.org.apache.bcel.internal.generic;

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

import com.sun.org.apache.bcel.internal.Constants;

/**
 * This interface contains shareable instruction objects.
 *
 * In order to save memory you can use some instructions multiply,
 * since they have an immutable state and are directly derived from
 * Instruction.  I.e. they have no instance fields that could be
 * changed. Since some of these instructions like ICONST_0 occur
 * very frequently this can save a lot of time and space. This
 * feature is an adaptation of the FlyWeight design pattern, we
 * just use an array instead of a factory.
 *
 * The Instructions can also accessed directly under their names, so
 * it's possible to write il.append(Instruction.ICONST_0);
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
public interface InstructionConstants {
  /** Predefined instruction objects
   */
  Instruction           NOP          = new NOP();
  Instruction           ACONST_NULL  = new ACONST_NULL();
  Instruction           ICONST_M1    = new ICONST(-1);
  Instruction           ICONST_0     = new ICONST(0);
  Instruction           ICONST_1     = new ICONST(1);
  Instruction           ICONST_2     = new ICONST(2);
  Instruction           ICONST_3     = new ICONST(3);
  Instruction           ICONST_4     = new ICONST(4);
  Instruction           ICONST_5     = new ICONST(5);
  Instruction           LCONST_0     = new LCONST(0);
  Instruction           LCONST_1     = new LCONST(1);
  Instruction           FCONST_0     = new FCONST(0);
  Instruction           FCONST_1     = new FCONST(1);
  Instruction           FCONST_2     = new FCONST(2);
  Instruction           DCONST_0     = new DCONST(0);
  Instruction           DCONST_1     = new DCONST(1);
  ArrayInstruction      IALOAD       = new IALOAD();
  ArrayInstruction      LALOAD       = new LALOAD();
  ArrayInstruction      FALOAD       = new FALOAD();
  ArrayInstruction      DALOAD       = new DALOAD();
  ArrayInstruction      AALOAD       = new AALOAD();
  ArrayInstruction      BALOAD       = new BALOAD();
  ArrayInstruction      CALOAD       = new CALOAD();
  ArrayInstruction      SALOAD       = new SALOAD();
  ArrayInstruction      IASTORE      = new IASTORE();
  ArrayInstruction      LASTORE      = new LASTORE();
  ArrayInstruction      FASTORE      = new FASTORE();
  ArrayInstruction      DASTORE      = new DASTORE();
  ArrayInstruction      AASTORE      = new AASTORE();
  ArrayInstruction      BASTORE      = new BASTORE();
  ArrayInstruction      CASTORE      = new CASTORE();
  ArrayInstruction      SASTORE      = new SASTORE();
  StackInstruction      POP          = new POP();
  StackInstruction      POP2         = new POP2();
  StackInstruction      DUP          = new DUP();
  StackInstruction      DUP_X1       = new DUP_X1();
  StackInstruction      DUP_X2       = new DUP_X2();
  StackInstruction      DUP2         = new DUP2();
  StackInstruction      DUP2_X1      = new DUP2_X1();
  StackInstruction      DUP2_X2      = new DUP2_X2();
  StackInstruction      SWAP         = new SWAP();
  ArithmeticInstruction IADD         = new IADD();
  ArithmeticInstruction LADD         = new LADD();
  ArithmeticInstruction FADD         = new FADD();
  ArithmeticInstruction DADD         = new DADD();
  ArithmeticInstruction ISUB         = new ISUB();
  ArithmeticInstruction LSUB         = new LSUB();
  ArithmeticInstruction FSUB         = new FSUB();
  ArithmeticInstruction DSUB         = new DSUB();
  ArithmeticInstruction IMUL         = new IMUL();
  ArithmeticInstruction LMUL         = new LMUL();
  ArithmeticInstruction FMUL         = new FMUL();
  ArithmeticInstruction DMUL         = new DMUL();
  ArithmeticInstruction IDIV         = new IDIV();
  ArithmeticInstruction LDIV         = new LDIV();
  ArithmeticInstruction FDIV         = new FDIV();
  ArithmeticInstruction DDIV         = new DDIV();
  ArithmeticInstruction IREM         = new IREM();
  ArithmeticInstruction LREM         = new LREM();
  ArithmeticInstruction FREM         = new FREM();
  ArithmeticInstruction DREM         = new DREM();
  ArithmeticInstruction INEG         = new INEG();
  ArithmeticInstruction LNEG         = new LNEG();
  ArithmeticInstruction FNEG         = new FNEG();
  ArithmeticInstruction DNEG         = new DNEG();
  ArithmeticInstruction ISHL         = new ISHL();
  ArithmeticInstruction LSHL         = new LSHL();
  ArithmeticInstruction ISHR         = new ISHR();
  ArithmeticInstruction LSHR         = new LSHR();
  ArithmeticInstruction IUSHR        = new IUSHR();
  ArithmeticInstruction LUSHR        = new LUSHR();
  ArithmeticInstruction IAND         = new IAND();
  ArithmeticInstruction LAND         = new LAND();
  ArithmeticInstruction IOR          = new IOR();
  ArithmeticInstruction LOR          = new LOR();
  ArithmeticInstruction IXOR         = new IXOR();
  ArithmeticInstruction LXOR         = new LXOR();
  ConversionInstruction I2L          = new I2L();
  ConversionInstruction I2F          = new I2F();
  ConversionInstruction I2D          = new I2D();
  ConversionInstruction L2I          = new L2I();
  ConversionInstruction L2F          = new L2F();
  ConversionInstruction L2D          = new L2D();
  ConversionInstruction F2I          = new F2I();
  ConversionInstruction F2L          = new F2L();
  ConversionInstruction F2D          = new F2D();
  ConversionInstruction D2I          = new D2I();
  ConversionInstruction D2L          = new D2L();
  ConversionInstruction D2F          = new D2F();
  ConversionInstruction I2B          = new I2B();
  ConversionInstruction I2C          = new I2C();
  ConversionInstruction I2S          = new I2S();
  Instruction           LCMP         = new LCMP();
  Instruction           FCMPL        = new FCMPL();
  Instruction           FCMPG        = new FCMPG();
  Instruction           DCMPL        = new DCMPL();
  Instruction           DCMPG        = new DCMPG();
  ReturnInstruction     IRETURN      = new IRETURN();
  ReturnInstruction     LRETURN      = new LRETURN();
  ReturnInstruction     FRETURN      = new FRETURN();
  ReturnInstruction     DRETURN      = new DRETURN();
  ReturnInstruction     ARETURN      = new ARETURN();
  ReturnInstruction     RETURN       = new RETURN();
  Instruction           ARRAYLENGTH  = new ARRAYLENGTH();
  Instruction           ATHROW       = new ATHROW();
  Instruction           MONITORENTER = new MONITORENTER();
  Instruction           MONITOREXIT  = new MONITOREXIT();

  /** You can use these constants in multiple places safely, if you can guarantee
   * that you will never alter their internal values, e.g. call setIndex().
   */
  LocalVariableInstruction THIS    = new ALOAD(0);
  LocalVariableInstruction ALOAD_0 = THIS;
  LocalVariableInstruction ALOAD_1 = new ALOAD(1);
  LocalVariableInstruction ALOAD_2 = new ALOAD(2);
  LocalVariableInstruction ILOAD_0 = new ILOAD(0);
  LocalVariableInstruction ILOAD_1 = new ILOAD(1);
  LocalVariableInstruction ILOAD_2 = new ILOAD(2);
  LocalVariableInstruction ASTORE_0 = new ASTORE(0);
  LocalVariableInstruction ASTORE_1 = new ASTORE(1);
  LocalVariableInstruction ASTORE_2 = new ASTORE(2);
  LocalVariableInstruction ISTORE_0 = new ISTORE(0);
  LocalVariableInstruction ISTORE_1 = new ISTORE(1);
  LocalVariableInstruction ISTORE_2 = new ISTORE(2);


  /** Get object via its opcode, for immutable instructions like
   * branch instructions entries are set to null.
   */
  Instruction[] INSTRUCTIONS = new Instruction[256];

  /** Interfaces may have no static initializers, so we simulate this
   * with an inner class.
   */
  Clinit bla = new Clinit();

  class Clinit {
    Clinit() {
      INSTRUCTIONS[Constants.NOP] = NOP;
      INSTRUCTIONS[Constants.ACONST_NULL] = ACONST_NULL;
      INSTRUCTIONS[Constants.ICONST_M1] = ICONST_M1;
      INSTRUCTIONS[Constants.ICONST_0] = ICONST_0;
      INSTRUCTIONS[Constants.ICONST_1] = ICONST_1;
      INSTRUCTIONS[Constants.ICONST_2] = ICONST_2;
      INSTRUCTIONS[Constants.ICONST_3] = ICONST_3;
      INSTRUCTIONS[Constants.ICONST_4] = ICONST_4;
      INSTRUCTIONS[Constants.ICONST_5] = ICONST_5;
      INSTRUCTIONS[Constants.LCONST_0] = LCONST_0;
      INSTRUCTIONS[Constants.LCONST_1] = LCONST_1;
      INSTRUCTIONS[Constants.FCONST_0] = FCONST_0;
      INSTRUCTIONS[Constants.FCONST_1] = FCONST_1;
      INSTRUCTIONS[Constants.FCONST_2] = FCONST_2;
      INSTRUCTIONS[Constants.DCONST_0] = DCONST_0;
      INSTRUCTIONS[Constants.DCONST_1] = DCONST_1;
      INSTRUCTIONS[Constants.IALOAD] = IALOAD;
      INSTRUCTIONS[Constants.LALOAD] = LALOAD;
      INSTRUCTIONS[Constants.FALOAD] = FALOAD;
      INSTRUCTIONS[Constants.DALOAD] = DALOAD;
      INSTRUCTIONS[Constants.AALOAD] = AALOAD;
      INSTRUCTIONS[Constants.BALOAD] = BALOAD;
      INSTRUCTIONS[Constants.CALOAD] = CALOAD;
      INSTRUCTIONS[Constants.SALOAD] = SALOAD;
      INSTRUCTIONS[Constants.IASTORE] = IASTORE;
      INSTRUCTIONS[Constants.LASTORE] = LASTORE;
      INSTRUCTIONS[Constants.FASTORE] = FASTORE;
      INSTRUCTIONS[Constants.DASTORE] = DASTORE;
      INSTRUCTIONS[Constants.AASTORE] = AASTORE;
      INSTRUCTIONS[Constants.BASTORE] = BASTORE;
      INSTRUCTIONS[Constants.CASTORE] = CASTORE;
      INSTRUCTIONS[Constants.SASTORE] = SASTORE;
      INSTRUCTIONS[Constants.POP] = POP;
      INSTRUCTIONS[Constants.POP2] = POP2;
      INSTRUCTIONS[Constants.DUP] = DUP;
      INSTRUCTIONS[Constants.DUP_X1] = DUP_X1;
      INSTRUCTIONS[Constants.DUP_X2] = DUP_X2;
      INSTRUCTIONS[Constants.DUP2] = DUP2;
      INSTRUCTIONS[Constants.DUP2_X1] = DUP2_X1;
      INSTRUCTIONS[Constants.DUP2_X2] = DUP2_X2;
      INSTRUCTIONS[Constants.SWAP] = SWAP;
      INSTRUCTIONS[Constants.IADD] = IADD;
      INSTRUCTIONS[Constants.LADD] = LADD;
      INSTRUCTIONS[Constants.FADD] = FADD;
      INSTRUCTIONS[Constants.DADD] = DADD;
      INSTRUCTIONS[Constants.ISUB] = ISUB;
      INSTRUCTIONS[Constants.LSUB] = LSUB;
      INSTRUCTIONS[Constants.FSUB] = FSUB;
      INSTRUCTIONS[Constants.DSUB] = DSUB;
      INSTRUCTIONS[Constants.IMUL] = IMUL;
      INSTRUCTIONS[Constants.LMUL] = LMUL;
      INSTRUCTIONS[Constants.FMUL] = FMUL;
      INSTRUCTIONS[Constants.DMUL] = DMUL;
      INSTRUCTIONS[Constants.IDIV] = IDIV;
      INSTRUCTIONS[Constants.LDIV] = LDIV;
      INSTRUCTIONS[Constants.FDIV] = FDIV;
      INSTRUCTIONS[Constants.DDIV] = DDIV;
      INSTRUCTIONS[Constants.IREM] = IREM;
      INSTRUCTIONS[Constants.LREM] = LREM;
      INSTRUCTIONS[Constants.FREM] = FREM;
      INSTRUCTIONS[Constants.DREM] = DREM;
      INSTRUCTIONS[Constants.INEG] = INEG;
      INSTRUCTIONS[Constants.LNEG] = LNEG;
      INSTRUCTIONS[Constants.FNEG] = FNEG;
      INSTRUCTIONS[Constants.DNEG] = DNEG;
      INSTRUCTIONS[Constants.ISHL] = ISHL;
      INSTRUCTIONS[Constants.LSHL] = LSHL;
      INSTRUCTIONS[Constants.ISHR] = ISHR;
      INSTRUCTIONS[Constants.LSHR] = LSHR;
      INSTRUCTIONS[Constants.IUSHR] = IUSHR;
      INSTRUCTIONS[Constants.LUSHR] = LUSHR;
      INSTRUCTIONS[Constants.IAND] = IAND;
      INSTRUCTIONS[Constants.LAND] = LAND;
      INSTRUCTIONS[Constants.IOR] = IOR;
      INSTRUCTIONS[Constants.LOR] = LOR;
      INSTRUCTIONS[Constants.IXOR] = IXOR;
      INSTRUCTIONS[Constants.LXOR] = LXOR;
      INSTRUCTIONS[Constants.I2L] = I2L;
      INSTRUCTIONS[Constants.I2F] = I2F;
      INSTRUCTIONS[Constants.I2D] = I2D;
      INSTRUCTIONS[Constants.L2I] = L2I;
      INSTRUCTIONS[Constants.L2F] = L2F;
      INSTRUCTIONS[Constants.L2D] = L2D;
      INSTRUCTIONS[Constants.F2I] = F2I;
      INSTRUCTIONS[Constants.F2L] = F2L;
      INSTRUCTIONS[Constants.F2D] = F2D;
      INSTRUCTIONS[Constants.D2I] = D2I;
      INSTRUCTIONS[Constants.D2L] = D2L;
      INSTRUCTIONS[Constants.D2F] = D2F;
      INSTRUCTIONS[Constants.I2B] = I2B;
      INSTRUCTIONS[Constants.I2C] = I2C;
      INSTRUCTIONS[Constants.I2S] = I2S;
      INSTRUCTIONS[Constants.LCMP] = LCMP;
      INSTRUCTIONS[Constants.FCMPL] = FCMPL;
      INSTRUCTIONS[Constants.FCMPG] = FCMPG;
      INSTRUCTIONS[Constants.DCMPL] = DCMPL;
      INSTRUCTIONS[Constants.DCMPG] = DCMPG;
      INSTRUCTIONS[Constants.IRETURN] = IRETURN;
      INSTRUCTIONS[Constants.LRETURN] = LRETURN;
      INSTRUCTIONS[Constants.FRETURN] = FRETURN;
      INSTRUCTIONS[Constants.DRETURN] = DRETURN;
      INSTRUCTIONS[Constants.ARETURN] = ARETURN;
      INSTRUCTIONS[Constants.RETURN] = RETURN;
      INSTRUCTIONS[Constants.ARRAYLENGTH] = ARRAYLENGTH;
      INSTRUCTIONS[Constants.ATHROW] = ATHROW;
      INSTRUCTIONS[Constants.MONITORENTER] = MONITORENTER;
      INSTRUCTIONS[Constants.MONITOREXIT] = MONITOREXIT;
    }
  }
}
