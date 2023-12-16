package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass9DA;
import X.C06560Yg;
import X.C107695bk;
import X.C133796hx;
import X.C158777kX;
import X.C166587yw;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C204019og;
import X.C204249p3;
import X.C64333Db;
import X.C86604Kt;
import X.C88834as;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class IndiaUpiPinSetUpCompletedActivity extends AnonymousClass9DA {
    public C158777kX A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = C1899593h.A0O(r2);
        }
    }

    public IndiaUpiPinSetUpCompletedActivity(int i) {
        this.A01 = false;
        C204019og.A00(this, 84);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.BKB(AnonymousClass001.A0f(), C18290x4.A0a(), "pin_created", (String) null);
    }

    public void onCreate(Bundle bundle) {
        C133796hx r3;
        getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C166587yw r5 = (C166587yw) getIntent().getParcelableExtra("extra_bank_account");
        AnonymousClass0R8 A0Y = AnonymousClass97T.A0Y(this);
        if (A0Y != null) {
            C1899593h.A0n(A0Y, R.string.f11nameremoved);
        }
        if (r5 == null || (r3 = r5.A08) == null) {
            Log.e("Screen called without valid account, finishing");
            finish();
            return;
        }
        AnonymousClass99H r32 = (AnonymousClass99H) r3;
        View findViewById = findViewById(R.id.account_layout);
        C06560Yg.A02(findViewById, R.id.progress).setVisibility(8);
        C86604Kt.A1E(findViewById, R.id.divider, 8);
        C86604Kt.A1E(findViewById, R.id.radio_button, 8);
        AnonymousClass97T.A0f(findViewById, r5);
        C18300x5.A0G(findViewById, R.id.account_number).setText(this.A00.A02(r5, false));
        C18300x5.A0G(findViewById, R.id.account_name).setText((CharSequence) C1899593h.A0X(r32.A03));
        C18300x5.A0G(findViewById, R.id.account_type).setText(r32.A0E());
        if (getIntent().getBooleanExtra("on_settings_page", false)) {
            C18310x6.A0L(this, R.id.continue_button).setText(R.string.f11nameremoved);
        }
        C204249p3.A02(findViewById(R.id.continue_button), this, 85);
        this.A0S.BKB(0, (Integer) null, "pin_created", (String) null);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A0S.BKB(AnonymousClass001.A0f(), C18290x4.A0a(), "pin_created", (String) null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiPinSetUpCompletedActivity() {
        this(0);
    }
}
