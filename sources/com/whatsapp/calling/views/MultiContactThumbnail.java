package com.whatsapp.calling.views;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.C100895Cr;
import X.C105365Uq;
import X.C111685iW;
import X.C116855qy;
import X.C184288rY;
import X.C620733j;
import X.C626936e;
import X.C86614Ku;
import X.C86644Kx;
import X.C86664Kz;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

public class MultiContactThumbnail extends ViewGroup implements AnonymousClass4GJ {
    public float A00;
    public int A01;
    public int A02;
    public Canvas A03;
    public Paint A04;
    public RectF A05;
    public C620733j A06;
    public C116855qy A07;
    public boolean A08;

    private void setNumImages(int i) {
        if (i == this.A01) {
            invalidate();
            return;
        }
        int childCount = getChildCount();
        int childCount2 = getChildCount();
        if (i <= childCount) {
            int i2 = childCount2 - i;
            int childCount3 = getChildCount();
            for (int i3 = 0; i3 < i2; i3++) {
                getChildAt((childCount3 - 1) - i3).setVisibility(8);
            }
        } else {
            int i4 = i - childCount2;
            for (int i5 = 0; i5 < i4; i5++) {
                ImageView A0H = C86614Ku.A0H(this);
                C86644Kx.A1A(A0H);
                addView(A0H);
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 0) {
                childAt.setVisibility(0);
            }
        }
        this.A01 = i;
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = this.A03;
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        super.draw(canvas2);
        RectF rectF = this.A05;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A04);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A07;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r0 <= 1) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
            r14 = this;
            int r0 = r14.A01
            r12 = 1
            if (r0 < r12) goto L_0x007f
            int r8 = r14.getPaddingLeft()
            int r11 = r14.getPaddingTop()
            int r0 = r14.getMeasuredWidth()
            int r7 = X.AnonymousClass4L0.A03(r14, r0)
            int r10 = r14.getMeasuredHeight()
            int r0 = r14.getPaddingBottom()
            int r10 = r10 - r0
            X.33j r0 = r14.A06
            boolean r13 = X.C102805Ki.A00(r0)
            int r7 = r7 - r8
            int r10 = r10 - r11
            int r9 = r7 / 2
            int r0 = r14.A02
            int r1 = r9 - r0
            int r6 = r10 / 2
            int r5 = r6 - r0
            int r9 = r9 + r8
            int r9 = r9 + r0
            int r6 = r6 + r11
            int r6 = r6 + r0
            int r0 = r14.A01
            if (r0 == r12) goto L_0x0039
            r7 = r1
        L_0x0039:
            r4 = 3
            r3 = r5
            if (r0 > r4) goto L_0x003e
            r3 = r10
        L_0x003e:
            if (r13 == 0) goto L_0x0043
            r2 = r9
            if (r0 > r12) goto L_0x0044
        L_0x0043:
            r2 = r8
        L_0x0044:
            android.view.View r1 = X.C86644Kx.A0G(r14)
            int r0 = r2 + r7
            int r3 = r3 + r11
            r1.layout(r2, r11, r0, r3)
            int r0 = r14.A01
            if (r0 == r12) goto L_0x007f
            r3 = r9
            if (r13 == 0) goto L_0x0056
            r3 = r8
        L_0x0056:
            r2 = 2
            if (r0 <= r2) goto L_0x005a
            r10 = r5
        L_0x005a:
            android.view.View r0 = r14.getChildAt(r12)
            int r1 = r3 + r7
            int r10 = r10 + r11
            r0.layout(r3, r11, r1, r10)
            int r0 = r14.A01
            if (r0 == r2) goto L_0x007f
            android.view.View r0 = r14.getChildAt(r2)
            int r5 = r5 + r6
            r0.layout(r3, r6, r1, r5)
            int r0 = r14.A01
            if (r0 == r4) goto L_0x007f
            if (r13 == 0) goto L_0x0077
            r8 = r9
        L_0x0077:
            android.view.View r0 = r14.getChildAt(r4)
            int r7 = r7 + r8
            r0.layout(r8, r6, r7, r5)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.MultiContactThumbnail.onLayout(boolean, int, int, int, int):void");
    }

    public MultiContactThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A08) {
            this.A08 = true;
            this.A06 = C88864av.A02((C111685iW) generatedComponent());
        }
        this.A00 = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C100895Cr.A04);
            this.A00 = obtainStyledAttributes.getDimension(1, this.A00);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, this.A02);
            obtainStyledAttributes.recycle();
        }
        int i2 = ((int) this.A00) * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        this.A03 = AnonymousClass4L0.A06(createBitmap);
        float f = (float) i2;
        this.A05 = new RectF(0.0f, 0.0f, f, f);
        this.A04 = C86664Kz.A0a(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A04.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        setWillNotDraw(false);
    }

    public void A00(C184288rY r6, C105365Uq r7, List list) {
        boolean z = true;
        if (list.size() < 1) {
            z = false;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Value %d out of bounds for numImages:");
        C626936e.A0D(z, AnonymousClass000.A0h(A0o, this.A01));
        int i = 4;
        if (list.size() <= 4) {
            i = list.size();
        }
        setNumImages(i);
        for (int i2 = 0; i2 < i; i2++) {
            r7.A05((ImageView) getChildAt(i2), r6, AnonymousClass4L0.A0L(list, i2), false);
        }
    }

    public MultiContactThumbnail(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiContactThumbnail(Context context) {
        this(context, (AttributeSet) null);
    }
}
