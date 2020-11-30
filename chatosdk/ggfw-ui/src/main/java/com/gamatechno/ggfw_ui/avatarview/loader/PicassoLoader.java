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

package com.gamatechno.ggfw_ui.avatarview.loader;

import androidx.annotation.NonNull;
import android.widget.ImageView;

import com.gamatechno.ggfw_ui.avatarview.AvatarPlaceholder;
import com.gamatechno.ggfw_ui.avatarview.ImageLoaderBase;
import com.gamatechno.ggfw_ui.avatarview.views.AvatarView;
import com.squareup.picasso.Picasso;

public class PicassoLoader extends ImageLoaderBase {

    public PicassoLoader() {
        super();
    }

    public PicassoLoader(String defaultPlaceholderString) {
        super(defaultPlaceholderString);
    }

    @Override
    public void loadImage(@NonNull AvatarView avatarView, @NonNull AvatarPlaceholder avatarPlaceholder, String avatarUrl) {
        Picasso.get()
                .load(avatarUrl)
                .placeholder(avatarPlaceholder)
                .fit()
                .into(avatarView);
    }

    @Override
    public void loadImage(@NonNull ImageView imageView, @NonNull AvatarPlaceholder avatarPlaceholder, String avatarUrl) {
        Picasso.get()
                .load(avatarUrl)
                .placeholder(avatarPlaceholder)
                .fit()
                .into(imageView);
    }
}
