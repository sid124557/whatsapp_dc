package com.whatsapp;

import X.C186058ug;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;

public class WaMediaThumbnailView extends WaImageView {
    public Bitmap A00;
    public C186058ug A01;

    public C186058ug getMediaItem() {
        return this.A01;
    }

    public Bitmap getThumbnail() {
        return this.A00;
    }

    public void setThumbnail(Bitmap bitmap) {
        this.A00 = bitmap;
        setImageBitmap(bitmap);
    }

    public void setMediaItem(C186058ug r1) {
        this.A01 = r1;
    }

    public WaMediaThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaMediaThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaMediaThumbnailView(Context context) {
        super(context);
    }
}
