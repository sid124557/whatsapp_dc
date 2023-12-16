package com.whatsapp.payments.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass948;
import X.AnonymousClass97T;
import X.AnonymousClass9DA;
import X.C107695bk;
import X.C158777kX;
import X.C160757oG;
import X.C166587yw;
import X.C18280x3;
import X.C183538qC;
import X.C1899593h;
import X.C1899693i;
import X.C19340zH;
import X.C203739oE;
import X.C204019og;
import X.C204219p0;
import X.C204329pB;
import X.C64333Db;
import X.C72343dZ;
import X.C88834as;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.AbsListView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

public class IndiaUpiPaymentMethodSelectionActivity extends AnonymousClass9DA implements C203739oE {
    public C158777kX A00;
    public AnonymousClass948 A01;
    public C183538qC A02;
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
            this.A00 = C1899593h.A0O(r2);
            this.A02 = C72343dZ.A00(r1.A8x);
        }
    }

    public String B9j(C166587yw r3) {
        return this.A00.A02(r3, false);
    }

    public Dialog onCreateDialog(int i) {
        if (i != 29) {
            return super.onCreateDialog(i);
        }
        C19340zH A08 = C1899693i.A08(this);
        C204219p0.A01(A08, this, 48, R.string.f11nameremoved);
        C204219p0.A00(A08, this, 49, R.string.f11nameremoved);
        return A08.create();
    }

    public IndiaUpiPaymentMethodSelectionActivity(int i) {
        this.A03 = false;
        C204019og.A00(this, 74);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        if (getIntent() == null) {
            this.A04.A04("got null bank account or balance; finishing");
            finish();
            return;
        }
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C1899593h.A0o(supportActionBar, "Select bank account");
        }
        this.A04.A06("onCreate");
        AbsListView absListView = (AbsListView) findViewById(R.id.payment_methods_list);
        AnonymousClass948 r0 = new AnonymousClass948(this, this.A00, this);
        this.A01 = r0;
        r0.A00 = (List) getIntent().getSerializableExtra("bank_accounts");
        r0.notifyDataSetChanged();
        absListView.setAdapter(this.A01);
        absListView.setOnItemClickListener(new C204329pB(this, 1));
    }

    public /* synthetic */ void Boj(C166587yw r1, PaymentMethodRow paymentMethodRow) {
    }

    public boolean BoN() {
        return false;
    }

    public /* synthetic */ boolean BoR() {
        return false;
    }

    public /* synthetic */ int B9g(C166587yw r2) {
        return 0;
    }

    public String B9i(C166587yw r2) {
        return null;
    }

    public /* synthetic */ boolean BoB(C166587yw r2) {
        return false;
    }

    public IndiaUpiPaymentMethodSelectionActivity() {
        this(0);
        this.A04 = C160757oG.A00("IndiaUpiPaymentMethodSelectionActivity", "payment-settings", "IN");
    }
}
