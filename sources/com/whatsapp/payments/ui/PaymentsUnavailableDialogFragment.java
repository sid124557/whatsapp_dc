package com.whatsapp.payments.ui;

import X.AnonymousClass002;
import X.AnonymousClass5V0;
import X.AnonymousClass5WY;
import X.C003203q;
import X.C19340zH;
import X.C204219p0;
import X.C53202mi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class PaymentsUnavailableDialogFragment extends Hilt_PaymentsUnavailableDialogFragment {
    public AnonymousClass5WY A00;
    public C53202mi A01;

    public static PaymentsUnavailableDialogFragment A00() {
        PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("arg_is_underage_unavailability", false);
        paymentsUnavailableDialogFragment.A0u(A08);
        return paymentsUnavailableDialogFragment;
    }

    public static PaymentsUnavailableDialogFragment A01() {
        PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("arg_is_underage_unavailability", true);
        paymentsUnavailableDialogFragment.A0u(A08);
        return paymentsUnavailableDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        boolean z;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            z = bundle2.getBoolean("arg_is_underage_unavailability");
        } else {
            z = false;
        }
        C19340zH A002 = AnonymousClass5V0.A00(A0Q());
        A002.A0U(R.string.f11nameremoved);
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        A002.A0T(i);
        A002.A0i(false);
        int i2 = R.string.f11nameremoved;
        if (z) {
            i2 = R.string.f11nameremoved;
        }
        A002.A0Y((DialogInterface.OnClickListener) null, i2);
        if (z) {
            A002.A0X(new C204219p0(this, 83), R.string.f11nameremoved);
        }
        return A002.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C003203q A0Q = A0Q();
        if (A0Q != null) {
            A0Q.finish();
        }
    }
}
