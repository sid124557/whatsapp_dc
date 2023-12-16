package com.whatsapp.growthlock;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass4I8;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C18300x5;
import X.C19340zH;
import X.C53602nM;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class InviteLinkUnavailableDialogFragment extends Hilt_InviteLinkUnavailableDialogFragment {
    public C53602nM A00;

    public static InviteLinkUnavailableDialogFragment A00(boolean z, boolean z2) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("finishCurrentActivity", z);
        A08.putBoolean("isGroupStillLocked", z2);
        InviteLinkUnavailableDialogFragment inviteLinkUnavailableDialogFragment = new InviteLinkUnavailableDialogFragment();
        inviteLinkUnavailableDialogFragment.A0u(A08);
        return inviteLinkUnavailableDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        C003203q A0Q = A0Q();
        boolean z = A0H().getBoolean("isGroupStillLocked");
        AnonymousClass4I8 r4 = new AnonymousClass4I8(A0Q, 16, this);
        TextView textView = (TextView) A0I().inflate(R.layout.f8nameremoved, (ViewGroup) null);
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        textView.setText(i);
        C19340zH A002 = AnonymousClass5V0.A00(A0Q);
        A002.A0Z(textView);
        int i2 = R.string.f11nameremoved;
        if (z) {
            i2 = R.string.f11nameremoved;
        }
        A002.A0T(i2);
        A002.A0i(true);
        A002.A0W(r4, R.string.f11nameremoved);
        A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
        AnonymousClass043 create = A002.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (A0H().getBoolean("finishCurrentActivity")) {
            C18300x5.A1A(this);
        }
    }
}
