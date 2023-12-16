package com.whatsapp.payments.ui;

import X.AnonymousClass303;
import X.AnonymousClass9Wg;
import X.C107695bk;
import X.C116985rC;
import X.C18280x3;
import X.C1899593h;
import X.C204019og;
import X.C50382i5;
import X.C53602nM;
import X.C64333Db;
import X.C88834as;
import android.net.Uri;
import android.os.Bundle;

public class BrazilViralityLinkVerifierActivity extends ViralityLinkVerifierActivity {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            this.A06 = (C50382i5) r2.AZG.get();
            this.A05 = (C116985rC) r2.AOi.get();
            this.A0F = C1899593h.A0Q(r2);
            this.A0D = C1899593h.A0I(r2);
            this.A0A = C1899593h.A0E(r2);
            this.A0G = A0I.ADJ();
            this.A09 = (C53602nM) r1.A2g.get();
            this.A0B = C1899593h.A0F(r2);
            this.A0C = C1899593h.A0H(r2);
        }
    }

    public BrazilViralityLinkVerifierActivity(int i) {
        this.A00 = false;
        C204019og.A00(this, 38);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        AnonymousClass303 r2 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
        r2.A03("campaign_id", data.getLastPathSegment());
        AnonymousClass9Wg.A03(r2, this.A0D.A0H("FBPAY").B7b(), "deeplink", (String) null);
    }

    public BrazilViralityLinkVerifierActivity() {
        this(0);
    }
}
