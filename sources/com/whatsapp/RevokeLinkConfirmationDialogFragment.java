package com.whatsapp;

import X.AnonymousClass002;
import X.AnonymousClass0Uj;
import X.AnonymousClass0x2;
import X.AnonymousClass34R;
import X.AnonymousClass5ZU;
import X.C08310eF;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C19340zH;
import X.C27991fJ;
import X.C56072rN;
import X.C64773Ex;
import X.C85804Hr;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class RevokeLinkConfirmationDialogFragment extends Hilt_RevokeLinkConfirmationDialogFragment {
    public C64773Ex A00;
    public AnonymousClass5ZU A01;
    public C56072rN A02;

    public static RevokeLinkConfirmationDialogFragment A00(C27991fJ r3, boolean z) {
        RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment = new RevokeLinkConfirmationDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A08, r3, "jid");
        A08.putBoolean("from_qr", z);
        revokeLinkConfirmationDialogFragment.A0u(A08);
        return revokeLinkConfirmationDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        String string;
        Bundle A0H = A0H();
        boolean z = A0H.getBoolean("from_qr");
        C19340zH A0K = C18280x3.A0K(this);
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        String string2 = C08310eF.A09(this).getString(i);
        C85804Hr r0 = new C85804Hr(this, 7);
        AnonymousClass0Uj r2 = A0K.A00;
        r2.A0I(r0, string2);
        r2.A0G((DialogInterface.OnClickListener) null, C08310eF.A09(this).getString(R.string.f11nameremoved));
        if (z) {
            A0K.setTitle(C08310eF.A09(this).getString(R.string.f11nameremoved));
            string = C08310eF.A09(this).getString(R.string.f11nameremoved);
        } else {
            C27991fJ A04 = AnonymousClass34R.A04(C18310x6.A0k(A0H, "jid"));
            boolean A06 = this.A02.A06(A04);
            int i2 = R.string.f11nameremoved;
            if (A06) {
                i2 = R.string.f11nameremoved;
            }
            Object[] A0L = AnonymousClass002.A0L();
            C18290x4.A1K(this.A01, C64773Ex.A00(this.A00, A04), A0L);
            string = C08310eF.A09(this).getString(i2, A0L);
        }
        A0K.A0Q(string);
        return A0K.create();
    }
}
