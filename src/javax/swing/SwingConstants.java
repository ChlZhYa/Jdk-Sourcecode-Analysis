/*
 * Copyright (c) 1997, 2000, Oracle and/or its affiliates. All rights reserved.
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
package javax.swing;


/**
 * A collection of constants generally used for positioning and orienting
 * components on the screen.
 *
 * @author Jeff Dinkins
 * @author Ralph Kar (orientation support)
 */
public interface SwingConstants {

        /**
         * The central position in an area. Used for
         * both compass-direction constants (NORTH, etc.)
         * and box-orientation constants (TOP, etc.).
         */
        int CENTER  = 0;

        //
        // Box-orientation constant used to specify locations in a box.
        //
        /**
         * Box-orientation constant used to specify the top of a box.
         */
        int TOP     = 1;
        /**
         * Box-orientation constant used to specify the left side of a box.
         */
        int LEFT    = 2;
        /**
         * Box-orientation constant used to specify the bottom of a box.
         */
        int BOTTOM  = 3;
        /**
         * Box-orientation constant used to specify the right side of a box.
         */
        int RIGHT   = 4;

        //
        // Compass-direction constants used to specify a position.
        //
        /**
         * Compass-direction North (up).
         */
        int NORTH      = 1;
        /**
         * Compass-direction north-east (upper right).
         */
        int NORTH_EAST = 2;
        /**
         * Compass-direction east (right).
         */
        int EAST       = 3;
        /**
         * Compass-direction south-east (lower right).
         */
        int SOUTH_EAST = 4;
        /**
         * Compass-direction south (down).
         */
        int SOUTH      = 5;
        /**
         * Compass-direction south-west (lower left).
         */
        int SOUTH_WEST = 6;
        /**
         * Compass-direction west (left).
         */
        int WEST       = 7;
        /**
         * Compass-direction north west (upper left).
         */
        int NORTH_WEST = 8;

        //
        // These constants specify a horizontal or
        // vertical orientation. For example, they are
        // used by scrollbars and sliders.
        //
        /** Horizontal orientation. Used for scrollbars and sliders. */
        int HORIZONTAL = 0;
        /** Vertical orientation. Used for scrollbars and sliders. */
        int VERTICAL   = 1;

        //
        // Constants for orientation support, since some languages are
        // left-to-right oriented and some are right-to-left oriented.
        // This orientation is currently used by buttons and labels.
        //
        /**
         * Identifies the leading edge of text for use with left-to-right
         * and right-to-left languages. Used by buttons and labels.
         */
        int LEADING  = 10;
        /**
         * Identifies the trailing edge of text for use with left-to-right
         * and right-to-left languages. Used by buttons and labels.
         */
        int TRAILING = 11;
        /**
         * Identifies the next direction in a sequence.
         *
         * @since 1.4
         */
        int NEXT = 12;

        /**
         * Identifies the previous direction in a sequence.
         *
         * @since 1.4
         */
        int PREVIOUS = 13;
}
