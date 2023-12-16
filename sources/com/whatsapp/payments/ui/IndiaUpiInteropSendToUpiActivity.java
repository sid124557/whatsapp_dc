package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass5V7;
import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.C107695bk;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C193999Re;
import X.C195909Zz;
import X.C204019og;
import X.C204249p3;
import X.C64333Db;
import X.C88834as;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class IndiaUpiInteropSendToUpiActivity extends AnonymousClass9DA {
    public C195909Zz A00;
    public C193999Re A01;
    public boolean A02;

    public void A5r() {
        if (!this.A02) {
            this.A02 = true;
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
            this.A01 = C1899693i.A0N(r1);
            this.A00 = C1899593h.A0D(r1);
        }
    }

    public IndiaUpiInteropSendToUpiActivity(int i) {
        this.A02 = false;
        C204019og.A00(this, 65);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setSupportActionBar(C1899593h.A07(this));
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0n(supportActionBar, R.string.f11nameremoved);
        }
        View findViewById = findViewById(R.id.send_to_upi_container);
        AnonymousClass5V7.A01(findViewById, R.drawable.ic_send_to_upi, 0, R.drawable.grey_circle_stroke, R.string.f11nameremoved);
        C204249p3.A02(findViewById, this, 53);
    }

    public IndiaUpiInteropSendToUpiActivity() {
        this(0);
    }
}
