package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1S3;
import X.AnonymousClass1VX;
import X.AnonymousClass31C;
import X.AnonymousClass33O;
import X.AnonymousClass39M;
import X.AnonymousClass39Q;
import X.AnonymousClass5V0;
import X.AnonymousClass5XO;
import X.AnonymousClass5Y0;
import X.AnonymousClass7HR;
import X.AnonymousClass97T;
import X.AnonymousClass99D;
import X.AnonymousClass9AI;
import X.AnonymousClass9Cx;
import X.AnonymousClass9G7;
import X.AnonymousClass9G8;
import X.AnonymousClass9GM;
import X.AnonymousClass9GN;
import X.AnonymousClass9OI;
import X.AnonymousClass9OY;
import X.AnonymousClass9OZ;
import X.AnonymousClass9PQ;
import X.AnonymousClass9QF;
import X.AnonymousClass9QH;
import X.AnonymousClass9Qx;
import X.AnonymousClass9RV;
import X.AnonymousClass9U4;
import X.AnonymousClass9VW;
import X.AnonymousClass9WY;
import X.AnonymousClass9dS;
import X.AnonymousClass9dT;
import X.C06560Yg;
import X.C107575bX;
import X.C117095rN;
import X.C134246ig;
import X.C154437dA;
import X.C160757oG;
import X.C161527pr;
import X.C161957qt;
import X.C162457s7;
import X.C166207yJ;
import X.C166557yt;
import X.C18270x1;
import X.C1899593h;
import X.C1899693i;
import X.C191929Gz;
import X.C193099Nd;
import X.C193319Oa;
import X.C193329Ob;
import X.C19340zH;
import X.C193599Pg;
import X.C193999Re;
import X.C194259Se;
import X.C194469Sz;
import X.C194569Tl;
import X.C194589Tn;
import X.C194619Tt;
import X.C196369aj;
import X.C196409an;
import X.C196629bS;
import X.C197549dU;
import X.C199439ga;
import X.C202829me;
import X.C203409ne;
import X.C203769oH;
import X.C203859oQ;
import X.C204109op;
import X.C204219p0;
import X.C204249p3;
import X.C204799pw;
import X.C204979qE;
import X.C29421in;
import X.C56602sG;
import X.C56962sq;
import X.C60152y5;
import X.C613130e;
import X.C617332a;
import X.C620633i;
import X.C620733j;
import X.C620933l;
import X.C621433s;
import X.C66663Mh;
import X.C69263Wi;
import X.C85204Fi;
import X.C86624Kv;
import X.C95814uZ;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.payments.ui.widget.PaymentView$$ExternalSyntheticLambda4;
import java.math.BigDecimal;
import java.util.List;

public class IndiaUpiSendPaymentActivity extends AnonymousClass9Cx implements C202829me {
    public int A00 = 0;
    public BottomSheetBehavior A01;
    public C56962sq A02;
    public C29421in A03;
    public C194619Tt A04;
    public AnonymousClass9Qx A05;
    public C193999Re A06;
    public AnonymousClass9RV A07;
    public C194589Tn A08;
    public AnonymousClass9OI A09;
    public AnonymousClass9GN A0A;
    public C191929Gz A0B;
    public C196369aj A0C = null;
    public AnonymousClass9G8 A0D;
    public C197549dU A0E;
    public C60152y5 A0F;
    public C613130e A0G;
    public AnonymousClass5XO A0H;
    public BigDecimal A0I;
    public boolean A0J;
    public boolean A0K = false;
    public boolean A0L = false;
    public final C56602sG A0M = new C203859oQ(this, 1);
    public final C203769oH A0N = new AnonymousClass9dS(this);
    public final C203409ne A0O = new AnonymousClass9dT(this);

    public static /* synthetic */ void A0C(AnonymousClass99D r3, IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        indiaUpiSendPaymentActivity.A0d = false;
        indiaUpiSendPaymentActivity.BjL();
        if (r3 != null && !indiaUpiSendPaymentActivity.A8F(r3)) {
            C160757oG r2 = indiaUpiSendPaymentActivity.A0f;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("starting onContactVpa for jid: ");
            A0o.append(indiaUpiSendPaymentActivity.A0E);
            A0o.append(" vpa: ");
            A0o.append(r3.A02);
            A0o.append(" receiverVpaId: ");
            C1899593h.A1J(r2, r3.A03, A0o);
            indiaUpiSendPaymentActivity.A0I = r3.A02;
            indiaUpiSendPaymentActivity.A0h = r3.A03;
            if (!C161527pr.A02(r3.A01)) {
                indiaUpiSendPaymentActivity.A0G = r3.A01;
            }
            indiaUpiSendPaymentActivity.A8N(true);
        }
    }

    public final String A8G(String str) {
        if (this.A0U == null || TextUtils.isEmpty(str)) {
            return "0";
        }
        return String.format(this.A01.A0O(), "%.2f", AnonymousClass000.A1b(C161957qt.A01(this.A0U, new BigDecimal(str))));
    }

    public final void A8H() {
        int i;
        if (this.A0K) {
            int i2 = this.A00;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = 36;
                    } else if (i2 == 3) {
                        i = 22;
                    } else if (i2 != 4) {
                        this.A0K = false;
                        C621433s.A00(this, 37);
                        PaymentView paymentView = this.A0N;
                        if (paymentView != null) {
                            paymentView.A04();
                            return;
                        }
                        return;
                    } else {
                        i = 35;
                    }
                    C621433s.A00(this, 37);
                    C621433s.A01(this, i);
                    this.A00 = 0;
                    return;
                }
                C621433s.A01(this, 37);
            } else if (this.A0A == null) {
                C621433s.A01(this, 37);
                AnonymousClass9GN r1 = new AnonymousClass9GN(this);
                this.A0A = r1;
                AnonymousClass0x7.A1B(r1, this.A04);
            }
        }
    }

    public final void A8J() {
        AnonymousClass9G7 r3 = new AnonymousClass9G7();
        this.A0D = r3;
        PaymentView paymentView = this.A0N;
        if (paymentView != null) {
            paymentView.A0C(r3, R.id.payment_bottom_button, R.id.payment_bottom_button_inflated);
            this.A0D.A00 = C204249p3.A00(this.A0N, 153);
        }
        C69263Wi r5 = this.A05;
        AnonymousClass31C r7 = this.A0H;
        C194259Se r13 = this.A0E;
        this.A0E = new AnonymousClass9AI(this, r5, this.A07, r7, this.A04, this.A0L, this.A0K, this.A0M, this.A0V, r13);
    }

    public final void A8K() {
        if (this.A0L) {
            A8N(true);
            if (AnonymousClass97T.A12(this) && this.A00 != 5) {
                AnonymousClass9GN r1 = new AnonymousClass9GN(this);
                this.A0A = r1;
                AnonymousClass0x7.A1B(r1, this.A04);
            }
        } else if (!C161527pr.A02(this.A0G)) {
            A8N(true);
            if (this.A0U != null) {
                AnonymousClass1VX r12 = this.A0D;
                C162457s7.A0J(r12, 0);
                int A0N2 = r12.A0N(3327);
                if (A0N2 == 0) {
                    A0N2 = SearchActionVerificationClientService.NOTIFICATION_ID;
                }
                String num = Integer.toString(A0N2);
                this.A0l = num;
                this.A0E.A00 = this.A0N.A02(num, this.A0m, this.A0k);
            }
        } else if (A7T()) {
            String A002 = C196629bS.A00(this.A0M);
            if (A002 == null || !A002.equals(this.A0I.A00)) {
                Bp9(R.string.f11nameremoved);
                this.A0E.A01(this.A0I, (C166557yt) null, new C204799pw(new C199439ga(this), 1, this));
                return;
            }
            A8A(new AnonymousClass9VW(R.string.f11nameremoved), (String) null, new Object[0]);
        } else if (this.A0E != null) {
            C191929Gz r13 = new C191929Gz(this, false);
            this.A0B = r13;
            AnonymousClass0x7.A1B(r13, this.A04);
            A8N(true);
        } else {
            finish();
        }
    }

    public final void A8L(String str, String str2) {
        C134246ig A052 = this.A0S.A05(4, 51, "new_payment", this.A0f);
        A052.A0S = str;
        A052.A0T = str2;
        AnonymousClass97T.A0t(A052, this);
    }

    public final void A8M(String str, boolean z) {
        if (str != null) {
            C620933l r2 = this.A0N.A03;
            r2.A0K(AnonymousClass000.A0V(";", str, C1899593h.A0c(r2)));
            C194569Tl.A00(AnonymousClass9U4.A00(this.A0P), str).A03(new C204979qE(1, this, z));
            return;
        }
        this.A05.A0D();
        A8A(new AnonymousClass9VW(R.string.f11nameremoved), (String) null, new Object[0]);
    }

    public final void A8N(boolean z) {
        PaymentView paymentView;
        PaymentView paymentView2 = this.A0N;
        if (paymentView2 != null && !this.A0d) {
            if (this.A00 == null) {
                setContentView((View) paymentView2);
                if (this.A0J) {
                    setSupportActionBar(C1899593h.A07(this));
                    AnonymousClass5XO.A00(this, getSupportActionBar());
                    A8I();
                }
            }
            A7u();
            if (z) {
                if (!C1899693i.A0w(this.A0D) || this.A0D.A0X(979)) {
                    A7t();
                } else {
                    A7B(this.A0E);
                }
            }
            String str = this.A0V;
            if (!(str == null || (paymentView = this.A0N) == null)) {
                paymentView.A1I = str;
            }
            List list = this.A0i;
            if (list != null) {
                list.clear();
            }
            if (this.A0J == null && (AnonymousClass97T.A12(this) || this.A0M.A0P())) {
                AnonymousClass9GM r1 = new AnonymousClass9GM(this);
                this.A0J = r1;
                C18270x1.A0w(r1, this.A04);
            }
            BjL();
        }
    }

    public /* bridge */ /* synthetic */ Object Bhf() {
        String str;
        AnonymousClass39Q r5;
        C196409an r18;
        String str2;
        C193599Pg r14;
        int i;
        AnonymousClass9OY r2;
        C166207yJ r0 = this.A0U;
        C617332a r1 = this.A07;
        if (r0 == null) {
            str = "INR";
        } else {
            str = r0.A01;
        }
        C85204Fi A012 = r1.A01(str);
        AnonymousClass9OI r22 = this.A09;
        if (r22.A00) {
            r22.A00 = false;
            if (TextUtils.isEmpty(this.A0j)) {
                this.A0j = getString(R.string.f11nameremoved);
            }
            if (TextUtils.isEmpty(this.A0m)) {
                this.A0m = ((AnonymousClass1S3) A012).A01.toString();
            }
        }
        if (!TextUtils.isEmpty(this.A0m)) {
            r5 = C1899593h.A08(A012, new BigDecimal(this.A0m));
        } else {
            r5 = ((AnonymousClass1S3) A012).A01;
        }
        AnonymousClass39Q A082 = C1899593h.A08(A012, new BigDecimal(this.A06.A03(C66663Mh.A1m)));
        if (!A7T()) {
            AnonymousClass1VX r10 = this.A0D;
            AnonymousClass5Y0 r9 = this.A0C;
            C620633i r8 = this.A08;
            C620733j r7 = this.A01;
            AnonymousClass33O r4 = this.A0d;
            C60152y5 r3 = this.A0F;
            r18 = new C196409an(this, r8, r7, this.A0B, r9, r10, this.A0D, r3, r4);
        } else {
            r18 = null;
        }
        if (!this.A0D.A0X(1955) || !this.A0L || C107575bX.A0F(this.A0k)) {
            str2 = this.A0l;
        } else {
            str2 = "500500";
        }
        String A0d = AnonymousClass97T.A0d(this);
        if (!C107575bX.A0F(A0d)) {
            str2 = A0d;
        }
        AnonymousClass39Q A022 = this.A0N.A02(str2, this.A0m, this.A0k);
        C166207yJ r42 = this.A0U;
        if (r42 != null) {
            r14 = new C193599Pg(this, this.A01, this.A07, r42, this.A0m);
        } else {
            r14 = null;
        }
        this.A0E = new C197549dU(this, this.A01, A012, A022, r5, A082, r14);
        C95814uZ r20 = this.A0E;
        String str3 = this.A0j;
        AnonymousClass39M r17 = this.A0c;
        Integer num = this.A0f;
        String str4 = this.A0o;
        C203769oH r12 = this.A0N;
        if (this.A0u) {
            i = 0;
        } else {
            i = 1;
            if (this.A0J) {
                i = 2;
            }
        }
        C193329Ob r82 = new C193329Ob(i, getIntent().getIntExtra("extra_transfer_direction", 0));
        C193099Nd r72 = new C193099Nd(!AnonymousClass97T.A12(this));
        AnonymousClass9OZ r52 = new AnonymousClass9OZ(NumberEntryKeyboard.A00(this.A01), this.A0r);
        C203409ne r11 = this.A0O;
        String str5 = this.A0n;
        String str6 = this.A0k;
        String str7 = this.A0m;
        C166207yJ r13 = this.A0U;
        if (r13 == null) {
            r2 = new AnonymousClass9OY(A012, 0);
        } else {
            r2 = new AnonymousClass9OY(this.A07.A01(r13.A01), 2);
        }
        Integer valueOf = Integer.valueOf(R.style.f12nameremoved);
        AnonymousClass9QF r21 = new AnonymousClass9QF(AnonymousClass0x9.A0C(valueOf, new int[]{0, 0, 0, 0}), AnonymousClass0x9.A0C(valueOf, new int[]{0, 0, 0, 0}), this.A0C, r2, this.A0E, str5, str6, str7, R.style.f12nameremoved, false, false, false);
        C193319Oa r32 = new C193319Oa(this, this.A0D.A0X(811));
        C194589Tn r92 = this.A08;
        AnonymousClass39M r27 = r17;
        return new AnonymousClass9QH(r20, r18, r12, r11, r21, new AnonymousClass9PQ(this.A0B, this.A07, r92, this.A0D.A0X(629)), r52, r72, r32, r82, r27, num, str3, str4, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r4 != 1018) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            r0 = 1008(0x3f0, float:1.413E-42)
            if (r4 == r0) goto L_0x0010
            r0 = 1015(0x3f7, float:1.422E-42)
            if (r4 == r0) goto L_0x0029
            r0 = 1018(0x3fa, float:1.427E-42)
            if (r4 == r0) goto L_0x0010
        L_0x000c:
            super.onActivityResult(r4, r5, r6)
            return
        L_0x0010:
            boolean r0 = r3.A8O()
            if (r0 == 0) goto L_0x000c
            X.39Q r2 = r3.A09
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r3.Bp9(r0)
            X.4FS r1 = r3.A04
            X.9iJ r0 = new X.9iJ
            r0.<init>(r2, r3)
            r1.BkM(r0)
            return
        L_0x0029:
            r3.A7s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public Dialog onCreateDialog(int i) {
        C19340zH r6;
        int i2;
        int i3;
        C19340zH A002;
        int i4;
        int i5;
        if (i != 29) {
            switch (i) {
                case 35:
                    A002 = AnonymousClass5V0.A00(this);
                    A002.A0U(R.string.f11nameremoved);
                    A002.A0T(R.string.f11nameremoved);
                    i2 = R.string.f11nameremoved;
                    i3 = 72;
                    break;
                case 36:
                    A002 = AnonymousClass5V0.A00(this);
                    A002.A0U(R.string.f11nameremoved);
                    A002.A0T(R.string.f11nameremoved);
                    i2 = R.string.f11nameremoved;
                    i3 = 73;
                    break;
                case 37:
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    progressDialog.setMessage(getString(R.string.f11nameremoved));
                    progressDialog.setCancelable(false);
                    progressDialog.setButton(-1, getString(R.string.f11nameremoved), new C204219p0(this, 74));
                    return progressDialog;
                default:
                    switch (i) {
                        case 39:
                            A8L("-10021", "MAX_AMOUNT_2K_ALERT");
                            r6 = AnonymousClass5V0.A00(this);
                            C86624Kv.A0i(this, r6, new Object[]{AnonymousClass1S3.A05.B3W(this.A01, this.A0I)}, R.string.f11nameremoved);
                            i4 = R.string.f11nameremoved;
                            i5 = 75;
                            break;
                        case 40:
                            A8L("-10021", "MAX_AMOUNT_2K_ALERT");
                            r6 = AnonymousClass5V0.A00(this);
                            C86624Kv.A0i(this, r6, new Object[]{AnonymousClass1S3.A05.B3W(this.A01, new BigDecimal(AnonymousClass97T.A0d(this)))}, R.string.f11nameremoved);
                            i4 = R.string.f11nameremoved;
                            i5 = 76;
                            break;
                        case 41:
                            A8L("-10021", "MAX_AMOUNT_2K_ALERT");
                            r6 = AnonymousClass5V0.A00(this);
                            C86624Kv.A0i(this, r6, new Object[]{AnonymousClass1S3.A05.B3W(this.A01, new BigDecimal(AnonymousClass97T.A0d(this)))}, R.string.f11nameremoved);
                            i4 = R.string.f11nameremoved;
                            i5 = 77;
                            break;
                        default:
                            return super.onCreateDialog(i);
                    }
                    C204219p0.A01(r6, this, i5, i4);
                    r6.A0i(false);
                    break;
            }
            C204219p0.A01(r6, this, i3, i2);
            r6.A0i(true);
        } else {
            r6 = C1899693i.A08(this);
            C204219p0.A01(r6, this, 70, R.string.f11nameremoved);
            C204219p0.A00(r6, this, 71, R.string.f11nameremoved);
        }
        return r6.create();
    }

    public final void A8I() {
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            boolean z = this.A0u;
            int i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
            C1899593h.A0n(supportActionBar, i);
            if (!this.A0u) {
                supportActionBar.A08(0.0f);
            }
        }
    }

    public final boolean A8O() {
        if (getIntent().getIntExtra("extra_transaction_type", 0) != 20 || !this.A0D.A0X(1847) || !this.A0I.A0D()) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0J = C154437dA.A00(this.A0D);
        this.A05.A03 = this.A0V;
        if (bundle == null) {
            String A0a = C1899593h.A0a(this);
            if (A0a == null) {
                A0a = this.A0f;
            }
            Integer A012 = this.A0V.A01(A0a, 185472016);
            if (A012 != null) {
                this.A00 = A012.intValue();
            }
            this.A0V.A08("wa_to_wa", !A7T(), this.A00);
        }
        this.A03.A06(this.A0M);
        A8I();
        PaymentView paymentView = (PaymentView) LayoutInflater.from(this).inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
        this.A0N = paymentView;
        paymentView.A0x = this;
        getLifecycle().A00(new PaymentView$$ExternalSyntheticLambda4(paymentView));
        C166207yJ r0 = (C166207yJ) getIntent().getParcelableExtra("extra_upi_global_meta_data");
        this.A0U = r0;
        if (r0 != null) {
            C196369aj r4 = new C196369aj();
            this.A0C = r4;
            PaymentView paymentView2 = this.A0N;
            if (paymentView2 != null) {
                paymentView2.A0C(r4, R.id.send_payment_amount_description_container, R.id.send_payment_amount_description_container_inflated);
            }
            this.A0C.Axq(new AnonymousClass7HR(2, new C194469Sz(AnonymousClass002.A0F(this, A8G(this.A0U.A08), AnonymousClass002.A0L(), 0, R.string.f11nameremoved))));
            C196369aj r3 = this.A0C;
            C204249p3 A002 = C204249p3.A00(this, 96);
            TextView textView = r3.A00;
            if (textView != null) {
                textView.setOnClickListener(A002);
            } else {
                throw C18270x1.A0S("amountConversion");
            }
        }
        this.A0L = getIntent().getBooleanExtra("verify-vpa-in-background", false);
        this.A0X = getIntent().getBooleanExtra("extra_mapper_alias_resolved", false);
        this.A0Q = getIntent().getStringExtra("extra_receiver_platform");
        if (this.A0D.A0X(1933) && AnonymousClass9WY.A05(this.A0f)) {
            this.A0I = new BigDecimal(this.A06.A03(C66663Mh.A1k));
        }
        this.A0n = getIntent().getBooleanExtra("extra_transaction_is_valid_merchant", false);
        this.A0T = getIntent().getStringExtra("extra_merchant_code");
        this.A0Z = C1899693i.A0a(this, "extra_merchant_code");
        String str = this.A0T;
        if (str != null && !str.equals("0000")) {
            this.A0p = "p2m";
        }
        if (A7T()) {
            A8J();
        } else {
            this.A0D = new AnonymousClass9G8();
        }
        if (this.A0J) {
            View A022 = C06560Yg.A02(this.A0N, R.id.send_payment_keyboard_popup_layout);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            this.A01 = bottomSheetBehavior;
            this.A0H.A02(A022, bottomSheetBehavior, this, this.A0B);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0V.A04(this.A00, 4);
        this.A03.A07(this.A0M);
        C191929Gz r0 = this.A0B;
        if (r0 != null) {
            r0.A0D(true);
        }
        AnonymousClass9GN r02 = this.A0A;
        if (r02 != null) {
            r02.A0D(true);
        }
    }

    public void onPause() {
        super.onPause();
        PaymentView paymentView = this.A0N;
        if (paymentView != null) {
            paymentView.A03 = paymentView.A11.B48().getCurrentFocus();
        }
    }

    public void onResume() {
        super.onResume();
        if (AnonymousClass97T.A12(this)) {
            if (!this.A05.A07.contains("upi-get-challenge") && this.A0M.A05().A00 == null) {
                this.A0f.A06("onResume getChallenge");
                Bp9(R.string.f11nameremoved);
                this.A05.A02("upi-get-challenge");
                A7Y();
                return;
            } else if (TextUtils.isEmpty((CharSequence) this.A0M.A04().A00)) {
                this.A07.A01(this, this.A05, new C204109op(this, 0));
                return;
            }
        }
        A7c();
    }

    public void onStart() {
        super.onStart();
        if (this.A0J) {
            BottomSheetBehavior bottomSheetBehavior = this.A01;
            PaymentView paymentView = this.A0N;
            if (bottomSheetBehavior != null && bottomSheetBehavior.A0O == 4) {
                paymentView.post(new C117095rN(bottomSheetBehavior, 28));
            }
        }
    }
}
