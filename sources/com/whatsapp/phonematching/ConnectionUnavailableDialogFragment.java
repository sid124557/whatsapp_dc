package com.whatsapp.phonematching;

import X.AnonymousClass4FS;
import X.AnonymousClass5V0;
import X.AnonymousClass5WY;
import X.AnonymousClass5ZR;
import X.C003203q;
import X.C08270df;
import X.C18300x5;
import X.C19340zH;
import X.C29441ip;
import X.C53202mi;
import X.C56912sl;
import X.C620633i;
import X.C626936e;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ConnectionUnavailableDialogFragment extends Hilt_ConnectionUnavailableDialogFragment {
    public AnonymousClass5WY A00;
    public C29441ip A01;
    public C620633i A02;
    public AnonymousClass5ZR A03;
    public C53202mi A04;
    public C56912sl A05;
    public AnonymousClass4FS A06;

    public Dialog A1J(Bundle bundle) {
        C003203q A0Q = A0Q();
        C626936e.A06(A0Q);
        C19340zH A002 = AnonymousClass5V0.A00(A0Q);
        A002.A0T(R.string.f11nameremoved);
        C19340zH.A09(A002, A0Q, this, 18, R.string.f11nameremoved);
        C19340zH.A07(A002, this, 75, R.string.f11nameremoved);
        return A002.create();
    }

    public void A1O(C08270df r1, String str) {
        C18300x5.A1B(this, r1, str);
    }
}
