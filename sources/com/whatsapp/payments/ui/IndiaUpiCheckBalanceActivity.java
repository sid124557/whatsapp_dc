package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass2CW;
import X.AnonymousClass31C;
import X.AnonymousClass34V;
import X.AnonymousClass3QD;
import X.AnonymousClass4L0;
import X.AnonymousClass5V0;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass9AK;
import X.AnonymousClass9AL;
import X.AnonymousClass9D8;
import X.AnonymousClass9U1;
import X.AnonymousClass9U5;
import X.C107695bk;
import X.C133686hm;
import X.C160757oG;
import X.C166557yt;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C1901594f;
import X.C19340zH;
import X.C194259Se;
import X.C194389Sr;
import X.C196629bS;
import X.C196719bd;
import X.C197109ca;
import X.C199219gE;
import X.C199229gF;
import X.C204019og;
import X.C204219p0;
import X.C204759ps;
import X.C205049qL;
import X.C40602Ha;
import X.C617332a;
import X.C64333Db;
import X.C69263Wi;
import X.C88834as;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;

public class IndiaUpiCheckBalanceActivity extends AnonymousClass9D8 {
    public AnonymousClass2CW A00;
    public C133686hm A01;
    public C617332a A02;
    public C166557yt A03;
    public C1901594f A04;
    public boolean A05;
    public final C160757oG A06;

    public final void A7j(String str) {
        C133686hm r1 = this.A01;
        A7g((AnonymousClass99H) r1.A08, str, r1.A0B, (String) this.A03.A00, (String) C1899593h.A0X(r1.A09), 4);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = (C133686hm) getIntent().getParcelableExtra("extra_bank_account");
        C69263Wi r4 = this.A05;
        AnonymousClass31C r5 = this.A0H;
        C194259Se r14 = this.A0E;
        AnonymousClass9U1 r6 = this.A0L;
        AnonymousClass9U5 r9 = this.A0M;
        C194389Sr r10 = this.A07;
        C197109ca r12 = this.A0S;
        C40602Ha r8 = this.A0K;
        C196629bS r7 = this.A0M;
        this.A09 = new AnonymousClass9AL(this, r4, r5, r6, r7, r8, r9, r10, this, r12, this.A0V, r14);
        this.A03 = C1899693i.A0G(AnonymousClass3QD.A00(), A7F(r7.A06()), "upiSequenceNumber");
        C69263Wi r42 = this.A05;
        AnonymousClass31C r62 = this.A0H;
        C194259Se r11 = this.A0E;
        C1901594f r2 = (C1901594f) AnonymousClass4L0.A0F(new C204759ps(new AnonymousClass9AK(this, r42, this.A02, r62, this.A0L, this.A0K, this.A0M, this.A07, r11), 0, this), this).A01(C1901594f.class);
        this.A04 = r2;
        r2.A01.A0B(this, C205049qL.A00(this, 23));
        C1901594f r22 = this.A04;
        r22.A07.A0B(this, C205049qL.A00(this, 24));
        A6f(getString(R.string.f11nameremoved));
        AnonymousClass97T.A10(this);
    }

    public void A5r() {
        if (!this.A05) {
            this.A05 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0k(A0I, r2, r1, this);
            this.A02 = C1899593h.A09(r2);
            this.A00 = (AnonymousClass2CW) A0I.A3f.get();
        }
    }

    public void BbO(AnonymousClass34V r3) {
        throw AnonymousClass002.A0G(this.A06.A02("onSetPin unsupported"));
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        if (i != 27) {
            if (i != 28) {
                switch (i) {
                    case 10:
                        return A7X(new C199219gE(this), getString(R.string.f11nameremoved), getString(R.string.f11nameremoved), i2, R.string.f11nameremoved, R.string.f11nameremoved);
                    case 11:
                        break;
                    case 12:
                        return A7X(new C199229gF(this), getString(R.string.f11nameremoved), getString(R.string.f11nameremoved), i2, R.string.f11nameremoved, R.string.f11nameremoved);
                    default:
                        return super.onCreateDialog(i);
                }
            }
            return A7V(this.A01, i);
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0T(R.string.f11nameremoved);
        A002.A0U(R.string.f11nameremoved);
        C204219p0.A01(A002, this, 25, R.string.f11nameremoved);
        return A002.create();
    }

    public IndiaUpiCheckBalanceActivity(int i) {
        this.A05 = false;
        C204019og.A00(this, 57);
    }

    public void BVC(AnonymousClass34V r4, String str) {
        Integer num;
        if (!TextUtils.isEmpty(str)) {
            this.A06.A06("onListKeys called");
            A7j(str);
        } else if (r4 != null && !C196719bd.A02(this, "upi-list-keys", r4.A00, false)) {
            if (this.A05.A06("upi-list-keys")) {
                AnonymousClass97T.A0y(this);
                AnonymousClass97T.A10(this);
                return;
            }
            C160757oG r2 = this.A06;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0o.append(num);
            C1899593h.A1J(r2, " failed; ; showErrorAndFinish", A0o);
            A7b();
        }
    }

    public IndiaUpiCheckBalanceActivity() {
        this(0);
        this.A06 = C160757oG.A00("IndiaUpiCheckPinActivity", "payment-settings", "IN");
    }
}
