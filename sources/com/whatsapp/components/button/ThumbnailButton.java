package com.whatsapp.components.button;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C100905Cs;
import X.C124536Cw;
import X.C124966Eq;
import X.C181298mX;
import X.C86634Kw;
import X.C86664Kz;
import X.C89804ex;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class ThumbnailButton extends C89804ex {
    public float A00;
    public float A01;
    public float A02 = 0.0f;
    public int A03;
    public int A04 = 419430400;
    public Paint A05;
    public C181298mX A06;
    public boolean A07;
    public final Rect A08 = AnonymousClass001.A0N();
    public final RectF A09 = AnonymousClass002.A07();

    private void A04(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(new C124536Cw());
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0Q);
            this.A02 = obtainStyledAttributes.getDimension(4, this.A02);
            this.A00 = obtainStyledAttributes.getFloat(0, this.A00);
            this.A04 = obtainStyledAttributes.getInteger(5, this.A04);
            this.A01 = obtainStyledAttributes.getDimension(2, this.A01);
            this.A03 = obtainStyledAttributes.getInteger(1, this.A03);
            this.A07 = obtainStyledAttributes.getBoolean(3, this.A07);
            z = obtainStyledAttributes.getBoolean(6, false);
            obtainStyledAttributes.recycle();
        }
        Paint A0Z = C86664Kz.A0Z();
        this.A05 = A0Z;
        A0Z.setAntiAlias(true);
        this.A05.setDither(true);
        this.A05.setFilterBitmap(true);
        this.A05.setColor(-1);
        if (z) {
            setOutlineProvider(new C124966Eq());
        }
    }

    public void A07(Canvas canvas) {
        int i;
        if (this.A01 > 0.0f && (i = this.A03) != 0) {
            this.A05.setColor(i);
            this.A05.setStrokeWidth(this.A01);
            C86634Kw.A17(this.A05);
            C181298mX r1 = this.A06;
            if (r1 != null) {
                canvas.drawPath((Path) r1.apply(this.A09), this.A05);
                return;
            }
            float f = this.A02;
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            RectF rectF = this.A09;
            Paint paint = this.A05;
            if (i2 >= 0) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                canvas.drawOval(rectF, paint);
            }
        }
    }

    public float getBorderSize() {
        return this.A01;
    }

    public int getBorderSizeAdjustment() {
        return (int) ((this.A01 + 2.0f) / 2.0f);
    }

    public void onMeasure(int i, int i2) {
        if (this.A00 == 1.0f) {
            int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            setMeasuredDimension(defaultSize, defaultSize);
            return;
        }
        super.onMeasure(i, i2);
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a A[Catch:{ RuntimeException -> 0x018f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2 A[Catch:{ RuntimeException -> 0x018f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            int r1 = r10.getBorderSizeAdjustment()
            android.graphics.RectF r6 = r10.A09
            int r0 = r10.getPaddingLeft()
            int r0 = r0 + r1
            float r0 = (float) r0
            r6.left = r0
            int r0 = X.AnonymousClass001.A0I(r10)
            int r0 = r0 - r1
            float r0 = (float) r0
            r6.right = r0
            int r0 = r10.getPaddingTop()
            int r0 = r0 + r1
            float r0 = (float) r0
            r6.top = r0
            int r0 = X.AnonymousClass001.A0H(r10)
            int r0 = r0 - r1
            float r0 = (float) r0
            r6.bottom = r0
            boolean r0 = r10.A07
            if (r0 != 0) goto L_0x0196
            android.graphics.drawable.Drawable r0 = r10.getDrawable()
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0196
            float r1 = r10.A02
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0196
            android.graphics.drawable.Drawable r1 = r10.getDrawable()     // Catch:{ RuntimeException -> 0x018f }
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch:{ RuntimeException -> 0x018f }
            if (r1 == 0) goto L_0x0199
            android.graphics.Bitmap r0 = r1.getBitmap()     // Catch:{ RuntimeException -> 0x018f }
            if (r0 == 0) goto L_0x0199
            android.graphics.Bitmap r5 = r1.getBitmap()     // Catch:{ RuntimeException -> 0x018f }
            int r8 = r5.getWidth()     // Catch:{ RuntimeException -> 0x018f }
            int r7 = r5.getHeight()     // Catch:{ RuntimeException -> 0x018f }
            android.widget.ImageView$ScaleType r1 = r10.getScaleType()     // Catch:{ RuntimeException -> 0x018f }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ RuntimeException -> 0x018f }
            r9 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            if (r1 != r0) goto L_0x0110
            android.graphics.Rect r3 = r10.A08     // Catch:{ RuntimeException -> 0x018f }
            r3.set(r4, r4, r8, r7)     // Catch:{ RuntimeException -> 0x018f }
            float r8 = (float) r8     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r6.height()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r2 * r8
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r6.width()     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r0 * r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fa
            float r2 = r6.width()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r2 * r1
            float r2 = r2 / r8
            float r1 = r6.top     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r6.bottom     // Catch:{ RuntimeException -> 0x018f }
            float r1 = r1 + r0
            float r1 = r1 / r9
            float r0 = r2 / r9
            float r1 = r1 - r0
            r6.top = r1     // Catch:{ RuntimeException -> 0x018f }
        L_0x0084:
            float r1 = r1 + r2
            r6.bottom = r1     // Catch:{ RuntimeException -> 0x018f }
        L_0x0087:
            android.graphics.Paint r1 = r10.A05     // Catch:{ RuntimeException -> 0x018f }
            r0 = -1
            r1.setColor(r0)     // Catch:{ RuntimeException -> 0x018f }
            android.graphics.Paint r0 = r10.A05     // Catch:{ RuntimeException -> 0x018f }
            X.AnonymousClass001.A10(r0)     // Catch:{ RuntimeException -> 0x018f }
            X.8mX r0 = r10.A06     // Catch:{ RuntimeException -> 0x018f }
            r1 = 31
            r2 = 0
            r8 = 0
            if (r0 == 0) goto L_0x00c2
            int r4 = r11.saveLayer(r6, r2, r1)     // Catch:{ RuntimeException -> 0x018f }
            X.8mX r0 = r10.A06     // Catch:{ RuntimeException -> 0x018f }
            java.lang.Object r0 = r0.apply(r6)     // Catch:{ RuntimeException -> 0x018f }
            android.graphics.Path r0 = (android.graphics.Path) r0     // Catch:{ RuntimeException -> 0x018f }
            r11.clipPath(r0)     // Catch:{ RuntimeException -> 0x018f }
        L_0x00a9:
            android.graphics.Paint r0 = r10.A05     // Catch:{ RuntimeException -> 0x018f }
            r11.drawBitmap(r5, r3, r6, r0)     // Catch:{ RuntimeException -> 0x018f }
            X.8mX r0 = r10.A06     // Catch:{ RuntimeException -> 0x018f }
            if (r0 != 0) goto L_0x00b8
            float r0 = r10.A02     // Catch:{ RuntimeException -> 0x018f }
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0199
        L_0x00b8:
            android.graphics.Paint r0 = r10.A05     // Catch:{ RuntimeException -> 0x018f }
            r0.setXfermode(r2)     // Catch:{ RuntimeException -> 0x018f }
            r11.restoreToCount(r4)     // Catch:{ RuntimeException -> 0x018f }
            goto L_0x0199
        L_0x00c2:
            float r0 = r10.A02     // Catch:{ RuntimeException -> 0x018f }
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00a9
            int r7 = r11.saveLayer(r6, r2, r1)     // Catch:{ RuntimeException -> 0x018f }
            r11.drawARGB(r4, r4, r4, r4)     // Catch:{ RuntimeException -> 0x018f }
            float r1 = r10.A02     // Catch:{ RuntimeException -> 0x018f }
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00e2
            android.graphics.Paint r0 = r10.A05     // Catch:{ RuntimeException -> 0x018f }
            r11.drawRoundRect(r6, r1, r1, r0)     // Catch:{ RuntimeException -> 0x018f }
        L_0x00da:
            android.graphics.Paint r1 = r10.A05     // Catch:{ RuntimeException -> 0x018f }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ RuntimeException -> 0x018f }
            X.C86634Kw.A18(r1, r0)     // Catch:{ RuntimeException -> 0x018f }
            goto L_0x00f8
        L_0x00e2:
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00f2
            android.graphics.Path r1 = X.C107245ax.A03(r6)     // Catch:{ RuntimeException -> 0x018f }
            android.graphics.Paint r0 = r10.A05     // Catch:{ RuntimeException -> 0x018f }
            r11.drawPath(r1, r0)     // Catch:{ RuntimeException -> 0x018f }
            goto L_0x00da
        L_0x00f2:
            android.graphics.Paint r0 = r10.A05     // Catch:{ RuntimeException -> 0x018f }
            r11.drawOval(r6, r0)     // Catch:{ RuntimeException -> 0x018f }
            goto L_0x00da
        L_0x00f8:
            r4 = r7
            goto L_0x00a9
        L_0x00fa:
            float r2 = r6.height()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r2 * r8
            float r2 = r2 / r1
            float r1 = r6.left     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r6.right     // Catch:{ RuntimeException -> 0x018f }
            float r1 = r1 + r0
            float r1 = r1 / r9
            float r0 = r2 / r9
            float r1 = r1 - r0
            r6.left = r1     // Catch:{ RuntimeException -> 0x018f }
            float r1 = r1 + r2
            r6.right = r1     // Catch:{ RuntimeException -> 0x018f }
            goto L_0x0087
        L_0x0110:
            android.widget.ImageView$ScaleType r1 = r10.getScaleType()     // Catch:{ RuntimeException -> 0x018f }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ RuntimeException -> 0x018f }
            android.graphics.Rect r3 = r10.A08     // Catch:{ RuntimeException -> 0x018f }
            if (r1 != r0) goto L_0x0136
            r3.set(r4, r4, r8, r7)     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r6.centerX()     // Catch:{ RuntimeException -> 0x018f }
            float r1 = (float) r8     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r1 / r9
            float r2 = r2 - r0
            r6.left = r2     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r2 + r1
            r6.right = r2     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r6.centerY()     // Catch:{ RuntimeException -> 0x018f }
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r1 / r9
            float r2 = r2 - r0
            r6.top = r2     // Catch:{ RuntimeException -> 0x018f }
            goto L_0x0084
        L_0x0136:
            r3.set(r4, r4, r8, r7)     // Catch:{ RuntimeException -> 0x018f }
            float r2 = (float) r8     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r6.height()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r2 * r0
            float r1 = (float) r7     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r6.width()     // Catch:{ RuntimeException -> 0x018f }
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x016c
            int r0 = r3.height()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = (float) r0     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r6.width()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r2 * r0
            float r0 = r6.height()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r2 / r0
            int r1 = r3.left     // Catch:{ RuntimeException -> 0x018f }
            int r0 = r3.right     // Catch:{ RuntimeException -> 0x018f }
            int r1 = r1 + r0
            float r1 = (float) r1     // Catch:{ RuntimeException -> 0x018f }
            float r1 = r1 / r9
            float r0 = r2 / r9
            float r1 = r1 - r0
            int r0 = (int) r1     // Catch:{ RuntimeException -> 0x018f }
            r3.left = r0     // Catch:{ RuntimeException -> 0x018f }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r0 + r2
            int r0 = (int) r0     // Catch:{ RuntimeException -> 0x018f }
            r3.right = r0     // Catch:{ RuntimeException -> 0x018f }
            goto L_0x0087
        L_0x016c:
            int r0 = r3.width()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = (float) r0     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r6.height()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r2 * r0
            float r0 = r6.width()     // Catch:{ RuntimeException -> 0x018f }
            float r2 = r2 / r0
            int r1 = r3.top     // Catch:{ RuntimeException -> 0x018f }
            int r0 = r3.bottom     // Catch:{ RuntimeException -> 0x018f }
            int r1 = r1 + r0
            float r1 = (float) r1     // Catch:{ RuntimeException -> 0x018f }
            float r1 = r1 / r9
            float r0 = r2 / r9
            float r1 = r1 - r0
            int r0 = (int) r1     // Catch:{ RuntimeException -> 0x018f }
            r3.top = r0     // Catch:{ RuntimeException -> 0x018f }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x018f }
            float r0 = r0 + r2
            int r0 = (int) r0     // Catch:{ RuntimeException -> 0x018f }
            r3.bottom = r0     // Catch:{ RuntimeException -> 0x018f }
            goto L_0x0087
        L_0x018f:
            r1 = move-exception
            java.lang.String r0 = "thumbnailbutton/"
            X.C1001559t.A00(r10, r0)
            throw r1
        L_0x0196:
            super.onDraw(r11)
        L_0x0199:
            r10.A07(r11)
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x01d8
            boolean r0 = r10.isSelected()
            if (r0 != 0) goto L_0x01ae
            boolean r0 = r10.isPressed()
            if (r0 == 0) goto L_0x01d8
        L_0x01ae:
            android.graphics.Paint r0 = r10.A05
            X.AnonymousClass001.A10(r0)
            android.graphics.Paint r1 = r10.A05
            int r0 = r10.A04
            r1.setColor(r0)
            X.8mX r0 = r10.A06
            if (r0 == 0) goto L_0x01d9
            r1 = 0
            r0 = 31
            int r1 = r11.saveLayer(r6, r1, r0)
            X.8mX r0 = r10.A06
            java.lang.Object r0 = r0.apply(r6)
            android.graphics.Path r0 = (android.graphics.Path) r0
            r11.clipPath(r0)
            android.graphics.Paint r0 = r10.A05
            r11.drawRect(r6, r0)
            r11.restoreToCount(r1)
        L_0x01d8:
            return
        L_0x01d9:
            float r1 = r10.A02
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01e6
            android.graphics.Paint r0 = r10.A05
            r11.drawRoundRect(r6, r1, r1, r0)
            return
        L_0x01e6:
            r0 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01f6
            android.graphics.Path r1 = X.C107245ax.A03(r6)
            android.graphics.Paint r0 = r10.A05
            r11.drawPath(r1, r0)
            return
        L_0x01f6:
            android.graphics.Paint r0 = r10.A05
            r11.drawOval(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.button.ThumbnailButton.onDraw(android.graphics.Canvas):void");
    }

    public void setBorderColor(int i) {
        this.A03 = i;
    }

    public void setBorderSize(float f) {
        this.A01 = f;
    }

    public void setClipPathProducer(C181298mX r1) {
        this.A06 = r1;
    }

    public void setCornerRadius(float f) {
        this.A02 = f;
    }

    public void setForegroundOnly(boolean z) {
        this.A07 = z;
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04(context, attributeSet);
    }

    public ThumbnailButton(Context context) {
        super(context);
        A04(context, (AttributeSet) null);
    }
}
