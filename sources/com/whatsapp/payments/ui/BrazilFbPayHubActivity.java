package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass98s;
import X.AnonymousClass9BY;
import X.AnonymousClass9TJ;
import X.AnonymousClass9TR;
import X.AnonymousClass9VB;
import X.AnonymousClass9W3;
import X.AnonymousClass9WM;
import X.AnonymousClass9b0;
import X.AnonymousClass9bR;
import X.C107695bk;
import X.C158777kX;
import X.C166587yw;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C1906899l;
import X.C1906999m;
import X.C1907099n;
import X.C194399Ss;
import X.C194489Tb;
import X.C194539Ti;
import X.C194649Ty;
import X.C195169Wk;
import X.C203739oE;
import X.C204019og;
import X.C29271iY;
import X.C64333Db;
import X.C88834as;
import android.content.Intent;
import android.view.View;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BrazilFbPayHubActivity extends AnonymousClass9BY implements C203739oE {
    public AnonymousClass9bR A00;
    public AnonymousClass9WM A01;
    public C1907099n A02;
    public AnonymousClass9W3 A03;
    public AnonymousClass9VB A04;
    public AnonymousClass9TR A05;
    public AnonymousClass9TJ A06;
    public C194649Ty A07;
    public C158777kX A08;
    public C194399Ss A09;
    public boolean A0A;

    public void A5r() {
        if (!this.A0A) {
            this.A0A = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r3 = A0I.A4Z;
            C1899593h.A15(r3, this);
            C107695bk r2 = r3.A00;
            C1899593h.A0z(r3, r2, this, C1899593h.A0W(r3, r2, this));
            this.A0D = C1899593h.A0I(r3);
            this.A0A = C1899593h.A0E(r3);
            this.A0C = C1899593h.A0F(r3);
            this.A0E = (AnonymousClass9b0) r3.APz.get();
            this.A07 = (C1906899l) r3.APJ.get();
            this.A0B = (C29271iY) r3.AQ0.get();
            this.A08 = (C1906999m) r3.APr.get();
            this.A06 = (C194539Ti) r3.AMj.get();
            this.A09 = (C194489Tb) r3.APu.get();
            this.A04 = (AnonymousClass9VB) r2.A8j.get();
            this.A00 = (AnonymousClass9bR) r2.A14.get();
            this.A06 = (AnonymousClass9TJ) r2.A17.get();
            this.A05 = (AnonymousClass9TR) r2.A8k.get();
            this.A02 = C1899593h.A0H(r3);
            this.A08 = C1899593h.A0O(r3);
            this.A01 = r2.AN7();
            this.A03 = (AnonymousClass9W3) r2.A8g.get();
            this.A07 = (C194649Ty) r2.A1I.get();
            this.A09 = A0I.ACt();
        }
    }

    public void BMA(boolean z) {
        String A032 = this.A07.A03("generic_context", false);
        Intent A033 = C1899693i.A03(this);
        AnonymousClass98s.A0a(A033, "onboarding_context", "generic_context");
        AnonymousClass98s.A0a(A033, "referral_screen", "fbpay_payment_settings");
        if (A032 != null) {
            A033.putExtra("screen_name", A032);
        } else {
            AnonymousClass98s.A0a(A033, "verification_needed", C1899693i.A0Z(z ? 1 : 0));
            A033.putExtra("screen_name", "brpay_p_add_card");
        }
        A6T(A033, false);
    }

    public BrazilFbPayHubActivity(int i) {
        this.A0A = false;
        C204019og.A00(this, 21);
    }

    public void BXr(C166587yw r3) {
        if (r3.A08() != 5) {
            startActivity(C1899593h.A06(this, r3, BrazilPaymentCardDetailsActivity.class));
        }
    }

    public void Boj(C166587yw r2, PaymentMethodRow paymentMethodRow) {
        if (C195169Wk.A08(r2)) {
            this.A06.A02(r2, paymentMethodRow);
        }
    }

    public void Brm(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C166587yw A0C = C1899693i.A0C(it);
            int A082 = A0C.A08();
            if (A082 == 5 || A082 == 9) {
                A0s.add(A0C);
            } else {
                A0s2.add(A0C);
            }
        }
        if (this.A02.A00()) {
            boolean isEmpty = A0s2.isEmpty();
            View view = this.A01;
            if (isEmpty) {
                view.setVisibility(8);
                this.A02.setVisibility(0);
            } else {
                view.setVisibility(0);
                this.A02.setVisibility(8);
            }
        }
        super.Brm(A0s2);
    }

    public void onResume() {
        super.onResume();
        if (!this.A07.A05.A03()) {
            finish();
        }
    }

    public boolean BoN() {
        return true;
    }

    public boolean BoR() {
        return true;
    }

    public /* synthetic */ int B9g(C166587yw r2) {
        return 0;
    }

    public /* synthetic */ boolean BoB(C166587yw r2) {
        return false;
    }

    public BrazilFbPayHubActivity() {
        this(0);
    }
}
