package com.whatsapp.status.playback.widget;

import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.AnonymousClass647;
import X.C116855qy;
import X.C86604Kt;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.Set;

public class StatusPlaybackProgressView extends View implements AnonymousClass4GJ {
    public float A00;
    public int A01;
    public int A02;
    public AnonymousClass647 A03;
    public C116855qy A04;
    public boolean A05;
    public final Paint A06;
    public final RectF A07;
    public final Set A08;

    public void A00() {
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.51f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.51j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.51d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.51e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.51d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.51d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.51d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: X.51d} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c6, code lost:
        if (r1 >= 100.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e7, code lost:
        if (r1 >= 100.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0103, code lost:
        if (r1 >= 100.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012e, code lost:
        if (r1 >= 100.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e7, code lost:
        if (((long) r4.A0B()) < X.C56952sp.A04(r4.A0D, 6728)) goto L_0x01ee;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r8 = r18
            r10 = r19
            super.onDraw(r10)
            int r0 = r8.A01
            if (r0 == 0) goto L_0x027b
            int r0 = r8.getWidth()
            int r1 = X.AnonymousClass000.A06(r8, r0)
            int r0 = r8.getHeight()
            int r17 = X.AnonymousClass000.A05(r8, r0)
            float r7 = (float) r1
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 * r4
            int r2 = r8.A01
            float r1 = (float) r2
            float r3 = r3 / r1
            int r0 = r17 * 2
            float r0 = (float) r0
            r12 = 1073741824(0x40000000, float:2.0)
            float r16 = X.C86664Kz.A00(r3, r12, r0)
            int r0 = r2 + -1
            float r0 = (float) r0
            float r0 = r0 * r16
            float r7 = r7 - r0
            float r7 = r7 * r4
            float r7 = r7 / r1
            android.graphics.Paint r9 = r8.A06
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r9.setStrokeCap(r0)
            X.AnonymousClass001.A10(r9)
            int r0 = r8.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r8.getPaddingTop()
            float r0 = (float) r0
            r10.translate(r1, r0)
            r11 = 0
            r6 = 0
            r5 = 0
        L_0x004f:
            int r0 = r8.A01
            if (r6 >= r0) goto L_0x0274
            int r2 = r8.A02
            if (r6 != r2) goto L_0x024a
            X.647 r0 = r8.A03
            if (r0 == 0) goto L_0x006d
            X.5pO r0 = (X.C115885pO) r0
            X.51x r0 = r0.A00
            X.5Ut r4 = r0.A08()
            boolean r0 = r4 instanceof X.C985351g
            if (r0 == 0) goto L_0x00ad
            X.51g r4 = (X.C985351g) r4
            float r1 = r4.A00
        L_0x006b:
            r8.A00 = r1
        L_0x006d:
            float r13 = r8.A00
            float r13 = r13 * r7
            r0 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 / r0
            java.util.Set r14 = r8.A08
            boolean r1 = X.C18300x5.A1X(r14, r6)
            r0 = 1728053247(0x66ffffff, float:6.0446287E23)
            if (r1 == 0) goto L_0x0081
            r0 = 1727676737(0x66fa4141, float:5.9089767E23)
        L_0x0081:
            r9.setColor(r0)
            android.graphics.RectF r4 = r8.A07
            float r1 = r5 + r7
            r0 = r17
            float r3 = (float) r0
            r4.set(r5, r11, r1, r3)
            float r2 = r3 / r12
            r10.drawRoundRect(r4, r2, r2, r9)
            boolean r1 = X.C18300x5.A1X(r14, r6)
            r0 = -1
            if (r1 == 0) goto L_0x009d
            r0 = -376511(0xfffffffffffa4141, float:NaN)
        L_0x009d:
            r9.setColor(r0)
            float r13 = r13 + r5
            r4.set(r5, r11, r13, r3)
            r10.drawRoundRect(r4, r2, r2, r9)
        L_0x00a7:
            float r0 = r7 + r16
            float r5 = r5 + r0
            int r6 = r6 + 1
            goto L_0x004f
        L_0x00ad:
            boolean r0 = r4 instanceof X.C985151e
            if (r0 == 0) goto L_0x00ce
            X.51e r4 = (X.C985151e) r4
            X.5Sn r2 = r4.A06
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r1 = X.C86664Kz.A00(r13, r2, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006b
        L_0x00c8:
            X.5Pj r0 = r4.A05
            r0.A00()
            goto L_0x006b
        L_0x00ce:
            boolean r0 = r4 instanceof X.C985651j
            if (r0 == 0) goto L_0x00ea
            X.51j r4 = (X.C985651j) r4
            X.5Sn r2 = r4.A0D
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r1 = X.C86664Kz.A00(r13, r2, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006b
            goto L_0x00c8
        L_0x00ea:
            boolean r0 = r4 instanceof X.C985251f
            if (r0 == 0) goto L_0x0106
            X.51f r4 = (X.C985251f) r4
            X.5Sn r2 = r4.A09
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r1 = X.C86664Kz.A00(r13, r2, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006b
            goto L_0x00c8
        L_0x0106:
            boolean r0 = r4 instanceof X.C985551i
            if (r0 == 0) goto L_0x0119
            X.51i r4 = (X.C985551i) r4
            boolean r0 = r4 instanceof X.C985451h
            if (r0 == 0) goto L_0x01b4
            X.51h r4 = (X.C985451h) r4
            X.5YG r15 = r4.A02
            if (r15 != 0) goto L_0x0131
            r1 = 0
            goto L_0x006b
        L_0x0119:
            X.51d r4 = (X.C985051d) r4
            X.5Sn r2 = r4.A01
            long r0 = r2.A00()
            float r13 = (float) r0
            r3 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r3
            long r0 = r2.A00
            float r2 = (float) r0
            float r1 = X.C86664Kz.A00(r13, r2, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006b
            goto L_0x00c8
        L_0x0131:
            int r1 = r4.A04
            int r0 = r4.A02
            r13 = 1120403456(0x42c80000, float:100.0)
            if (r1 < r0) goto L_0x013d
            r1 = 1120403456(0x42c80000, float:100.0)
            goto L_0x006b
        L_0x013d:
            boolean r0 = r15.A0a()
            if (r0 != 0) goto L_0x014b
            X.5Pj r0 = r4.A05
            X.51x r0 = r0.A00
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x01a0
        L_0x014b:
            int r0 = r15.A05()
            long r2 = (long) r0
            com.whatsapp.mediaview.PhotoView r14 = r4.A0G
            int r1 = r14.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0179
            boolean r0 = r15.A0b()
            if (r0 == 0) goto L_0x0179
            android.view.View r0 = r15.A09()
            if (r0 == r14) goto L_0x0179
            java.lang.String r0 = "hideThumbnail"
            r4.A0J(r0)
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0179
            r1 = 8
            r14.setVisibility(r1)
            android.view.View r0 = r4.A08
            r0.setVisibility(r1)
        L_0x0179:
            int r14 = r4.A03
            r1 = 0
            if (r14 != 0) goto L_0x018e
            int r14 = r15.A06()
            r4.A03 = r14
            r0 = 1
            if (r14 <= r0) goto L_0x01ad
            long r0 = (long) r14
            int r0 = r4.A0L(r0)
            r4.A02 = r0
        L_0x018e:
            long r0 = (long) r14
            long r2 = r2 / r0
            float r0 = (float) r2
            float r0 = r0 * r13
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0196:
            float r0 = r0.floatValue()
            float r0 = java.lang.Math.min(r13, r0)
            r4.A00 = r0
        L_0x01a0:
            int r0 = r4.A04
            float r1 = (float) r0
            float r1 = r1 * r13
            float r0 = r4.A00
            float r1 = r1 + r0
            int r0 = r4.A02
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x006b
        L_0x01ad:
            r4.A03 = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0196
        L_0x01b4:
            X.5YG r0 = r4.A02
            if (r0 == 0) goto L_0x01ee
            r13 = 1
            boolean r0 = r0.A0a()
            boolean r0 = X.AnonymousClass000.A1U(r0, r13)
            r2 = 1120403456(0x42c80000, float:100.0)
            if (r0 != 0) goto L_0x01f5
            X.5Pj r0 = r4.A05
            X.51x r0 = r0.A00
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x01f5
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x01f2
            r0 = 0
        L_0x01d2:
            r4.A00 = r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e9
            int r0 = r4.A0B()
            long r0 = (long) r0
            X.1VX r3 = r4.A0D
            r2 = 6728(0x1a48, float:9.428E-42)
            long r13 = X.C56952sp.A04(r3, r2)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x01ee
        L_0x01e9:
            X.5Pj r0 = r4.A05
            r0.A00()
        L_0x01ee:
            float r1 = r4.A00
            goto L_0x006b
        L_0x01f2:
            r4.A00 = r2
            goto L_0x01e9
        L_0x01f5:
            int r0 = r4.A0B()
            long r0 = (long) r0
            com.whatsapp.mediaview.PhotoView r15 = r4.A0G
            int r14 = r15.getVisibility()
            r3 = 8
            if (r14 == r3) goto L_0x0230
            X.5YG r3 = r4.A02
            if (r3 == 0) goto L_0x0230
            boolean r3 = r3.A0b()
            if (r3 != r13) goto L_0x0230
            X.5YG r3 = r4.A02
            if (r3 == 0) goto L_0x0218
            android.view.View r3 = r3.A09()
            if (r3 == r15) goto L_0x0230
        L_0x0218:
            java.lang.String r3 = "getProgress/hideThumbnail"
            r4.A0J(r3)
            java.lang.String r3 = "hideThumbnail"
            r4.A0J(r3)
            boolean r3 = r4.A04
            if (r3 != 0) goto L_0x0230
            r14 = 8
            r15.setVisibility(r14)
            android.view.View r3 = r4.A08
            r3.setVisibility(r14)
        L_0x0230:
            X.5YG r3 = r4.A02
            if (r3 == 0) goto L_0x0248
            boolean r3 = r3.A0a()
            if (r3 != 0) goto L_0x0248
        L_0x023a:
            r4.A07 = r13
            float r13 = (float) r0
            float r13 = r13 * r2
            long r0 = r4.A02()
            float r3 = (float) r0
            float r0 = X.C86664Kz.A00(r13, r3, r2)
            goto L_0x01d2
        L_0x0248:
            r13 = 0
            goto L_0x023a
        L_0x024a:
            java.util.Set r0 = r8.A08
            boolean r1 = X.C18300x5.A1X(r0, r6)
            if (r6 >= r2) goto L_0x026b
            r0 = -1
            if (r1 == 0) goto L_0x0258
            r0 = -376511(0xfffffffffffa4141, float:NaN)
        L_0x0258:
            r9.setColor(r0)
            android.graphics.RectF r2 = r8.A07
            float r1 = r5 + r7
            r0 = r17
            float r0 = (float) r0
            r2.set(r5, r11, r1, r0)
            float r0 = r0 / r12
            r10.drawRoundRect(r2, r0, r0, r9)
            goto L_0x00a7
        L_0x026b:
            r0 = 1728053247(0x66ffffff, float:6.0446287E23)
            if (r1 == 0) goto L_0x0258
            r0 = 1727676737(0x66fa4141, float:5.9089767E23)
            goto L_0x0258
        L_0x0274:
            X.647 r0 = r8.A03
            if (r0 == 0) goto L_0x027b
            r8.invalidate()
        L_0x027b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.widget.StatusPlaybackProgressView.onDraw(android.graphics.Canvas):void");
    }

    public void setCount(int i) {
        this.A01 = i;
        invalidate();
    }

    public void setPosition(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            this.A00 = 0.0f;
            invalidate();
        }
    }

    public void setProgressProvider(AnonymousClass647 r1) {
        this.A03 = r1;
        invalidate();
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A08 = AnonymousClass002.A0K();
        this.A07 = AnonymousClass002.A07();
        this.A06 = C86604Kt.A0B();
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A08 = AnonymousClass002.A0K();
        this.A07 = AnonymousClass002.A07();
        this.A06 = C86604Kt.A0B();
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
        this.A08 = AnonymousClass002.A0K();
        this.A07 = AnonymousClass002.A07();
        this.A06 = C86604Kt.A0B();
    }

    public StatusPlaybackProgressView(Context context) {
        super(context);
        A00();
        this.A08 = AnonymousClass002.A0K();
        this.A07 = AnonymousClass002.A07();
        this.A06 = C86604Kt.A0B();
    }

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
