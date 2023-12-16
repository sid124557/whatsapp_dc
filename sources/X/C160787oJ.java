package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.7oJ  reason: invalid class name and case insensitive filesystem */
public abstract class C160787oJ {
    public static final TimeInterpolator A0O = C159917mg.A01;
    public static final int[] A0P = new int[0];
    public static final int[] A0Q;
    public static final int[] A0R = {16842908, 16842910};
    public static final int[] A0S = {16843623, 16842910};
    public static final int[] A0T = {16843623, 16842908, 16842910};
    public static final int[] A0U = {16842919, 16842910};
    public float A00;
    public float A01;
    public float A02 = 1.0f;
    public float A03;
    public int A04 = 0;
    public int A05;
    public int A06;
    public Animator A07;
    public Drawable A08;
    public Drawable A09;
    public C161407pZ A0A;
    public C161407pZ A0B;
    public AnonymousClass6D0 A0C;
    public AnonymousClass6D7 A0D;
    public C161877ql A0E;
    public boolean A0F;
    public boolean A0G = true;
    public final Matrix A0H = new Matrix();
    public final Rect A0I = AnonymousClass001.A0N();
    public final RectF A0J = AnonymousClass002.A07();
    public final RectF A0K = AnonymousClass002.A07();
    public final AnonymousClass6Z3 A0L;
    public final AnonymousClass7SB A0M;
    public final C178888iG A0N;

    public abstract void A04(float f, float f2, float f3);

    public abstract void A09(int[] iArr);

    static {
        int[] A0E2 = C18330xA.A0E();
        A0E2[0] = 16842910;
        A0Q = A0E2;
    }

    public static final ValueAnimator A00(AnonymousClass6CK r3) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(A0O);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(r3);
        valueAnimator.addUpdateListener(r3);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public final AnimatorSet A01(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList A0s = AnonymousClass001.A0s();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        AnonymousClass6Z3 r4 = this.A0L;
        float alpha = r4.getAlpha();
        float scaleX = r4.getScaleX();
        float scaleY = r4.getScaleY();
        float f4 = this.A02;
        ofFloat.addUpdateListener(new C162617sT(new Matrix(this.A0H), this, alpha, f, scaleX, f2, scaleY, f4, f3));
        A0s.add(ofFloat);
        C1446272h.A00(animatorSet, A0s);
        animatorSet.setDuration((long) C160907oe.A00(r4.getContext(), i, C18290x4.A0G(r4).getInteger(R.integer.f7nameremoved)));
        animatorSet.setInterpolator(AnonymousClass5YH.A01(C159917mg.A02, r4.getContext(), i2));
        return animatorSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r1.A02(r1.A04) >= r13.A06) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r7 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r13 = this;
            android.graphics.Rect r6 = r13.A0I
            r13.A07(r6)
            android.graphics.drawable.Drawable r1 = r13.A08
            java.lang.String r0 = "Didn't initialize content background"
            X.C04890Rb.A01(r1, r0)
            X.8iG r0 = r13.A0N
            X.8Bu r0 = (X.C170078Bu) r0
            X.6Z3 r5 = r0.A00
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0044
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x0026
            X.6Z3 r1 = r13.A0L
            int r0 = r1.A04
            int r1 = r1.A02(r0)
            int r0 = r13.A06
            if (r1 < r0) goto L_0x0044
        L_0x0026:
            android.graphics.drawable.Drawable r7 = r13.A08
            if (r7 == 0) goto L_0x002d
        L_0x002a:
            X.C160787oJ.super.setBackgroundDrawable(r7)
        L_0x002d:
            int r4 = r6.left
            int r3 = r6.top
            int r2 = r6.right
            int r1 = r6.bottom
            android.graphics.Rect r0 = r5.A0C
            r0.set(r4, r3, r2, r1)
            int r0 = r5.A02
            int r4 = r4 + r0
            int r3 = r3 + r0
            int r2 = r2 + r0
            int r1 = r1 + r0
            r5.setPadding(r4, r3, r2, r1)
            return
        L_0x0044:
            android.graphics.drawable.Drawable r8 = r13.A08
            int r9 = r6.left
            int r10 = r6.top
            int r11 = r6.right
            int r12 = r6.bottom
            android.graphics.drawable.InsetDrawable r7 = new android.graphics.drawable.InsetDrawable
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160787oJ.A03():void");
    }

    public void A05(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable != null) {
            AnonymousClass0YG.A01(C106925aO.A02(colorStateList), drawable);
        }
    }

    public void A07(Rect rect) {
        int i;
        float f;
        if (this.A0F) {
            int i2 = this.A06;
            AnonymousClass6Z3 r1 = this.A0L;
            i = (i2 - r1.A02(r1.A04)) / 2;
        } else {
            i = 0;
        }
        if (this.A0G) {
            f = this.A0L.getElevation() + this.A03;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil((double) f));
        int max2 = Math.max(i, AnonymousClass6C9.A04(f, 1.5f));
        rect.set(max, max2, max, max2);
    }

    public final void A08(C161877ql r3) {
        this.A0E = r3;
        AnonymousClass6D7 r0 = this.A0D;
        if (r0 != null) {
            r0.setShapeAppearanceModel(r3);
        }
        Drawable drawable = this.A09;
        if (drawable instanceof C181238mQ) {
            ((C181238mQ) drawable).setShapeAppearanceModel(r3);
        }
        AnonymousClass6D0 r02 = this.A0C;
        if (r02 != null) {
            r02.A07 = r3;
            r02.invalidateSelf();
        }
    }

    public C160787oJ(AnonymousClass6Z3 r4, C178888iG r5) {
        this.A0L = r4;
        this.A0N = r5;
        AnonymousClass7SB r2 = new AnonymousClass7SB();
        this.A0M = r2;
        r2.A00(A00(new C129026Yx(this)), A0U);
        r2.A00(A00(new C129016Yw(this)), A0T);
        r2.A00(A00(new C129016Yw(this)), A0R);
        r2.A00(A00(new C129016Yw(this)), A0S);
        r2.A00(A00(new C129036Yy(this)), A0Q);
        r2.A00(A00(new C129006Yv(this)), A0P);
        r4.getRotation();
    }

    public final AnimatorSet A02(C161407pZ r9, float f, float f2, float f3) {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass6Z3 r7 = this.A0L;
        ObjectAnimator A0H2 = AnonymousClass6CA.A0H(View.ALPHA, r7, new float[1], f, 0);
        r9.A03("opacity").A00(A0H2);
        A0s.add(A0H2);
        ObjectAnimator A0H3 = AnonymousClass6CA.A0H(View.SCALE_X, r7, new float[1], f2, 0);
        r9.A03("scale").A00(A0H3);
        if (Build.VERSION.SDK_INT == 26) {
            A0H3.setEvaluator(new C162537sL(this));
        }
        A0s.add(A0H3);
        ObjectAnimator A0H4 = AnonymousClass6CA.A0H(View.SCALE_Y, r7, new float[1], f2, 0);
        r9.A03("scale").A00(A0H4);
        if (Build.VERSION.SDK_INT == 26) {
            A0H4.setEvaluator(new C162537sL(this));
        }
        A0s.add(A0H4);
        Matrix matrix = this.A0H;
        A06(matrix, f3);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(r7, new AnonymousClass6EK(), new C162547sM(this), new Matrix[]{new Matrix(matrix)});
        r9.A03("iconScale").A00(ofObject);
        A0s.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1446272h.A00(animatorSet, A0s);
        return animatorSet;
    }

    public final void A06(Matrix matrix, float f) {
        matrix.reset();
        Drawable drawable = this.A0L.getDrawable();
        if (drawable != null && this.A05 != 0) {
            RectF rectF = this.A0J;
            RectF rectF2 = this.A0K;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            float f2 = (float) this.A05;
            rectF2.set(0.0f, 0.0f, f2, f2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            float f3 = ((float) this.A05) / 2.0f;
            matrix.postScale(f, f, f3, f3);
        }
    }
}
