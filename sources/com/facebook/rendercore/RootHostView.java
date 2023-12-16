package com.facebook.rendercore;

import X.AnonymousClass002;
import X.AnonymousClass6N7;
import X.AnonymousClass7ON;
import X.C1443071a;
import X.C151097Tk;
import X.C151847Wn;
import X.C158987ku;
import X.C159167lF;
import X.C162457s7;
import X.C177898gd;
import X.C378924l;
import X.C86624Kv;
import X.C86664Kz;
import android.content.Context;
import android.util.AttributeSet;

public class RootHostView extends AnonymousClass6N7 {
    public static final int[] A01 = C86664Kz.A1Z();
    public final C151097Tk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootHostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        this.A00 = new C151097Tk(this);
    }

    public void setRenderTreeUpdateListener(C177898gd r4) {
        C162457s7.A0J(r4, 0);
        C159167lF r2 = this.A00.A04;
        AnonymousClass7ON r1 = r2.A00;
        if (r1 == null) {
            r1 = new AnonymousClass7ON(r2, r2.A07);
            r2.A00 = r1;
        }
        r1.A00 = r4;
    }

    public final C151097Tk getRootHostDelegate() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0020, code lost:
        r0 = X.AnonymousClass71Z.A00((int) r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            X.7Tk r7 = r9.A00
            long r1 = X.C153917cG.A00(r10, r11)
            int[] r6 = A01
            r5 = 1
            int r0 = X.C86664Kz.A06(r1)
            X.7at r0 = X.AnonymousClass71Z.A00(r0)
            int r8 = r0.A02(r1)
            int r0 = r0.A04(r1)
            boolean r0 = X.AnonymousClass000.A1U(r8, r0)
            r4 = 0
            if (r0 == 0) goto L_0x003d
            int r0 = (int) r1
            X.7at r0 = X.AnonymousClass71Z.A00(r0)
            int r3 = r0.A01(r1)
            int r0 = r0.A03(r1)
            if (r3 != r0) goto L_0x003d
            r7.A02 = r5
            r6[r4] = r8
            r6[r5] = r3
        L_0x0035:
            r1 = r6[r4]
            r0 = r6[r5]
            r9.setMeasuredDimension(r1, r0)
            return
        L_0x003d:
            X.7ku r0 = r7.A00
            if (r0 == 0) goto L_0x0047
            r0.A04(r6, r1)
            r7.A02 = r4
            goto L_0x0035
        L_0x0047:
            super.onMeasure(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.RootHostView.onMeasure(int, int):void");
    }

    public void setRenderState(C158987ku r4) {
        C151847Wn r1;
        C151097Tk r2 = this.A00;
        if (!C162457s7.A0P(r2.A00, r4)) {
            C158987ku r12 = r2.A00;
            if (r12 != null) {
                r12.A0A = null;
            }
            r2.A00 = r4;
            if (r4 != null) {
                C151097Tk r0 = r4.A0A;
                if (r0 == null || r0.equals(r2)) {
                    r4.A0A = r2;
                    r1 = r4.A08;
                } else {
                    throw AnonymousClass002.A0E("Must detach from previous host listener first");
                }
            } else {
                r1 = null;
            }
            if (!C162457s7.A0P(r2.A01, r1)) {
                if (r1 == null) {
                    r2.A04.A04();
                }
                r2.A01 = r1;
                r2.A03.requestLayout();
            }
        }
    }

    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        C151097Tk r0 = this.A00;
        C1443071a.A00(r0.A03, r0.A04);
    }

    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        C151097Tk r0 = this.A00;
        C1443071a.A00(r0.A03, r0.A04);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00.A04.A02();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.A04.A03();
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        C151097Tk r0 = this.A00;
        C1443071a.A00(r0.A03, r0.A04);
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        C151097Tk r0 = this.A00;
        C1443071a.A00(r0.A03, r0.A04);
    }

    public /* synthetic */ RootHostView(Context context, AttributeSet attributeSet, int i, C378924l r5) {
        this(context, C86624Kv.A09(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RootHostView(Context context) {
        this(context, (AttributeSet) null);
        C162457s7.A0J(context, 1);
    }
}
