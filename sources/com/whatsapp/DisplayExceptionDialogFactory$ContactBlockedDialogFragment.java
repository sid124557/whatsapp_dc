package com.whatsapp;

import X.C003203q;
import X.C18310x6;
import X.C19340zH;
import X.C56962sq;
import X.C626936e;
import X.C85834Hu;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class DisplayExceptionDialogFactory$ContactBlockedDialogFragment extends Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment {
    public C56962sq A00;

    public Dialog A1J(Bundle bundle) {
        Log.w("home/dialog contact-blocked");
        Bundle A0H = A0H();
        String A0k = C18310x6.A0k(A0H, "message");
        ArrayList parcelableArrayList = A0H.getParcelableArrayList("jids");
        C626936e.A06(parcelableArrayList);
        C003203q A0R = A0R();
        C56962sq r4 = this.A00;
        C19340zH A002 = C19340zH.A00(A0R, A0k);
        A002.A0Y(new C85834Hu(A0R, r4, parcelableArrayList, 0), R.string.f11nameremoved);
        C19340zH.A05(A002);
        return A002.create();
    }
}
