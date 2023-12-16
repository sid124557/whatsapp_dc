package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: X.0Qv  reason: invalid class name and case insensitive filesystem */
public final class C04830Qv {
    public final WeakReference A00;

    public static View A00(C04830Qv r0) {
        return (View) r0.A00.get();
    }

    public C04830Qv(View view) {
        this.A00 = new WeakReference(view);
    }

    public void A01() {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().cancel();
        }
    }

    public void A02() {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().start();
        }
    }

    public void A03(float f) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().alpha(f);
        }
    }

    public void A04(float f) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().scaleX(f);
        }
    }

    public void A05(float f) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().scaleY(f);
        }
    }

    public void A06(float f) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().translationX(f);
        }
    }

    public void A07(float f) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().translationY(f);
        }
    }

    public void A08(long j) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().setDuration(j);
        }
    }

    public void A09(Interpolator interpolator) {
        View A002 = A00(this);
        if (A002 != null) {
            A002.animate().setInterpolator(interpolator);
        }
    }

    public void A0A(AnonymousClass0u4 r5) {
        C17460vc r0;
        View A002 = A00(this);
        if (A002 != null) {
            ViewPropertyAnimator animate = A002.animate();
            if (r5 != null) {
                r0 = new C17460vc(A002, this, r5, 0);
            } else {
                r0 = null;
            }
            animate.setListener(r0);
        }
    }
}
