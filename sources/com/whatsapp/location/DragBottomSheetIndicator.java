package com.whatsapp.location;

import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.C116855qy;
import X.C86604Kt;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

public class DragBottomSheetIndicator extends View implements AnonymousClass4GJ {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public C116855qy A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Paint A09;
    public final Path A0A;

    public void A00() {
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
    }

    public final void A01(Context context) {
        Paint paint = this.A08;
        C86634Kw.A17(paint);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setStrokeWidth(C86604Kt.A00(context) * 2.0f);
        paint.setColor(-1);
        Paint paint2 = this.A09;
        C86634Kw.A17(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeWidth(C86604Kt.A00(context) * 4.0f);
        paint2.setColor(855638016);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setExpanded(boolean z) {
        this.A05 = z;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        invalidate();
    }

    public void setOffset(float f) {
        this.A03 = this.A02;
        this.A01 = this.A00;
        this.A02 = SystemClock.elapsedRealtime();
        this.A00 = f;
        invalidate();
    }

    public void setUpdating(boolean z) {
        this.A07 = z;
        if (z) {
            invalidate();
        }
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A08 = C86664Kz.A0a(1);
        this.A09 = C86664Kz.A0a(1);
        this.A0A = AnonymousClass002.A06();
        A01(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        if (r7.A05 != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0071, code lost:
        if (r4 >= 0.0f) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r7.A05 != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r4 = (float) (((double) r4) * 0.25d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r4 > 0.0f) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.onDraw(r8)
            float r5 = r7.A00
            float r0 = r7.A01
            float r4 = r5 - r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A03
            long r2 = r2 - r0
            float r0 = (float) r2
            float r4 = r4 / r0
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0063
            r4 = 0
        L_0x001b:
            int r6 = r7.getPaddingLeft()
            int r2 = r7.getPaddingTop()
            int r5 = X.AnonymousClass001.A0I(r7)
            int r1 = X.AnonymousClass001.A0H(r7)
            int r0 = r1 + r2
            int r0 = r0 / 2
            float r3 = (float) r0
            int r1 = r1 - r2
            float r2 = (float) r1
            boolean r1 = r7.A05
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L_0x003a
            r0 = -1090519040(0xffffffffbf000000, float:-0.5)
        L_0x003a:
            float r0 = r0 + r4
            float r2 = r2 * r0
            float r2 = r2 + r3
            android.graphics.Path r1 = r7.A0A
            r1.reset()
            float r0 = (float) r6
            r1.moveTo(r0, r2)
            int r6 = r6 + r5
            int r0 = r6 / 2
            float r0 = (float) r0
            r1.lineTo(r0, r3)
            float r0 = (float) r5
            r1.lineTo(r0, r2)
            android.graphics.Paint r0 = r7.A09
            r8.drawPath(r1, r0)
            android.graphics.Paint r0 = r7.A08
            r8.drawPath(r1, r0)
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0062
            r7.invalidate()
        L_0x0062:
            return
        L_0x0063:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x007d
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x006b:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0077
        L_0x006f:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
        L_0x0073:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x001b
        L_0x0077:
            double r2 = (double) r4
            r0 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r2 = r2 * r0
            float r4 = (float) r2
            goto L_0x001b
        L_0x007d:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0086
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0073
        L_0x0086:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.DragBottomSheetIndicator.onDraw(android.graphics.Canvas):void");
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A08 = C86664Kz.A0a(1);
        this.A09 = C86664Kz.A0a(1);
        this.A0A = AnonymousClass002.A06();
        A01(context);
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A08 = C86664Kz.A0a(1);
        this.A09 = C86664Kz.A0a(1);
        this.A0A = AnonymousClass002.A06();
        A01(context);
    }

    public DragBottomSheetIndicator(Context context) {
        super(context);
        A00();
        this.A08 = C86664Kz.A0a(1);
        this.A09 = C86664Kz.A0a(1);
        this.A0A = AnonymousClass002.A06();
        A01(context);
    }

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
