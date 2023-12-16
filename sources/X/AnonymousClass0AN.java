package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0AN  reason: invalid class name */
public class AnonymousClass0AN extends AnonymousClass0AP {
    public Animator A0Z(View view, ViewGroup viewGroup, AnonymousClass0U7 r7, AnonymousClass0U7 r8) {
        Number number;
        float f = 0.0f;
        float f2 = 0.0f;
        if (!(r7 == null || (number = (Number) r7.A02.get("android:fade:transitionAlpha")) == null)) {
            f2 = number.floatValue();
        }
        if (f2 != 1.0f) {
            f = f2;
        }
        return A0b(view, f, 1.0f);
    }

    public Animator A0a(View view, ViewGroup viewGroup, AnonymousClass0U7 r6, AnonymousClass0U7 r7) {
        float f = 1.0f;
        Number number = (Number) r6.A02.get("android:fade:transitionAlpha");
        if (number != null) {
            f = number.floatValue();
        }
        return A0b(view, f, 0.0f);
    }

    public final Animator A0b(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AnonymousClass0VZ.A02.A04(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AnonymousClass0VZ.A01, new float[]{f2});
        ofFloat.addListener(new AnonymousClass008(view));
        A0B(new C17670vx(view, 0, this));
        return ofFloat;
    }

    public AnonymousClass0AN(int i) {
        if ((i & -4) == 0) {
            this.A00 = i;
            return;
        }
        throw AnonymousClass001.A0c("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public void A0V(AnonymousClass0U7 r4) {
        AnonymousClass0AP.A02(r4);
        r4.A02.put("android:fade:transitionAlpha", Float.valueOf(AnonymousClass0VZ.A02.A00(r4.A00)));
    }

    public AnonymousClass0AN() {
    }
}
