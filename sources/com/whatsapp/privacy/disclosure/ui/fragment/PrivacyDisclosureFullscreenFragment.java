package com.whatsapp.privacy.disclosure.ui.fragment;

import X.AnonymousClass4SD;
import X.AnonymousClass58Y;
import X.AnonymousClass5BZ;
import X.AnonymousClass5Yj;
import X.AnonymousClass751;
import X.C003203q;
import X.C08310eF;
import X.C152417Yu;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C19300zA;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class PrivacyDisclosureFullscreenFragment extends C08310eF {
    public C152417Yu A00;
    public C19300zA A01;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        View view2 = this.A0B;
        if (view2 != null) {
            view2.setBackgroundColor(C18290x4.A0G(view2).getColor(AnonymousClass5Yj.A02(view2.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)));
        }
        C152417Yu r0 = this.A00;
        if (r0 == null) {
            throw C18270x1.A0S("args");
        }
        C19300zA r3 = this.A01;
        if (r3 != null) {
            r3.A00(r0.A02, r0.A00, r0.A01);
        }
        A0R().A05.A01(new AnonymousClass4SD(), A0V());
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

    public void A0c() {
        super.A0c();
        this.A01 = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        C152417Yu A002 = AnonymousClass751.A00(this);
        if (A002 != null) {
            this.A00 = A002;
            return;
        }
        Log.e("PrivacyDisclosureFullscreenFragment: parseAndValidateArguments(): invalid disclosure arguments");
        AnonymousClass5BZ.A00(A0U(), AnonymousClass58Y.RESULT_ERROR);
    }
}
