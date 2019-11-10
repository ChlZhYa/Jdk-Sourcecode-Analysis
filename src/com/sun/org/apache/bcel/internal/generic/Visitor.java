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

/**
 * Interface implementing the Visitor pattern programming style.
 * I.e., a class that implements this interface can handle all types of
 * instructions with the properly typed methods just by calling the accept()
 * method.
 *
 * @author  <A HREF="mailto:markus.dahm@berlin.de">M. Dahm</A>
 */
public interface Visitor {
  void visitStackInstruction(StackInstruction obj);
  void visitLocalVariableInstruction(LocalVariableInstruction obj);
  void visitBranchInstruction(BranchInstruction obj);
  void visitLoadClass(LoadClass obj);
  void visitFieldInstruction(FieldInstruction obj);
  void visitIfInstruction(IfInstruction obj);
  void visitConversionInstruction(ConversionInstruction obj);
  void visitPopInstruction(PopInstruction obj);
  void visitStoreInstruction(StoreInstruction obj);
  void visitTypedInstruction(TypedInstruction obj);
  void visitSelect(Select obj);
  void visitJsrInstruction(JsrInstruction obj);
  void visitGotoInstruction(GotoInstruction obj);
  void visitUnconditionalBranch(UnconditionalBranch obj);
  void visitPushInstruction(PushInstruction obj);
  void visitArithmeticInstruction(ArithmeticInstruction obj);
  void visitCPInstruction(CPInstruction obj);
  void visitInvokeInstruction(InvokeInstruction obj);
  void visitArrayInstruction(ArrayInstruction obj);
  void visitAllocationInstruction(AllocationInstruction obj);
  void visitReturnInstruction(ReturnInstruction obj);
  void visitFieldOrMethod(FieldOrMethod obj);
  void visitConstantPushInstruction(ConstantPushInstruction obj);
  void visitExceptionThrower(ExceptionThrower obj);
  void visitLoadInstruction(LoadInstruction obj);
  void visitVariableLengthInstruction(VariableLengthInstruction obj);
  void visitStackProducer(StackProducer obj);
  void visitStackConsumer(StackConsumer obj);
  void visitACONST_NULL(ACONST_NULL obj);
  void visitGETSTATIC(GETSTATIC obj);
  void visitIF_ICMPLT(IF_ICMPLT obj);
  void visitMONITOREXIT(MONITOREXIT obj);
  void visitIFLT(IFLT obj);
  void visitLSTORE(LSTORE obj);
  void visitPOP2(POP2 obj);
  void visitBASTORE(BASTORE obj);
  void visitISTORE(ISTORE obj);
  void visitCHECKCAST(CHECKCAST obj);
  void visitFCMPG(FCMPG obj);
  void visitI2F(I2F obj);
  void visitATHROW(ATHROW obj);
  void visitDCMPL(DCMPL obj);
  void visitARRAYLENGTH(ARRAYLENGTH obj);
  void visitDUP(DUP obj);
  void visitINVOKESTATIC(INVOKESTATIC obj);
  void visitLCONST(LCONST obj);
  void visitDREM(DREM obj);
  void visitIFGE(IFGE obj);
  void visitCALOAD(CALOAD obj);
  void visitLASTORE(LASTORE obj);
  void visitI2D(I2D obj);
  void visitDADD(DADD obj);
  void visitINVOKESPECIAL(INVOKESPECIAL obj);
  void visitIAND(IAND obj);
  void visitPUTFIELD(PUTFIELD obj);
  void visitILOAD(ILOAD obj);
  void visitDLOAD(DLOAD obj);
  void visitDCONST(DCONST obj);
  void visitNEW(NEW obj);
  void visitIFNULL(IFNULL obj);
  void visitLSUB(LSUB obj);
  void visitL2I(L2I obj);
  void visitISHR(ISHR obj);
  void visitTABLESWITCH(TABLESWITCH obj);
  void visitIINC(IINC obj);
  void visitDRETURN(DRETURN obj);
  void visitFSTORE(FSTORE obj);
  void visitDASTORE(DASTORE obj);
  void visitIALOAD(IALOAD obj);
  void visitDDIV(DDIV obj);
  void visitIF_ICMPGE(IF_ICMPGE obj);
  void visitLAND(LAND obj);
  void visitIDIV(IDIV obj);
  void visitLOR(LOR obj);
  void visitCASTORE(CASTORE obj);
  void visitFREM(FREM obj);
  void visitLDC(LDC obj);
  void visitBIPUSH(BIPUSH obj);
  void visitDSTORE(DSTORE obj);
  void visitF2L(F2L obj);
  void visitFMUL(FMUL obj);
  void visitLLOAD(LLOAD obj);
  void visitJSR(JSR obj);
  void visitFSUB(FSUB obj);
  void visitSASTORE(SASTORE obj);
  void visitALOAD(ALOAD obj);
  void visitDUP2_X2(DUP2_X2 obj);
  void visitRETURN(RETURN obj);
  void visitDALOAD(DALOAD obj);
  void visitSIPUSH(SIPUSH obj);
  void visitDSUB(DSUB obj);
  void visitL2F(L2F obj);
  void visitIF_ICMPGT(IF_ICMPGT obj);
  void visitF2D(F2D obj);
  void visitI2L(I2L obj);
  void visitIF_ACMPNE(IF_ACMPNE obj);
  void visitPOP(POP obj);
  void visitI2S(I2S obj);
  void visitIFEQ(IFEQ obj);
  void visitSWAP(SWAP obj);
  void visitIOR(IOR obj);
  void visitIREM(IREM obj);
  void visitIASTORE(IASTORE obj);
  void visitNEWARRAY(NEWARRAY obj);
  void visitINVOKEINTERFACE(INVOKEINTERFACE obj);
  void visitINEG(INEG obj);
  void visitLCMP(LCMP obj);
  void visitJSR_W(JSR_W obj);
  void visitMULTIANEWARRAY(MULTIANEWARRAY obj);
  void visitDUP_X2(DUP_X2 obj);
  void visitSALOAD(SALOAD obj);
  void visitIFNONNULL(IFNONNULL obj);
  void visitDMUL(DMUL obj);
  void visitIFNE(IFNE obj);
  void visitIF_ICMPLE(IF_ICMPLE obj);
  void visitLDC2_W(LDC2_W obj);
  void visitGETFIELD(GETFIELD obj);
  void visitLADD(LADD obj);
  void visitNOP(NOP obj);
  void visitFALOAD(FALOAD obj);
  void visitINSTANCEOF(INSTANCEOF obj);
  void visitIFLE(IFLE obj);
  void visitLXOR(LXOR obj);
  void visitLRETURN(LRETURN obj);
  void visitFCONST(FCONST obj);
  void visitIUSHR(IUSHR obj);
  void visitBALOAD(BALOAD obj);
  void visitDUP2(DUP2 obj);
  void visitIF_ACMPEQ(IF_ACMPEQ obj);
  void visitIMPDEP1(IMPDEP1 obj);
  void visitMONITORENTER(MONITORENTER obj);
  void visitLSHL(LSHL obj);
  void visitDCMPG(DCMPG obj);
  void visitD2L(D2L obj);
  void visitIMPDEP2(IMPDEP2 obj);
  void visitL2D(L2D obj);
  void visitRET(RET obj);
  void visitIFGT(IFGT obj);
  void visitIXOR(IXOR obj);
  void visitINVOKEVIRTUAL(INVOKEVIRTUAL obj);
  void visitFASTORE(FASTORE obj);
  void visitIRETURN(IRETURN obj);
  void visitIF_ICMPNE(IF_ICMPNE obj);
  void visitFLOAD(FLOAD obj);
  void visitLDIV(LDIV obj);
  void visitPUTSTATIC(PUTSTATIC obj);
  void visitAALOAD(AALOAD obj);
  void visitD2I(D2I obj);
  void visitIF_ICMPEQ(IF_ICMPEQ obj);
  void visitAASTORE(AASTORE obj);
  void visitARETURN(ARETURN obj);
  void visitDUP2_X1(DUP2_X1 obj);
  void visitFNEG(FNEG obj);
  void visitGOTO_W(GOTO_W obj);
  void visitD2F(D2F obj);
  void visitGOTO(GOTO obj);
  void visitISUB(ISUB obj);
  void visitF2I(F2I obj);
  void visitDNEG(DNEG obj);
  void visitICONST(ICONST obj);
  void visitFDIV(FDIV obj);
  void visitI2B(I2B obj);
  void visitLNEG(LNEG obj);
  void visitLREM(LREM obj);
  void visitIMUL(IMUL obj);
  void visitIADD(IADD obj);
  void visitLSHR(LSHR obj);
  void visitLOOKUPSWITCH(LOOKUPSWITCH obj);
  void visitDUP_X1(DUP_X1 obj);
  void visitFCMPL(FCMPL obj);
  void visitI2C(I2C obj);
  void visitLMUL(LMUL obj);
  void visitLUSHR(LUSHR obj);
  void visitISHL(ISHL obj);
  void visitLALOAD(LALOAD obj);
  void visitASTORE(ASTORE obj);
  void visitANEWARRAY(ANEWARRAY obj);
  void visitFRETURN(FRETURN obj);
  void visitFADD(FADD obj);
  void visitBREAKPOINT(BREAKPOINT obj);
}
