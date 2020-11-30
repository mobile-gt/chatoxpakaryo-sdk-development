/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017. Shendy Aditya Syamsudin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.gamatechno.ggfw.easyphotopicker;

/**
 * Created by Jacek Kwiecień on 03.11.2015.
 */
public interface Constants {

    String DEFAULT_FOLDER_NAME = "GGImage";

    interface RequestCodes {
        int EASYIMAGE_IDENTIFICATOR = 0b1101101100; //876
        int VIDEOEASYIMAGE_IDENTIFICATOR = 0b11011011000; //876
        int SOURCE_CHOOSER = 1 << 14;

        int PICK_PICTURE_FROM_DOCUMENTS = EASYIMAGE_IDENTIFICATOR + (1 << 11);
        int PICK_PICTURE_FROM_GALLERY = EASYIMAGE_IDENTIFICATOR + (1 << 12);
        int TAKE_PICTURE = EASYIMAGE_IDENTIFICATOR + (1 << 13);
        int TAKE_VIDEO = VIDEOEASYIMAGE_IDENTIFICATOR + (1 << 13);
    }

    interface BundleKeys {
        String FOLDER_NAME = "com.gamatechno.folder_name";
        String ALLOW_MULTIPLE = "com.gamatechno.allow_multiple";
        String COPY_TAKEN_PHOTOS = "com.gamatechno.copy_taken_photos";
        String COPY_PICKED_IMAGES = "com.gamatechno.copy_picked_images";
    }
}
