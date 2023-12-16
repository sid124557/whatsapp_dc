package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: X.7ka  reason: invalid class name and case insensitive filesystem */
public class C158807ka {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public TimeInterpolator A04;

    public void A00(Animator animator) {
        animator.setStartDelay(this.A02);
        animator.setDuration(this.A03);
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C159917mg.A02;
        }
        animator.setInterpolator(timeInterpolator);
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.A00);
            valueAnimator.setRepeatMode(this.A01);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C158807ka) {
            C158807ka r7 = (C158807ka) obj;
            if (this.A02 == r7.A02 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A01 == r7.A01) {
                TimeInterpolator timeInterpolator = this.A04;
                if (timeInterpolator == null) {
                    timeInterpolator = C159917mg.A02;
                }
                Class<?> cls = timeInterpolator.getClass();
                TimeInterpolator timeInterpolator2 = r7.A04;
                if (timeInterpolator2 == null) {
                    timeInterpolator2 = C159917mg.A02;
                }
                return AnonymousClass001.A1a(timeInterpolator2, cls);
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.A02;
        int A032 = AnonymousClass6C7.A03(((int) (j ^ (j >>> 32))) * 31, this.A03);
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C159917mg.A02;
        }
        return ((AnonymousClass000.A08(timeInterpolator.getClass(), A032) + this.A00) * 31) + this.A01;
    }

    public C158807ka(TimeInterpolator timeInterpolator, long j, long j2) {
        this.A00 = 0;
        this.A01 = 1;
        this.A02 = j;
        this.A03 = j2;
        this.A04 = timeInterpolator;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(10);
        A0o.append(AnonymousClass000.A0O(this));
        C18270x1.A18(this, A0o, '{');
        A0o.append(" delay: ");
        A0o.append(this.A02);
        A0o.append(" duration: ");
        A0o.append(this.A03);
        A0o.append(" interpolator: ");
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C159917mg.A02;
        }
        A0o.append(timeInterpolator.getClass());
        A0o.append(" repeatCount: ");
        A0o.append(this.A00);
        A0o.append(" repeatMode: ");
        A0o.append(this.A01);
        return AnonymousClass000.A0X("}\n", A0o);
    }

    public C158807ka(long j) {
        this.A04 = null;
        this.A00 = 0;
        this.A01 = 1;
        this.A02 = j;
        this.A03 = 150;
    }
}
