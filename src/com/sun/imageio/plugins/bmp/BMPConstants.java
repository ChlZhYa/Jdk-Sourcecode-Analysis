/*
 * Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
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

package com.sun.imageio.plugins.bmp;

public interface BMPConstants {
    // bmp versions
    String VERSION_2 = "BMP v. 2.x";
    String VERSION_3 = "BMP v. 3.x";
    String VERSION_3_NT = "BMP v. 3.x NT";
    String VERSION_4 = "BMP v. 4.x";
    String VERSION_5 = "BMP v. 5.x";

    // Color space types
    int LCS_CALIBRATED_RGB = 0;
    int LCS_sRGB = 1;
    int LCS_WINDOWS_COLOR_SPACE = 2;
    int PROFILE_LINKED = 3;
    int PROFILE_EMBEDDED = 4;

    // Compression Types
    int BI_RGB = 0;
    int BI_RLE8 = 1;
    int BI_RLE4 = 2;
    int BI_BITFIELDS = 3;
    int BI_JPEG = 4;
    int BI_PNG = 5;
}
