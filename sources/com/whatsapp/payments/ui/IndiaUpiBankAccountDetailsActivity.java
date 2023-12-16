package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass2YZ;
import X.AnonymousClass303;
import X.AnonymousClass31C;
import X.AnonymousClass33K;
import X.AnonymousClass36K;
import X.AnonymousClass5V0;
import X.AnonymousClass5WY;
import X.AnonymousClass6C7;
import X.AnonymousClass7ZK;
import X.AnonymousClass94I;
import X.AnonymousClass99H;
import X.AnonymousClass9AK;
import X.AnonymousClass9C3;
import X.AnonymousClass9DM;
import X.AnonymousClass9Qp;
import X.AnonymousClass9U1;
import X.AnonymousClass9U4;
import X.AnonymousClass9U5;
import X.AnonymousClass9V1;
import X.AnonymousClass9VH;
import X.AnonymousClass9W6;
import X.AnonymousClass9Wg;
import X.AnonymousClass9c5;
import X.AnonymousClass9c9;
import X.C107335b8;
import X.C107345b9;
import X.C107695bk;
import X.C109505ej;
import X.C133686hm;
import X.C133796hx;
import X.C137006nc;
import X.C153607bd;
import X.C158757kV;
import X.C158777kX;
import X.C160757oG;
import X.C161527pr;
import X.C161957qt;
import X.C162457s7;
import X.C166467yj;
import X.C166557yt;
import X.C166587yw;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C1899593h;
import X.C1899693i;
import X.C1906899l;
import X.C191719Gb;
import X.C19340zH;
import X.C194259Se;
import X.C194389Sr;
import X.C195229Ws;
import X.C196629bS;
import X.C196719bd;
import X.C197109ca;
import X.C197729dm;
import X.C199079fx;
import X.C202179lV;
import X.C204019og;
import X.C204219p0;
import X.C204249p3;
import X.C204279p6;
import X.C29261iX;
import X.C35371wl;
import X.C35711xJ;
import X.C40602Ha;
import X.C617332a;
import X.C64333Db;
import X.C66663Mh;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86654Ky;
import X.C88834as;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.CopyableTextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class IndiaUpiBankAccountDetailsActivity extends AnonymousClass9C3 implements C202179lV {
    public C133686hm A00;
    public C617332a A01;
    public AnonymousClass31C A02;
    public AnonymousClass9VH A03;
    public C196719bd A04;
    public AnonymousClass9U1 A05;
    public C196629bS A06;
    public AnonymousClass9W6 A07;
    public C40602Ha A08;
    public AnonymousClass9U5 A09;
    public C194389Sr A0A;
    public C137006nc A0B;
    public AnonymousClass9AK A0C;
    public C197109ca A0D;
    public C158757kV A0E;
    public AnonymousClass2YZ A0F;
    public AnonymousClass94I A0G;
    public AnonymousClass9Qp A0H;
    public AnonymousClass9V1 A0I;
    public C194259Se A0J;
    public boolean A0K;
    public final C160757oG A0L;

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (i4 == -1) {
            if (i == 0) {
                this.A0H.A00(this);
            } else if (i3 == 1012) {
                this.A0G.A00();
            } else {
                if (i3 == 1016) {
                    this.A0G.A00();
                } else if (i3 != 1017) {
                    if (i3 == 1019) {
                        if (intent != null) {
                            this.A0G.setInternationalActivationView((C166467yj) intent2.getParcelableExtra("INTERNATIONAL_ACTIVATION_RESULT_STATE"));
                        }
                    } else if (i3 == 1020 && intent != null) {
                        AnonymousClass99H A0I2 = C1899693i.A0I(this.A0L, this.A00.A08, "IndiaUpiBankAccountDetailsActivity onDeactivate Unable to get IndiaUpiMethodData");
                        this.A0G.setInternationalActivationView(new C166467yj("", true, ""));
                        String stringExtra = intent2.getStringExtra("extra_referral_screen");
                        AnonymousClass303 A0K2 = C1899593h.A0K();
                        A0K2.A03("payments_request_name", "deactivate_international_payments");
                        AnonymousClass9Wg.A02(A0K2, this.A0D, (Integer) null, "international_payment_prompt", stringExtra, 3);
                        C137006nc r7 = this.A0B;
                        C166557yt r12 = A0I2.A09;
                        String str = A0I2.A0F;
                        C166557yt r10 = (C166557yt) intent2.getParcelableExtra("DEACTIVATION_MPIN_BLOB");
                        C166557yt r9 = (C166557yt) intent2.getParcelableExtra("DEACTIVATION_SEQ_NUMBER");
                        C166557yt r8 = A0I2.A06;
                        String str2 = this.A00.A0A;
                        AnonymousClass9c9 r6 = new AnonymousClass9c9(this);
                        C162457s7.A0J(r12, 0);
                        C18260x0.A0Q(str, r10);
                        C18270x1.A11(r9, 3, r8);
                        C162457s7.A0J(str2, 5);
                        Log.i("PAY: deactivateInternationalPayments called");
                        AnonymousClass31C r11 = r7.A00;
                        String A032 = r11.A03();
                        C35711xJ r92 = new C35711xJ(new C35371wl(C166557yt.A00(r12), str, str2, r7.A02.A01(), C166557yt.A00(r10), C166557yt.A00(r9), C166557yt.A00(r8)), new C35371wl(A032, 15), AnonymousClass0x2.A0U(), 10);
                        AnonymousClass36K r82 = r92.A00;
                        C162457s7.A0D(r82);
                        r11.A0D(new C197729dm(r6, r7, r92, str2), r82, A032, 204, 0);
                    }
                }
                Intent A062 = C1899593h.A06(this, this.A00, IndiaUpiPinSetUpCompletedActivity.class);
                A062.putExtra("on_settings_page", true);
                startActivity(A062);
            }
        }
        super.onActivityResult(i3, i4, intent2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        this.A03.A01(new C195229Ws(this, 0));
        this.A0H = new AnonymousClass9Qp(this.A0A);
        this.A00 = (C133686hm) C86614Ku.A0D(this).get("extra_bank_account");
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            boolean A062 = this.A07.A06(this.A00);
            int i = R.string.f11nameremoved;
            if (A062) {
                i = R.string.f11nameremoved;
            }
            supportActionBar.A0B(i);
            supportActionBar.A0N(true);
        }
        this.A0L.A06("onCreate");
        AnonymousClass0x9.A0E(getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) findViewById(R.id.footer_container), true), R.id.psp_logo).setImageResource(this.A0I.A00(this.A06.A07(), (String) null).A00);
        C69263Wi r5 = this.A04;
        AnonymousClass31C r7 = this.A02;
        C194259Se r12 = this.A0J;
        this.A0C = new AnonymousClass9AK(this, r5, this.A01, r7, this.A05, this.A08, this.A09, this.A0A, r12);
    }

    public void A5r() {
        if (!this.A0K) {
            this.A0K = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r3 = A0I2.A4Z;
            C1899593h.A15(r3, this);
            C107695bk r2 = r3.A00;
            C1899593h.A0z(r3, r2, this, C1899593h.A0W(r3, r2, this));
            this.A04 = C64333Db.A04(r3);
            this.A0I = C64333Db.A8y(r3);
            this.A09 = (AnonymousClass33K) r3.AaW.get();
            this.A06 = C64333Db.A07(r3);
            this.A05 = (AnonymousClass5WY) r3.AUS.get();
            this.A07 = C64333Db.A2t(r3);
            this.A0D = C1899593h.A0I(r3);
            this.A0G = C1899593h.A0O(r3);
            this.A0A = (C1906899l) r3.APJ.get();
            this.A0C = C1899593h.A0G(r3);
            this.A0B = (C29261iX) r3.APs.get();
            this.A02 = C64333Db.A5u(r3);
            this.A0J = C1899593h.A0Q(r3);
            this.A0I = (AnonymousClass9V1) r3.AHb.get();
            this.A04 = C1899693i.A0H(r2);
            this.A07 = (AnonymousClass9W6) r3.AHa.get();
            this.A05 = (AnonymousClass9U1) r3.AHX.get();
            this.A03 = (AnonymousClass9VH) r2.A0z.get();
            this.A09 = C1899593h.A0F(r3);
            this.A0A = A0I2.ACl();
            this.A0F = (AnonymousClass2YZ) r2.A8x.get();
            this.A01 = C1899593h.A09(r3);
            this.A0D = C1899593h.A0L(r3);
            this.A08 = (C40602Ha) C1899693i.A0Y(r3);
            this.A06 = C1899693i.A0J(r3);
            this.A0E = (C158757kV) r2.A6P.get();
            this.A0B = A0I2.ACn();
        }
    }

    public void A75() {
        C199079fx r3 = new C199079fx(this);
        C18270x1.A0w(new C191719Gb(this, r3, 103), this.A0I);
    }

    public final C166467yj A78(C166587yw r8) {
        String string;
        if (!C161957qt.A02(this.A0D, this.A06.A07())) {
            return null;
        }
        AnonymousClass7ZK A002 = this.A0E.A00(r8.A0A);
        if (A002 == null || !A002.A02.equals("activated")) {
            string = getString(R.string.f11nameremoved);
        } else {
            string = AnonymousClass002.A0F(this, C161957qt.A00(this.A07, A002.A00), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
        }
        return new C166467yj(string, false, "");
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r2;
        int i2;
        int i3;
        boolean z = false;
        if (i != 100) {
            if (i == 101) {
                r2 = C1899693i.A08(this);
                C204219p0.A01(r2, this, 10, R.string.f11nameremoved);
                i2 = R.string.f11nameremoved;
                i3 = 11;
            } else if (i != 200) {
                switch (i) {
                    case 103:
                        r2 = AnonymousClass5V0.A00(this);
                        r2.A0T(R.string.f11nameremoved);
                        i2 = R.string.f11nameremoved;
                        i3 = 12;
                        break;
                    case 104:
                        r2 = AnonymousClass5V0.A00(this);
                        r2.A0T(R.string.f11nameremoved);
                        i2 = R.string.f11nameremoved;
                        i3 = 13;
                        break;
                    case 105:
                        r2 = AnonymousClass5V0.A00(this);
                        r2.A0U(R.string.f11nameremoved);
                        r2.A0T(R.string.f11nameremoved);
                        C204219p0.A01(r2, this, 14, R.string.f11nameremoved);
                        i2 = R.string.f11nameremoved;
                        i3 = 15;
                        break;
                    default:
                        return super.onCreateDialog(i);
                }
            } else {
                r2 = AnonymousClass5V0.A00(this);
                r2.A0U(R.string.f11nameremoved);
                C158777kX r3 = this.A0G;
                C166587yw r1 = this.A08;
                C162457s7.A0J(r1, 0);
                C86624Kv.A0i(this, r2, new Object[]{r3.A02(r1, true)}, R.string.f11nameremoved);
                C204219p0.A00(r2, this, 16, R.string.f11nameremoved);
                String string = getString(R.string.f11nameremoved);
                r2.A00.A0I(new C204219p0(this, 18), string);
            }
            C204219p0.A00(r2, this, i3, i2);
        } else {
            if (AnonymousClass9U4.A01(this.A0D).A0N(1).size() > 0) {
                z = true;
            }
            r2 = AnonymousClass5V0.A00(this);
            int i4 = R.string.f11nameremoved;
            if (z) {
                i4 = R.string.f11nameremoved;
            }
            r2.A0g(C107345b9.A05(this, this.A0C, getString(i4)));
            r2.A0i(true);
            C204219p0.A00(r2, this, 17, R.string.f11nameremoved);
            C204219p0.A01(r2, this, 19, R.string.f11nameremoved);
            r2.A0V(new C204279p6(this, 2));
        }
        return r2.create();
    }

    public IndiaUpiBankAccountDetailsActivity(int i) {
        this.A0K = false;
        C204019og.A00(this, 49);
    }

    public void A76(C166587yw r6, boolean z) {
        super.A76(r6, z);
        C133686hm r2 = (C133686hm) r6;
        this.A00 = r2;
        this.A02.setText(this.A07.A03(r2));
        if (z) {
            this.A02.setText(this.A07.A03(this.A00));
            CopyableTextView copyableTextView = this.A03;
            Object[] A0L2 = AnonymousClass002.A0L();
            A0L2[0] = this.A06.A04().A00;
            AnonymousClass001.A0y(this, copyableTextView, A0L2, R.string.f11nameremoved);
            this.A03.A02 = C196629bS.A00(this.A06);
            this.A03.A03 = getString(R.string.f11nameremoved);
            C133796hx r22 = this.A00.A08;
            if (r22 instanceof AnonymousClass99H) {
                this.A01.setText(((AnonymousClass99H) r22).A0E());
            }
            ((ViewGroup) findViewById(R.id.payment_method_additional_details_container)).addView(LayoutInflater.from(this).inflate(R.layout.f8nameremoved, (ViewGroup) null));
            findViewById(R.id.check_balance_container).setOnClickListener(new C109505ej(C204249p3.A00(this, 37), this.A06));
            C107335b8.A0E(C86654Ky.A0M(this, R.id.check_balance_icon), AnonymousClass0Y8.A04(this, R.color.f5nameremoved));
            C86604Kt.A1L(this, R.id.default_payment_method_divider);
            this.A0G = new AnonymousClass94I(this);
            ((ViewGroup) findViewById(R.id.widget_container)).addView(this.A0G);
            AnonymousClass94I r23 = this.A0G;
            C166467yj A78 = A78(r6);
            r23.A06 = this;
            r23.findViewById(R.id.reset_upi_pin_container).setOnClickListener(r23);
            r23.A04 = AnonymousClass002.A09(r23, R.id.reset_upi_pin);
            r23.A00 = r23.findViewById(R.id.change_upi_pin_container);
            r23.A03 = r23.findViewById(R.id.switch_payment_provider_container);
            r23.A02 = r23.findViewById(R.id.upi_international_shimmer);
            r23.A01 = r23.findViewById(R.id.upi_international_container);
            C166557yt r0 = ((AnonymousClass99H) r6.A08).A05;
            r23.A05 = r0;
            if (!AnonymousClass001.A1Z(r0.A00)) {
                r23.A04.setText(R.string.f11nameremoved);
                r23.A00.setVisibility(8);
            } else {
                r23.A00.setVisibility(0);
                if (A78 != null) {
                    r23.setInternationalActivationView(A78);
                }
            }
            r23.A00.setOnClickListener(r23);
            r23.A03.setOnClickListener(r23);
            this.A0G.A03.setVisibility(AnonymousClass001.A08(AnonymousClass000.A1S(this.A06.A08(C66663Mh.A0f) ? 1 : 0) ^ true ? 1 : 0));
        }
    }

    public void onClick(View view) {
        if (view.getId() != R.id.default_payment_method_row || !this.A07.A06(this.A00)) {
            super.onClick(view);
            return;
        }
        Bp9(R.string.f11nameremoved);
        AnonymousClass99H A0I2 = C1899693i.A0I(this.A0L, this.A00.A08, "onMakeDefaultPaymentMethod Unable to get IndiaUpiMethodData");
        AnonymousClass9AK r4 = this.A0C;
        C166557yt r5 = A0I2.A09;
        String str = A0I2.A0F;
        C166557yt r6 = A0I2.A06;
        String str2 = this.A00.A0A;
        boolean z = !A0I2.A0H;
        AnonymousClass9DM r7 = new AnonymousClass9DM(this.A04, this.A0D, this, this);
        if (C161527pr.A02(r5)) {
            r4.A07.A01(r4.A01, (C153607bd) null, new AnonymousClass9c5(r6, r7, r4, str2, false, z));
        } else {
            r4.A01(r5, r6, r7, str, str2, false, z);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A03.A02()) {
            AnonymousClass9VH.A00(this);
        }
    }

    public IndiaUpiBankAccountDetailsActivity() {
        this(0);
        this.A0L = C160757oG.A00("IndiaUpiBankAccountDetailsActivity", "payment-settings", "IN");
    }
}
