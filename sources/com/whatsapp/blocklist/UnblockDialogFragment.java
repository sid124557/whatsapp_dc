package com.whatsapp.blocklist;

import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass49D;
import X.AnonymousClass4I8;
import X.AnonymousClass4JL;
import X.AnonymousClass5V0;
import X.C003203q;
import X.C18310x6;
import X.C19340zH;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class UnblockDialogFragment extends Hilt_UnblockDialogFragment {
    public AnonymousClass49D A00;
    public boolean A01;

    public static UnblockDialogFragment A00(AnonymousClass49D r3, String str, int i, boolean z) {
        UnblockDialogFragment unblockDialogFragment = new UnblockDialogFragment();
        unblockDialogFragment.A00 = r3;
        unblockDialogFragment.A01 = z;
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("message", str);
        A08.putInt("title", i);
        unblockDialogFragment.A0u(A08);
        return unblockDialogFragment;
    }

    public Dialog A1J(Bundle bundle) {
        C85804Hr r3;
        C003203q A0Q = A0Q();
        String A0k = C18310x6.A0k(A0H(), "message");
        int i = A0H().getInt("title");
        if (this.A00 == null) {
            r3 = null;
        } else {
            r3 = new C85804Hr(this, 24);
        }
        AnonymousClass4I8 r1 = new AnonymousClass4I8(A0Q, 1, this);
        C19340zH A002 = AnonymousClass5V0.A00(A0Q);
        A002.A0Q(A0k);
        if (i != 0) {
            A002.A0B(i);
        }
        A002.setPositiveButton(R.string.f11nameremoved, r3);
        A002.setNegativeButton(R.string.f11nameremoved, r1);
        if (this.A01) {
            A002.A0M(new AnonymousClass4JL(A0Q, 0));
        }
        AnonymousClass043 create = A002.create();
        create.setCanceledOnTouchOutside(!this.A01);
        return create;
    }
}
