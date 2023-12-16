package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass1VX;
import X.AnonymousClass31C;
import X.AnonymousClass36F;
import X.AnonymousClass4FS;
import X.AnonymousClass4L0;
import X.AnonymousClass9AI;
import X.AnonymousClass9B3;
import X.AnonymousClass9U1;
import X.AnonymousClass9U5;
import X.AnonymousClass9UW;
import X.AnonymousClass9VH;
import X.AnonymousClass9VW;
import X.C003203q;
import X.C06560Yg;
import X.C105895Wv;
import X.C153527bU;
import X.C160757oG;
import X.C161527pr;
import X.C166557yt;
import X.C18270x1;
import X.C18300x5;
import X.C1899593h;
import X.C1902494w;
import X.C191729Gc;
import X.C194209Rz;
import X.C194259Se;
import X.C194619Tt;
import X.C195229Ws;
import X.C196629bS;
import X.C196719bd;
import X.C197109ca;
import X.C203819oM;
import X.C203959oa;
import X.C204079om;
import X.C204249p3;
import X.C205049qL;
import X.C40602Ha;
import X.C617332a;
import X.C620733j;
import X.C626936e;
import X.C69263Wi;
import X.C86654Ky;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public class IndiaUpiSendPaymentToVpaFragment extends Hilt_IndiaUpiSendPaymentToVpaFragment {
    public EditText A00;
    public ProgressBar A01;
    public TextView A02;
    public C69263Wi A03;
    public C620733j A04;
    public AnonymousClass36F A05;
    public C617332a A06;
    public AnonymousClass1VX A07;
    public C166557yt A08;
    public AnonymousClass31C A09;
    public AnonymousClass9VH A0A;
    public C194619Tt A0B;
    public C196719bd A0C;
    public AnonymousClass9U1 A0D;
    public C196629bS A0E;
    public C40602Ha A0F;
    public AnonymousClass9U5 A0G;
    public AnonymousClass9AI A0H;
    public C197109ca A0I;
    public C194209Rz A0J;
    public C1902494w A0K;
    public C153527bU A0L;
    public AnonymousClass9B3 A0M;
    public C194259Se A0N;
    public C105895Wv A0O;
    public AnonymousClass4FS A0P;
    public WDSButton A0Q;
    public WDSButton A0R;
    public String A0S;
    public boolean A0T;
    public final C160757oG A0U = C160757oG.A00("IndiaUpiSendPaymentToVpaDialogFragment", "payment", "IN");

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A0A.A01(new C195229Ws(this, 4));
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.7yt, com.whatsapp.jid.UserJid] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1J() {
        /*
            r6 = this;
            boolean r0 = r6.A0T
            if (r0 == 0) goto L_0x0095
            android.widget.EditText r0 = r6.A00
            java.lang.String r1 = X.C86604Kt.A0o(r0)
            X.33j r0 = r6.A04
            java.util.Locale r0 = r0.A0O()
            java.lang.String r5 = r1.toLowerCase(r0)
            java.util.regex.Pattern r0 = X.AnonymousClass9UW.A00
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.matches()
            java.lang.String r4 = "upiAlias"
            r2 = 0
            if (r0 == 0) goto L_0x0061
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x005c
            int r1 = r5.length()
            r0 = 8
            if (r1 < r0) goto L_0x005c
            r0 = 10
            if (r1 > r0) goto L_0x005c
            X.7bU r0 = r6.A0L
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Set r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0042:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r0 = r1.next()
            X.7yE r0 = (X.C166157yE) r0
            X.7yt r0 = r0.A00
            java.lang.Object r0 = r0.A00
            X.C626936e.A06(r0)
            X.C162457s7.A0D(r0)
            r3.add(r0)
            goto L_0x0042
        L_0x005c:
            r1 = 2131891733(0x7f121615, float:1.9418194E38)
            goto L_0x00e6
        L_0x0061:
            boolean r0 = X.C194759Uj.A00(r5)
            if (r0 == 0) goto L_0x0091
            X.7yt r0 = X.C1899593h.A0C(r5, r4)
            r6.A08 = r0
            X.9bS r0 = r6.A0E
            java.lang.String r1 = X.C196629bS.A00(r0)
            X.7yt r0 = r6.A08
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 != 0) goto L_0x0088
            X.7yt r0 = r6.A08
            java.lang.String r0 = X.C166557yt.A00(r0)
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0088
            goto L_0x00d9
        L_0x0088:
            X.9Tt r1 = r6.A0B
            X.7yt r0 = r6.A08
            boolean r0 = r1.A07(r0)
            goto L_0x00f8
        L_0x0091:
            r1 = 2131891736(0x7f121618, float:1.94182E38)
            goto L_0x00e6
        L_0x0095:
            X.3QD r2 = X.AnonymousClass3QD.A00()
            android.widget.EditText r0 = r6.A00
            java.lang.String r1 = X.C86604Kt.A0o(r0)
            X.33j r0 = r6.A04
            java.util.Locale r0 = r0.A0O()
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "upiHandle"
            X.7yt r0 = X.C1899693i.A0G(r2, r1, r0)
            r6.A08 = r0
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C194759Uj.A00(r0)
            if (r0 != 0) goto L_0x00bf
            r1 = 2131891735(0x7f121617, float:1.9418198E38)
            goto L_0x00e6
        L_0x00bf:
            X.9bS r0 = r6.A0E
            java.lang.String r1 = X.C196629bS.A00(r0)
            X.7yt r0 = r6.A08
            boolean r0 = X.C161527pr.A02(r0)
            if (r0 != 0) goto L_0x00ef
            X.7yt r0 = r6.A08
            java.lang.String r0 = X.C166557yt.A00(r0)
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00ef
        L_0x00d9:
            r1 = 2131891809(0x7f121661, float:1.9418349E38)
            goto L_0x00e6
        L_0x00dd:
            boolean r0 = r3.contains(r5)
            if (r0 == 0) goto L_0x0108
            r1 = 2131891808(0x7f121660, float:1.9418347E38)
        L_0x00e6:
            X.9VW r0 = new X.9VW
            r0.<init>(r1)
            r6.A1L(r0)
            return
        L_0x00ef:
            X.9Tt r1 = r6.A0B
            X.7yt r0 = r6.A08
            boolean r0 = r1.A07(r0)
            r2 = 0
        L_0x00f8:
            if (r0 == 0) goto L_0x0100
            X.7yt r0 = r6.A08
            r6.A1K(r2, r0)
            return
        L_0x0100:
            X.94w r1 = r6.A0K
            X.7yt r0 = r6.A08
            r1.A0D(r0, r2)
            goto L_0x0111
        L_0x0108:
            X.7yt r1 = X.C1899593h.A0C(r5, r4)
            X.94w r0 = r6.A0K
            r0.A0D(r2, r1)
        L_0x0111:
            X.9ca r4 = r6.A0I
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = "enter_user_payment_id"
            java.lang.String r0 = r6.A0S
            r4.BKB(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment.A1J():void");
    }

    public final void A1K(UserJid userJid, C166557yt r11) {
        C194209Rz r1 = this.A0J;
        if (r1 != null) {
            PaymentBottomSheet paymentBottomSheet = r1.A01;
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A1K();
            }
            r1.A06.A00(r1.A02, new C204079om(r11, 0, r1), userJid, r11, false, false);
        }
    }

    public final void A1L(AnonymousClass9VW r6) {
        C160757oG r2 = this.A0U;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("showErrorText: ");
        C1899593h.A1K(r2, A0o, r6.A00);
        this.A02.setVisibility(0);
        this.A02.setText(r6.A02(A0G()));
        C003203q A0Q2 = A0Q();
        if (A0Q2 != null) {
            C06560Yg.A0C(AnonymousClass0Y8.A07(A0Q2, R.color.f5nameremoved), this.A00);
        }
        this.A0I.BKB(0, 51, "enter_user_payment_id", this.A0S);
    }

    public void A0c() {
        super.A0c();
        this.A0H = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A0Q = null;
        this.A0R = null;
    }

    public void A0f() {
        super.A0f();
        if (this.A0A.A02()) {
            AnonymousClass9VH.A00(A0Q());
        }
    }

    public void A0w(Bundle bundle, View view) {
        EditText editText;
        int i;
        Context A1D = A1D();
        C69263Wi r2 = this.A03;
        AnonymousClass31C r4 = this.A09;
        C194259Se r10 = this.A0N;
        this.A0H = new AnonymousClass9AI(A1D, r2, this.A06, r4, this.A0B, this.A0D, this.A0F, this.A0G, this.A0M, r10);
        C1902494w r5 = (C1902494w) AnonymousClass4L0.A0F(new C203819oM(this, 1), this).A01(C1902494w.class);
        this.A0K = r5;
        int A0N2 = r5.A04.A0N(2492);
        C18270x1.A0w(new C191729Gc(r5.A03, r5, A0N2), r5.A08);
        this.A00 = (EditText) C06560Yg.A02(view, R.id.account_id_handle);
        this.A01 = (ProgressBar) C06560Yg.A02(view, R.id.progress);
        this.A02 = C18300x5.A0G(view, R.id.error_text);
        this.A0Q = C86654Ky.A0f(view, R.id.close_dialog_button);
        this.A0R = C86654Ky.A0f(view, R.id.primary_payment_button);
        TextView A0G2 = C18300x5.A0G(view, R.id.title_text);
        this.A0R.setEnabled(false);
        boolean A002 = AnonymousClass9UW.A00(this.A07, this.A0E.A07());
        this.A0T = A002;
        if (A002) {
            A0G2.setText(R.string.f11nameremoved);
            editText = this.A00;
            i = R.string.f11nameremoved;
        } else {
            A0G2.setText(R.string.f11nameremoved);
            editText = this.A00;
            i = R.string.f11nameremoved;
        }
        editText.setHint(i);
        this.A00.addTextChangedListener(new C203959oa(this, 1));
        C204249p3.A02(this.A0Q, this, 98);
        C204249p3.A02(this.A0R, this, 99);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            C166557yt r22 = (C166557yt) bundle2.getParcelable("extra_payment_handle");
            if (!C161527pr.A02(r22)) {
                EditText editText2 = this.A00;
                Object obj = r22.A00;
                C626936e.A06(obj);
                editText2.setText((CharSequence) obj);
                A1J();
            }
            this.A0S = bundle2.getString("extra_referral_screen");
        }
        this.A0I.BKB(0, (Integer) null, "enter_user_payment_id", this.A0S);
        C205049qL.A03(A0V(), this.A0K.A00, this, 49);
        C205049qL.A03(A0V(), this.A0K.A02, this, 50);
        C205049qL.A03(A0V(), this.A0K.A01, this, 51);
    }
}
