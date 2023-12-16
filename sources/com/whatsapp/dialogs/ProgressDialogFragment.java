package com.whatsapp.dialogs;

import X.AnonymousClass002;
import X.AnonymousClass4LF;
import X.AnonymousClass5X0;
import X.C08270df;
import X.C08310eF;
import X.C18300x5;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class ProgressDialogFragment extends Hilt_ProgressDialogFragment {
    public DialogInterface.OnKeyListener A00;
    public boolean A01 = false;

    public Dialog A1J(Bundle bundle) {
        String str;
        if (bundle != null) {
            this.A01 = !AnonymousClass5X0.A02;
        }
        A0H();
        int i = A0H().getInt("title_id");
        int i2 = this.A06.getInt("message_id");
        if (bundle != null) {
            str = bundle.getString("previous_message_text");
        } else {
            str = null;
        }
        AnonymousClass4LF r2 = new AnonymousClass4LF(A0Q());
        String string = this.A06.getString("title");
        if (!(string == null && (i == 0 || (string = C08310eF.A09(this).getString(i)) == null))) {
            r2.setTitle(string);
        }
        if (!(str == null && (str = this.A06.getString("message")) == null && (i2 == 0 || (str = C08310eF.A09(this).getString(i2)) == null))) {
            r2.setMessage(str);
        }
        r2.setIndeterminate(true);
        A1P(false);
        DialogInterface.OnKeyListener onKeyListener = this.A00;
        if (onKeyListener != null) {
            r2.setOnKeyListener(onKeyListener);
        }
        return r2;
    }

    public static ProgressDialogFragment A00(int i, int i2) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("title_id", i);
        A08.putInt("message_id", i2);
        progressDialogFragment.A0u(A08);
        return progressDialogFragment;
    }

    public void A1V() {
        if (this.A04 >= 7) {
            A1K();
        } else {
            this.A01 = true;
        }
    }

    public void A0g() {
        super.A0g();
        if (this.A01) {
            A1K();
            this.A01 = false;
        }
    }

    public void A0q(Bundle bundle) {
        CharSequence charSequence;
        super.A0q(bundle);
        AnonymousClass4LF r0 = (AnonymousClass4LF) this.A03;
        if (r0 != null && (charSequence = r0.A00) != null) {
            bundle.putString("previous_message_text", charSequence.toString());
        }
    }

    public void A1O(C08270df r1, String str) {
        C18300x5.A1B(this, r1, str);
    }
}
