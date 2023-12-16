package com.whatsapp.status.playback.fragment;

import X.AnonymousClass66G;
import X.C113995mK;
import X.C162457s7;
import X.C620633i;
import X.C66433Lk;
import X.C69263Wi;
import X.C85244Fm;
import android.content.DialogInterface;

public class OpenLinkDialogFragment extends Hilt_OpenLinkDialogFragment {
    public C69263Wi A00;
    public C85244Fm A01;
    public C620633i A02;
    public C113995mK A03;
    public AnonymousClass66G A04;
    public C66433Lk A05;

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass66G r0 = this.A04;
        if (r0 != null) {
            r0.BR6();
        }
    }
}
