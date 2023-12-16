package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass32Y;
import X.AnonymousClass392;
import X.AnonymousClass396;
import X.AnonymousClass39B;
import X.AnonymousClass39E;
import X.AnonymousClass39F;
import X.AnonymousClass39S;
import X.AnonymousClass4L0;
import X.AnonymousClass4Tu;
import X.AnonymousClass5UW;
import X.AnonymousClass7SV;
import X.AnonymousClass957;
import X.AnonymousClass95H;
import X.C06560Yg;
import X.C101195Dv;
import X.C103115Lp;
import X.C104205Qb;
import X.C105145Tt;
import X.C107695bk;
import X.C110655go;
import X.C151257Ua;
import X.C152967aS;
import X.C154197cm;
import X.C181798nL;
import X.C18280x3;
import X.C1899593h;
import X.C204019og;
import X.C205059qM;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C88834as;
import X.C89644eZ;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaymentCheckoutOrderDetailsItemListActivity extends C89644eZ {
    public RecyclerView A00;
    public C101195Dv A01;
    public AnonymousClass5UW A02;
    public C154197cm A03;
    public C105145Tt A04;
    public C104205Qb A05;
    public C151257Ua A06;
    public C181798nL A07;
    public AnonymousClass4Tu A08;
    public C620733j A09;
    public C103115Lp A0A;
    public AnonymousClass7SV A0B;
    public boolean A0C;

    public void A5r() {
        if (!this.A0C) {
            this.A0C = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r3 = A0I.A4Z;
            C1899593h.A15(r3, this);
            C107695bk r2 = r3.A00;
            C1899593h.A0z(r3, r2, this, C1899593h.A0W(r3, r2, this));
            this.A02 = (AnonymousClass5UW) r3.A4T.get();
            this.A0A = (C103115Lp) r2.A8P.get();
            this.A09 = C64333Db.A2t(r3);
            this.A06 = (C151257Ua) r2.A2I.get();
            this.A05 = (C104205Qb) r3.ARe.get();
            this.A04 = (C105145Tt) r3.A4V.get();
            this.A0B = (AnonymousClass7SV) r2.A2J.get();
            this.A03 = new C154197cm();
            this.A01 = (C101195Dv) A0I.A1u.get();
            this.A07 = (C181798nL) A0I.A1N.get();
        }
    }

    public PaymentCheckoutOrderDetailsItemListActivity(int i) {
        this.A0C = false;
        C204019og.A00(this, 104);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        String stringExtra = getIntent().getStringExtra("message_title");
        AnonymousClass39S r5 = (AnonymousClass39S) getIntent().getParcelableExtra("message_content");
        UserJid A082 = AnonymousClass32Y.A08(getIntent().getStringExtra("business_owner_jid"));
        C626936e.A06(r5);
        List<AnonymousClass39F> list = r5.A07.A09;
        C626936e.A0B(!list.isEmpty());
        C626936e.A06(A082);
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass39F A002 : list) {
            String A003 = A002.A00();
            if (!TextUtils.isEmpty(A003)) {
                A0s.add(new AnonymousClass392(A003));
            }
        }
        AnonymousClass396 r4 = new AnonymousClass396((String) null, A0s);
        String A004 = ((AnonymousClass39F) list.get(0)).A00();
        if (A004 == null) {
            A004 = "";
        }
        AnonymousClass39E r10 = new AnonymousClass39E(A082, new AnonymousClass39B(r5.A0M, A004, false), Collections.singletonList(r4));
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0J(stringExtra);
        }
        this.A00 = (RecyclerView) C06560Yg.A02(this.A00, R.id.item_list);
        AnonymousClass957 r3 = new AnonymousClass957(new C152967aS(this.A06, this.A0B), this.A09, r5);
        this.A00.A0o(new AnonymousClass95H());
        this.A00.setAdapter(r3);
        AnonymousClass4Tu r0 = (AnonymousClass4Tu) AnonymousClass4L0.A0F(new C110655go(this.A01, this.A07.Azv(A082), A082, this.A0A, r10), this).A01(AnonymousClass4Tu.class);
        this.A08 = r0;
        r0.A01.A0B(this, new C205059qM(r3, 1, this));
    }

    public void onResume() {
        super.onResume();
        this.A08.A0D();
    }

    public PaymentCheckoutOrderDetailsItemListActivity() {
        this(0);
    }
}
