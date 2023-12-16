package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collections;

/* renamed from: X.0Ys  reason: invalid class name and case insensitive filesystem */
public class C06670Ys implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C06960a6 A02;
    public final /* synthetic */ C05820Vc A03;
    public final /* synthetic */ AnonymousClass0XY A04;
    public final /* synthetic */ AnonymousClass0XY A05;

    public C06670Ys(View view, C06960a6 r2, C05820Vc r3, AnonymousClass0XY r4, AnonymousClass0XY r5, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
        this.A00 = i;
        this.A01 = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass0UT r1;
        C05820Vc r8 = this.A03;
        r8.A00.A08(valueAnimator.getAnimatedFraction());
        AnonymousClass0XY r7 = this.A05;
        AnonymousClass0XY r12 = this.A04;
        float A052 = r8.A00.A05();
        int i = this.A00;
        C05290St r5 = new C05290St(r7);
        int i2 = 1;
        do {
            int i3 = i & i2;
            AnonymousClass0XU A0C = r7.A00.A0C(i2);
            if (i3 != 0) {
                AnonymousClass0XU A0C2 = r12.A00.A0C(i2);
                float f = 1.0f - A052;
                A0C = AnonymousClass0XY.A00(A0C, (int) (((double) (((float) (A0C.A01 - A0C2.A01)) * f)) + 0.5d), (int) (((double) (((float) (A0C.A03 - A0C2.A03)) * f)) + 0.5d), (int) (((double) (((float) (A0C.A02 - A0C2.A02)) * f)) + 0.5d), (int) (((double) (((float) (A0C.A00 - A0C2.A00)) * f)) + 0.5d));
            }
            r1 = r5.A00;
            r1.A07(A0C, i2);
            i2 <<= 1;
        } while (i2 <= 256);
        AnonymousClass069.A04(this.A01, r1.A00(), Collections.singletonList(r8));
    }
}
