package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.ReTosFragment;
import com.whatsapp.util.Log;

/* renamed from: X.9pW  reason: invalid class name and case insensitive filesystem */
public class C204539pW implements AnonymousClass4EY {
    public Object A00;
    public final int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x017f, code lost:
        r10 = (X.C29491iu) r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BaC(X.AnonymousClass2Oi r10) {
        /*
            r9 = this;
            r4 = r9
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x002a;
                case 2: goto L_0x0063;
                case 3: goto L_0x00a8;
                case 4: goto L_0x00ba;
                case 5: goto L_0x0144;
                case 6: goto L_0x017b;
                case 7: goto L_0x01d6;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.String r0 = "DyiViewModel/delete-report/on-success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r9.A00
            X.9Fx r1 = (X.C191689Fx) r1
            X.9VV r2 = r1.A07
            java.lang.String r0 = r1.A09
            monitor-enter(r2)
            r2.A04(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x01b3
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001c:
            java.lang.Object r0 = r9.A00
            X.9W9 r0 = (X.AnonymousClass9W9) r0
            java.lang.Object r1 = r0.A01
            X.3XA r1 = (X.AnonymousClass3XA) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A05(r0)
            return
        L_0x002a:
            java.lang.Object r2 = r9.A00
            X.9Bb r2 = (X.AnonymousClass9Bb) r2
            r2.BjL()
            X.9Ac r10 = (X.C190859Ac) r10
            java.util.List r1 = r10.A00
            if (r1 == 0) goto L_0x0058
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0058
            int r0 = X.C195169Wk.A01(r1)
            X.7yw r0 = X.C1899693i.A0D(r1, r0)
            X.6hx r1 = r0.A08
            boolean r0 = r1 instanceof X.AnonymousClass99H
            if (r0 == 0) goto L_0x0058
            X.99H r1 = (X.AnonymousClass99H) r1
            if (r1 == 0) goto L_0x0058
            X.9bS r0 = r2.A0M
            r0.Brs(r1)
            r2.A7W(r1)
            return
        L_0x0058:
            X.3Wi r1 = r2.A05
            X.9g3 r0 = new X.9g3
            r0.<init>(r9)
            r1.A0S(r0)
            return
        L_0x0063:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0129
            java.lang.Object r3 = r9.A00
            X.9D7 r3 = (X.AnonymousClass9D7) r3
            X.9bS r0 = r3.A0M
            X.33l r2 = r0.A03     // Catch:{ JSONException -> 0x0081 }
            org.json.JSONObject r1 = X.C1899593h.A0g(r2)     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r0 = "smsVerifDataSentToPsp"
            r1.remove(r0)     // Catch:{ JSONException -> 0x0081 }
            java.lang.String r0 = "smsVerifData"
            r1.remove(r0)     // Catch:{ JSONException -> 0x0081 }
            X.C1899593h.A1D(r2, r1)     // Catch:{ JSONException -> 0x0081 }
            goto L_0x0087
        L_0x0081:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs deleteSmsVerificationData threw: "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0087:
            r3.A7H()
            r3.BjL()
            android.content.Intent r2 = X.C1899593h.A05(r3)
            java.lang.String r1 = "extra_payments_entry_type"
            r0 = 6
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_is_first_payment_method"
            r0 = 1
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r2.putExtra(r1, r0)
            r0 = 1
            r3.A6T(r2, r0)
            return
        L_0x00a8:
            java.lang.Object r0 = r9.A00
            X.4el r0 = (X.C89704el) r0
            X.4FS r2 = r0.A04
            r0 = 0
            X.9od r1 = new X.9od
            r1.<init>(r9, r0)
            java.lang.String[] r0 = new java.lang.String[r0]
            r2.BkL(r1, r0)
            return
        L_0x00ba:
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0129
            java.lang.Object r4 = r9.A00
            X.9Bs r4 = (X.AnonymousClass9Bs) r4
            X.9bS r1 = r4.A0M
            java.lang.String r0 = r1.A07()
            r5 = 1
            r1.B1N(r0, r5)
            r4.A7H()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r3 = X.AnonymousClass0x9.A08(r4, r0)
            com.whatsapp.payments.ui.widget.PaymentView r0 = r4.A0N
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = r0.getPaymentNote()
            r4.A0j = r0
            com.whatsapp.payments.ui.widget.PaymentView r0 = r4.A0N
            X.39R r0 = r0.getPaymentBackground()
            r4.A0B = r0
            com.whatsapp.payments.ui.widget.PaymentView r1 = r4.A0N
            X.39M r0 = r1.getStickerIfSelected()
            r4.A0c = r0
            java.lang.Integer r0 = r1.getStickerSendOrigin()
            r4.A0f = r0
        L_0x00f5:
            r4.A7O(r3)
            java.lang.String r2 = "extra_payments_entry_type"
            java.lang.String r1 = "payment_composer_icon"
            java.lang.String r0 = r4.A0f
            boolean r1 = r1.equals(r0)
            r0 = 3
            if (r1 == 0) goto L_0x0107
            r0 = 10
        L_0x0107:
            r3.putExtra(r2, r0)
            java.lang.String r0 = "extra_is_first_payment_method"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "extra_skip_value_props_display"
            r3.putExtra(r0, r5)
            com.whatsapp.jid.UserJid r0 = r4.A0E
            java.lang.String r1 = X.C627336j.A07(r0)
            java.lang.String r0 = "extra_receiver_jid"
            r3.putExtra(r0, r1)
            r4.startActivity(r3)
            r4.finish()
            r4.BjL()
            return
        L_0x0129:
            r2 = 2131891691(0x7f1215eb, float:1.941811E38)
            java.lang.Object r1 = r9.A00
            X.4ea r1 = (X.C89654ea) r1
            r0 = 2131434483(0x7f0b1bf3, float:1.8490781E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r1, r0)
            r0.setText(r2)
            r0 = 2131434482(0x7f0b1bf2, float:1.849078E38)
            X.C86604Kt.A1L(r1, r0)
            r1.Bot(r2)
            return
        L_0x0144:
            java.lang.Object r3 = r9.A00
            com.whatsapp.payments.ui.ReTosFragment r3 = (com.whatsapp.payments.ui.ReTosFragment) r3
            X.7oG r2 = r3.A06
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "accept-tos/result="
            r1.append(r0)
            boolean r0 = r10.A02
            X.C1899593h.A1L(r2, r1, r0)
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x0171
            r0 = 1
            r3.A1P(r0)
            android.widget.Button r1 = r3.A00
            r0 = 0
            r1.setVisibility(r0)
            android.widget.ProgressBar r1 = r3.A01
            r0 = 8
            r1.setVisibility(r0)
            r3.A1K()
            return
        L_0x0171:
            r1 = 0
            X.34V r0 = new X.34V
            r0.<init>((int) r1)
            r9.A00(r0)
            return
        L_0x017b:
            boolean r0 = r10 instanceof X.C29491iu
            if (r0 == 0) goto L_0x01c6
            X.1iu r10 = (X.C29491iu) r10
            java.util.List r0 = r10.A01
            if (r0 == 0) goto L_0x01c6
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01c6
            java.lang.Object r2 = r9.A00
            X.94y r2 = (X.AnonymousClass94y) r2
            X.7oG r1 = r2.A0f
            java.lang.String r0 = "BrazilConsumer/getTransactions/onResponseSuccess"
            r1.A04(r0)
            X.7yP r1 = r10.A00
            if (r1 == 0) goto L_0x01be
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x01bd
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01bd
            X.9b0 r3 = r2.A0c
            X.7yP r0 = r10.A00
            java.lang.String r7 = r0.A00
            r5 = 0
            r8 = r5
            r6 = r5
            r3.A01(r4, r5, r6, r7, r8)
            return
        L_0x01b3:
            monitor-exit(r2)
            X.08M r1 = r1.A02
            int r0 = r2.A01(r0)
            X.C06270Wx.A04(r1, r0)
        L_0x01bd:
            return
        L_0x01be:
            r0 = 0
            r2.A0c(r0)
            r2.A0d(r0)
            return
        L_0x01c6:
            java.lang.Object r0 = r9.A00
            X.94y r0 = (X.AnonymousClass94y) r0
            X.4UC r1 = r0.A08
            r0 = 24
            X.9QJ r0 = X.AnonymousClass9QJ.A00(r0)
            r1.A0H(r0)
            return
        L_0x01d6:
            java.lang.Object r0 = r9.A00
            X.94o r0 = (X.C1902194o) r0
            X.4UC r3 = X.C1902194o.A00(r0)
            java.lang.String r0 = "PAY: BrazilMerchantDetailsViewModel removePayment Success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 2131893469(0x7f121cdd, float:1.9421715E38)
            r1 = 6
            X.9Q9 r0 = new X.9Q9
            r0.<init>(r1)
            r0.A00 = r2
            r3.A0H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204539pW.BaC(X.2Oi):void");
    }

    public C204539pW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A00(AnonymousClass34V r7) {
        ReTosFragment reTosFragment = (ReTosFragment) this.A00;
        reTosFragment.A1P(true);
        reTosFragment.A00.setVisibility(0);
        reTosFragment.A01.setVisibility(8);
        C003203q A0Q = reTosFragment.A0Q();
        if (A0Q != null) {
            C204629pf r3 = new C204629pf(this, 23);
            C204649ph r2 = new C204649ph(1);
            AnonymousClass043 A03 = reTosFragment.A05.A03(A0Q, r3, r2, r7.A00);
            if (A03 == null) {
                A03 = AnonymousClass9WM.A00(A0Q, r2, C08310eF.A09(reTosFragment).getString(R.string.f11nameremoved));
            }
            A03.show();
        }
    }

    public void Ba4(AnonymousClass34V r5) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass3XA) ((AnonymousClass9W9) this.A00).A01).A05(Boolean.FALSE);
                return;
            case 1:
                ((C89654ea) this.A00).A05.A0S(new C199129g4(this));
                return;
            case 2:
                AnonymousClass9D7 r1 = (AnonymousClass9D7) this.A00;
                r1.BjL();
                r1.A7m(r1.A09);
                return;
            case 3:
                C191129Co r3 = (C191129Co) this.A00;
                r3.A04.A0A(AnonymousClass000.A0P(r5, "incorrect format retry: get-methods request error: ", AnonymousClass001.A0o()), (Throwable) null);
                r3.A7b();
                return;
            case 4:
                return;
            case 5:
                A00(r5);
                return;
            case 6:
                ((AnonymousClass94y) this.A00).A08.A0H(AnonymousClass9QJ.A00(24));
                return;
            case 7:
                AnonymousClass4UC A002 = C1902194o.A00((C1902194o) this.A00);
                C18260x0.A1S(AnonymousClass001.A0o(), "PAY: BrazilMerchantDetailsViewModel removePayment/onRequestError. paymentNetworkError: ", r5);
                AnonymousClass9Q9 r0 = new AnonymousClass9Q9(6);
                r0.A00 = R.string.f11nameremoved;
                A002.A0H(r0);
                return;
            default:
                Log.i("DyiViewModel/delete-report/on-error");
                if (r5.A00 == 404) {
                    C191689Fx r12 = (C191689Fx) this.A00;
                    AnonymousClass9VV r2 = r12.A07;
                    String str = r12.A09;
                    synchronized (r2) {
                        r2.A04(str);
                    }
                    C06270Wx.A04(r12.A02, r2.A01(str));
                    return;
                }
                C1899593h.A0p(((C191689Fx) this.A00).A03, AnonymousClass001.A0f(), r5);
                return;
        }
    }

    public void BaB(AnonymousClass34V r5) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass3XA) ((AnonymousClass9W9) this.A00).A01).A05(Boolean.FALSE);
                return;
            case 1:
                ((C89654ea) this.A00).A05.A0S(new C199109g2(this));
                return;
            case 2:
                AnonymousClass9D7 r1 = (AnonymousClass9D7) this.A00;
                r1.BjL();
                r1.A7m(r1.A09);
                return;
            case 3:
                C191129Co r3 = (C191129Co) this.A00;
                r3.A04.A0A(AnonymousClass000.A0P(r5, "incorrect format retry: get-methods response error: ", AnonymousClass001.A0o()), (Throwable) null);
                r3.A7b();
                return;
            case 4:
                ((C89654ea) this.A00).BjL();
                return;
            case 5:
                A00(r5);
                return;
            case 6:
                ((AnonymousClass94y) this.A00).A08.A0H(AnonymousClass9QJ.A00(24));
                return;
            case 7:
                AnonymousClass4UC A002 = C1902194o.A00((C1902194o) this.A00);
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilMerchantDetailsViewModel removePayment/onResponseError. paymentNetworkError: ", r5);
                AnonymousClass9Q9 r0 = new AnonymousClass9Q9(6);
                r0.A00 = R.string.f11nameremoved;
                A002.A0H(r0);
                return;
            default:
                Log.i("DyiViewModel/delete-report/on-error");
                C1899593h.A0p(((C191689Fx) this.A00).A03, AnonymousClass001.A0f(), r5);
                return;
        }
    }
}
