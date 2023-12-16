package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass21X;
import X.AnonymousClass4GJ;
import X.AnonymousClass4O5;
import X.C06360Xi;
import X.C100905Cs;
import X.C116855qy;
import X.C143916zg;
import X.C150907Sr;
import X.C151137To;
import X.C159727mM;
import X.C167067zi;
import X.C181608n2;
import X.C18270x1;
import X.C18280x3;
import X.C86624Kv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class QrImageView extends View implements AnonymousClass4GJ {
    public static final Random A09 = new Random();
    public int A00;
    public Paint A01;
    public RectF A02;
    public Drawable A03;
    public C151137To A04;
    public C116855qy A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;

    public void setQrCode(C151137To r2) {
        setQrCode(r2, (C181608n2) null);
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0G);
            this.A08 = obtainStyledAttributes.getBoolean(1, true);
            this.A00 = obtainStyledAttributes.getInt(0, -16777216);
            this.A03 = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            try {
                this.A04 = C159727mM.A00(AnonymousClass21X.M, "This is a sample QR Code", (Map) null);
            } catch (C143916zg e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void A01(C181608n2 r4) {
        ArrayList arrayList = this.A06;
        if (arrayList == null || arrayList.isEmpty()) {
            C150907Sr r0 = this.A04.A04;
            int i = r0.A01 * r0.A00;
            ArrayList A0I = AnonymousClass002.A0I(i);
            this.A06 = A0I;
            for (int i2 = 0; i2 < i; i2++) {
                C18270x1.A1K(A0I, i2);
            }
        }
        AnonymousClass4O5 r2 = new AnonymousClass4O5(this);
        r2.setDuration(1200);
        r2.setInterpolator(new LinearInterpolator());
        if (r4 != null) {
            r2.setAnimationListener(new C167067zi(r4, this));
        }
        startAnimation(r2);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        C151137To r0 = this.A04;
        if (r0 != null) {
            C150907Sr r15 = r0.A04;
            int i = r15.A01;
            int i2 = r15.A00;
            RectF rectF = this.A02;
            float width = rectF.width() / ((float) i);
            float height = rectF.height() / ((float) i2);
            Paint paint = this.A01;
            paint.setColor(-1);
            float paddingLeft = (float) getPaddingLeft();
            float paddingTop = (float) getPaddingTop();
            Canvas canvas2 = canvas;
            Paint paint2 = paint;
            Canvas canvas3 = canvas2;
            float f = paddingLeft;
            canvas3.drawRect(f, paddingTop, (float) AnonymousClass001.A0I(this), (float) AnonymousClass001.A0H(this), paint2);
            paint.setColor(this.A00);
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (r15.A02[i4][i3] == 1) {
                        float f2 = rectF.left;
                        float f3 = (float) ((int) ((((float) i3) * width) + f2));
                        float f4 = rectF.top;
                        float f5 = f3;
                        canvas3.drawRect(f5, (float) ((int) ((((float) i4) * height) + f4)), f2 + (((float) (i3 + 1)) * width), f4 + (((float) (i4 + 1)) * height), paint2);
                    }
                }
            }
            paint.setColor(-1);
            if (this.A06 != null && !isInEditMode()) {
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    int A052 = C18280x3.A05(it);
                    int i5 = A052 % i;
                    int i6 = A052 / i;
                    float f6 = rectF.left;
                    float f7 = (float) ((int) ((((float) i5) * width) + f6));
                    float f8 = rectF.top;
                    float f9 = f7;
                    canvas3.drawRect(f9, (float) ((int) ((((float) i6) * height) + f8)), f6 + (((float) (i5 + 1)) * width), f8 + (((float) (i6 + 1)) * height), paint2);
                }
            }
            if (this.A03 != null) {
                ArrayList arrayList = this.A06;
                if (arrayList == null || arrayList.isEmpty() || isInEditMode()) {
                    this.A03.draw(canvas2);
                }
            }
        }
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C86624Kv.A1E(this);
        A00(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A08 && this.A04 != null) {
            A01((C181608n2) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A06 = null;
        clearAnimation();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            int r0 = r9.getMeasuredWidth()
            int r6 = X.AnonymousClass000.A06(r9, r0)
            int r0 = r9.getMeasuredHeight()
            int r5 = X.AnonymousClass000.A05(r9, r0)
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            if (r6 <= r5) goto L_0x005c
            int r0 = r6 - r5
            float r4 = (float) r0
            float r4 = r4 / r8
            r1 = r5
        L_0x001d:
            r0 = 0
        L_0x001e:
            android.graphics.RectF r3 = r9.A02
            float r2 = (float) r1
            r3.set(r7, r7, r2, r2)
            r3.offset(r4, r0)
            int r0 = r9.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r9.getPaddingTop()
            float r0 = (float) r0
            r3.offset(r1, r0)
            android.graphics.drawable.Drawable r0 = r9.A03
            if (r0 == 0) goto L_0x005b
            r0 = 1049414861(0x3e8ccccd, float:0.275)
            float r2 = r2 * r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r4 = (int) r2
            int r6 = r6 - r4
            float r0 = (float) r6
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r0 = (int) r0
            int r3 = X.C86664Kz.A0F(r9, r0)
            int r5 = r5 - r4
            float r0 = (float) r5
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r2 = (int) r0
            int r0 = r9.getPaddingTop()
            int r2 = r2 + r0
            int r1 = r3 + r4
            int r4 = r4 + r2
            android.graphics.drawable.Drawable r0 = r9.A03
            r0.setBounds(r3, r2, r1, r4)
        L_0x005b:
            return
        L_0x005c:
            if (r5 <= r6) goto L_0x0065
            int r0 = r5 - r6
            float r0 = (float) r0
            float r0 = r0 / r8
            r1 = r6
            r4 = 0
            goto L_0x001e
        L_0x0065:
            r1 = r6
            r4 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QrImageView.onMeasure(int, int):void");
    }

    public QrImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C86624Kv.A1E(this);
        A00(context, attributeSet);
    }

    public void setQrCode(C151137To r2, C181608n2 r3) {
        this.A04 = r2;
        if (this.A08 && C06360Xi.A04(this) && r2 != null) {
            A01(r3);
        } else if (r3 != null) {
            r3.BPW(this);
        }
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C86624Kv.A1E(this);
        A00(context, attributeSet);
    }

    public QrImageView(Context context) {
        super(context);
        C86624Kv.A1E(this);
        A00(context, (AttributeSet) null);
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
    }
}
