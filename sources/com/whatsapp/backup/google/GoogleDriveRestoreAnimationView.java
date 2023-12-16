package com.whatsapp.backup.google;

import X.AnonymousClass02Z;
import X.AnonymousClass0Y8;
import X.AnonymousClass34K;
import X.C002602v;
import X.C107335b8;
import X.C620733j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.whatsapp.R;

public class GoogleDriveRestoreAnimationView extends AnonymousClass02Z {
    public float A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04;
    public Resources A05;
    public Paint A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public C002602v A0A;
    public C620733j A0B;
    public boolean A0C;
    public boolean A0D;
    public final DecelerateInterpolator A0E = new DecelerateInterpolator();

    public void A04() {
        this.A01 = 4;
        C002602v r0 = this.A0A;
        if (r0 != null) {
            r0.cancel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r0 != null) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            r3 = 0
            if (r8 == 0) goto L_0x0061
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            int[] r0 = X.C38932Aa.A00
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r0, r3, r3)
            r5 = 0
            r4 = 1
            X.33j r0 = r6.A0B     // Catch:{ all -> 0x0059 }
            boolean r1 = r0.A0U()     // Catch:{ all -> 0x0059 }
            r0 = 0
            if (r1 == 0) goto L_0x001d
            r0 = 3
        L_0x001d:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)     // Catch:{ all -> 0x0059 }
            r6.A09 = r0     // Catch:{ all -> 0x0059 }
            X.33j r0 = r6.A0B     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.A0U()     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x002c
            r5 = 3
        L_0x002c:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r5)     // Catch:{ all -> 0x0059 }
            r6.A07 = r0     // Catch:{ all -> 0x0059 }
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)     // Catch:{ all -> 0x0059 }
            r6.A0D = r0     // Catch:{ all -> 0x0059 }
            X.33j r0 = r6.A0B     // Catch:{ all -> 0x0059 }
            boolean r1 = r0.A0U()     // Catch:{ all -> 0x0059 }
            r0 = 1
            if (r1 == 0) goto L_0x0043
            r0 = 4
        L_0x0043:
            int r0 = r2.getColor(r0, r3)     // Catch:{ all -> 0x0059 }
            r6.A03 = r0     // Catch:{ all -> 0x0059 }
            X.33j r0 = r6.A0B     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.A0U()     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0052
            r4 = 4
        L_0x0052:
            int r0 = r2.getColor(r4, r3)     // Catch:{ all -> 0x0059 }
            r6.A02 = r0     // Catch:{ all -> 0x0059 }
            goto L_0x005e
        L_0x0059:
            r0 = move-exception
            r2.recycle()
            throw r0
        L_0x005e:
            r2.recycle()
        L_0x0061:
            android.content.res.Resources r2 = r7.getResources()
            r6.A05 = r2
            android.graphics.drawable.Drawable r0 = r6.A09
            if (r0 != 0) goto L_0x0081
            X.33j r0 = r6.A0B
            boolean r1 = r0.A0U()
            r0 = 2131232916(0x7f080894, float:1.8081955E38)
            if (r1 == 0) goto L_0x0079
            r0 = 2131232914(0x7f080892, float:1.808195E38)
        L_0x0079:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r6.A09 = r0
            if (r0 == 0) goto L_0x0085
        L_0x0081:
            int r3 = r0.getIntrinsicWidth()
        L_0x0085:
            r6.A04 = r3
            android.graphics.drawable.Drawable r0 = r6.A07
            if (r0 != 0) goto L_0x00a1
            android.content.res.Resources r2 = r6.A05
            X.33j r0 = r6.A0B
            boolean r1 = r0.A0U()
            r0 = 2131232914(0x7f080892, float:1.808195E38)
            if (r1 == 0) goto L_0x009b
            r0 = 2131232916(0x7f080894, float:1.8081955E38)
        L_0x009b:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r6.A07 = r0
        L_0x00a1:
            android.graphics.drawable.Drawable r1 = r6.A09
            int r0 = r6.A03
            android.graphics.drawable.Drawable r0 = X.C107335b8.A0B(r1, r0)
            r6.A09 = r0
            android.graphics.drawable.Drawable r1 = r6.A07
            int r0 = r6.A02
            android.graphics.drawable.Drawable r0 = X.C107335b8.A0B(r1, r0)
            r6.A07 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r6.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleDriveRestoreAnimationView.A07(android.content.Context, android.util.AttributeSet):void");
    }

    public void A05() {
        if (this.A0A == null) {
            A06();
        }
        this.A01 = 1;
        startAnimation(this.A0A);
    }

    public final void A06() {
        C002602v r2 = new C002602v(this);
        this.A0A = r2;
        r2.setDuration(2000);
        this.A0A.setRepeatCount(-1);
        this.A0A.setInterpolator(new LinearInterpolator());
        this.A0A.setFillAfter(true);
    }

    public void A08(boolean z) {
        int i;
        if (this.A0A == null) {
            A06();
        }
        clearAnimation();
        Resources resources = this.A05;
        if (z) {
            this.A08 = C107335b8.A0B(resources.getDrawable(R.drawable.ic_restore_error), AnonymousClass0Y8.A04(getContext(), R.color.f5nameremoved));
            i = 3;
        } else {
            this.A09 = C107335b8.A0B(resources.getDrawable(R.drawable.ill_restore_anim), this.A03);
            this.A08 = C107335b8.A0B(this.A05.getDrawable(R.drawable.ill_restore_success_checkmark), AnonymousClass0Y8.A04(getContext(), AnonymousClass34K.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
            i = 2;
        }
        this.A01 = i;
        C002602v r2 = this.A0A;
        if (r2 != null) {
            r2.setDuration(800);
            startAnimation(this.A0A);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01dc, code lost:
        if (r4 < (r2 - 0.5d)) goto L_0x01de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r26) {
        /*
            r25 = this;
            r12 = r25
            int r0 = r12.getWidth()
            int r5 = X.AnonymousClass000.A06(r12, r0)
            int r1 = r12.getWidth()
            int r0 = r12.getHeight()
            float r1 = (float) r1
            r14 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r14
            float r0 = (float) r0
            float r0 = r0 / r14
            r15 = r26
            r15.translate(r1, r0)
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = -r5
            float r7 = (float) r0
            float r7 = r7 / r14
            float r8 = (float) r1
            float r8 = r8 / r14
            float r7 = r7 + r8
            int r0 = r12.A01
            r4 = 3
            r9 = 1056964608(0x3f000000, float:0.5)
            r2 = 1
            r10 = 1058642330(0x3f19999a, float:0.6)
            r3 = 2
            if (r0 == r3) goto L_0x023f
            if (r0 == r4) goto L_0x003d
            r9 = 0
        L_0x003d:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x003f:
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 * r6
            int r8 = (int) r0
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r6 = r6 * r0
            float r6 = r6 / r14
            int r13 = (int) r6
            android.graphics.drawable.Drawable r11 = r12.A09
            int r0 = r8 / 2
            float r10 = (float) r0
            float r0 = r7 - r10
            int r6 = (int) r0
            int r1 = -r13
            float r7 = r7 + r10
            int r0 = (int) r7
            r11.setBounds(r6, r1, r0, r13)
            android.graphics.drawable.Drawable r0 = r12.A09
            r0.draw(r15)
            double r0 = (double) r9
            r16 = 0
            int r6 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x008c
            android.graphics.drawable.Drawable r0 = r12.A08
            if (r0 == 0) goto L_0x008c
            int r0 = r0.getIntrinsicWidth()
            float r1 = (float) r0
            float r1 = r1 * r9
            android.graphics.drawable.Drawable r0 = r12.A08
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r9 = r9 * r0
            android.graphics.drawable.Drawable r10 = r12.A08
            int r7 = (int) r1
            int r6 = -r7
            int r1 = (int) r9
            int r0 = -r1
            r10.setBounds(r6, r0, r7, r1)
            android.graphics.drawable.Drawable r0 = r12.A08
            r0.draw(r15)
        L_0x008c:
            android.graphics.drawable.Drawable r0 = r12.A07
            int r6 = r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r0 = r12.A07
            int r10 = r0.getIntrinsicHeight()
            int r10 = r10 / r3
            int r0 = r12.A01
            if (r0 == r3) goto L_0x00ac
            android.graphics.drawable.Drawable r9 = r12.A07
            int r7 = r5 / 2
            int r1 = r7 - r6
            int r0 = -r10
            r9.setBounds(r1, r0, r7, r10)
            android.graphics.drawable.Drawable r0 = r12.A07
            r0.draw(r15)
        L_0x00ac:
            int r0 = r12.A01
            if (r0 == r3) goto L_0x01ab
            if (r0 == r4) goto L_0x01ab
            float r3 = (float) r5
            float r1 = -r3
            float r1 = r1 / r14
            float r0 = (float) r8
            float r1 = r1 + r0
            double r8 = (double) r1
            float r3 = r3 / r14
            float r0 = (float) r6
            float r3 = r3 - r0
            double r0 = (double) r3
            double r3 = r8 - r0
            double r3 = r3 * r3
            double r3 = r3 + r16
            double r3 = java.lang.Math.sqrt(r3)
            float r5 = (float) r3
            double r6 = (double) r5
            r13 = 4599526299433487565(0x3fd4cccccccccccd, double:0.325)
            double r10 = java.lang.Math.sin(r13)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 * r3
            double r6 = r6 / r10
            double r8 = r8 + r0
            double r8 = r8 / r3
            double r21 = java.lang.Math.cos(r13)
            double r21 = r21 * r6
            double r21 = r21 + r16
            android.graphics.Paint r0 = r12.A06
            r0.setAntiAlias(r2)
            r13 = 0
        L_0x00e4:
            double r10 = (double) r13
            r16 = 4604029899060858061(0x3fe4cccccccccccd, double:0.65)
            double r2 = r10 * r16
            r18 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r2 = r2 / r18
            r4 = -4623935809413835653(0xbfd47ae147ae147b, double:-0.32)
            double r2 = r2 + r4
            int r24 = r13 + 1
            r0 = r24
            double r0 = (double) r0
            double r0 = r0 * r16
            double r0 = r0 / r18
            double r0 = r0 + r4
            boolean r4 = r12.A0D
            if (r4 == 0) goto L_0x023b
            r5 = 0
        L_0x0105:
            float r4 = (float) r2
            float r2 = (float) r0
            r23 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r4
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0115
            int r0 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r0 < 0) goto L_0x0234
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0115:
            float r2 = r2 * r1
            float r4 = r4 + r2
            double r2 = (double) r4
            double r16 = java.lang.Math.sin(r2)
            double r16 = r16 * r6
            X.33j r0 = r12.A0B
            boolean r1 = r0.A0U()
            r0 = 1
            if (r1 == 0) goto L_0x0128
            r0 = -1
        L_0x0128:
            double r0 = (double) r0
            double r16 = r16 * r0
            double r4 = r8 + r16
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x022b
            r2 = 0
        L_0x0133:
            android.graphics.Paint r0 = r12.A06
            r17 = r0
            android.content.res.Resources r16 = r12.getResources()
            boolean r0 = r12.A0D
            android.content.Context r14 = r12.getContext()
            if (r0 == 0) goto L_0x0223
            r1 = 2130969706(0x7f04046a, float:1.7548101E38)
            r0 = 2131101131(0x7f0605cb, float:1.7814663E38)
        L_0x0149:
            int r1 = X.AnonymousClass34K.A02(r14, r1, r0)
            r0 = r16
            int r1 = r0.getColor(r1)
            r0 = r17
            r0.setColor(r1)
            android.graphics.Paint r0 = r12.A06
            X.AnonymousClass001.A10(r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131168022(0x7f070b16, float:1.7950334E38)
            float r20 = r1.getDimension(r0)
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x01ac
            if (r13 == 0) goto L_0x0199
            float r0 = r12.A00
            float r0 = -r0
            double r0 = (double) r0
            r13 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r0 = r0 * r13
            r13 = 4602891378046628709(0x3fe0c152382d7365, double:0.5235987755982988)
            double r13 = r13 * r10
            double r0 = r0 + r13
            double r0 = java.lang.Math.cos(r0)
            r10 = 4638637247447433216(0x405fc00000000000, double:127.0)
            double r0 = r0 * r10
            double r0 = r0 + r10
            android.graphics.Paint r11 = r12.A06
            int r10 = (int) r0
            r11.setAlpha(r10)
            float r14 = (float) r4
            float r13 = (float) r2
        L_0x0192:
            android.graphics.Paint r1 = r12.A06
            r0 = r20
            r15.drawCircle(r14, r13, r0, r1)
        L_0x0199:
            r13 = r24
            r1 = 12
            if (r13 < r1) goto L_0x00e4
            int r1 = r12.A01
            r0 = 4
            if (r1 != r0) goto L_0x01ab
            X.02v r0 = r12.A0A
            if (r0 == 0) goto L_0x01ab
            r0.cancel()
        L_0x01ab:
            return
        L_0x01ac:
            float r14 = (float) r4
            float r13 = (float) r2
            android.graphics.Paint r1 = r12.A06
            r0 = r20
            r15.drawCircle(r14, r13, r0, r1)
            r0 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r10 = r10 * r0
            double r10 = r10 / r18
            double r4 = java.lang.Math.sin(r10)
            float r10 = r12.A00
            r0 = 1058642330(0x3f19999a, float:0.6)
            float r0 = r10 - r0
            double r2 = (double) r0
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r2 = r2 * r0
            r0 = 1053609164(0x3ecccccc, float:0.39999998)
            double r0 = (double) r0
            double r2 = r2 / r0
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01de
            double r16 = r2 - r18
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L_0x01df
        L_0x01de:
            r1 = 0
        L_0x01df:
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0199
            int r0 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x0199
            if (r1 == 0) goto L_0x0199
            double r2 = r2 - r18
            double r4 = r4 - r2
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r4 = r4 * r0
            r0 = 4634204016564240384(0x4050000000000000, double:64.0)
            double r4 = r4 + r0
            int r1 = (int) r4
            r0 = 255(0xff, float:3.57E-43)
            if (r1 < r0) goto L_0x01fc
            r1 = 255(0xff, float:3.57E-43)
        L_0x01fc:
            android.graphics.Paint r5 = r12.A06
            android.content.res.Resources r4 = r12.getResources()
            android.content.Context r3 = r12.getContext()
            r2 = 2130969705(0x7f040469, float:1.75481E38)
            r0 = 2131101130(0x7f0605ca, float:1.781466E38)
            int r0 = X.AnonymousClass34K.A02(r3, r2, r0)
            int r0 = r4.getColor(r0)
            r5.setColor(r0)
            android.graphics.Paint r0 = r12.A06
            X.AnonymousClass001.A10(r0)
            android.graphics.Paint r0 = r12.A06
            r0.setAlpha(r1)
            goto L_0x0192
        L_0x0223:
            r1 = 2130969704(0x7f040468, float:1.7548097E38)
            r0 = 2131101129(0x7f0605c9, float:1.7814659E38)
            goto L_0x0149
        L_0x022b:
            double r0 = java.lang.Math.cos(r2)
            double r0 = r0 * r6
            double r2 = r21 - r0
            goto L_0x0133
        L_0x0234:
            float r5 = r5 - r1
            float r0 = r23 - r1
            float r5 = r5 / r0
            r1 = r5
            goto L_0x0115
        L_0x023b:
            float r5 = r12.A00
            goto L_0x0105
        L_0x023f:
            boolean r0 = r12.A0C
            if (r0 != 0) goto L_0x0294
            float r6 = r12.A00
            int r1 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            android.view.animation.DecelerateInterpolator r0 = r12.A0E
            if (r1 >= 0) goto L_0x0283
            float r6 = r6 / r10
            float r7 = r0.getInterpolation(r6)
            android.graphics.drawable.Drawable r0 = r12.A09
            int r1 = r0.getIntrinsicWidth()
            int r0 = r12.A04
            float r6 = (float) r0
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r1 = (float) r1
            int r0 = r12.A04
            float r0 = (float) r0
            float r1 = r1 - r0
            float r1 = r1 * r7
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r6 = r6 + r1
            float r1 = (float) r5
            float r0 = r1 / r14
            float r8 = r8 - r0
            android.graphics.drawable.Drawable r0 = r12.A09
            int r0 = r0.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 * r6
            float r1 = r1 - r0
            float r7 = r7 * r1
            float r7 = r7 / r14
            float r7 = r7 + r8
            r9 = 0
            goto L_0x003f
        L_0x0283:
            float r6 = r6 - r10
            float r0 = r0.getInterpolation(r6)
            float r9 = r9 * r0
            float r1 = r12.A00
            r0 = 1065185444(0x3f7d70a4, float:0.99)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0294
            r12.A0C = r2
        L_0x0294:
            r7 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleDriveRestoreAnimationView.onDraw(android.graphics.Canvas):void");
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A07(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C002602v r2 = new C002602v(this);
        this.A0A = r2;
        r2.setDuration(2000);
        this.A0A.setRepeatCount(-1);
        this.A0A.setInterpolator(new LinearInterpolator());
        this.A0A.setFillAfter(true);
        startAnimation(this.A0A);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void onVisibilityChanged(View view, int i) {
        C002602v r0;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A0A) != null) {
            startAnimation(r0);
        }
    }

    public GoogleDriveRestoreAnimationView(Context context) {
        super(context);
        A07(context, (AttributeSet) null);
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A07(context, attributeSet);
    }
}
