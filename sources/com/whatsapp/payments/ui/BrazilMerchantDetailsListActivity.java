package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass33K;
import X.AnonymousClass5WY;
import X.AnonymousClass9Bv;
import X.AnonymousClass9H2;
import X.AnonymousClass9QM;
import X.AnonymousClass9TZ;
import X.AnonymousClass9h4;
import X.C05570Ua;
import X.C107695bk;
import X.C153087ae;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C1902194o;
import X.C191209Ea;
import X.C196709bc;
import X.C204019og;
import X.C56492s4;
import X.C64333Db;
import X.C86604Kt;
import X.C88834as;
import android.content.Intent;
import android.view.ViewGroup;
import com.whatsapp.R;

public class BrazilMerchantDetailsListActivity extends AnonymousClass9Bv {
    public AnonymousClass5WY A00;
    public C56492s4 A01;
    public AnonymousClass33K A02;
    public C196709bc A03;
    public C153087ae A04;
    public AnonymousClass9TZ A05;
    public AnonymousClass9H2 A06;
    public C1902194o A07;
    public AnonymousClass9QM A08;
    public boolean A09;

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            C1902194o r2 = this.A07;
            r2.A0T.BkM(new AnonymousClass9h4(r2));
        }
    }

    public void A5r() {
        if (!this.A09) {
            this.A09 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            this.A00 = C1899593h.A0I(r2);
            this.A01 = C64333Db.A07(r2);
            this.A00 = (AnonymousClass5WY) r2.AUS.get();
            this.A02 = (AnonymousClass33K) r2.AaW.get();
            this.A03 = A0I.ACj();
            this.A04 = C1899593h.A0G(r2);
            this.A05 = C1899693i.A0P(r2);
            this.A08 = (AnonymousClass9QM) r1.A1M.get();
        }
    }

    public C05570Ua A74(ViewGroup viewGroup, int i) {
        if (i != 302) {
            return super.A74(viewGroup, i);
        }
        return new C191209Ea(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
    }

    public BrazilMerchantDetailsListActivity(int i) {
        this.A09 = false;
        C204019og.A00(this, 22);
    }

    public void A6O(int i) {
        if (i == R.string.f11nameremoved) {
            finish();
        }
    }

    public BrazilMerchantDetailsListActivity() {
        this(0);
    }
}
