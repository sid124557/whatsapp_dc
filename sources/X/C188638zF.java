package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.util.Log;

/* renamed from: X.8zF  reason: invalid class name and case insensitive filesystem */
public class C188638zF extends AnimatorListenerAdapter {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public final int A03 = 1;

    public C188638zF(C105235Uc r2, boolean z, boolean z2) {
        this.A00 = r2;
        this.A02 = z;
        this.A01 = z2;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A03 != 0) {
            super.onAnimationCancel(animator);
        } else {
            this.A01 = true;
        }
    }

    public void onAnimationEnd(Animator animator) {
        int i = this.A03;
        Object obj = this.A00;
        if (i != 0) {
            C105235Uc r1 = (C105235Uc) obj;
            if (r1.A04 != null) {
                Log.d("RecordingLockController/onAnimationEnd/requestStop");
                r1.A04.Bcq(this.A02, this.A01, false, false);
                return;
            }
            return;
        }
        C160787oJ r12 = (C160787oJ) obj;
        r12.A04 = 0;
        r12.A07 = null;
        if (!this.A01) {
            AnonymousClass6Z3 r2 = r12.A0L;
            boolean z = this.A02;
            int i2 = 4;
            if (z) {
                i2 = 8;
            }
            r2.A01(i2, z);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A03 != 0) {
            AnonymousClass4NZ r0 = ((C105235Uc) this.A00).A05;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        C160787oJ r3 = (C160787oJ) this.A00;
        r3.A0L.A01(0, this.A02);
        r3.A04 = 1;
        r3.A07 = animator;
        this.A01 = false;
    }

    public C188638zF(C160787oJ r2, boolean z) {
        this.A00 = r2;
        this.A02 = z;
    }
}
