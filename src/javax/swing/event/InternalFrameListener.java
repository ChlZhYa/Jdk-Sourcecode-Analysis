/*
 * Copyright (c) 1998, 2013, Oracle and/or its affiliates. All rights reserved.
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

package javax.swing.event;

import java.util.EventListener;

/**
 * The listener interface for receiving internal frame events.
 * This class is functionally equivalent to the WindowListener class
 * in the AWT.
 * <p>
 * See <a href="https://docs.oracle.com/javase/tutorial/uiswing/events/internalframelistener.html">How to Write an Internal Frame Listener</a>
 * in <em>The Java Tutorial</em> for further documentation.
 *
 * @see java.awt.event.WindowListener
 *
 * @author Thomas Ball
 */
public interface InternalFrameListener extends EventListener {
    /**
     * Invoked when a internal frame has been opened.
     * @see javax.swing.JInternalFrame#show
     */
    void internalFrameOpened(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is in the process of being closed.
     * The close operation can be overridden at this point.
     * @see javax.swing.JInternalFrame#setDefaultCloseOperation
     */
    void internalFrameClosing(InternalFrameEvent e);

    /**
     * Invoked when an internal frame has been closed.
     * @see javax.swing.JInternalFrame#setClosed
     */
    void internalFrameClosed(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is iconified.
     * @see javax.swing.JInternalFrame#setIcon
     */
    void internalFrameIconified(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is de-iconified.
     * @see javax.swing.JInternalFrame#setIcon
     */
    void internalFrameDeiconified(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is activated.
     * @see javax.swing.JInternalFrame#setSelected
     */
    void internalFrameActivated(InternalFrameEvent e);

    /**
     * Invoked when an internal frame is de-activated.
     * @see javax.swing.JInternalFrame#setSelected
     */
    void internalFrameDeactivated(InternalFrameEvent e);
}
