package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass0x2;
import X.AnonymousClass2R8;
import X.AnonymousClass4BC;
import X.C116985rC;
import X.C18280x3;
import X.C19340zH;
import X.C85804Hr;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class WebCodeDialogFragment extends Hilt_WebCodeDialogFragment {
    public C116985rC A00;
    public AnonymousClass2R8 A01;
    public AnonymousClass4BC A02;

    public void A0d() {
        this.A02 = null;
        super.A0d();
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof AnonymousClass4BC) {
            this.A02 = (AnonymousClass4BC) context;
        }
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0B(R.string.f11nameremoved);
        A0K.A0A(R.string.f11nameremoved);
        AnonymousClass0x2.A0t(new C85804Hr(this, 84), A0K, R.string.f11nameremoved);
        return A0K.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass4BC r0 = this.A02;
        if (r0 != null) {
            r0.BZD();
        }
    }
}
