package X;

import android.animation.ValueAnimator;

/* renamed from: X.0j0  reason: invalid class name and case insensitive filesystem */
public class C11040j0 implements Runnable {
    public final /* synthetic */ AnonymousClass09U A00;

    public C11040j0(AnonymousClass09U r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass09U r2 = this.A00;
        int i = r2.A02;
        if (i == 1) {
            r2.A0K.cancel();
        } else if (i != 2) {
            return;
        }
        r2.A02 = 3;
        ValueAnimator valueAnimator = r2.A0K;
        valueAnimator.setFloatValues(new float[]{AnonymousClass001.A03(valueAnimator), 0.0f});
        valueAnimator.setDuration((long) 500);
        valueAnimator.start();
    }
}
