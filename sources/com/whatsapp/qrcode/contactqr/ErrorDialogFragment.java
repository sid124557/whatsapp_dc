package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass4BC;
import X.C08310eF;
import X.C18280x3;
import X.C19340zH;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public class ErrorDialogFragment extends Hilt_ErrorDialogFragment {
    public AnonymousClass4BC A00;

    public void A0d() {
        super.A0d();
        this.A00 = null;
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof AnonymousClass4BC) {
            this.A00 = (AnonymousClass4BC) context;
        }
    }

    public Dialog A1J(Bundle bundle) {
        int i;
        int i2 = A0H().getInt("ARG_ERROR_CODE");
        C19340zH A0K = C18280x3.A0K(this);
        A0K.setPositiveButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
        switch (i2) {
            case 2:
                A0K.A0B(R.string.f11nameremoved);
                A0K.A0Q(C08310eF.A09(this).getString(R.string.f11nameremoved));
                break;
            case 3:
                i = R.string.f11nameremoved;
                break;
            case 4:
                i = R.string.f11nameremoved;
                break;
            case 5:
                i = R.string.f11nameremoved;
                break;
            case 6:
                i = R.string.f11nameremoved;
                break;
            case 7:
                i = R.string.f11nameremoved;
                break;
            default:
                i = R.string.f11nameremoved;
                break;
        }
        A0K.A0A(i);
        return A0K.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass4BC r0 = this.A00;
        if (r0 != null) {
            r0.BZD();
        }
    }
}
