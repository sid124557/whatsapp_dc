package com.whatsapp;

import X.AnonymousClass1VX;
import X.AnonymousClass4FV;
import X.AnonymousClass5XU;
import X.C003203q;
import X.C105435Ux;
import X.C111095hX;
import X.C18300x5;
import X.C50382i5;
import X.C53602nM;
import X.C56612sH;
import X.C620633i;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment extends Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment {
    public C111095hX A00;
    public AnonymousClass5XU A01;
    public C50382i5 A02;
    public C53602nM A03;
    public C620633i A04;
    public C56612sH A05;
    public AnonymousClass4FV A06;

    public Dialog A1J(Bundle bundle) {
        Log.w("home/dialog software-expired");
        C003203q A0R = A0R();
        C56612sH r6 = this.A05;
        AnonymousClass1VX r8 = this.A02;
        C50382i5 r3 = this.A02;
        AnonymousClass4FV r9 = this.A06;
        AnonymousClass5XU r2 = this.A01;
        return C105435Ux.A00(A0R, this.A00, r2, r3, this.A03, this.A04, r6, this.A01, r8, r9);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C18300x5.A1A(this);
    }
}
