package com.whatsapp;

import X.AnonymousClass5Y0;
import X.C50472iE;
import android.content.DialogInterface;

@Deprecated
public class LegacyMessageDialogFragment extends Hilt_LegacyMessageDialogFragment {
    public DialogInterface.OnClickListener A00;
    public DialogInterface.OnClickListener A01;
    public AnonymousClass5Y0 A02;

    public static C50472iE A00(Object[] objArr, int i) {
        C50472iE r0 = new C50472iE();
        r0.A01 = i;
        r0.A0A = objArr;
        return r0;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
