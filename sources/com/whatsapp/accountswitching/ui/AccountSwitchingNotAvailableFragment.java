package com.whatsapp.accountswitching.ui;

import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass33p;
import X.AnonymousClass5XC;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class AccountSwitchingNotAvailableFragment extends Hilt_AccountSwitchingNotAvailableFragment {
    public AnonymousClass5XC A00;
    public AnonymousClass33p A01;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        Log.i("AccountSwitchingNotAvailableFragment/dialog shown");
        View findViewById = view.findViewById(R.id.account_switching_notify_me_button);
        View findViewById2 = view.findViewById(R.id.account_switching_dismiss_button);
        AnonymousClass33p r0 = this.A01;
        if (r0 != null) {
            if (C18280x3.A1W(AnonymousClass0x2.A0F(r0), "notify_account_switching_available")) {
                AnonymousClass002.A09(view, R.id.account_switching_not_available_subtitle).setText(R.string.f11nameremoved);
                C162457s7.A0H(findViewById);
                findViewById.setVisibility(8);
            } else {
                C18280x3.A0p(findViewById, this, 33);
            }
            C18280x3.A0p(findViewById2, this, 34);
            A1Y().A00(7, 20);
            return;
        }
        throw C18270x1.A0S("waSharedPreferences");
    }

    public static final void A00(AccountSwitchingNotAvailableFragment accountSwitchingNotAvailableFragment) {
        Log.i("AccountSwitchingNotAvailableFragment/actionButton clicked");
        AnonymousClass33p r0 = accountSwitchingNotAvailableFragment.A01;
        if (r0 != null) {
            C18270x1.A0l(C18270x1.A03(r0), "notify_account_switching_available", true);
            accountSwitchingNotAvailableFragment.A1Y().A00(7, 22);
            super.A1L();
            return;
        }
        throw C18270x1.A0S("waSharedPreferences");
    }

    public final AnonymousClass5XC A1Y() {
        AnonymousClass5XC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("accountSwitchingLogger");
    }

    public void onCancel(DialogInterface dialogInterface) {
        A1Y().A00(7, 21);
        A1L();
    }
}
