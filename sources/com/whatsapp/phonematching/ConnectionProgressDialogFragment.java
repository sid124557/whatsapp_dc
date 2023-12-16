package com.whatsapp.phonematching;

import X.C08270df;
import X.C08310eF;
import X.C18300x5;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ConnectionProgressDialogFragment extends Hilt_ConnectionProgressDialogFragment {
    public Dialog A1J(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(A0Q());
        progressDialog.setMessage(C08310eF.A09(this).getString(R.string.f11nameremoved));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public void A1O(C08270df r1, String str) {
        C18300x5.A1B(this, r1, str);
    }
}
