/*
 * Copyright (c) 1997, 1998, Oracle and/or its affiliates. All rights reserved.
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
package javax.swing.text.rtf;

import javax.swing.text.AttributeSet;
import javax.swing.text.MutableAttributeSet;
import java.io.IOException;

/**
 * This interface describes a class which defines a 1-1 mapping between
 * an RTF keyword and a SwingText attribute.
 */
interface RTFAttribute
{
    int D_CHARACTER = 0;
    int D_PARAGRAPH = 1;
    int D_SECTION = 2;
    int D_DOCUMENT = 3;
    int D_META = 4;

    /* These next three should really be public variables,
       but you can't declare public variables in an interface... */
    /* int domain; */
    int domain();
    /* String swingName; */
    Object swingName();
    /* String rtfName; */
    String rtfName();

    boolean set(MutableAttributeSet target);
    boolean set(MutableAttributeSet target, int parameter);

    boolean setDefault(MutableAttributeSet target);

    /* TODO: This method is poorly thought out */
    boolean write(AttributeSet source,
            RTFGenerator target,
            boolean force)
        throws IOException;

    boolean writeValue(Object value,
            RTFGenerator target,
            boolean force)
        throws IOException;
}
