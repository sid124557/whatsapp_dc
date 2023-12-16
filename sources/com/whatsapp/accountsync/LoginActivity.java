package com.whatsapp.accountsync;

import X.AnonymousClass0x7;
import X.AnonymousClass4SG;
import X.AnonymousClass54W;
import X.C131866eJ;
import X.C56972sr;
import X.C627736r;
import X.C64333Db;
import X.C69263Wi;
import X.C86604Kt;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import com.whatsapp.R;

public class LoginActivity extends C131866eJ {
    public C69263Wi A00;
    public C56972sr A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            this.A04 = C64333Db.A8y(A2Y);
            this.A00 = C64333Db.A04(A2Y);
            this.A01 = C64333Db.A06(A2Y);
        }
    }

    public LoginActivity(int i) {
        this.A02 = false;
        C86604Kt.A1K(this, 10);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        boolean z = false;
        for (Account account : AccountManager.get(this).getAccounts()) {
            if ("com.whatsapp".contains(account.type)) {
                z = true;
            }
        }
        if (z) {
            this.A00.A0H(R.string.f11nameremoved, 1);
        } else if (C56972sr.A04(this.A01) == null) {
            startActivity(C627736r.A03(this).putExtra("show_registration_first_dlg", true));
        } else {
            AnonymousClass0x7.A1B(new AnonymousClass54W(this, this), this.A04);
            return;
        }
        finish();
    }

    public LoginActivity() {
        this(0);
    }
}
