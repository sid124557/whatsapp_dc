package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* renamed from: X.7sT  reason: invalid class name and case insensitive filesystem */
public class C162617sT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ float A06;
    public final /* synthetic */ Matrix A07;
    public final /* synthetic */ C160787oJ A08;

    public C162617sT(Matrix matrix, C160787oJ r2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A08 = r2;
        this.A00 = f;
        this.A05 = f2;
        this.A02 = f3;
        this.A06 = f4;
        this.A03 = f5;
        this.A01 = f6;
        this.A04 = f7;
        this.A07 = matrix;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A032 = AnonymousClass001.A03(valueAnimator);
        C160787oJ r4 = this.A08;
        AnonymousClass6Z3 r3 = r4.A0L;
        r3.setAlpha(C159917mg.A00(this.A00, this.A05, 0.0f, 0.2f, A032));
        float f = this.A02;
        float f2 = this.A06;
        r3.setScaleX(AnonymousClass001.A00(f2, f, A032));
        r3.setScaleY(AnonymousClass001.A00(f2, this.A03, A032));
        float A002 = AnonymousClass001.A00(this.A04, this.A01, A032);
        r4.A02 = A002;
        Matrix matrix = this.A07;
        r4.A06(matrix, A002);
        r3.setImageMatrix(matrix);
    }
}
