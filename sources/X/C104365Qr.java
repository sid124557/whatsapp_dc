package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* renamed from: X.5Qr  reason: invalid class name and case insensitive filesystem */
public final class C104365Qr {
    public static int A09;
    public static WeakReference A0A;
    public ValueAnimator A00;
    public final C113995mK A01;
    public final C56042rK A02;
    public final C105125Tr A03;
    public final AnonymousClass57S A04;
    public final C183538qC A05;
    public final C183538qC A06;
    public final C183538qC A07;
    public final AnonymousClass66R A08 = C154517dI.A01(new C120655yw(this));

    public final void A00() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.A00;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.A00;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }

    public C104365Qr(C113995mK r2, C56042rK r3, C105125Tr r4, AnonymousClass57S r5, C183538qC r6, C183538qC r7, C183538qC r8) {
        C18260x0.A0f(r6, r4, r7, r8, r5);
        C18260x0.A0U(r2, r3);
        this.A07 = r6;
        this.A03 = r4;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
    }
}
