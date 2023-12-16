package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.0mY  reason: invalid class name and case insensitive filesystem */
public class C13050mY implements Runnable {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C06020Vx A02;
    public final /* synthetic */ C06960a6 A03;
    public final /* synthetic */ C05820Vc A04;

    public C13050mY(ValueAnimator valueAnimator, View view, C06020Vx r3, C06960a6 r4, C05820Vc r5) {
        this.A03 = r4;
        this.A01 = view;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = valueAnimator;
    }

    public void run() {
        AnonymousClass069.A02(this.A01, this.A02, this.A04);
        this.A00.start();
    }
}
