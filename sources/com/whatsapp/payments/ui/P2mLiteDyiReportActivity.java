package com.whatsapp.payments.ui;

import X.AnonymousClass043;
import X.AnonymousClass9BX;
import X.C56952sp;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;

public final class P2mLiteDyiReportActivity extends AnonymousClass9BX {
    public String A79() {
        return C56952sp.A08(this.A0D, 2759);
    }

    public void A7A(int i, int i2) {
        AnonymousClass043 A03 = this.A0G.A03(this, (DialogInterface.OnDismissListener) null, (DialogInterface.OnDismissListener) null, i);
        if (A03 != null) {
            A03.show();
        }
    }

    public void A7B(String str) {
        this.A0O.A0J(str);
    }

    public int A74() {
        return R.string.f11nameremoved;
    }

    public int A75() {
        return R.string.f11nameremoved;
    }

    public int A76() {
        return R.string.f11nameremoved;
    }

    public int A77() {
        return R.string.f11nameremoved;
    }

    public int A78() {
        return R.string.f11nameremoved;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0A.setVisibility(0);
    }
}
