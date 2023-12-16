package X;

import android.transition.Transition;

/* renamed from: X.8zr  reason: invalid class name and case insensitive filesystem */
public class C189018zr extends C166717z9 {
    public Object A00;
    public final int A01;

    public C189018zr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C189018zr r1) {
        ((C182718os) r1.A00).Bed(false);
    }

    public void onTransitionEnd(Transition transition) {
        if (this.A01 != 0) {
            A00(this);
        } else {
            ((C92614my) this.A00).A05 = false;
        }
    }

    public void onTransitionStart(Transition transition) {
        if (this.A01 != 0) {
            super.onTransitionStart(transition);
        } else {
            ((C92614my) this.A00).A05 = true;
        }
    }
}
