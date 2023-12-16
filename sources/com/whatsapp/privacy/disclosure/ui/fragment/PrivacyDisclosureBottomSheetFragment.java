package com.whatsapp.privacy.disclosure.ui.fragment;

import X.AnonymousClass15U;
import X.AnonymousClass58Y;
import X.AnonymousClass5BZ;
import X.AnonymousClass751;
import X.C003203q;
import X.C141826wC;
import X.C152417Yu;
import X.C162457s7;
import X.C18270x1;
import X.C19300zA;
import X.C620633i;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.util.Log;

public final class PrivacyDisclosureBottomSheetFragment extends RoundedBottomSheetDialogFragment {
    public C152417Yu A00;
    public C19300zA A01;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        C152417Yu r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("args");
        }
        C19300zA r3 = this.A01;
        if (r3 != null) {
            r3.A00(r0.A02, r0.A00, r0.A01);
        }
    }

    public void A1X(View view) {
        C162457s7.A0J(view, 0);
        super.A1X(view);
        C152417Yu r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("args");
        }
        boolean z = false;
        if (r0.A02.A04 == C141826wC.LARGE) {
            z = true;
            C620633i.A04(view, this);
        }
        BottomSheetBehavior A012 = BottomSheetBehavior.A01(view);
        A012.A0d(true);
        A012.A0a(new AnonymousClass15U(A012, this, z));
        A012.A0S(3);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C003203q A0Q = A0Q();
        if (A0Q == null) {
            return null;
        }
        C19300zA r0 = new C19300zA(A0Q, A0Q.getSupportFragmentManager());
        this.A01 = r0;
        return r0;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        C152417Yu A002 = AnonymousClass751.A00(this);
        if (A002 != null) {
            this.A00 = A002;
            return;
        }
        Log.e("PrivacyDisclosureBottomSheetFragment: parseAndValidateArguments(): invalid disclosure arguments");
        AnonymousClass5BZ.A00(A0U(), AnonymousClass58Y.RESULT_ERROR);
        A1L();
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            AnonymousClass5BZ.A00(A0Q.getSupportFragmentManager(), AnonymousClass58Y.RESULT_BACK);
        }
    }
}
