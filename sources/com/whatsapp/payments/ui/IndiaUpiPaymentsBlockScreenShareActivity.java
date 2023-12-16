package com.whatsapp.payments.ui;

import X.AnonymousClass0Y8;
import X.AnonymousClass0YI;
import X.AnonymousClass34K;
import X.AnonymousClass3DZ;
import X.AnonymousClass5Yj;
import X.C1899593h;
import X.C197109ca;
import X.C204019og;
import X.C204249p3;
import X.C64333Db;
import X.C89704el;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.whatsapp.R;

public class IndiaUpiPaymentsBlockScreenShareActivity extends C89704el {
    public C197109ca A00;
    public boolean A01;

    public void A5r() {
        if (!this.A01) {
            this.A01 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            this.A04 = C64333Db.A8y(A002);
            this.A00 = C1899593h.A0L(A002);
        }
    }

    public IndiaUpiPaymentsBlockScreenShareActivity(int i) {
        this.A01 = false;
        C204019og.A00(this, 78);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setDimAmount(0.8f);
        int A04 = AnonymousClass0Y8.A04(this, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved));
        C1899593h.A0h(this);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(AnonymousClass0YI.A03(0.3f, A04, AnonymousClass0Y8.A04(this, AnonymousClass34K.A01(this, R.attr.f3nameremoved))));
        setContentView((int) R.layout.f8nameremoved);
        C204249p3.A02(findViewById(R.id.close), this, 78);
        this.A00.BKB(0, (Integer) null, "block_screen_share", (String) null);
    }

    public IndiaUpiPaymentsBlockScreenShareActivity() {
        this(0);
    }
}
