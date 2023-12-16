package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass043;
import X.AnonymousClass1Ha;
import X.AnonymousClass1S3;
import X.AnonymousClass23S;
import X.AnonymousClass2CT;
import X.AnonymousClass2CU;
import X.AnonymousClass31C;
import X.AnonymousClass34V;
import X.AnonymousClass35J;
import X.AnonymousClass39Q;
import X.AnonymousClass3QD;
import X.AnonymousClass3Z6;
import X.AnonymousClass4G9;
import X.AnonymousClass4K2;
import X.AnonymousClass4K5;
import X.AnonymousClass5V0;
import X.AnonymousClass99H;
import X.AnonymousClass9AL;
import X.AnonymousClass9D6;
import X.AnonymousClass9U1;
import X.AnonymousClass9U5;
import X.AnonymousClass9VW;
import X.C133686hm;
import X.C133796hx;
import X.C159127lA;
import X.C15930sC;
import X.C160757oG;
import X.C161447pg;
import X.C162457s7;
import X.C166557yt;
import X.C18270x1;
import X.C18280x3;
import X.C183538qC;
import X.C19340zH;
import X.C194259Se;
import X.C194389Sr;
import X.C196719bd;
import X.C197109ca;
import X.C373621y;
import X.C42502Ok;
import X.C44512Wi;
import X.C44522Wj;
import X.C48172eT;
import X.C57692u3;
import X.C60042xu;
import X.C60482yd;
import X.C621433s;
import X.C626936e;
import X.C69263Wi;
import X.C69393Wv;
import X.C73813g7;
import X.C85744Hl;
import X.C85824Ht;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.Map;

public final class IndiaUpiFcsPinHandlerActivity extends AnonymousClass9D6 {
    public AnonymousClass2CT A00;
    public AnonymousClass2CU A01;
    public C133686hm A02;
    public C166557yt A03;
    public C44512Wi A04;
    public C42502Ok A05;
    public C44522Wj A06;
    public C183538qC A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public final C160757oG A0C = C160757oG.A00("IndiaUpiFcsPinHandlerActivity", "payment-settings", "IN");
    public final C48172eT A0D = new C48172eT(this);

    public void A7i(HashMap hashMap) {
        C162457s7.A0J(hashMap, 0);
        String A062 = this.A0L.A06("MPIN", hashMap, A0C(A7k()));
        C166557yt r0 = this.A03;
        String str = null;
        if (r0 == null) {
            throw C18270x1.A0S("seqNumber");
        }
        Object obj = r0.A00;
        if (C162457s7.A0P(A7k(), "pay")) {
            str = AnonymousClass35J.A02(this.A01, this.A06);
        }
        if (A062 != null && obj != null) {
            AnonymousClass3Z6[] r1 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6.A09("mpin", A062, r1, 0);
            AnonymousClass3Z6.A05("npci_common_library_transaction_id", obj, r1);
            Map A0G = C73813g7.A0G(r1);
            if (str != null) {
                A0G.put("nonce", str);
            }
            AnonymousClass4G9 A7j = A7j();
            if (A7j != null) {
                A7j.B3J(A0G);
            }
            if (this.A0B) {
                A7H();
                finish();
            }
        }
    }

    public void BVC(AnonymousClass34V r22, String str) {
        Integer num;
        Object obj;
        Object obj2;
        String str2 = str;
        if (str == null || str2.length() == 0) {
            AnonymousClass34V r0 = r22;
            if (r22 != null && !C196719bd.A02(this, "upi-list-keys", r0.A00, false)) {
                if (this.A05.A06("upi-list-keys")) {
                    this.A0M.A0D();
                    BjL();
                    Bp9(R.string.f11nameremoved);
                    this.A09.A00();
                    return;
                }
                C160757oG r2 = this.A0C;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("onListKeys: ");
                if (str != null) {
                    num = Integer.valueOf(str2.length());
                } else {
                    num = null;
                }
                A0o.append(num);
                r2.A06(AnonymousClass000.A0X(" failed; ; showErrorAndFinish", A0o));
                A7b();
                return;
            }
            return;
        }
        this.A0C.A06("onListKeys called");
        AnonymousClass99H r5 = null;
        if (C162457s7.A0P(A7k(), "pay") || C162457s7.A0P(A7k(), "collect")) {
            C133686hm r02 = this.A02;
            if (r02 == null) {
                throw C18270x1.A0S("paymentBankAccount");
            }
            C133796hx r6 = r02.A08;
            C162457s7.A0K(r6, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
            C626936e.A06(r6);
            AnonymousClass99H r62 = (AnonymousClass99H) r6;
            long longExtra = getIntent().getLongExtra("extra_payment_preset_amount", 0);
            int intExtra = getIntent().getIntExtra("extra_payment_offset", 100);
            C60042xu r1 = new C60042xu();
            r1.A01 = longExtra;
            r1.A00 = intExtra;
            r1.A02 = AnonymousClass1S3.A05;
            AnonymousClass39Q r10 = r1.A01().A02;
            C162457s7.A0D(r10);
            C133686hm r03 = this.A02;
            if (r03 == null) {
                throw C18270x1.A0S("paymentBankAccount");
            }
            String str3 = r03.A0B;
            C166557yt r11 = r62.A08;
            String str4 = (String) this.A0M.A04().A00;
            String stringExtra = getIntent().getStringExtra("extra_receiver_vpa");
            C166557yt r04 = this.A03;
            if (r04 == null) {
                throw C18270x1.A0S("seqNumber");
            }
            String str5 = (String) r04.A00;
            C133686hm r05 = this.A02;
            if (r05 == null) {
                throw C18270x1.A0S("paymentBankAccount");
            }
            C166557yt r06 = r05.A09;
            if (r06 == null) {
                obj = null;
            } else {
                obj = r06.A00;
            }
            String str6 = (String) obj;
            String stringExtra2 = getIntent().getStringExtra("extra_payee_name");
            int i = 5;
            if (C162457s7.A0P(A7k(), "pay")) {
                i = 6;
            }
            A7f(r10, r11, str2, str3, str4, stringExtra, str5, str6, stringExtra2, (String) null, i);
            return;
        }
        C133686hm r12 = this.A02;
        if (r12 == null) {
            throw C18270x1.A0S("paymentBankAccount");
        }
        String str7 = r12.A0B;
        C166557yt r07 = this.A03;
        if (r07 == null) {
            throw C18270x1.A0S("seqNumber");
        }
        String str8 = (String) r07.A00;
        C133796hx r13 = r12.A08;
        if (r13 instanceof AnonymousClass99H) {
            r5 = (AnonymousClass99H) r13;
        }
        int A0C2 = A0C(A7k());
        C133686hm r08 = this.A02;
        if (r08 == null) {
            throw C18270x1.A0S("paymentBankAccount");
        }
        C166557yt r09 = r08.A09;
        if (r09 == null) {
            obj2 = null;
        } else {
            obj2 = r09.A00;
        }
        A7g(r5, str2, str7, str8, (String) obj2, A0C2);
    }

    public void A7b() {
        AnonymousClass9VW A032 = this.A02.A03(this.A05);
        A7I();
        if (A032.A01() == 0) {
            A032.A03();
        }
        C19340zH A002 = AnonymousClass5V0.A00(this);
        A002.A0g(A032.A02(this));
        C19340zH.A04(this, A002, 150, R.string.f11nameremoved);
        A002.A0i(true);
        A002.A0V(new C85824Ht(this, 5));
        C18280x3.A0q(A002);
    }

    public final AnonymousClass4G9 A7j() {
        C159127lA r1;
        C44522Wj r12 = this.A06;
        if (r12 != null) {
            String str = this.A08;
            if (str != null) {
                C161447pg A002 = r12.A00(str);
                if (A002 == null || (r1 = A002.A00) == null) {
                    return null;
                }
                return (AnonymousClass4G9) r1.A00("native_flow_npci_common_library");
            }
            throw C18270x1.A0S("fdsManagerId");
        }
        throw C18270x1.A0S("phoenixManagerRegistry");
    }

    public final String A7k() {
        String str = this.A0A;
        if (str != null) {
            return str;
        }
        throw C18270x1.A0S("pinOp");
    }

    public final void A7l() {
        if (this.A0B) {
            A7n("finish_after_error");
            return;
        }
        A7H();
        finish();
    }

    public void BZY(int i, Bundle bundle) {
        if (this.A0B && i == 1 && bundle != null && C162457s7.A0P(bundle.getSerializable("error"), "USER_ABORTED")) {
            A7n("cancel");
        }
        super.BZY(i, bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A0B && i == 200 && i2 == 252) {
            A7n("cancel");
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        if (this.A00 != null) {
            C44512Wi r0 = new C44512Wi(this);
            this.A04 = r0;
            if (r0.A00(bundle2)) {
                Parcelable parcelableExtra = getIntent().getParcelableExtra("extra_bank_account");
                C162457s7.A0H(parcelableExtra);
                this.A02 = (C133686hm) parcelableExtra;
                String stringExtra = getIntent().getStringExtra("extra_india_upi_pin_op");
                C162457s7.A0H(stringExtra);
                C162457s7.A0J(stringExtra, 0);
                this.A0A = stringExtra;
                String A1r = AnonymousClass1Ha.A1r(this);
                C162457s7.A0H(A1r);
                C162457s7.A0J(A1r, 0);
                this.A08 = A1r;
                String stringExtra2 = getIntent().getStringExtra("extra_fcs_observer_id");
                C162457s7.A0H(stringExtra2);
                this.A09 = stringExtra2;
                this.A0B = getIntent().getBooleanExtra("is_asynchronous", false);
                AnonymousClass3QD A002 = AnonymousClass3QD.A00();
                String stringExtra3 = getIntent().getStringExtra("extra_seq_number");
                if (stringExtra3 == null) {
                    stringExtra3 = A7F(this.A0M.A06());
                }
                this.A03 = new C166557yt(A002, String.class, stringExtra3, "upiSequenceNumber");
                if (!this.A0B) {
                    AnonymousClass2CU r02 = this.A01;
                    if (r02 != null) {
                        String str = this.A09;
                        if (str == null) {
                            throw C18270x1.A0S("observerId");
                        }
                        C42502Ok r3 = new C42502Ok(this.A0D, (C60482yd) r02.A00.A03.AZ5.get(), str);
                        this.A05 = r3;
                        r3.A01.A02(r3.A02).A00(new C85744Hl(r3, 6), C69393Wv.class, r3);
                    } else {
                        throw C18270x1.A0S("fcsResourceExecutionCallbackHandlerFactory");
                    }
                }
                int intExtra = getIntent().getIntExtra(C373621y.ERROR_CODE.key, 0);
                if (intExtra == 0) {
                    A6f(getString(R.string.f11nameremoved));
                    C69263Wi r7 = this.A05;
                    AnonymousClass31C r8 = this.A0H;
                    C194259Se r1 = this.A0E;
                    AnonymousClass9U1 r9 = this.A0L;
                    AnonymousClass9U5 r12 = this.A0M;
                    C194389Sr r13 = this.A07;
                    C197109ca r15 = this.A0S;
                    AnonymousClass9AL r5 = new AnonymousClass9AL(this, r7, r8, r9, this.A0M, this.A0K, r12, r13, this, r15, this.A0V, r1);
                    this.A09 = r5;
                    r5.A00();
                    return;
                }
                A7m(intExtra);
                return;
            }
            return;
        }
        throw C18270x1.A0S("fcsActivityLifecycleManagerFactory");
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        int i2;
        int i3;
        C15930sC r1;
        if (i != 19) {
            r2 = AnonymousClass5V0.A00(this);
            if (i != 27) {
                switch (i) {
                    case 10:
                        r2.A0U(R.string.f11nameremoved);
                        r2.A0T(R.string.f11nameremoved);
                        C19340zH.A04(this, r2, 155, R.string.f11nameremoved);
                        C19340zH.A03(this, r2, 158, R.string.f11nameremoved);
                        r2.A0i(true);
                        i2 = 7;
                        break;
                    case 11:
                        r2.A0T(R.string.f11nameremoved);
                        C19340zH.A04(this, r2, 153, R.string.f11nameremoved);
                        C19340zH.A03(this, r2, 154, R.string.f11nameremoved);
                        r2.A0i(true);
                        i2 = 4;
                        break;
                    case 12:
                        r2.A0U(R.string.f11nameremoved);
                        r2.A0T(R.string.f11nameremoved);
                        C19340zH.A04(this, r2, 159, R.string.f11nameremoved);
                        C19340zH.A03(this, r2, 151, R.string.f11nameremoved);
                        r2.A0i(true);
                        i2 = 3;
                        break;
                    default:
                        r2.A0T(R.string.f11nameremoved);
                        i3 = R.string.f11nameremoved;
                        r1 = new AnonymousClass4K5(this, i, 0);
                        break;
                }
            } else {
                r2.A0U(R.string.f11nameremoved);
                r2.A0T(R.string.f11nameremoved);
                i3 = R.string.f11nameremoved;
                r1 = new AnonymousClass4K2(this, 152);
            }
            r2.A0d(this, r1, i3);
        } else {
            r2 = AnonymousClass5V0.A00(this);
            r2.A0T(R.string.f11nameremoved);
            C19340zH.A04(this, r2, 156, R.string.f11nameremoved);
            C19340zH.A03(this, r2, 157, R.string.f11nameremoved);
            r2.A0i(true);
            i2 = 6;
            r2.A0V(new C85824Ht(this, i2));
        }
        AnonymousClass043 create = r2.create();
        C162457s7.A0H(create);
        return create;
    }

    public static final int A0C(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2131583866:
                if (str.equals("change_pin")) {
                    return 2;
                }
                break;
            case 110760:
                str2 = "pay";
                break;
            case 74085029:
                str2 = "check_balance";
                break;
            case 398918110:
                str2 = "check_pin";
                break;
            case 949444906:
                if (str.equals("collect")) {
                    return 5;
                }
                break;
            case 1985322040:
                if (str.equals("set_pin")) {
                    return 1;
                }
                break;
        }
        if (str.equals(str2)) {
            return 4;
        }
        throw AnonymousClass001.A0c("Unexpected pin operation");
    }

    public void A7Z() {
        BjL();
        C621433s.A01(this, 19);
    }

    public void A7c() {
    }

    public void A7d() {
    }

    public final void A7m(int i) {
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("error_code", i);
        if (C162457s7.A0P(A7k(), "check_balance")) {
            this.A0S.A08(new AnonymousClass34V(i), 29, 1);
        }
        int i2 = 12;
        if (i != 11454) {
            i2 = 10;
            if (i != 11459) {
                i2 = 11;
                if (i != 11468) {
                    if (i == 11487 || i == 20682 || i == 20697) {
                        i2 = 27;
                    } else if (C162457s7.A0P(A7k(), "pay") || C162457s7.A0P(A7k(), "collect")) {
                        A7H();
                        finish();
                        return;
                    } else {
                        A7b();
                        return;
                    }
                }
            }
        }
        C621433s.A02(this, A082, i2);
    }

    public final void A7n(String str) {
        AnonymousClass4G9 A7j = A7j();
        if (A7j != null) {
            A7j.B3J(C57692u3.A04("action", str));
        }
        A7H();
        finish();
    }

    public void BbO(AnonymousClass34V r2) {
        throw AnonymousClass23S.A00();
    }

    public void onDestroy() {
        super.onDestroy();
        C42502Ok r2 = this.A05;
        if (r2 != null) {
            r2.A01.A02(r2.A02).A02(C69393Wv.class, r2);
        }
    }
}
