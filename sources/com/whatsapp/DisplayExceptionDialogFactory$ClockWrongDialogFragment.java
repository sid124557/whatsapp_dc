package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass5XU;
import X.C003203q;
import X.C18310x6;
import X.C56612sH;
import X.C620633i;
import X.C85824Ht;
import X.C88984bI;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$ClockWrongDialogFragment extends Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment {
    public AnonymousClass5XU A00;
    public C620633i A01;
    public C56612sH A02;
    public boolean A03 = true;

    public Dialog A1J(Bundle bundle) {
        Log.w("home/dialog clock-wrong");
        C003203q A0R = A0R();
        C88984bI r2 = new C88984bI(A0R, this.A00, this.A01, this.A02, this.A01);
        r2.setOnCancelListener(new C85824Ht(A0R, 0));
        return r2;
    }

    public void A0f() {
        super.A0f();
        if (!this.A00.A03()) {
            A1K();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03 = false;
        A1K();
        new DisplayExceptionDialogFactory$ClockWrongDialogFragment().A1O(A0R().getSupportFragmentManager(), AnonymousClass000.A0O(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A03 && A0Q() != null) {
            C18310x6.A1A(this);
        }
    }
}
