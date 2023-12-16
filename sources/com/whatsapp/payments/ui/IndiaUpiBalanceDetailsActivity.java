package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass6C7;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass9DA;
import X.C107695bk;
import X.C160757oG;
import X.C166587yw;
import X.C18280x3;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C204019og;
import X.C64333Db;
import X.C86614Ku;
import X.C88834as;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;

public class IndiaUpiBalanceDetailsActivity extends AnonymousClass9DA {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public boolean A03;
    public final C160757oG A04;

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
        }
    }

    public IndiaUpiBalanceDetailsActivity(int i) {
        this.A03 = false;
        C204019og.A00(this, 47);
    }

    public void onCreate(Bundle bundle) {
        int A0E;
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        if (getIntent() == null || C86614Ku.A0D(this) == null || C86614Ku.A0D(this).get("payment_bank_account") == null || C86614Ku.A0D(this).get("balance") == null) {
            this.A04.A04("got null bank account or balance; finishing");
            finish();
            return;
        }
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0n(supportActionBar, R.string.f11nameremoved);
        }
        this.A04.A06("onCreate");
        this.A02 = C18310x6.A0L(this, R.id.balance_text);
        this.A00 = C18310x6.A0L(this, R.id.account_name_text);
        this.A01 = C18310x6.A0L(this, R.id.account_type_text);
        C166587yw r2 = (C166587yw) C86614Ku.A0D(this).get("payment_bank_account");
        this.A00.setText(this.A0N.A03(r2));
        AnonymousClass99H r22 = (AnonymousClass99H) r2.A08;
        TextView textView = this.A01;
        if (r22 == null) {
            A0E = R.string.f11nameremoved;
        } else {
            A0E = r22.A0E();
        }
        textView.setText(A0E);
        this.A02.setText(C1899693i.A0a(this, "balance"));
        if (r22 != null) {
            String str = r22.A0B;
            if ("OD_UNSECURED".equals(str) || "OD_SECURED".equals(str)) {
                C18310x6.A0L(this, R.id.balance).setText(R.string.f11nameremoved);
                findViewById(R.id.available_balance_layout).setVisibility(0);
                C18280x3.A0r(this, R.id.divider_above_available_balance, 0);
                C18310x6.A0L(this, R.id.available_balance_text).setText(getIntent().getStringExtra("usable_balance"));
            }
        }
    }

    public IndiaUpiBalanceDetailsActivity() {
        this(0);
        this.A04 = C160757oG.A00("IndiaUpiBalanceDetailsActivity", "payment-settings", "IN");
    }
}
