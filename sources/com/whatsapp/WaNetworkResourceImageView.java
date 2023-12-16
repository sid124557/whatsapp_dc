package com.whatsapp;

import X.AnonymousClass5CF;
import X.AnonymousClass79W;
import X.C103695Nz;
import X.C162457s7;
import X.C378924l;
import X.C86624Kv;
import X.C86634Kw;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

public final class WaNetworkResourceImageView extends WaImageView {
    public Bitmap A00;
    public C103695Nz A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaNetworkResourceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A05();
        if (attributeSet != null && this.A00 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79W.A04);
            C162457s7.A0D(obtainStyledAttributes);
            String string = obtainStyledAttributes.getString(0);
            if (string == null || string.length() == 0) {
                this.A00 = null;
            } else {
                measure(0, 0);
                C103695Nz r3 = this.A01;
                if (r3 != null) {
                    r3.A00(this, string, getMeasuredWidth(), getMeasuredHeight(), true);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void A07(String str, boolean z) {
        String str2 = str;
        C162457s7.A0J(str, 0);
        measure(0, 0);
        C103695Nz r0 = this.A01;
        if (r0 != null) {
            r0.A00(this, str2, getMeasuredWidth(), getMeasuredHeight(), z);
        }
    }

    public void onDraw(Canvas canvas) {
        C162457s7.A0J(canvas, 0);
        Bitmap bitmap = this.A00;
        if (bitmap == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap A002 = AnonymousClass5CF.A00(bitmap, getWidth(), getHeight());
        this.A00 = A002;
        canvas.drawBitmap(A002, (float) ((getWidth() - A002.getWidth()) >> 1), (float) ((getHeight() - A002.getHeight()) >> 1), (Paint) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaNetworkResourceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ WaNetworkResourceImageView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaNetworkResourceImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
