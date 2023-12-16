package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0YD  reason: invalid class name */
public final class AnonymousClass0YD {
    public static final long A00 = TimeUnit.SECONDS.toMillis(1);
    public static final AnonymousClass0YD A01 = new AnonymousClass0YD();

    public static final long A00(Animator animator) {
        C162457s7.A0J(animator, 0);
        if (animator instanceof AnonymousClass004) {
            AnonymousClass004 r6 = (AnonymousClass004) animator;
            return (r6.A04 * ((long) r6.A00)) + A00(r6.A05);
        } else if (animator instanceof AnonymousClass003) {
            return ((AnonymousClass003) animator).A01();
        } else {
            if (animator instanceof AnonymousClass00G) {
                return ((ValueAnimator) animator).getCurrentPlayTime();
            }
            return 0;
        }
    }

    public static final long A01(Animator animator) {
        C162457s7.A0J(animator, 0);
        if (animator instanceof AnonymousClass004) {
            return ((AnonymousClass004) animator).getTotalDuration();
        }
        if (animator instanceof AnonymousClass003) {
            return ((AnonymousClass003) animator).getTotalDuration();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return animator.getTotalDuration();
        }
        return animator.getStartDelay() + animator.getDuration();
    }

    public static final void A03(Animator animator, long j) {
        C162457s7.A0J(animator, 0);
        animator.setStartDelay(animator.getStartDelay() + j);
    }

    public static final void A04(Animator animator, long j) {
        C162457s7.A0J(animator, 0);
        if (animator instanceof AnonymousClass004) {
            ((AnonymousClass004) animator).A01(j);
        } else if (animator instanceof AnonymousClass003) {
            for (Animator A04 : ((AnonymousClass003) animator).A03) {
                A04(A04, j);
            }
        } else if (animator instanceof AnonymousClass00G) {
            ((ValueAnimator) animator).setCurrentPlayTime(j);
        }
    }

    public final void A05(C153427bI r3, String str, boolean z) {
        C162457s7.A0J(str, 1);
        Animator A02 = A02(r3, str);
        if (A02 != null) {
            A02.addListener(new AnonymousClass009(r3, str, z));
            A02.start();
        }
    }

    public static final Animator A02(C153427bI r0, String str) {
        return C162377rs.A00(r0, str);
    }
}
