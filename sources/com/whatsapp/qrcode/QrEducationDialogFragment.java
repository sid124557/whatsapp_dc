package com.whatsapp.qrcode;

import X.AnonymousClass0x2;
import X.C08310eF;
import X.C18270x1;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

public class QrEducationDialogFragment extends Hilt_QrEducationDialogFragment {
    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        ((QrEducationView) inflate.findViewById(R.id.education)).A0E = false;
        AnonymousClass0x2.A0y(inflate.findViewById(R.id.ok), this, 0);
        return inflate;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A1M(2, R.style.f12nameremoved);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C08310eF r5 = this.A0E;
        if (r5 instanceof QrScanCodeFragment) {
            QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) r5;
            if (qrScanCodeFragment.A09) {
                qrScanCodeFragment.A09 = false;
                C18270x1.A0l(C18270x1.A03(qrScanCodeFragment.A04), "contact_qr_education", false);
                qrScanCodeFragment.A02.A0T(qrScanCodeFragment.A0C, 15000);
            }
            qrScanCodeFragment.A08 = false;
            qrScanCodeFragment.A06.Bjp();
        }
    }
}
