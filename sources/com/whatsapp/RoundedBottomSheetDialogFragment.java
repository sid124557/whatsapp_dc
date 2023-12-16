package com.whatsapp;

import X.AnonymousClass1VX;
import X.AnonymousClass5IB;
import X.AnonymousClass64B;
import X.AnonymousClass7SZ;
import X.C139806se;
import X.C139836sh;
import X.C139846si;
import X.C139856sj;
import X.C139866sk;
import X.C162457s7;
import X.C162687sa;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.biz.cart.view.fragment.CartFragment;

@Deprecated
public abstract class RoundedBottomSheetDialogFragment extends Hilt_RoundedBottomSheetDialogFragment {
    public AnonymousClass5IB A00;
    public AnonymousClass7SZ A01 = null;

    public int A1H() {
        if (this instanceof CartFragment) {
            return R.style.f12nameremoved;
        }
        return R.style.f12nameremoved;
    }

    public AnonymousClass7SZ A1U() {
        AnonymousClass7SZ r1 = this.A01;
        if (r1 == null) {
            C139806se r4 = new C139806se(this);
            AnonymousClass5IB r3 = this.A00;
            Class<?> cls = getClass();
            C162457s7.A0J(cls, 0);
            AnonymousClass1VX r12 = r3.A01;
            if (r12.A0X(3856)) {
                r1 = new C139836sh(r4);
            } else if (!AnonymousClass64B.class.isAssignableFrom(cls) || !r12.A0X(3316)) {
                r1 = C139866sk.A00;
            } else {
                r1 = new C139846si(r3.A00, r4);
            }
            this.A01 = r1;
        }
        return r1;
    }

    public Dialog A1J(Bundle bundle) {
        boolean z = A1U().A01;
        Dialog A1J = super.A1J(bundle);
        if (!z) {
            A1J.setOnShowListener(new C162687sa(A1J, this));
        }
        return A1J;
    }

    public void A1X(View view) {
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(view);
        A012.A0S(3);
        A012.A0p = true;
        A012.A0U(view.getHeight(), false);
    }

    public boolean A1Y() {
        if ((A1U() instanceof C139836sh) || (A1U() instanceof C139856sj)) {
            return true;
        }
        return false;
    }
}
