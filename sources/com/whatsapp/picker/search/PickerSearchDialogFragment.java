package com.whatsapp.picker.search;

import X.AnonymousClass34K;
import X.AnonymousClass6BC;
import X.AnonymousClass8s7;
import X.C003203q;
import X.C107405bG;
import X.C115975pX;
import X.C162157rM;
import X.C162457s7;
import X.C18290x4;
import X.C94264qq;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public abstract class PickerSearchDialogFragment extends Hilt_PickerSearchDialogFragment {
    public C115975pX A00;

    public void onDismiss(DialogInterface dialogInterface) {
        C94264qq r0;
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C115975pX r2 = this.A00;
        if (r2 != null) {
            r2.A06 = false;
            if (r2.A07 && (r0 = r2.A00) != null) {
                r0.A09();
            }
            r2.A03 = null;
            C162157rM r02 = r2.A08;
            if (r02 != null) {
                r02.A00 = null;
                C18290x4.A1L(r02.A02);
            }
        }
        this.A00 = null;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass8s7 r2;
        C003203q A0Q = A0Q();
        if ((A0Q instanceof AnonymousClass8s7) && (r2 = (AnonymousClass8s7) A0Q) != null) {
            r2.BY7(this);
        }
        return null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1M(0, R.style.f12nameremoved);
    }

    public Dialog A1J(Bundle bundle) {
        Dialog A1J = super.A1J(bundle);
        C162457s7.A0D(A1J);
        C107405bG.A02(AnonymousClass34K.A01(A1D(), R.attr.f3nameremoved), A1J);
        A1J.setOnKeyListener(new AnonymousClass6BC(this, 2));
        return A1J;
    }
}
