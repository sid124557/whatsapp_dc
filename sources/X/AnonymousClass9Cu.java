package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.9Cu  reason: invalid class name */
public abstract class AnonymousClass9Cu extends AnonymousClass9Bs implements C202719mT {
    public C56662sM A00;
    public C133696hn A01;
    public AnonymousClass34S A02;

    public ConfirmPaymentFragment A8G(C133696hn r14, AnonymousClass39L r15, PaymentBottomSheet paymentBottomSheet) {
        C133696hn r6 = r14;
        ConfirmPaymentFragment A002 = ConfirmPaymentFragment.A00(r6, this.A0G, (AnonymousClass9XZ) null, "p2m", this.A0Z, 0);
        C197109ca r9 = this.A0S;
        AnonymousClass9SZ r12 = this.A0L;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        A002.A0N = new C197299ct(this, this.A02, this.A08, r6, r15, this.A0I, r9, this, paymentBottomSheet2, r12);
        A002.A0O = new C197319cv(r14, r15, this, paymentBottomSheet2);
        return A002;
    }

    public String A8I(AnonymousClass39L r16) {
        String str;
        AnonymousClass9Ct r1 = (AnonymousClass9Ct) this;
        String A8H = r1.A8H();
        String obj = r16.A02.A00.toString();
        if (!TextUtils.isEmpty(r1.A05)) {
            str = r1.A05;
        } else {
            str = r1.A06;
        }
        String str2 = r1.A0j;
        C195179Wl r2 = new C195179Wl(A8H, obj, str, r1.A0Z, (String) null, (String) null, "04", r1.A0c, (String) null, (String) C1899593h.A0X(r1.A0I), (String) null, (String) null);
        r2.A07 = C195179Wl.A04(str2, false);
        return r2.A06();
    }

    public void A8J() {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
        if (indiaUpiCheckOrderDetailsActivity.BIW()) {
            C86624Kv.A0f(indiaUpiCheckOrderDetailsActivity);
        }
    }

    public void A8L(C133696hn r9, AnonymousClass39L r10, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass9Ct r1 = (AnonymousClass9Ct) this;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        if (paymentBottomSheet == null) {
            r1.A8R(true);
        }
        C201269jn r6 = new C201269jn(r9, r10, r1, paymentBottomSheet);
        r1.A8W(r10, new C204139os(r9, r10, r1, 2), new C204819py(paymentBottomSheet, 2, r1), paymentBottomSheet2, r6, new C200359iC(r1, paymentBottomSheet));
    }

    public void A8N(C166587yw r15, AnonymousClass39L r16, HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment, PaymentBottomSheet paymentBottomSheet) {
        AnonymousClass9Ct r2 = (AnonymousClass9Ct) this;
        HybridPaymentMethodPickerFragment hybridPaymentMethodPickerFragment2 = hybridPaymentMethodPickerFragment;
        WaButtonWithLoader waButtonWithLoader = hybridPaymentMethodPickerFragment2.A01;
        if (waButtonWithLoader != null) {
            waButtonWithLoader.A06 = true;
            waButtonWithLoader.A00();
        }
        AnonymousClass39L r3 = r16;
        PaymentBottomSheet paymentBottomSheet2 = paymentBottomSheet;
        C201389jz r8 = new C201389jz(r15, r3, hybridPaymentMethodPickerFragment2, r2, paymentBottomSheet2);
        r2.A8W(r3, new C204139os(r15, r3, r2, 1), new C204819py(hybridPaymentMethodPickerFragment2, 1, r2), paymentBottomSheet2, r8, new C199289gL(hybridPaymentMethodPickerFragment2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r7.A0W.A0t(r7.A0E) == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A8P(X.AnonymousClass39L r15) {
        /*
            r14 = this;
            r7 = r14
            com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity r7 = (com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity) r7
            X.9d8 r0 = r7.A07
            java.lang.String r0 = r0.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002b
            X.9Wq r1 = r7.A0W
            com.whatsapp.jid.UserJid r0 = r7.A0E
            boolean r0 = r1.A0t(r0)
            if (r0 == 0) goto L_0x002b
            X.3QD r2 = X.AnonymousClass3QD.A00()
            X.9d8 r0 = r7.A07
            java.lang.String r1 = r0.A0C
            java.lang.String r0 = "moneyStringValue"
            X.7yt r0 = X.C1899693i.A0G(r2, r1, r0)
            r7.A0F = r0
            com.whatsapp.jid.UserJid r0 = r7.A0E
            r7.A0G = r0
        L_0x002b:
            X.7yw r0 = r7.A0B
            if (r0 != 0) goto L_0x0097
            X.9d8 r0 = r7.A07
            java.lang.String r0 = r0.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0044
            X.9Wq r1 = r7.A0W
            com.whatsapp.jid.UserJid r0 = r7.A0E
            boolean r1 = r1.A0t(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r6 = 0
            if (r0 == 0) goto L_0x0093
            r7.overridePendingTransition(r6, r6)
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r4.<init>()
            X.9d8 r0 = r7.A07
            java.lang.String r3 = r0.A0C
            X.C162457s7.A0J(r3, r6)
            com.whatsapp.payments.ui.PaymentCheckoutIncentiveFragment r2 = new com.whatsapp.payments.ui.PaymentCheckoutIncentiveFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "extra_formatted_discount"
            r1.putString(r0, r3)
            r2.A0u(r1)
            X.9d7 r0 = new X.9d7
            r0.<init>(r7)
            r2.A00 = r0
            r4.A02 = r2
            java.lang.String r0 = "PaymentCheckoutOrderDiscountFragment"
            r7.Bon(r4, r0)
            r7.A7z(r4)
            X.9ca r5 = r7.A0S
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3 = 0
            java.lang.String r2 = "payment_intro_prompt"
            java.lang.String r0 = r7.A0f
            X.9Af r1 = X.C190889Af.A00()
            X.6ig r0 = r5.A05(r4, r3, r2, r0)
            X.C197109ca.A02(r0, r1, r5, r6)
        L_0x008f:
            r7.A8R(r6)
            return
        L_0x0093:
            r7.A7w(r7)
            goto L_0x008f
        L_0x0097:
            boolean r0 = r7.A8Y()
            if (r0 == 0) goto L_0x00a1
            r7.A8U()
            return
        L_0x00a1:
            r0 = 1
            r7.A8R(r0)
            r9 = 0
            X.9i9 r12 = new X.9i9
            r8 = r15
            r12.<init>(r15, r7)
            X.9d4 r10 = new X.9d4
            r10.<init>(r7)
            X.9gG r13 = new X.9gG
            r13.<init>(r7)
            r11 = r9
            r7.A8W(r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Cu.A8P(X.39L):void");
    }

    public void A8R(boolean z) {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
        boolean z2 = !indiaUpiCheckOrderDetailsActivity.BIW();
        if (z) {
            if (!z2) {
                indiaUpiCheckOrderDetailsActivity.Bp9(R.string.f11nameremoved);
            }
        } else if (z2) {
            C197419d8 r2 = indiaUpiCheckOrderDetailsActivity.A07;
            r2.A0F.A0S(new C199519gi(r2));
        } else {
            indiaUpiCheckOrderDetailsActivity.BjL();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0194 A[EDGE_INSN: B:80:0x0194->B:69:0x0194 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A81(X.C166587yw r12, X.AnonymousClass39L r13, com.whatsapp.payments.ui.PaymentBottomSheet r14) {
        /*
            r11 = this;
            if (r14 == 0) goto L_0x002b
            r9 = r14
        L_0x0003:
            r8 = r11
            X.34S r5 = r11.A02
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.List r0 = X.AnonymousClass34S.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            r0 = 1
            X.C162457s7.A0J(r1, r0)
            X.AnonymousClass345.A01(r11, r1)     // Catch:{ NameNotFoundException -> 0x0010 }
            boolean r0 = X.AnonymousClass34S.A01(r11, r1)
            if (r0 == 0) goto L_0x0010
            r6.add(r1)
            goto L_0x0010
        L_0x002b:
            com.whatsapp.payments.ui.PaymentBottomSheet r9 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r9.<init>()
            goto L_0x0003
        L_0x0031:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            android.content.res.Resources r4 = r11.getResources()
            r0 = 10
            int r0 = X.C73783g4.A0b(r6, r0)
            java.util.ArrayList r3 = X.AnonymousClass002.A0I(r0)
            java.util.Iterator r1 = r6.iterator()
        L_0x0047:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            X.C162457s7.A0H(r4)
            X.6hn r0 = r5.A02(r4, r0)
            r3.add(r0)
            goto L_0x0047
        L_0x005c:
            r2.addAll(r3)
            X.C162457s7.A0H(r4)
            java.lang.String r0 = "other"
            X.6hn r0 = r5.A02(r4, r0)
            r2.add(r0)
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "whatsapp"
            r10.add(r0)
            java.util.Iterator r1 = r2.iterator()
        L_0x0078:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008a
            X.7yw r0 = X.C1899693i.A0C(r1)
            java.lang.String r0 = X.C197109ca.A00(r0)
            r10.add(r0)
            goto L_0x0078
        L_0x008a:
            boolean r3 = r11 instanceof X.AnonymousClass9Ct
            if (r3 == 0) goto L_0x0197
            r5 = r8
            X.9Ct r5 = (X.AnonymousClass9Ct) r5
            X.99n r4 = r5.A0O
            java.lang.String r1 = r5.A08
            java.util.List r0 = r5.A09
            boolean r0 = r4.A0L(r1, r0)
            if (r0 == 0) goto L_0x0197
            X.99n r0 = r5.A0O
            com.whatsapp.jid.UserJid r4 = r5.A0E
            if (r4 == 0) goto L_0x0197
            X.1VX r1 = r0.A02
            r0 = 4709(0x1265, float:6.599E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0197
            r0 = 4806(0x12c6, float:6.735E-42)
            java.lang.String r1 = r1.A0Q(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00c5
            java.util.List r1 = X.C18310x6.A0t(r1)
            java.lang.String r0 = r4.user
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0197
        L_0x00c5:
            r4 = 1
        L_0x00c6:
            r1 = r8
            X.9Ct r1 = (X.AnonymousClass9Ct) r1
            X.99n r0 = r1.A0O
            java.util.List r5 = r1.A09
            X.1VX r3 = r0.A02
            r0 = 6472(0x1948, float:9.069E-42)
            boolean r0 = r3.A0X(r0)
            if (r0 == 0) goto L_0x0194
            if (r5 == 0) goto L_0x0194
            java.util.Iterator r5 = r5.iterator()
        L_0x00dd:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0194
            java.lang.Object r3 = r5.next()
            X.394 r3 = (X.AnonymousClass394) r3
            X.4Fg r0 = r3.A00
            if (r0 == 0) goto L_0x00dd
            java.lang.String r3 = r3.A01
            java.lang.String r0 = "upi_merchant_configuration"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00dd
            r0 = 1
        L_0x00f8:
            r3 = 0
            if (r0 == 0) goto L_0x0127
            java.util.List r0 = r1.A09
            java.util.Objects.requireNonNull(r0)
            java.util.List r0 = r1.A09
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            X.C626936e.A0B(r0)
            java.util.List r0 = r1.A09
            java.lang.Object r0 = r0.get(r3)
            X.394 r0 = (X.AnonymousClass394) r0
            X.4Fg r0 = r0.A00
            X.3SQ r0 = (X.AnonymousClass3SQ) r0
            java.util.Objects.requireNonNull(r0)
            X.3SP r0 = r0.A00
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0127
            r3 = 1
        L_0x0127:
            if (r4 == 0) goto L_0x018f
            java.lang.String r0 = "hpp"
        L_0x012b:
            r10.add(r0)
        L_0x012e:
            java.util.List r1 = r11.A0i
            android.content.Intent r0 = r11.getIntent()
            X.2z0 r6 = X.C107395bF.A02(r0)
            com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment r7 = new com.whatsapp.payments.ui.HybridPaymentMethodPickerFragment
            r7.<init>()
            android.os.Bundle r5 = X.AnonymousClass002.A08()
            if (r1 != 0) goto L_0x0145
            X.3d3 r1 = X.C72023d3.A00
        L_0x0145:
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r1)
            java.lang.String r0 = "arg_native_methods"
            r5.putParcelableArrayList(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r2)
            java.lang.String r0 = "arg_external_methods"
            r5.putParcelableArrayList(r0, r1)
            java.lang.String r0 = "arg_selected_method"
            r5.putParcelable(r0, r12)
            java.lang.String r0 = "arg_hpp_checkout_enabled"
            r5.putBoolean(r0, r4)
            if (r6 == 0) goto L_0x0166
            X.C107395bF.A07(r5, r6)
        L_0x0166:
            java.lang.String r0 = "arg_has_merchant_configuration_payment_link"
            r5.putBoolean(r0, r3)
            r7.A0u(r5)
            X.9cy r0 = new X.9cy
            r0.<init>(r11, r4, r3)
            r7.A0B = r0
            X.9cz r5 = new X.9cz
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r7.A0C = r5
            if (r14 == 0) goto L_0x0186
            r14.A1b(r7)
        L_0x0182:
            r11.BjL()
            return
        L_0x0186:
            r9.A02 = r7
            X.C86644Kx.A1C(r9, r11)
            r11.A7z(r9)
            goto L_0x0182
        L_0x018f:
            if (r3 == 0) goto L_0x012e
            java.lang.String r0 = "payment_link"
            goto L_0x012b
        L_0x0194:
            r0 = 0
            goto L_0x00f8
        L_0x0197:
            r4 = 0
            if (r3 != 0) goto L_0x00c6
            r3 = 0
            goto L_0x0127
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Cu.A81(X.7yw, X.39L, com.whatsapp.payments.ui.PaymentBottomSheet):void");
    }

    public String A8H() {
        if (!C161527pr.A02(this.A0G)) {
            return C1899693i.A0e(this.A0G);
        }
        AnonymousClass3ZH r0 = this.A08;
        if (r0 == null || TextUtils.isEmpty(r0.A0L())) {
            return BBy();
        }
        return this.A08.A0L();
    }

    public void A8K() {
        IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this;
        if (indiaUpiCheckOrderDetailsActivity.A0O.A0L(indiaUpiCheckOrderDetailsActivity.A08, indiaUpiCheckOrderDetailsActivity.A09)) {
            indiaUpiCheckOrderDetailsActivity.Bp9(R.string.f11nameremoved);
            C97204xo r9 = indiaUpiCheckOrderDetailsActivity.A04;
            UserJid userJid = indiaUpiCheckOrderDetailsActivity.A0E;
            C626936e.A06(userJid);
            String str = indiaUpiCheckOrderDetailsActivity.A07;
            C626936e.A06(str);
            String str2 = indiaUpiCheckOrderDetailsActivity.A06;
            C626936e.A06(str2);
            C196939bz r8 = new C196939bz(indiaUpiCheckOrderDetailsActivity);
            C162457s7.A0J(userJid, 0);
            C18260x0.A0Q(str, str2);
            AnonymousClass31C r10 = r9.A02;
            String A03 = r10.A03();
            C35371wl A0X = C1899693i.A0X(A03);
            C56052rL A012 = C56052rL.A01();
            C56052rL.A0E(A012, "xmlns", "w:pay");
            C56052rL A0U = C1899593h.A0U();
            C56052rL.A0D(A0U, "action", "get-order-transaction");
            C56052rL.A06(userJid, A0U, "receiver");
            if (C626836d.A0M(str2, 1, 100, false)) {
                C56052rL.A0D(A0U, "order_id", str2);
            }
            if (C626836d.A0M(str, 1, 100, false)) {
                C56052rL.A0D(A0U, "payment_config_id", str);
            }
            r10.A0D(new C203929oX(r9.A01.A00, r9.A00, r9.A03, AnonymousClass9OC.A02(r9, "get-order-transaction"), (C203019mz) r8, r9), C1899593h.A0S(A0U, A012, A0X), A03, 204, 0);
            return;
        }
        indiaUpiCheckOrderDetailsActivity.A04.BkM(new C200319i8(new C195279Wy(indiaUpiCheckOrderDetailsActivity, 0), indiaUpiCheckOrderDetailsActivity));
    }

    public void A8M(C133696hn r3, AnonymousClass39L r4, PaymentBottomSheet paymentBottomSheet) {
        PaymentBottomSheet paymentBottomSheet2;
        if (paymentBottomSheet != null) {
            paymentBottomSheet2 = paymentBottomSheet;
        } else {
            paymentBottomSheet2 = new PaymentBottomSheet();
        }
        ConfirmPaymentFragment A8G = A8G(r3, r4, paymentBottomSheet2);
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1b(A8G);
            return;
        }
        paymentBottomSheet2.A02 = A8G;
        Boo(paymentBottomSheet2);
        A7z(paymentBottomSheet2);
    }

    public void A8O(C166587yw r3, AnonymousClass39L r4, PaymentBottomSheet paymentBottomSheet) {
        ConfirmPaymentFragment A7n;
        if (r3 instanceof C133696hn) {
            A7n = A8G((C133696hn) r3, r4, paymentBottomSheet);
        } else {
            this.A0B = r3;
            A7n = A7n(r4.A02, (AnonymousClass39Q) null, paymentBottomSheet);
        }
        paymentBottomSheet.A1b(A7n);
    }

    public final void A8Q(AnonymousClass39L r6) {
        AnonymousClass224 A002;
        Bitmap bitmap;
        int i;
        String A0Z = C18280x3.A0Z(this.A0P.A03(), "pref_p2m_hybrid_last_used_payment_option");
        if (!"WhatsappPay".equals(A0Z) || !this.A0P.A0C("p2p_context").A0C()) {
            if (!TextUtils.isEmpty(A0Z) && (A002 = AnonymousClass281.A00(A0Z)) != null) {
                String str = A002.packageName;
                C162457s7.A0J(str, 1);
                try {
                    AnonymousClass345.A01(this, str);
                    if (AnonymousClass34S.A01(this, str)) {
                        Resources resources = getResources();
                        C162457s7.A0J(resources, 1);
                        String A003 = AnonymousClass34S.A00(resources, str);
                        AnonymousClass224 A004 = AnonymousClass281.A00(str);
                        if (A004 != null) {
                            i = A004.appIcon;
                        } else if ("other".equals(str)) {
                            i = R.drawable.ic_send_to_upi;
                        } else {
                            bitmap = null;
                            A8L(new C133696hn(bitmap, str, A003), r6, (PaymentBottomSheet) null);
                            return;
                        }
                        bitmap = BitmapFactory.decodeResource(resources, i);
                        A8L(new C133696hn(bitmap, str, A003), r6, (PaymentBottomSheet) null);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            A8R(false);
            A81(this.A0B, r6, (PaymentBottomSheet) null);
            return;
        }
        A8P(r6);
    }

    public void BKD(AnonymousClass303 r11, Integer num, Integer num2, String str) {
        this.A0S.BKF(r11, num, num2, str, this.A0f, this.A0i, this.A0h, false, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        if (i != 1022) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            Bundle extras = intent.getExtras();
            String str = "SUCCESS";
            if (extras == null || !str.equalsIgnoreCase(extras.getString("Status"))) {
                z = false;
            } else {
                A8K();
                z = true;
            }
            AnonymousClass303 r2 = new AnonymousClass303((String) null, new AnonymousClass303[0]);
            if (!z) {
                str = "FAILED";
            }
            r2.A03("transaction_status", str);
            C133696hn r1 = this.A01;
            if (r1 != null) {
                r2 = this.A0S.A06(r1, r2);
            }
            BKD(r2, 0, (Integer) null, "payment_complete");
        }
    }
}
