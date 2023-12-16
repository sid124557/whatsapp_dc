package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass31C;
import X.AnonymousClass34V;
import X.AnonymousClass4L0;
import X.AnonymousClass5V0;
import X.AnonymousClass94g;
import X.AnonymousClass97T;
import X.AnonymousClass99H;
import X.AnonymousClass9AL;
import X.AnonymousClass9D8;
import X.AnonymousClass9OX;
import X.AnonymousClass9Q3;
import X.AnonymousClass9U1;
import X.AnonymousClass9U5;
import X.C107695bk;
import X.C133686hm;
import X.C160757oG;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C19340zH;
import X.C194009Rf;
import X.C194259Se;
import X.C194389Sr;
import X.C194479Ta;
import X.C196629bS;
import X.C196719bd;
import X.C197109ca;
import X.C199469gd;
import X.C199479ge;
import X.C204019og;
import X.C204219p0;
import X.C204759ps;
import X.C205049qL;
import X.C39452Ca;
import X.C40602Ha;
import X.C626936e;
import X.C64333Db;
import X.C69263Wi;
import X.C88834as;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.List;

public class IndiaUpiStepUpActivity extends AnonymousClass9D8 {
    public C39452Ca A00;
    public C133686hm A01;
    public C194479Ta A02;
    public AnonymousClass9AL A03;
    public AnonymousClass94g A04;
    public String A05;
    public boolean A06;
    public final C160757oG A07;
    public final List A08;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_bank_account");
        C626936e.A07(parcelableExtra, "Bank account must be passed with intent extras");
        this.A01 = (C133686hm) parcelableExtra;
        List list = this.A08;
        String stringExtra = getIntent().getStringExtra("extra_step_up_id");
        C626936e.A07(stringExtra, "Step up id must be passed as intent extra");
        list.add(stringExtra);
        C69263Wi r4 = this.A05;
        AnonymousClass31C r5 = this.A0H;
        C194259Se r14 = this.A0E;
        AnonymousClass9U1 r6 = this.A0L;
        AnonymousClass9U5 r9 = this.A0M;
        C194389Sr r10 = this.A07;
        C197109ca r12 = this.A0S;
        C40602Ha r8 = this.A0K;
        C196629bS r7 = this.A0M;
        this.A03 = new AnonymousClass9AL(this, r4, r5, r6, r7, r8, r9, r10, this, r12, this.A0V, r14);
        C194009Rf r2 = new C194009Rf(this, r4, r8, r9);
        this.A05 = A7F(r7.A06());
        AnonymousClass94g r22 = (AnonymousClass94g) AnonymousClass4L0.A0F(new C204759ps(r2, 3, this), this).A01(AnonymousClass94g.class);
        this.A04 = r22;
        r22.A00.A0B(this, C205049qL.A00(this, 52));
        AnonymousClass94g r23 = this.A04;
        r23.A02.A0B(this, C205049qL.A00(this, 53));
        AnonymousClass94g r3 = this.A04;
        AnonymousClass9OX.A00(r3.A04.A00, r3.A00, R.string.f11nameremoved);
        r3.A07.A00();
    }

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
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
            this.A00 = (C39452Ca) A0I.A3j.get();
            this.A02 = (C194479Ta) r2.APL.get();
        }
    }

    public void BbO(AnonymousClass34V r3) {
        throw AnonymousClass002.A0G(this.A07.A02("onSetPin unsupported"));
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        if (i != 28) {
            if (i != 32) {
                switch (i) {
                    case 10:
                        return A7X(new C199469gd(this), getString(R.string.f11nameremoved), getString(R.string.f11nameremoved), i2, R.string.f11nameremoved, R.string.f11nameremoved);
                    case 11:
                        break;
                    case 12:
                        return A7W(new C199479ge(this), getString(R.string.f11nameremoved), 12, R.string.f11nameremoved, R.string.f11nameremoved);
                    default:
                        return super.onCreateDialog(i);
                }
            } else {
                C19340zH A002 = AnonymousClass5V0.A00(this);
                A002.A0T(R.string.f11nameremoved);
                C204219p0.A01(A002, this, 78, R.string.f11nameremoved);
                return A002.create();
            }
        }
        return A7V(this.A01, i);
    }

    public IndiaUpiStepUpActivity(int i) {
        this.A06 = false;
        C204019og.A00(this, 93);
    }

    public void BVC(AnonymousClass34V r6, String str) {
        Integer num;
        if (!TextUtils.isEmpty(str)) {
            this.A07.A06("onListKeys called");
            AnonymousClass94g r4 = this.A04;
            C133686hm r3 = r4.A05;
            AnonymousClass9Q3 r1 = new AnonymousClass9Q3(0);
            r1.A05 = str;
            r1.A04 = r3.A0B;
            r1.A01 = (AnonymousClass99H) r3.A08;
            r1.A06 = (String) C1899593h.A0X(r3.A09);
            r4.A02.A0H(r1);
        } else if (r6 != null && !C196719bd.A02(this, "upi-list-keys", r6.A00, false)) {
            if (this.A05.A06("upi-list-keys")) {
                AnonymousClass97T.A0y(this);
                this.A03.A00();
                return;
            }
            C160757oG r2 = this.A07;
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

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1014) {
            if (i2 == -1) {
                this.A0P.A0A();
                this.A0C.A05(this.A08);
                this.A02.A01((String) null);
            }
            finish();
        }
    }

    public IndiaUpiStepUpActivity() {
        this(0);
        this.A07 = C160757oG.A00("IndiaUpiStepUpActivity", "payment-settings", "IN");
        this.A08 = AnonymousClass001.A0s();
    }
}
