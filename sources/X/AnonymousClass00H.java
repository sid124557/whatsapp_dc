package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.00H  reason: invalid class name */
public class AnonymousClass00H extends ValueAnimator implements Choreographer.FrameCallback {
    public float A00 = 0.0f;
    public float A01 = 2.14748365E9f;
    public float A02 = -2.14748365E9f;
    public float A03 = 1.0f;
    public int A04 = 0;
    public long A05 = 0;
    public AnonymousClass0QL A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public final Set A09 = new CopyOnWriteArraySet();
    public final Set A0A = new CopyOnWriteArraySet();

    public void A05() {
        float A032;
        this.A07 = true;
        boolean A1V = AnonymousClass001.A1V((this.A03 > 0.0f ? 1 : (this.A03 == 0.0f ? 0 : -1)));
        for (Animator.AnimatorListener animatorListener : this.A09) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, A1V);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
        if (this.A03 < 0.0f) {
            A032 = A02();
        } else {
            A032 = A03();
        }
        A07((float) ((int) A032));
        this.A05 = 0;
        this.A04 = 0;
        A06();
    }

    public float A01() {
        AnonymousClass0QL r0 = this.A06;
        if (r0 == null) {
            return 0.0f;
        }
        float f = this.A00;
        float f2 = r0.A02;
        return (f - f2) / (r0.A00 - f2);
    }

    public float A02() {
        AnonymousClass0QL r2 = this.A06;
        if (r2 == null) {
            return 0.0f;
        }
        float f = this.A01;
        if (f == 2.14748365E9f) {
            return r2.A00;
        }
        return f;
    }

    public float A03() {
        AnonymousClass0QL r2 = this.A06;
        if (r2 == null) {
            return 0.0f;
        }
        float f = this.A02;
        if (f == -2.14748365E9f) {
            return r2.A02;
        }
        return f;
    }

    public void A04() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.A0A) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public void A06() {
        if (this.A07) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void A07(float f) {
        if (this.A00 != f) {
            this.A00 = AnonymousClass001.A01(A02(), f, A03());
            this.A05 = 0;
            A04();
        }
    }

    public void A08(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            AnonymousClass0QL r0 = this.A06;
            if (r0 == null) {
                f3 = -3.4028235E38f;
                f4 = Float.MAX_VALUE;
            } else {
                f3 = r0.A02;
                f4 = r0.A00;
            }
            this.A02 = AnonymousClass001.A01(f4, f, f3);
            this.A01 = AnonymousClass001.A01(f4, f2, f3);
            A07((float) ((int) AnonymousClass001.A01(f2, this.A00, f)));
            return;
        }
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass001.A1P(A0M, f, 0);
        AnonymousClass001.A1P(A0M, f2, 1);
        throw AnonymousClass001.A0c(String.format("minFrame (%s) must be <= maxFrame (%s)", A0M));
    }

    public void A09(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.A09) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.A09.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0A.add(animatorUpdateListener);
    }

    public void cancel() {
        for (Animator.AnimatorListener onAnimationCancel : this.A09) {
            onAnimationCancel.onAnimationCancel(this);
        }
        A00(this);
    }

    public float getAnimatedFraction() {
        float f;
        float A032;
        if (this.A06 == null) {
            return 0.0f;
        }
        if (this.A03 < 0.0f) {
            f = A02();
            A032 = this.A00;
        } else {
            f = this.A00;
            A032 = A03();
        }
        return (f - A032) / (A02() - A03());
    }

    public long getDuration() {
        AnonymousClass0QL r0 = this.A06;
        if (r0 == null) {
            return 0;
        }
        return (long) AnonymousClass0QL.A00(r0);
    }

    public long getStartDelay() {
        throw AnonymousClass002.A0G("LottieAnimator does not support getStartDelay.");
    }

    public boolean isRunning() {
        return this.A07;
    }

    public void removeAllListeners() {
        this.A09.clear();
    }

    public void removeAllUpdateListeners() {
        this.A0A.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.A09.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0A.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw AnonymousClass002.A0G("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw AnonymousClass002.A0G("LottieAnimator does not support setStartDelay.");
    }

    public static void A00(AnonymousClass00H r1) {
        Choreographer.getInstance().removeFrameCallback(r1);
        r1.A07 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r4 > r2) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFrame(long r8) {
        /*
            r7 = this;
            r7.A06()
            X.0QL r6 = r7.A06
            if (r6 == 0) goto L_0x0090
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x0090
            long r1 = r7.A05
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0015
            long r3 = r8 - r1
        L_0x0015:
            r5 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r6.A01
            float r5 = r5 / r0
            float r2 = r7.A03
            float r0 = java.lang.Math.abs(r2)
            float r5 = r5 / r0
            float r1 = (float) r3
            float r1 = r1 / r5
            float r4 = r7.A00
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            float r1 = -r1
        L_0x002c:
            float r4 = r4 + r1
            r7.A00 = r4
            float r3 = r7.A03()
            float r2 = r7.A02()
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0040
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r1 = r0 ^ 1
            float r0 = X.AnonymousClass001.A01(r2, r4, r3)
            r7.A00 = r0
            r7.A05 = r8
            r7.A04()
            if (r1 == 0) goto L_0x007b
            int r1 = r7.getRepeatCount()
            r0 = -1
            if (r1 == r0) goto L_0x0096
            int r1 = r7.A04
            int r0 = r7.getRepeatCount()
            if (r1 < r0) goto L_0x0096
            float r1 = r7.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            float r0 = r7.A03()
        L_0x006a:
            r7.A00 = r0
            A00(r7)
            float r1 = r7.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r7.A09(r0)
        L_0x007b:
            X.0QL r0 = r7.A06
            if (r0 == 0) goto L_0x008d
            float r3 = r7.A00
            float r1 = r7.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00da
            float r0 = r7.A01
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00da
        L_0x008d:
            X.AnonymousClass0K1.A01()
        L_0x0090:
            return
        L_0x0091:
            float r0 = r7.A02()
            goto L_0x006a
        L_0x0096:
            java.util.Set r0 = r7.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x009c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r0.onAnimationRepeat(r7)
            goto L_0x009c
        L_0x00ac:
            int r0 = r7.A04
            int r0 = r0 + 1
            r7.A04 = r0
            int r1 = r7.getRepeatMode()
            r0 = 2
            if (r1 != r0) goto L_0x00c7
            boolean r0 = r7.A08
            r0 = r0 ^ 1
            r7.A08 = r0
            float r0 = r7.A03
            float r0 = -r0
            r7.A03 = r0
        L_0x00c4:
            r7.A05 = r8
            goto L_0x007b
        L_0x00c7:
            float r1 = r7.A03
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d5
            float r0 = r7.A02()
        L_0x00d2:
            r7.A00 = r0
            goto L_0x00c4
        L_0x00d5:
            float r0 = r7.A03()
            goto L_0x00d2
        L_0x00da:
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0 = 0
            r2[r0] = r1
            float r0 = r7.A01
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 1
            r2[r0] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r0 = 2
            r2[r0] = r1
            java.lang.String r0 = "Frame must be [%f,%f]. It is %f"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00H.doFrame(long):void");
    }

    public Object getAnimatedValue() {
        return Float.valueOf(A01());
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.A08) {
            this.A08 = false;
            this.A03 = -this.A03;
        }
    }

    public ValueAnimator setDuration(long j) {
        throw AnonymousClass002.A0G("LottieAnimator does not support setDuration.");
    }
}
