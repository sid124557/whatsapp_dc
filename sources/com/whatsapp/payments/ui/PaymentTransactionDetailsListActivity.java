package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2X5;
import X.AnonymousClass2z0;
import X.AnonymousClass303;
import X.AnonymousClass33K;
import X.AnonymousClass33O;
import X.AnonymousClass4DI;
import X.AnonymousClass4L0;
import X.AnonymousClass5C5;
import X.AnonymousClass5OL;
import X.AnonymousClass5UX;
import X.AnonymousClass5Ul;
import X.AnonymousClass5WY;
import X.AnonymousClass5ZR;
import X.AnonymousClass8EA;
import X.AnonymousClass94y;
import X.AnonymousClass94z;
import X.AnonymousClass9DY;
import X.AnonymousClass9EY;
import X.AnonymousClass9F0;
import X.AnonymousClass9F1;
import X.AnonymousClass9F2;
import X.AnonymousClass9F3;
import X.AnonymousClass9F4;
import X.AnonymousClass9F5;
import X.AnonymousClass9F6;
import X.AnonymousClass9QK;
import X.AnonymousClass9QM;
import X.AnonymousClass9Tp;
import X.AnonymousClass9U4;
import X.C05570Ua;
import X.C106145Xu;
import X.C106195Xz;
import X.C106715a2;
import X.C107395bF;
import X.C111095hX;
import X.C114015mM;
import X.C153087ae;
import X.C160757oG;
import X.C18320x8;
import X.C183538qC;
import X.C1899693i;
import X.C1907099n;
import X.C191349Eo;
import X.C191359Ep;
import X.C191369Eq;
import X.C191389Es;
import X.C191409Eu;
import X.C191419Ev;
import X.C191429Ew;
import X.C191439Ex;
import X.C191449Ey;
import X.C191459Ez;
import X.C191649Ft;
import X.C191659Fu;
import X.C193629Pj;
import X.C193999Re;
import X.C194229Sb;
import X.C194589Tn;
import X.C194599Tr;
import X.C195219Wq;
import X.C195909Zz;
import X.C203499no;
import X.C203719oC;
import X.C203799oK;
import X.C29271iY;
import X.C33141sV;
import X.C55732qp;
import X.C56232re;
import X.C56422rx;
import X.C56492s4;
import X.C620133d;
import X.C620733j;
import X.C621033m;
import X.C624034w;
import X.C624134x;
import X.C626936e;
import X.C627636p;
import X.C627736r;
import X.C64773Ex;
import X.C66433Lk;
import X.C69263Wi;
import X.C85244Fm;
import X.C86604Kt;
import X.C86614Ku;
import X.C994455t;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class PaymentTransactionDetailsListActivity extends AnonymousClass9DY {
    public C85244Fm A00;
    public AnonymousClass5WY A01;
    public AnonymousClass5Ul A02;
    public C56492s4 A03;
    public C621033m A04;
    public AnonymousClass5UX A05;
    public C64773Ex A06;
    public C56422rx A07;
    public C114015mM A08;
    public AnonymousClass5OL A09;
    public AnonymousClass5ZR A0A;
    public C620733j A0B;
    public AnonymousClass8EA A0C;
    public AnonymousClass33K A0D;
    public C56232re A0E;
    public C620133d A0F;
    public C106195Xz A0G;
    public C195909Zz A0H;
    public C194599Tr A0I;
    public C193999Re A0J;
    public C153087ae A0K;
    public C1907099n A0L;
    public AnonymousClass9U4 A0M;
    public C194589Tn A0N;
    public AnonymousClass9Tp A0O;
    public AnonymousClass94y A0P;
    public AnonymousClass9QK A0Q;
    public C194229Sb A0R;
    public C195219Wq A0S;
    public C55732qp A0T;
    public AnonymousClass33O A0U;
    public AnonymousClass5C5 A0V;
    public C66433Lk A0W;
    public C106715a2 A0X;
    public C33141sV A0Y;
    public AnonymousClass2X5 A0Z;
    public C183538qC A0a;
    public String A0b;
    public final C160757oG A0c = C160757oG.A00("PaymentTransactionDetailsListActivity", "payment-settings", "COMMON");

    public C05570Ua A74(ViewGroup viewGroup, int i) {
        if (i != 306) {
            switch (i) {
                case 200:
                    return new AnonymousClass9F1(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A0D, this.A0N);
                case 201:
                    return new C191459Ez(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A0I);
                case 202:
                    AnonymousClass1VX r3 = this.A0D;
                    return new AnonymousClass9F4(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A08, r3);
                case 203:
                    AnonymousClass1VX r10 = this.A0D;
                    C106715a2 r11 = this.A0X;
                    C114015mM r8 = this.A08;
                    return new AnonymousClass9F5(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A03, this.A05, r8, this.A08, r10, r11);
                case 204:
                    return new C191419Ev(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                case 205:
                    C69263Wi r6 = this.A05;
                    C106195Xz r102 = this.A0G;
                    return new AnonymousClass9F6(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), r6, this.A00, this.A09, this.A08, r102);
                case 206:
                    return new C191389Es(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                case 207:
                    return new AnonymousClass9EY(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                case 208:
                    return new C191359Ep(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                case 209:
                    AnonymousClass1VX r62 = this.A0D;
                    AnonymousClass5Ul r2 = this.A02;
                    C621033m r32 = this.A04;
                    C55732qp r9 = this.A0T;
                    C620733j r5 = this.A0B;
                    C33141sV r12 = this.A0Y;
                    AnonymousClass5ZR r4 = this.A0A;
                    C620133d r82 = this.A0F;
                    AnonymousClass33O r103 = this.A0U;
                    C56232re r7 = this.A0E;
                    AnonymousClass5C5 r112 = this.A0V;
                    View A0R2 = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                    return new C191369Eq(A0R2, new C106145Xu(A0R2, r2, r32, r4, r5, r62, r7, r82, r9, r103, r112, r12));
                case 210:
                    return new C191349Eo(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                case 211:
                    return new C191409Eu(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                case 212:
                    return new AnonymousClass9F0(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), A75().B7b());
                case 213:
                    return new C191429Ew(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                case 214:
                    return new AnonymousClass9F3(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                case 215:
                    return new C191439Ex(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
                case 216:
                    AnonymousClass1VX r92 = this.A0D;
                    C69263Wi r72 = this.A05;
                    return new AnonymousClass9F2(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A00, r72, this.A08, r92, this.A0W);
                default:
                    return super.A74(viewGroup, i);
            }
        } else {
            return new C191449Ey(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A0D);
        }
    }

    public C203719oC A75() {
        return this.A0M.A0G();
    }

    public AnonymousClass94y A76(Bundle bundle) {
        AnonymousClass0XL A0F2;
        Class cls;
        if (this instanceof BrazilPaymentTransactionDetailActivity) {
            BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = (BrazilPaymentTransactionDetailActivity) this;
            if (bundle == null) {
                bundle = C86614Ku.A0D(brazilPaymentTransactionDetailActivity);
            }
            boolean A002 = brazilPaymentTransactionDetailActivity.A0L.A00();
            AnonymousClass9QM r2 = brazilPaymentTransactionDetailActivity.A03;
            if (A002) {
                A0F2 = AnonymousClass4L0.A0F(new C203799oK(bundle, 2, r2), brazilPaymentTransactionDetailActivity);
                cls = C191649Ft.class;
            } else {
                A0F2 = AnonymousClass4L0.A0F(new C203799oK(bundle, 1, r2), brazilPaymentTransactionDetailActivity);
                cls = C191659Fu.class;
            }
        } else {
            AnonymousClass9QK r22 = this.A0Q;
            C203499no B7b = A75().B7b();
            if (bundle == null) {
                bundle = C86614Ku.A0D(this);
            }
            A0F2 = AnonymousClass4L0.A0F(new AnonymousClass94z(bundle, B7b, r22), this);
            cls = AnonymousClass94y.class;
        }
        return (AnonymousClass94y) A0F2.A01(cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x037f, code lost:
        startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0382, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0475, code lost:
        r2 = r0.A05;
        X.C626936e.A06(r2);
        r1 = new X.C194519Tf();
        r1.A04 = r3;
        r1.A01 = r9.A0B;
        r1.A02 = r2;
        r1.A03 = r9.A0S;
        r1.A00 = r9.A06;
        r1.A01(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0492, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0559, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x055c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a4, code lost:
        r2.putExtra(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a7, code lost:
        startActivity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01aa, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A78(X.AnonymousClass9QJ r21) {
        /*
            r20 = this;
            r0 = r21
            int r7 = r0.A00
            java.lang.String r4 = "extra_bank_account"
            java.lang.String r3 = "extra_merchant_code"
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.String r5 = "paymentHandle"
            java.lang.String r14 = "payment_transaction_details"
            r2 = 1
            r11 = 0
            r1 = 0
            r9 = r20
            switch(r7) {
                case 0: goto L_0x0041;
                case 1: goto L_0x01fa;
                case 2: goto L_0x0559;
                case 3: goto L_0x0209;
                case 4: goto L_0x020d;
                case 5: goto L_0x0223;
                case 6: goto L_0x025d;
                case 7: goto L_0x0017;
                case 8: goto L_0x0274;
                case 9: goto L_0x002b;
                case 10: goto L_0x027a;
                case 11: goto L_0x0372;
                case 12: goto L_0x0493;
                case 13: goto L_0x0383;
                case 14: goto L_0x0016;
                case 15: goto L_0x0016;
                case 16: goto L_0x03a1;
                case 17: goto L_0x0078;
                case 18: goto L_0x0086;
                case 19: goto L_0x03de;
                case 20: goto L_0x03e2;
                case 21: goto L_0x00a6;
                case 22: goto L_0x040b;
                case 23: goto L_0x0436;
                case 24: goto L_0x0016;
                case 25: goto L_0x01d1;
                case 26: goto L_0x0439;
                case 27: goto L_0x0016;
                case 28: goto L_0x0473;
                default: goto L_0x0016;
            }
        L_0x0016:
            return
        L_0x0017:
            java.lang.Class r1 = r0.A09
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r9, r1)
            X.7yw r0 = r0.A04
            X.C626936e.A06(r0)
            r2.putExtra(r4, r0)
            java.lang.String r1 = "event_screen"
            java.lang.String r0 = "forgot_pin"
            goto L_0x01a4
        L_0x002b:
            X.9oC r1 = r9.A75()
            java.lang.Class r1 = r1.B42()
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r9, r1)
            X.7yw r0 = r0.A04
            X.C626936e.A06(r0)
            r2.putExtra(r4, r0)
            goto L_0x01a7
        L_0x0041:
            android.os.Bundle r2 = r0.A02
            java.lang.String r0 = "action_bar_on_configuration_change"
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L_0x0052
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r9.A79(r0, r11)
        L_0x0052:
            java.lang.String r0 = "action_bar_title_res_id"
            int r2 = r2.getInt(r0)
            X.0R8 r3 = r9.getSupportActionBar()
            if (r3 == 0) goto L_0x0016
            r0 = 1
            r3.A0N(r0)
            r3.A0B(r2)
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r0 = "extra_action_bar_display_close"
            boolean r0 = r2.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0016
            r0 = 2131232509(0x7f0806fd, float:1.808113E38)
            r3.A09(r0)
            return
        L_0x0078:
            X.34w r2 = r0.A05
            if (r2 == 0) goto L_0x0016
            X.9oC r2 = r9.A75()
            X.34w r0 = r0.A05
            X.AnonymousClass9Lt.A00(r9, r0, r2, r14, r1)
            return
        L_0x0086:
            boolean r0 = r9 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity
            if (r0 == 0) goto L_0x009f
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r9 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r9
            X.9Fv r2 = r9.A07
        L_0x008e:
            boolean r0 = r2 instanceof X.C191659Fu
            if (r0 == 0) goto L_0x0016
            X.9Fu r2 = (X.C191659Fu) r2
            X.4FS r1 = r2.A0l
            X.9gp r0 = new X.9gp
            r0.<init>(r2)
            r1.BkM(r0)
            return
        L_0x009f:
            boolean r0 = r9 instanceof com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity
            if (r0 == 0) goto L_0x0559
            X.94y r2 = r9.A0P
            goto L_0x008e
        L_0x00a6:
            X.94y r4 = r9.A0P
            java.lang.String r15 = r9.A0b
            r3 = 87
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            X.9no r10 = r4.A0e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r17 = r11
            r16 = r11
            r18 = r1
            r19 = r2
            r10.BKF(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1n7 r3 = r0.A08
            if (r3 != 0) goto L_0x010d
            java.lang.String r3 = "PAY : PaymentTransactionDetailsListActivity/EVENT_OPEN_ORDER_DETAILS_PAGE : orderMessageKey is null"
            com.whatsapp.util.Log.e((java.lang.String) r3)
            X.34w r4 = r0.A05
            if (r4 == 0) goto L_0x010b
            com.whatsapp.jid.UserJid r3 = r4.A0D
            if (r3 == 0) goto L_0x010b
            java.lang.Boolean r5 = r4.A06()
            if (r5 == 0) goto L_0x010b
            X.3Ex r4 = r9.A06
            X.34w r3 = r0.A05
            com.whatsapp.jid.UserJid r3 = r3.A0D
            X.3ZH r4 = r4.A0A(r3)
            boolean r3 = r5.booleanValue()
            if (r3 == 0) goto L_0x0108
            java.lang.String r5 = r4.A0J()
        L_0x00ec:
            r3 = 2131891434(0x7f1214ea, float:1.9417588E38)
            java.lang.String r4 = r9.getString(r3)
            r3 = 2131891433(0x7f1214e9, float:1.9417586E38)
            java.lang.Object[] r1 = X.C18310x6.A1b(r5, r1)
            java.lang.String r0 = r0.A0D
            java.lang.String r0 = X.AnonymousClass002.A0F(r9, r0, r1, r2, r3)
            X.043 r0 = X.AnonymousClass9WM.A01(r9, r11, r4, r0)
            r0.show()
            return
        L_0x0108:
            java.lang.String r5 = r4.A0b
            goto L_0x00ec
        L_0x010b:
            r5 = r11
            goto L_0x00ec
        L_0x010d:
            X.C626936e.A06(r3)
            X.2z0 r1 = r3.A1J
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x0134
            X.9Tp r1 = r9.A0O
            r1.A00()
            X.9Tp r1 = r9.A0O
            boolean r1 = r1.A06()
            if (r1 == 0) goto L_0x0016
            X.9Tp r1 = r9.A0O
            X.1n7 r0 = r0.A08
            X.C626936e.A06(r0)
            r1.A02()
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0134:
            X.99n r2 = r9.A0L
            X.9Zz r7 = r9.A0H
            X.1n7 r1 = r0.A08
            X.C626936e.A06(r1)
            X.2z0 r1 = r1.A1J
            X.4uZ r3 = r1.A00
            X.C626936e.A06(r3)
            X.1n7 r1 = r0.A08
            X.C626936e.A06(r1)
            X.2z0 r6 = r1.A1J
            java.lang.String r1 = r0.A0D
            X.C626936e.A06(r1)
            int r4 = r0.A01
            java.lang.String r5 = "order_details"
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x01ab
            boolean r0 = r2.A0K(r11)
            if (r0 == 0) goto L_0x01ab
            X.9U4 r2 = r7.A0B
            java.lang.String r0 = "P2M_LITE"
            X.9oC r0 = r2.A0H(r0)
            if (r0 == 0) goto L_0x01bc
            java.lang.Class r0 = r0.BAk()
            if (r0 == 0) goto L_0x01bc
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r9, r0)
        L_0x0174:
            X.C107395bF.A00(r2, r6)
            java.lang.String r0 = "extra_order_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "extra_transaction_type"
            java.lang.String r0 = "p2m"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "extra_payment_config_id"
            r2.putExtra(r0, r11)
            java.lang.String r0 = "referral_screen"
            r2.putExtra(r0, r5)
            if (r4 <= 0) goto L_0x0194
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r2.putExtra(r0, r4)
        L_0x0194:
            java.lang.String r0 = "extra_payment_type"
            r2.putExtra(r0, r11)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.setFlags(r0)
            java.lang.String r1 = "extra_jid"
            java.lang.String r0 = r3.getRawString()
        L_0x01a4:
            r2.putExtra(r1, r0)
        L_0x01a7:
            r9.startActivity(r2)
            return
        L_0x01ab:
            X.9U4 r0 = r7.A0B
            X.9oC r0 = r0.A0G()
            java.lang.Class r0 = r0.BAk()
            if (r0 == 0) goto L_0x01bc
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r9, r0)
            goto L_0x0174
        L_0x01bc:
            X.9U4 r2 = r7.A0B
            java.lang.String r0 = "GLOBAL_ORDER"
            X.9oC r0 = r2.A0H(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.Class r0 = r0.BAk()
            if (r0 == 0) goto L_0x0016
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r9, r0)
            goto L_0x0174
        L_0x01d1:
            X.94y r1 = r9.A0P
            java.lang.String r15 = r9.A0b
            r0 = 142(0x8e, float:1.99E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r18 = 0
            X.9no r10 = r1.A0e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r17 = r11
            r16 = r11
            r19 = r2
            r10.BKF(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.9oC r0 = r9.A75()
            X.9Vt r0 = r0.B9W()
            if (r0 == 0) goto L_0x0016
            r0.A00(r9, r14)
            return
        L_0x01fa:
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x0205
            r0 = 2131891993(0x7f121719, float:1.9418722E38)
            r9.Bp9(r0)
            return
        L_0x0205:
            r9.BjL()
            return
        L_0x0209:
            r9.invalidateOptionsMenu()
            return
        L_0x020d:
            X.3ZH r2 = r0.A03
            X.C626936e.A06(r2)
            X.36r r1 = new X.36r
            r1.<init>()
            r0 = 18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Intent r0 = r1.A1M(r9, r2, r0)
            goto L_0x037f
        L_0x0223:
            X.9oC r1 = r9.A75()
            java.lang.Class r1 = r1.BB3()
            android.content.Intent r4 = X.AnonymousClass0x9.A08(r9, r1)
            X.3QD r2 = X.AnonymousClass3QD.A00()
            java.lang.String r1 = r0.A0F
            X.7yt r2 = X.C1899693i.A0F(r2, r6, r1, r5)
            java.lang.String r1 = "extra_payment_handle"
            r4.putExtra(r1, r2)
            java.lang.String r2 = "extra_referral_screen"
            java.lang.String r1 = "payment_transaction_history"
            r4.putExtra(r2, r1)
            java.lang.String r2 = "extra_payment_handle_id"
            java.lang.String r1 = r0.A0E
            r4.putExtra(r2, r1)
            java.lang.String r2 = "extra_payee_name"
            X.7yt r1 = r0.A07
            r4.putExtra(r2, r1)
            java.lang.String r0 = r0.A0B
            r4.putExtra(r3, r0)
            r0 = 0
            r9.A6T(r4, r0)
            return
        L_0x025d:
            r3 = 2131891727(0x7f12160f, float:1.9418182E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.9oC r0 = r9.A75()
            int r0 = r0.BAv()
            java.lang.String r0 = r9.getString(r0)
            r2[r1] = r0
            r9.Box(r2, r1, r3)
            return
        L_0x0274:
            java.lang.String r0 = r0.A0C
            r9.Bov(r11, r0)
            return
        L_0x027a:
            X.34w r15 = r0.A05
            X.C626936e.A06(r15)
            X.7yw r14 = r0.A04
            boolean r0 = r15.A0L()
            if (r0 == 0) goto L_0x028a
            java.lang.String r3 = "payments:request"
            goto L_0x028c
        L_0x028a:
            java.lang.String r3 = "payments:transaction"
        L_0x028c:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ Exception -> 0x02d9 }
            java.lang.String r1 = "lg"
            X.33j r0 = r9.A0B     // Catch:{ Exception -> 0x02d9 }
            java.lang.String r0 = r0.A07()     // Catch:{ Exception -> 0x02d9 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            java.lang.String r1 = "lc"
            X.33j r0 = r9.A0B     // Catch:{ Exception -> 0x02d9 }
            java.lang.String r0 = r0.A06()     // Catch:{ Exception -> 0x02d9 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            java.lang.String r1 = "platform"
            java.lang.String r0 = "android"
            org.json.JSONObject r1 = r2.put(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            java.lang.String r0 = "context"
            org.json.JSONObject r2 = r1.put(r0, r3)     // Catch:{ Exception -> 0x02d9 }
            java.lang.String r1 = "type"
            java.lang.String r0 = "p2p"
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            java.lang.String r1 = r15.A0J     // Catch:{ Exception -> 0x02d9 }
            if (r1 == 0) goto L_0x02c7
            java.lang.String r0 = "error_code"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x02d9 }
        L_0x02c7:
            if (r14 == 0) goto L_0x02e1
            java.lang.String r0 = r14.A0B     // Catch:{ Exception -> 0x02d9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x02d9 }
            if (r0 != 0) goto L_0x02e1
            java.lang.String r1 = "bank_name"
            java.lang.String r0 = r14.A0B     // Catch:{ Exception -> 0x02d9 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x02d9 }
            goto L_0x02e1
        L_0x02d9:
            r2 = move-exception
            X.7oG r1 = r9.A0c
            java.lang.String r0 = "debugInfoData fields"
            r1.A0A(r0, r2)
        L_0x02e1:
            android.os.Bundle r8 = X.AnonymousClass002.A08()
            boolean r0 = r15.A0L()
            if (r0 != 0) goto L_0x02f2
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"
            java.lang.String r0 = r15.A0K
            r8.putString(r1, r0)
        L_0x02f2:
            java.lang.String r1 = r15.A0F
            if (r1 == 0) goto L_0x02fb
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentBankTxnId"
            r8.putString(r0, r1)
        L_0x02fb:
            if (r14 == 0) goto L_0x030f
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentMethod"
            r8.putParcelable(r0, r14)
            X.6hx r0 = r14.A08
            if (r0 == 0) goto L_0x036a
            java.lang.String r1 = r0.A09()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentBankPhone"
            r8.putString(r0, r1)
        L_0x030f:
            java.lang.String r1 = r15.A0J
            if (r1 == 0) goto L_0x0318
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentErrorCode"
            r8.putString(r0, r1)
        L_0x0318:
            int r1 = r15.A02
            r0 = 409(0x199, float:5.73E-43)
            if (r1 != r0) goto L_0x032b
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.type"
            r0 = 2
            r8.putInt(r1, r0)
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.paymentStatus"
            java.lang.String r0 = "RF"
            r8.putString(r1, r0)
        L_0x032b:
            X.9oC r0 = r9.A75()
            X.8tj r0 = r0.BAs()
            if (r0 == 0) goto L_0x0348
            boolean r0 = r0.BFU()
            if (r0 == 0) goto L_0x0348
            android.net.Uri r0 = r9.A6D()
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.uri"
            java.lang.String r0 = r0.toString()
            r8.putString(r1, r0)
        L_0x0348:
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.from"
            r8.putString(r0, r3)
            X.4FS r2 = r9.A04
            X.2s4 r12 = r9.A03
            X.3Mh r11 = r9.A06
            X.5WY r10 = r9.A01
            X.33j r13 = r9.A0B
            X.33K r1 = r9.A0D
            X.7ae r0 = r9.A0K
            X.9H2 r7 = new X.9H2
            r17 = r0
            r18 = r3
            r16 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.AnonymousClass0x7.A1B(r7, r2)
            return
        L_0x036a:
            X.7oG r1 = r9.A0c
            java.lang.String r0 = "payment method missing country fields"
            r1.A05(r0)
            goto L_0x030f
        L_0x0372:
            android.content.Context r2 = r9.getApplicationContext()
            java.lang.String r0 = r0.A0G
            X.C626936e.A06(r0)
            android.content.Intent r0 = X.C627736r.A17(r2, r0, r11, r1, r1)
        L_0x037f:
            r9.startActivity(r0)
            return
        L_0x0383:
            X.9Re r7 = r9.A0J
            com.whatsapp.jid.UserJid r4 = r0.A06
            X.3QD r3 = X.AnonymousClass3QD.A00()
            java.lang.String r2 = r0.A0F
            X.7yt r10 = X.C1899693i.A0F(r3, r6, r2, r5)
            r3 = 2
            X.9om r2 = new X.9om
            r2.<init>(r0, r3, r9)
            r12 = r1
            r6 = r7
            r7 = r9
            r8 = r2
            r9 = r4
            r11 = r1
            r6.A00(r7, r8, r9, r10, r11, r12)
            return
        L_0x03a1:
            X.7yw r2 = r0.A04
            X.C626936e.A06(r2)
            java.lang.String r2 = r0.A0A
            X.C626936e.A06(r2)
            X.2lm r13 = new X.2lm
            r13.<init>(r2, r11, r11)
            java.util.HashMap r15 = X.AnonymousClass001.A0t()
            X.7yw r0 = r0.A04
            java.lang.String r2 = r0.A0A
            java.lang.String r0 = "credential_id"
            r15.put(r0, r2)
            X.3Wi r2 = r9.A05
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r2.A0G(r1, r0)
            X.8qC r0 = r9.A0a
            java.lang.Object r10 = r0.get()
            X.2YZ r10 = (X.AnonymousClass2YZ) r10
            r0 = 8
            X.9qV r11 = new X.9qV
            r11.<init>(r9, r0)
            r0 = 4
            X.9UK r12 = new X.9UK
            r12.<init>(r9, r0)
            r10.A00(r11, r12, r13, r14, r15)
            return
        L_0x03de:
            super.onBackPressed()
            return
        L_0x03e2:
            X.94y r1 = r9.A0P
            java.lang.String r15 = r9.A0b
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r18 = 0
            X.9no r10 = r1.A0e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r17 = r11
            r16 = r11
            r19 = r2
            r10.BKF(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.5hX r2 = r9.A00
            X.2X5 r1 = r9.A0Z
            java.lang.String r0 = "smb_transaction_details"
            android.content.Intent r0 = r1.A00(r0)
            r2.A0A(r9, r0)
            return
        L_0x040b:
            X.94y r1 = r9.A0P
            X.9Pj r1 = r1.A06
            if (r1 == 0) goto L_0x042c
            X.34x r1 = r1.A02
        L_0x0413:
            X.2rx r2 = r9.A07
            X.34w r1 = r1.A0P
            com.whatsapp.jid.UserJid r1 = r1.A0D
            X.2qS r1 = r2.A00(r1)
            boolean r3 = r1.A02()
            X.34w r1 = r0.A05
            int r2 = r1.A03
            r1 = 200(0xc8, float:2.8E-43)
            if (r2 != r1) goto L_0x042e
            java.lang.String r3 = "wa_smb_p2m_payment_details"
            goto L_0x0475
        L_0x042c:
            r1 = 0
            goto L_0x0413
        L_0x042e:
            if (r3 == 0) goto L_0x0433
            java.lang.String r3 = "wa_api_p2m_receipt_support"
            goto L_0x0475
        L_0x0433:
            java.lang.String r3 = "wa_p2m_receipt_support"
            goto L_0x0475
        L_0x0436:
            java.lang.String r3 = "wa_p2m_receipt_report_transaction"
            goto L_0x0475
        L_0x0439:
            X.94y r4 = r9.A0P
            java.lang.String r15 = r9.A0b
            r3 = 143(0x8f, float:2.0E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            X.9no r10 = r4.A0e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            r17 = r11
            r16 = r11
            r18 = r1
            r19 = r2
            r10.BKF(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.9Tp r3 = r9.A0O
            X.2sr r2 = r9.A01
            X.34w r1 = r0.A05
            X.C626936e.A06(r1)
            com.whatsapp.jid.UserJid r1 = r1.A0E
            boolean r1 = r2.A0a(r1)
            X.34w r0 = r0.A05
            if (r1 != 0) goto L_0x0470
            com.whatsapp.jid.UserJid r0 = r0.A0E
        L_0x0469:
            X.C626936e.A06(r0)
            r3.A03(r2)
            return
        L_0x0470:
            com.whatsapp.jid.UserJid r0 = r0.A0D
            goto L_0x0469
        L_0x0473:
            java.lang.String r3 = "wa_p2m_lite_receipt_support"
        L_0x0475:
            X.34w r2 = r0.A05
            X.C626936e.A06(r2)
            X.9Tf r1 = new X.9Tf
            r1.<init>()
            r1.A04 = r3
            X.33j r0 = r9.A0B
            r1.A01 = r0
            r1.A02 = r2
            X.9Wq r0 = r9.A0S
            r1.A03 = r0
            X.3Ex r0 = r9.A06
            r1.A00 = r0
            r1.A01(r9)
            return
        L_0x0493:
            X.94y r1 = r9.A0P
            X.9Pj r1 = r1.A06
            if (r1 == 0) goto L_0x0566
            X.34x r5 = r1.A02
        L_0x049b:
            X.9Zz r4 = r9.A0H
            r1 = 0
            android.content.Intent r4 = r4.A01(r9, r2, r1)
            X.7ae r1 = r9.A0K
            X.4Fi r7 = r1.A01()
            X.33j r6 = r9.A0B
            X.34w r1 = r5.A0P
            X.39Q r1 = r1.A08
            java.lang.String r6 = r7.B3U(r6, r1)
            java.lang.String r1 = "extra_payment_preset_amount"
            r4.putExtra(r1, r6)
            X.9Wq r8 = r9.A0S
            X.34w r7 = r5.A0P
            int r6 = r7.A02
            r1 = 405(0x195, float:5.68E-43)
            if (r6 != r1) goto L_0x04d6
            int r1 = r7.A03
            if (r1 != r2) goto L_0x04d6
            X.99n r1 = r8.A0C
            X.1VX r6 = r1.A02
            r1 = 2381(0x94d, float:3.336E-42)
            boolean r1 = r6.A0X(r1)
            if (r1 == 0) goto L_0x04d6
            X.9Sb r1 = r9.A0R
            r1.A01(r4)
        L_0x04d6:
            X.2z0 r1 = r5.A1J
            X.4uZ r7 = r1.A00
            boolean r1 = r7 instanceof com.whatsapp.jid.GroupJid
            java.lang.String r6 = "extra_jid"
            if (r1 == 0) goto L_0x055d
            X.AnonymousClass0x2.A0u(r4, r7, r6)
            X.34w r1 = r5.A0P
            com.whatsapp.jid.UserJid r1 = r1.A0D
            java.lang.String r1 = X.C627336j.A07(r1)
            java.lang.String r6 = "extra_receiver_jid"
        L_0x04ed:
            r4.putExtra(r6, r1)
            java.lang.String r6 = "extra_payment_note"
            java.lang.String r1 = r5.A13()
            r4.putExtra(r6, r1)
            java.lang.String r1 = "extra_conversation_message_type"
            r4.putExtra(r1, r2)
            boolean r1 = r5.A1m()
            if (r1 == 0) goto L_0x050f
            java.util.List r1 = r5.A18
            java.lang.String r2 = X.C624435a.A01(r1)
            java.lang.String r1 = "extra_mentioned_jids"
            r4.putExtra(r1, r2)
        L_0x050f:
            X.34w r1 = r5.A0P
            if (r1 == 0) goto L_0x051e
            X.39R r2 = r1.A05()
            if (r2 == 0) goto L_0x051e
            java.lang.String r1 = "extra_payment_background"
            r4.putExtra(r1, r2)
        L_0x051e:
            X.1VX r2 = r9.A0D
            r1 = 812(0x32c, float:1.138E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 != 0) goto L_0x0532
            X.1VX r2 = r9.A0D
            r1 = 811(0x32b, float:1.136E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x054a
        L_0x0532:
            boolean r1 = r5 instanceof X.AnonymousClass1nE
            if (r1 == 0) goto L_0x054a
            X.1nE r5 = (X.AnonymousClass1nE) r5
            X.2qp r1 = r9.A0T
            X.39M r2 = r1.A00(r5)
            java.lang.String r1 = "extra_payment_sticker"
            r4.putExtra(r1, r2)
            java.lang.String r2 = "extra_payment_sticker_send_origin"
            java.lang.Integer r1 = r5.A05
            r4.putExtra(r2, r1)
        L_0x054a:
            java.lang.String r2 = "referral_screen"
            java.lang.String r1 = "send_again_button"
            r4.putExtra(r2, r1)
            java.lang.String r0 = r0.A0B
            r4.putExtra(r3, r0)
            r9.startActivity(r4)
        L_0x0559:
            r9.finish()
            return
        L_0x055d:
            X.34w r1 = r5.A0P
            com.whatsapp.jid.UserJid r1 = r1.A0D
            java.lang.String r1 = X.C627336j.A07(r1)
            goto L_0x04ed
        L_0x0566:
            r5 = 0
            goto L_0x049b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.A78(X.9QJ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ad, code lost:
        if (r2.A03 != 40) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        if (r2 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b2, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b7, code lost:
        if (X.AnonymousClass9V7.A00(r2) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ba, code lost:
        r5.BKF(r6, r16, r17, "payment_transaction_details", r10, (java.lang.String) null, (java.lang.String) null, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A79(java.lang.Integer r16, java.lang.Integer r17) {
        /*
            r15 = this;
            X.94y r0 = r15.A0P
            X.9Pj r0 = r0.A06
            r6 = 0
            if (r0 != 0) goto L_0x0102
            r2 = r6
        L_0x0008:
            X.9oC r0 = r15.A75()
            X.9no r5 = r0.B7b()
            if (r5 == 0) goto L_0x00c3
            if (r2 == 0) goto L_0x006c
            X.9Wq r3 = r15.A0S
            int r1 = r2.A03
            r0 = 9
            if (r1 != r0) goto L_0x00d8
            java.lang.String r1 = "cashback"
        L_0x001e:
            java.lang.String r0 = "cashback"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "incentive"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "purchase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
            X.303 r6 = X.C1899593h.A0K()
        L_0x003a:
            java.lang.String r0 = "transaction_type"
            r6.A03(r0, r1)
            X.94y r0 = r15.A0P
            X.9Pj r0 = r0.A06
            if (r0 == 0) goto L_0x0069
            X.7yw r4 = r0.A00
            if (r4 == 0) goto L_0x0069
            boolean r0 = r4 instanceof X.C133726hq
            if (r0 == 0) goto L_0x00c4
            r0 = r4
            X.6hq r0 = (X.C133726hq) r0
            java.lang.String r3 = r0.A00
            java.lang.String r1 = "confirm"
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "payment_instruction"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c4
            java.lang.String r1 = "cpi"
        L_0x0064:
            java.lang.String r0 = "payment_type"
            r6.A03(r0, r1)
        L_0x0069:
            r15.A77(r2, r6)
        L_0x006c:
            boolean r0 = r15 instanceof com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity
            if (r0 == 0) goto L_0x00a2
            android.content.Intent r3 = r15.getIntent()
            java.lang.String r0 = "extra_mapper_alias_resolved"
            r1 = 0
            boolean r0 = r3.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x00a2
            if (r6 != 0) goto L_0x0087
            X.303[] r1 = new X.AnonymousClass303[r1]
            r0 = 0
            X.303 r6 = new X.303
            r6.<init>(r0, r1)
        L_0x0087:
            java.lang.String r1 = "is_alias_resolved"
            r0 = 1
            r6.A02(r1, r0)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "extra_receiver_platform"
            java.lang.String r1 = r1.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "receiver_platform"
            r6.A03(r0, r1)
        L_0x00a2:
            java.lang.String r9 = "payment_transaction_details"
            java.lang.String r10 = r15.A0b
            if (r2 == 0) goto L_0x00af
            int r1 = r2.A03
            r0 = 40
            r13 = 1
            if (r1 == r0) goto L_0x00b2
        L_0x00af:
            r13 = 0
            if (r2 == 0) goto L_0x00b9
        L_0x00b2:
            boolean r0 = X.AnonymousClass9V7.A00(r2)
            r14 = 1
            if (r0 != 0) goto L_0x00ba
        L_0x00b9:
            r14 = 0
        L_0x00ba:
            r11 = 0
            r7 = r16
            r8 = r17
            r12 = r11
            r5.BKF(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00c3:
            return
        L_0x00c4:
            boolean r0 = r4 instanceof X.C133706ho
            if (r0 != 0) goto L_0x00ce
            boolean r0 = r4 instanceof X.C133736hr
            if (r0 != 0) goto L_0x00ce
            r1 = 0
            goto L_0x0064
        L_0x00ce:
            java.lang.String r1 = "native"
            goto L_0x0064
        L_0x00d1:
            X.9Af r6 = new X.9Af
            r6.<init>()
            goto L_0x003a
        L_0x00d8:
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00e0
            r0 = 100
            if (r1 != r0) goto L_0x00f2
        L_0x00e0:
            X.99n r1 = r3.A0C
            boolean r0 = r1.A0C()
            if (r0 != 0) goto L_0x00ee
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x00f2
        L_0x00ee:
            java.lang.String r1 = "purchase"
            goto L_0x001e
        L_0x00f2:
            X.1S4 r0 = r2.A0A
            if (r0 == 0) goto L_0x00fe
            X.39O r0 = r0.A00
            if (r0 == 0) goto L_0x00fe
            java.lang.String r1 = "incentive"
            goto L_0x001e
        L_0x00fe:
            java.lang.String r1 = "none"
            goto L_0x001e
        L_0x0102:
            X.34w r2 = r0.A01
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.A79(java.lang.Integer, java.lang.Integer):void");
    }

    public boolean A7A() {
        return C1899693i.A0x(this.A0L);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C193629Pj r0 = this.A0P.A06;
        if (!(r0 == null || r0.A02 == null)) {
            menu.add(0, R.id.menuitem_view_in_chat, 0, R.string.f11nameremoved);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C624134x r6;
        Intent A072;
        long j;
        Class cls;
        C193629Pj r0 = this.A0P.A06;
        if (r0 != null) {
            r6 = r0.A02;
        } else {
            r6 = null;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
            if (isTaskRoot()) {
                if (this instanceof IndiaUpiPaymentTransactionDetailsActivity) {
                    cls = IndiaPaymentTransactionHistoryActivity.class;
                } else {
                    cls = PaymentTransactionHistoryActivity.class;
                }
                A072 = AnonymousClass0x9.A08(this, cls);
                A072.putExtra("extra_show_requests", this.A0P.A09);
                finishAndRemoveTask();
            }
            return true;
        }
        if (r6 != null) {
            if (menuItem.getItemId() == R.id.menuitem_view_in_chat) {
                if (r6.A1L == 0) {
                    j = 1;
                } else {
                    j = r6.A1L;
                }
                long A012 = C627636p.A01(r6);
                C111095hX r7 = this.A00;
                C627736r r1 = new C627736r();
                C626936e.A06(r6);
                AnonymousClass2z0 r62 = r6.A1J;
                r7.A0B(this, C107395bF.A00(r1.A1N(this, r62.A00).putExtra("row_id", j).putExtra("sort_id", A012), r62));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_debug) {
                C626936e.A0C(C1899693i.A0x(this.A0L));
                A072 = C18320x8.A07();
                String BAm = A75().BAm();
                if (TextUtils.isEmpty(BAm)) {
                    return false;
                }
                A072.setClassName(this, BAm);
                A072.putExtra("extra_transaction_id", r6.A15);
                AnonymousClass2z0 r02 = r6.A1J;
                if (r02 != null) {
                    C107395bF.A00(A072, r02);
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
        startActivity(A072);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (X.C86614Ku.A0D(r4) != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            boolean r0 = r4.A7A()
            X.C626936e.A0C(r0)
            java.lang.String r0 = X.C1899593h.A0Z(r4)
            r4.A0b = r0
            X.8EA r0 = r4.A0C
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x001e
            if (r5 != 0) goto L_0x003a
            android.os.Bundle r0 = X.C86614Ku.A0D(r4)
            if (r0 != 0) goto L_0x003a
        L_0x001e:
            X.7oG r3 = r4.A0c
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PaymentStore uninitialized or no valid bundle: "
            r2.append(r0)
            if (r5 != 0) goto L_0x0032
            android.os.Bundle r1 = X.C86614Ku.A0D(r4)
            r0 = 1
            if (r1 == 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            X.C1899593h.A1L(r3, r2, r0)
            r4.finish()
            return
        L_0x003a:
            X.94y r2 = r4.A76(r5)
            r4.A0P = r2
            r0 = 63
            X.9qL r1 = X.C205049qL.A00(r4, r0)
            X.08M r0 = r2.A02
            r0.A0B(r4, r1)
            r0 = 64
            X.9qL r1 = X.C205049qL.A00(r4, r0)
            X.4UC r0 = r2.A08
            r0.A0B(r4, r1)
            X.94y r2 = r4.A0P
            r1 = 2
            X.9Nc r0 = new X.9Nc
            r0.<init>(r1)
            r2.A0Q(r0)
            X.3Wi r3 = r4.A05
            X.5a2 r2 = r4.A0X
            X.33p r1 = r4.A09
            X.5OL r0 = new X.5OL
            r0.<init>(r3, r1, r2)
            r4.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C994455t r1;
        C29271iY r12;
        AnonymousClass4DI r0;
        super.onDestroy();
        AnonymousClass94y r02 = this.A0P;
        if (!(r02 == null || (r12 = r02.A0Z) == null || (r0 = r02.A0Y) == null)) {
            r12.A07(r0);
        }
        AnonymousClass5OL r2 = this.A09;
        if (r2 != null && (r1 = r2.A00) != null) {
            r1.A02 = true;
            r1.interrupt();
            r2.A00 = null;
        }
    }

    public void A77(C624034w r1, AnonymousClass303 r2) {
    }
}
