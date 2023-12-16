package com.whatsapp.payments.ui;

import X.AnonymousClass08M;
import X.AnonymousClass0R8;
import X.AnonymousClass3DZ;
import X.AnonymousClass4L0;
import X.AnonymousClass95F;
import X.AnonymousClass9GY;
import X.AnonymousClass9QK;
import X.AnonymousClass9YD;
import X.C107695bk;
import X.C15910sA;
import X.C18270x1;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C1901694h;
import X.C203799oK;
import X.C204019og;
import X.C205049qL;
import X.C64333Db;
import X.C89644eZ;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;

public class MerchantPayoutTransactionHistoryActivity extends C89644eZ {
    public FrameLayout A00;
    public StickyHeadersRecyclerView A01;
    public AnonymousClass95F A02;
    public C1901694h A03;
    public AnonymousClass9QK A04;
    public boolean A05;

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            C1899593h.A15(A002, this);
            C107695bk r1 = A002.A00;
            C1899593h.A0z(A002, r1, this, C1899593h.A0W(A002, r1, this));
            this.A04 = (AnonymousClass9QK) r1.A8p.get();
        }
    }

    public MerchantPayoutTransactionHistoryActivity(int i) {
        this.A05 = false;
        C204019og.A00(this, 97);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int A012 = C1899693i.A01(this, R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0n(supportActionBar, R.string.f11nameremoved);
            C1899593h.A0j(this, supportActionBar, A012);
        }
        this.A02 = new AnonymousClass95F(this);
        this.A00 = (FrameLayout) findViewById(R.id.loading_container);
        StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) findViewById(R.id.transaction_list);
        this.A01 = stickyHeadersRecyclerView;
        stickyHeadersRecyclerView.setAdapter(this.A02);
        C1901694h r3 = (C1901694h) AnonymousClass4L0.A0F(new C203799oK(this, 3, this.A04), this).A01(C1901694h.class);
        this.A03 = r3;
        C18320x8.A18(r3.A00, true);
        C18320x8.A18(r3.A01, false);
        C18270x1.A0w(new AnonymousClass9GY(r3.A06, r3), r3.A09);
        C1901694h r5 = this.A03;
        C205049qL A002 = C205049qL.A00(this, 56);
        C205049qL A003 = C205049qL.A00(this, 57);
        AnonymousClass9YD r2 = new AnonymousClass9YD();
        AnonymousClass08M r0 = r5.A02;
        C15910sA r1 = r5.A03;
        r0.A0B(r1, A002);
        r5.A00.A0B(r1, A003);
        r5.A01.A0B(r1, r2);
    }

    public MerchantPayoutTransactionHistoryActivity() {
        this(0);
    }
}
