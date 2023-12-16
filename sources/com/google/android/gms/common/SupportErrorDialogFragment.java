package com.google.android.gms.common;

import X.C162177rO;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog A00;
    public Dialog A01;
    public DialogInterface.OnCancelListener A02;

    public Dialog A1J(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog != null) {
            return dialog;
        }
        this.A0E = false;
        Dialog dialog2 = this.A01;
        if (dialog2 != null) {
            return dialog2;
        }
        Context A1D = A1D();
        C162177rO.A02(A1D);
        AlertDialog create = new AlertDialog.Builder(A1D).create();
        this.A01 = create;
        return create;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A02;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
