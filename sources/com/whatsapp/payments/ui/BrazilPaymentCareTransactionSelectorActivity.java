package com.whatsapp.payments.ui;

import X.AnonymousClass002;
import X.AnonymousClass33K;
import X.AnonymousClass3DZ;
import X.AnonymousClass5WY;
import X.AnonymousClass97Z;
import X.AnonymousClass9H2;
import X.AnonymousClass9NM;
import X.C005205m;
import X.C107695bk;
import X.C153087ae;
import X.C166587yw;
import X.C1899593h;
import X.C203499no;
import X.C204019og;
import X.C204249p3;
import X.C56492s4;
import X.C624034w;
import X.C64333Db;
import X.C64773Ex;
import X.C86634Kw;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;

public class BrazilPaymentCareTransactionSelectorActivity extends PaymentTransactionHistoryActivity {
    public AnonymousClass5WY A00;
    public C56492s4 A01;
    public C64773Ex A02;
    public AnonymousClass33K A03;
    public C153087ae A04;
    public C203499no A05;
    public AnonymousClass9H2 A06;
    public boolean A07;

    public final AnonymousClass9H2 A79() {
        AnonymousClass9H2 r0 = this.A06;
        if (r0 != null && r0.A06() == 1) {
            this.A06.A0D(false);
        }
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("com.whatsapp.support.DescribeProblemActivity.from", "payments:settings");
        C56492s4 r5 = this.A01;
        AnonymousClass9H2 r02 = new AnonymousClass9H2(A08, this, this.A00, this.A06, r5, this.A04, (C166587yw) null, (C624034w) null, this.A03, this.A04, "payments:settings");
        this.A06 = r02;
        return r02;
    }

    public void A5r() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            AnonymousClass97Z.A0C(A002, r1, this);
            this.A02 = C64333Db.A26(A002);
            this.A03 = (AnonymousClass33K) A002.AaW.get();
            this.A04 = C1899593h.A0G(A002);
            this.A00 = (AnonymousClass5WY) A002.AUS.get();
            this.A01 = C64333Db.A07(A002);
            this.A05 = C1899593h.A0M(r1);
        }
    }

    public BrazilPaymentCareTransactionSelectorActivity(int i) {
        this.A07 = false;
        C204019og.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86634Kw.A0R(this).A0B(R.string.f11nameremoved);
        this.A0F.A00 = new AnonymousClass9NM(this);
        TextView textView = (TextView) C005205m.A00(this, R.id.bottom_button);
        textView.setVisibility(0);
        textView.setText(R.string.f11nameremoved);
        C204249p3.A02(textView, this, 18);
    }

    public BrazilPaymentCareTransactionSelectorActivity() {
        this(0);
    }
}
