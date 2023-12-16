package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.93F  reason: invalid class name */
public class AnonymousClass93F implements AnonymousClass4EZ {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass93F(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void BQs(String str) {
        String str2;
        switch (this.A02) {
            case 0:
                return;
            case 1:
                Log.e("EmailVerificationXmppMethods/sendRequestForEmail/onDeliveryFailure/delivery failure");
                ((C184328rc) this.A00).BSq((Integer) null);
                return;
            case 2:
                Log.e("EmailVerificationXmppMethods/sendRequestForEmailOtp/onDeliveryFailure/delivery failure");
                ((C184338rd) this.A01).BSr((Integer) null, (Long) null);
                return;
            case 3:
                Log.e("EmailVerificationXmppMethods/sendRequestToSetEmail/onDeliveryFailure/delivery failure");
                ((C184348re) this.A01).BSq((Integer) null);
                return;
            case 4:
                Log.e("EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/onDeliveryFailure/delivery failure");
                ((C184358rf) this.A01).BSr((Integer) null, (Long) null);
                return;
            case 5:
                C18260x0.A0s("SubscribeNewsletterRequest/onDeliveryFailure iqId = ", str, C18270x1.A0X(str));
                return;
            case 6:
                str2 = "activateInternationalPayments/onActivateInternational/onDeliveryFailure";
                break;
            default:
                str2 = "validateInternationalQrCode/onDeliveryFailure";
                break;
        }
        Log.e(str2);
    }

    public void BSN(AnonymousClass36K r14, String str) {
        Long l;
        Long l2;
        switch (this.A02) {
            case 0:
                C162457s7.A0J(r14, 1);
                try {
                    AnonymousClass4B7[] r1 = new AnonymousClass4B7[4];
                    C1896292a.A0U(r1, 136, AnonymousClass92Z.A03(C41032Ir.A02(r14, (C41032Ir) this.A01), r14, 23) ? 1 : 0);
                    C1896292a.A0U(r1, 137, 1);
                    C1896292a.A0Q(r1, 138);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Fetching parent participants failed: ");
                    C18260x0.A1I(A0o, ((C183438q2) C626836d.A07(r14, "IQErrorBadRequest|IQErrorItemNotFound|IQErrorNotAuthorized|IQErrorRateOverlimit", C1896292a.A0M(r1, 139), AnonymousClass6CA.A0i())).B5b().longValue());
                    return;
                } catch (AnonymousClass24Y e) {
                    Log.e((Throwable) e);
                    return;
                }
            case 1:
                C162457s7.A0J(r14, 1);
                int A012 = C57492tj.A01(r14);
                C18260x0.A0x("EmailVerificationXmppMethods/sendRequestForEmail/onError/", AnonymousClass001.A0o(), A012);
                ((C184328rc) this.A00).BSq(Integer.valueOf(A012));
                return;
            case 2:
                C162457s7.A0J(r14, 1);
                int A013 = C57492tj.A01(r14);
                C18260x0.A0x("EmailVerificationXmppMethods/sendRequestForEmailOtp/onError/", AnonymousClass001.A0o(), A013);
                try {
                    AnonymousClass4B7[] r2 = new AnonymousClass4B7[4];
                    C1896292a.A0U(r2, 1, AnonymousClass92Z.A03(C41032Ir.A02(r14, (C41032Ir) this.A00), r14, 1) ? 1 : 0);
                    C1896292a.A0U(r2, 2, 1);
                    C1896292a.A0U(r2, 3, 2);
                    C1896292a.A0U(r2, 4, 3);
                    C179878jr r4 = (C179878jr) C626836d.A07(r14, "IQErrorEmailTooMany|IQErrorEmailTooRecent|IQErrorInternalServerError|IQErrorForbidden", AnonymousClass0x2.A0i(r2), AnonymousClass6CA.A0i());
                    if (r4 instanceof C139026rO) {
                        C139026rO r12 = (C139026rO) r4;
                        if (r12.A01 == 0) {
                            C162457s7.A0K(r4, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailTooManyMixin");
                            l2 = (Long) r12.A00;
                        } else {
                            C162457s7.A0K(r4, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailTooRecentMixin");
                            l2 = (Long) r12.A00;
                        }
                    } else {
                        l2 = null;
                    }
                    ((C184338rd) this.A01).BSr(Integer.valueOf(A013), l2);
                    return;
                } catch (AnonymousClass24Y e2) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "EmailVerificationXmppMethods/sendRequestForEmailOtp/CorruptStreamException: ", e2);
                    ((C184338rd) this.A01).BSr((Integer) null, (Long) null);
                    throw new AnonymousClass24Y(AnonymousClass000.A0P(e2, "EmailVerificationXmppMethods: ", AnonymousClass001.A0o()));
                }
            case 3:
                C162457s7.A0J(r14, 1);
                int A014 = C57492tj.A01(r14);
                C18260x0.A0x("EmailVerificationXmppMethods/sendRequestToSetEmail/onError/", AnonymousClass001.A0o(), A014);
                ((C184348re) this.A01).BSq(Integer.valueOf(A014));
                return;
            case 4:
                C162457s7.A0J(r14, 1);
                int A015 = C57492tj.A01(r14);
                C18260x0.A0x("EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/onError/", AnonymousClass001.A0o(), A015);
                try {
                    AnonymousClass4B7[] r13 = new AnonymousClass4B7[4];
                    C1896292a.A0U(r13, 5, AnonymousClass92Z.A03(C41032Ir.A02(r14, (C41032Ir) this.A00), r14, 4) ? 1 : 0);
                    C1896292a.A0U(r13, 6, 1);
                    C1896292a.A0Q(r13, 7);
                    C179888js r22 = (C179888js) C626836d.A07(r14, "IQErrorEmailOTPStale|IQErrorEmailGuessTooRecent|IQErrorInternalServerError|IQErrorForbidden", C1896292a.A0M(r13, 8), AnonymousClass6CA.A0i());
                    if (r22 instanceof C139046rQ) {
                        C139046rQ r15 = (C139046rQ) r22;
                        if (r15.A01 == 1) {
                            C162457s7.A0K(r22, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailOTPStaleMixin");
                            l = (Long) r15.A00;
                        } else {
                            C162457s7.A0K(r22, "null cannot be cast to non-null type com.whatsapp.wapdata.generated.account.incoming.IQErrorEmailGuessTooRecentMixin");
                            l = (Long) r15.A00;
                        }
                    } else {
                        l = null;
                    }
                    ((C184358rf) this.A01).BSr(Integer.valueOf(A015), l);
                    return;
                } catch (AnonymousClass24Y e3) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/CorruptStreamException: ", e3);
                    ((C184358rf) this.A01).BSr((Integer) null, (Long) null);
                    throw new AnonymousClass24Y(AnonymousClass000.A0P(e3, "EmailVerificationXmppMethods: ", AnonymousClass001.A0o()));
                }
            case 5:
                C162457s7.A0J(r14, 1);
                A00((AnonymousClass7LB) this.A01, r14, (C35711xJ) this.A00);
                return;
            case 6:
                C162457s7.A0J(r14, 1);
                C158457k0 r3 = null;
                C139006rM r23 = (C139006rM) new C139746sY(r14, (C35711xJ) this.A01, 9).A00;
                long A03 = C18320x8.A03((Number) r23.A00);
                String str2 = r23.A03;
                C162457s7.A0D(str2);
                IndiaUpiInternationalActivationViewModel indiaUpiInternationalActivationViewModel = ((AnonymousClass7SS) this.A00).A01;
                C197109ca r8 = indiaUpiInternationalActivationViewModel.A04;
                AnonymousClass303 A0W = AnonymousClass6C9.A0W();
                A0W.A03("payments_error_code", String.valueOf(A03));
                A0W.A03("payments_error_text", str2);
                AnonymousClass9Wg.A02(A0W, r8, 51, "international_payment_prompt", (String) null, 4);
                AnonymousClass08M r6 = indiaUpiInternationalActivationViewModel.A00;
                C158457k0 r5 = (C158457k0) r6.A07();
                if (r5 != null) {
                    Application application = indiaUpiInternationalActivationViewModel.A00;
                    r3 = new C158457k0(new C152397Ys(A03, application.getString(R.string.f11nameremoved), application.getString(R.string.f11nameremoved)), r5.A01, false);
                }
                r6.A0G(r3);
                return;
            default:
                C162457s7.A0J(r14, 1);
                C139746sY r0 = new C139746sY(r14, (C35711xJ) this.A01, 11);
                C158387jt r24 = null;
                IndiaUpiInternationalValidateQrViewModel indiaUpiInternationalValidateQrViewModel = ((AnonymousClass7T9) this.A00).A01;
                AnonymousClass08M r62 = indiaUpiInternationalValidateQrViewModel.A00;
                C158387jt r52 = (C158387jt) r62.A07();
                if (r52 != null) {
                    long A032 = C18320x8.A03((Number) ((C139006rM) r0.A00).A00);
                    Application application2 = indiaUpiInternationalValidateQrViewModel.A00;
                    r24 = new C158387jt(new C152407Yt(A032, application2.getString(R.string.f11nameremoved), application2.getString(R.string.f11nameremoved)), r52.A01);
                }
                r62.A0G(r24);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        if (java.math.BigDecimal.ZERO.compareTo(new java.math.BigDecimal(r10)) == 0) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r21, java.lang.String r22) {
        /*
            r20 = this;
            r1 = r20
            int r2 = r1.A02
            r0 = r21
            switch(r2) {
                case 0: goto L_0x03bc;
                case 1: goto L_0x034d;
                case 2: goto L_0x02f8;
                case 3: goto L_0x02a3;
                case 4: goto L_0x023c;
                case 5: goto L_0x022c;
                case 6: goto L_0x00e7;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2 = 1
            X.C162457s7.A0J(r0, r2)
            java.lang.Object r3 = r1.A01
            X.1xJ r3 = (X.C35711xJ) r3
            X.6sX r4 = new X.6sX
            r4.<init>(r0, r3)
            java.lang.Object r5 = r1.A00
            X.7T9 r5 = (X.AnonymousClass7T9) r5
            r11 = 0
            r9 = 0
            com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrViewModel r6 = r5.A01
            X.6qu r1 = r4.A04
            java.lang.String r14 = r1.A01
            X.C162457s7.A0D(r14)
            X.1VX r3 = r6.A01
            r0 = 3102(0xc1e, float:4.347E-42)
            java.lang.String r3 = r3.A0Q(r0)
            X.C162457s7.A0D(r3)
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = ","
            java.util.List r0 = X.AnonymousClass2AB.A02(r3, r0)
            java.lang.String[] r8 = X.AnonymousClass0x7.A1b(r0)
            int r7 = r8.length
            r3 = 0
        L_0x0042:
            if (r3 >= r7) goto L_0x00bb
            r0 = r8[r3]
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r10 = r1.A00
            X.C162457s7.A0D(r10)
            int r0 = r10.length()
            if (r0 != 0) goto L_0x0070
            java.lang.String r8 = "01"
        L_0x0059:
            X.7yt r0 = r5.A00
            java.lang.Object r3 = r0.A00
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r3, r0)
            android.net.Uri r3 = android.net.Uri.parse(r0)
            java.lang.String r0 = "mc"
            java.lang.String r7 = X.C195179Wl.A02(r3, r0)
            goto L_0x0076
        L_0x0070:
            java.lang.String r8 = "15"
            goto L_0x0059
        L_0x0073:
            int r3 = r3 + 1
            goto L_0x0042
        L_0x0076:
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO     // Catch:{ NumberFormatException -> 0x0083 }
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0083 }
            r0.<init>(r10)     // Catch:{ NumberFormatException -> 0x0083 }
            int r0 = r3.compareTo(r0)     // Catch:{ NumberFormatException -> 0x0083 }
            if (r0 != 0) goto L_0x0084
        L_0x0083:
            r10 = r11
        L_0x0084:
            X.4UC r3 = r6.A04
            java.lang.String r6 = r4.A06
            X.C162457s7.A0D(r6)
            if (r7 != 0) goto L_0x008f
            java.lang.String r7 = r4.A05
        L_0x008f:
            java.lang.String r9 = "11"
            java.lang.String r12 = r5.A02
            java.lang.String r13 = r4.A07
            X.C162457s7.A0D(r13)
            java.lang.String r15 = r1.A02
            X.C162457s7.A0D(r15)
            java.lang.String r1 = r1.A03
            X.C162457s7.A0D(r1)
            java.lang.String r0 = r4.A08
            X.C162457s7.A0D(r0)
            X.7yJ r5 = new X.7yJ
            r17 = r0
            r18 = r2
            r16 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.6oA r0 = new X.6oA
            r0.<init>(r5)
            r3.A0G(r0)
            return
        L_0x00bb:
            X.08M r7 = r6.A00
            java.lang.Object r5 = r7.A07()
            X.7jt r5 = (X.C158387jt) r5
            if (r5 == 0) goto L_0x00e3
            android.app.Application r1 = r6.A00
            r0 = 2131894869(0x7f122255, float:1.9424555E38)
            java.lang.String r4 = r1.getString(r0)
            r0 = 2131894868(0x7f122254, float:1.9424553E38)
            java.lang.String r0 = r1.getString(r0)
            r2 = 0
            X.7Yt r1 = new X.7Yt
            r1.<init>(r2, r4, r0)
            boolean r0 = r5.A01
            X.7jt r9 = new X.7jt
            r9.<init>(r1, r0)
        L_0x00e3:
            r7.A0G(r9)
            return
        L_0x00e7:
            r4 = 1
            X.C162457s7.A0J(r0, r4)
            java.lang.Object r2 = r1.A01
            X.2Ir r2 = (X.C41032Ir) r2
            r12 = 0
            X.36K r8 = X.C41032Ir.A02(r0, r2)
            java.lang.String r2 = "account"
            java.lang.String r3 = "action"
            java.lang.String[] r18 = new java.lang.String[]{r2, r3}
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.String[] r13 = new java.lang.String[]{r2, r3}
            r3 = 0
            java.lang.Long r10 = X.AnonymousClass0x2.A0R()
            java.lang.Long r11 = X.AnonymousClass0x2.A0S()
            r14 = r3
            java.lang.Object r17 = X.C626836d.A06(r8, r9, r10, r11, r12, r13, r14)
            r13 = r0
            r14 = r9
            r15 = r10
            r16 = r11
            r19 = r4
            X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r4 = "start-ts"
            java.lang.String[] r18 = new java.lang.String[]{r2, r4}
            java.lang.Class<java.lang.Long> r14 = java.lang.Long.class
            java.lang.Long r15 = X.AnonymousClass0x2.A0T()
            r17 = r12
            r19 = r3
            java.lang.Object r5 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.String r4 = "end-ts"
            java.lang.String[] r18 = new java.lang.String[]{r2, r4}
            java.lang.Object r4 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.String r6 = "version"
            java.lang.String[] r18 = new java.lang.String[]{r2, r6}
            java.lang.Long r15 = X.AnonymousClass0x2.A0U()
            X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)
            java.util.ArrayList r7 = X.C139706sU.A00
            java.lang.String r6 = "international-payments-status"
            java.lang.String[] r6 = new java.lang.String[]{r2, r6}
            java.lang.String r10 = X.C626836d.A0A(r0, r7, r6)
            r6 = 77
            X.AnonymousClass92Z.A01(r8, r0, r6)
            java.lang.String[] r6 = new java.lang.String[]{r2}
            r2 = 407(0x197, float:5.7E-43)
            java.util.List r0 = X.C1896292a.A0N(r0, r6, r2)
            r0.get(r3)
            java.lang.Object r0 = r1.A00
            X.7SS r0 = (X.AnonymousClass7SS) r0
            X.C162457s7.A0D(r10)
            long r8 = X.C18320x8.A03(r5)
            long r11 = X.C18320x8.A03(r4)
            X.7Yq r7 = new X.7Yq
            r7.<init>(r8, r10, r11)
            com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationViewModel r6 = r0.A01
            X.7kV r9 = r6.A05
            X.7Yp r4 = r0.A00
            java.lang.String r0 = r4.A02
            java.lang.String r8 = r7.A02
            long r11 = r7.A01
            long r1 = r7.A00
            X.7ZK r10 = new X.7ZK
            r13 = r0
            r14 = r1
            r16 = r8
            r10.<init>(r11, r13, r14, r16)
            X.66R r7 = r9.A02
            java.lang.Object r5 = r7.getValue()
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r0 = r10.A03
            r5.put(r0, r10)
            java.lang.Object r0 = r7.getValue()
            java.util.Map r0 = (java.util.Map) r0
            r9.A02(r0)
            java.lang.String r0 = "activated"
            boolean r0 = X.C162457s7.A0P(r8, r0)
            r11 = 1
            android.app.Application r10 = r6.A00
            if (r0 == 0) goto L_0x0224
            r7 = 2131892254(0x7f12181e, float:1.9419251E38)
            java.lang.Object[] r5 = new java.lang.Object[r11]
            X.33j r0 = r6.A01
            java.lang.String r0 = X.C161957qt.A00(r0, r1)
            java.lang.String r9 = X.AnonymousClass002.A0F(r10, r0, r5, r3, r7)
        L_0x01c2:
            X.C162457s7.A0H(r9)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.DAYS
            r7 = 1
            long r12 = r14.toSeconds(r7)
            long r17 = r1 + r12
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.7yt r4 = r4.A00
            java.lang.Object r13 = r4.A00
            X.C626936e.A06(r13)
            X.C162457s7.A0D(r13)
            r12 = r13
            java.lang.Number r12 = (java.lang.Number) r12
            long r4 = r12.longValue()
            long r15 = r0.toSeconds(r4)
            int r4 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x0211
            long r4 = r14.toSeconds(r7)
            long r7 = r1 - r4
            X.C626936e.A06(r13)
            long r4 = r12.longValue()
            long r4 = r0.toSeconds(r4)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0211
            java.lang.String r0 = ""
        L_0x0201:
            X.4UC r2 = r6.A06
            X.7yj r1 = new X.7yj
            r1.<init>(r9, r3, r0)
            X.6o9 r0 = new X.6o9
            r0.<init>(r1)
            r2.A0G(r0)
            return
        L_0x0211:
            r5 = 2131890248(0x7f121048, float:1.9415182E38)
            java.lang.Object[] r4 = new java.lang.Object[r11]
            X.33j r0 = r6.A01
            java.lang.String r0 = X.C161957qt.A00(r0, r1)
            java.lang.String r0 = X.AnonymousClass002.A0F(r10, r0, r4, r3, r5)
            X.C162457s7.A0D(r0)
            goto L_0x0201
        L_0x0224:
            r0 = 2131892257(0x7f121821, float:1.9419257E38)
            java.lang.String r9 = r10.getString(r0)
            goto L_0x01c2
        L_0x022c:
            r2 = 1
            X.C162457s7.A0J(r0, r2)
            java.lang.Object r2 = r1.A00
            X.1xJ r2 = (X.C35711xJ) r2
            java.lang.Object r1 = r1.A01
            X.7LB r1 = (X.AnonymousClass7LB) r1
            A00(r1, r0, r2)
            return
        L_0x023c:
            r2 = 1
            X.C162457s7.A0J(r0, r2)
            java.lang.String r2 = "EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.Object r2 = r1.A00     // Catch:{ 24Y -> 0x0281 }
            X.2Ir r2 = (X.C41032Ir) r2     // Catch:{ 24Y -> 0x0281 }
            X.36K r7 = X.C41032Ir.A02(r0, r2)     // Catch:{ 24Y -> 0x0281 }
            java.lang.String r6 = "verify_email"
            java.lang.String r2 = "wait_time"
            java.lang.String r4 = "#elementValue"
            java.lang.String[] r3 = new java.lang.String[]{r6, r2, r4}     // Catch:{ 24Y -> 0x0281 }
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Object r5 = X.AnonymousClass6C7.A0b(r0, r2, r3)     // Catch:{ 24Y -> 0x0281 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ 24Y -> 0x0281 }
            java.util.ArrayList r3 = X.C139686sS.A00     // Catch:{ 24Y -> 0x0281 }
            java.lang.String r2 = "code_match"
            java.lang.String[] r2 = new java.lang.String[]{r6, r2, r4}     // Catch:{ 24Y -> 0x0281 }
            java.lang.String r3 = X.C626836d.A0A(r0, r3, r2)     // Catch:{ 24Y -> 0x0281 }
            r2 = 5
            X.AnonymousClass92Z.A01(r7, r0, r2)     // Catch:{ 24Y -> 0x0281 }
            java.lang.Object r4 = r1.A01     // Catch:{ 24Y -> 0x0281 }
            X.8rf r4 = (X.C184358rf) r4     // Catch:{ 24Y -> 0x0281 }
            java.lang.String r0 = "true"
            boolean r0 = X.C162457s7.A0P(r3, r0)     // Catch:{ 24Y -> 0x0281 }
            long r2 = X.C18320x8.A03(r5)     // Catch:{ 24Y -> 0x0281 }
            r4.BdQ(r2, r0)     // Catch:{ 24Y -> 0x0281 }
            return
        L_0x0281:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestToVerifyEmailOtp/CorruptStreamException: "
            X.C18260x0.A1Q(r2, r0, r3)
            java.lang.Object r1 = r1.A01
            X.8rf r1 = (X.C184358rf) r1
            r0 = 0
            r1.BSr(r0, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EmailVerificationXmppMethods: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r3, r0, r1)
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02a3:
            r2 = 1
            X.C162457s7.A0J(r0, r2)
            java.lang.String r2 = "EmailVerificationXmppMethods/sendRequestToSetEmail/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.Object r2 = r1.A00     // Catch:{ 24Y -> 0x02d6 }
            X.2Ir r2 = (X.C41032Ir) r2     // Catch:{ 24Y -> 0x02d6 }
            X.36K r6 = X.C41032Ir.A02(r0, r2)     // Catch:{ 24Y -> 0x02d6 }
            java.util.ArrayList r5 = X.C139676sR.A00     // Catch:{ 24Y -> 0x02d6 }
            java.lang.String r4 = "do_verify"
            java.lang.String r3 = "#elementValue"
            java.lang.String r2 = "email"
            java.lang.String[] r2 = new java.lang.String[]{r2, r4, r3}     // Catch:{ 24Y -> 0x02d6 }
            java.lang.String r3 = X.C626836d.A0A(r0, r5, r2)     // Catch:{ 24Y -> 0x02d6 }
            r2 = 3
            X.AnonymousClass92Z.A02(r6, r0, r2)     // Catch:{ 24Y -> 0x02d6 }
            java.lang.Object r2 = r1.A01     // Catch:{ 24Y -> 0x02d6 }
            X.8re r2 = (X.C184348re) r2     // Catch:{ 24Y -> 0x02d6 }
            java.lang.String r0 = "true"
            boolean r0 = X.C162457s7.A0P(r3, r0)     // Catch:{ 24Y -> 0x02d6 }
            r2.BdJ(r0)     // Catch:{ 24Y -> 0x02d6 }
            return
        L_0x02d6:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestToSetEmail/CorruptStreamException: "
            X.C18260x0.A1Q(r2, r0, r3)
            java.lang.Object r1 = r1.A01
            X.8re r1 = (X.C184348re) r1
            r0 = 0
            r1.BSq(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EmailVerificationXmppMethods: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r3, r0, r1)
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02f8:
            r2 = 1
            X.C162457s7.A0J(r0, r2)
            java.lang.String r2 = "EmailVerificationXmppMethods/sendRequestForEmailOtp/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.Object r2 = r1.A00     // Catch:{ 24Y -> 0x032b }
            X.2Ir r2 = (X.C41032Ir) r2     // Catch:{ 24Y -> 0x032b }
            X.36K r5 = X.C41032Ir.A02(r0, r2)     // Catch:{ 24Y -> 0x032b }
            java.lang.String r4 = "wait_time"
            java.lang.String r3 = "#elementValue"
            java.lang.String r2 = "verify_email"
            java.lang.String[] r3 = new java.lang.String[]{r2, r4, r3}     // Catch:{ 24Y -> 0x032b }
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            java.lang.Object r3 = X.AnonymousClass6C7.A0b(r0, r2, r3)     // Catch:{ 24Y -> 0x032b }
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ 24Y -> 0x032b }
            r2 = 2
            X.AnonymousClass92Z.A01(r5, r0, r2)     // Catch:{ 24Y -> 0x032b }
            java.lang.Object r0 = r1.A01     // Catch:{ 24Y -> 0x032b }
            X.8rd r0 = (X.C184338rd) r0     // Catch:{ 24Y -> 0x032b }
            long r2 = X.C18320x8.A03(r3)     // Catch:{ 24Y -> 0x032b }
            r0.Bcy(r2)     // Catch:{ 24Y -> 0x032b }
            return
        L_0x032b:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestForEmailOtp/CorruptStreamException: "
            X.C18260x0.A1Q(r2, r0, r3)
            java.lang.Object r1 = r1.A01
            X.8rd r1 = (X.C184338rd) r1
            r0 = 0
            r1.BSr(r0, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EmailVerificationXmppMethods: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r3, r0, r1)
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x034d:
            r2 = 1
            X.C162457s7.A0J(r0, r2)
            java.lang.String r2 = "EmailVerificationXmppMethods/sendRequestForEmail/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r4 = 0
            java.lang.Object r2 = r1.A01     // Catch:{ 24Y -> 0x039b }
            X.2Ir r2 = (X.C41032Ir) r2     // Catch:{ 24Y -> 0x039b }
            X.36K r8 = X.C41032Ir.A02(r0, r2)     // Catch:{ 24Y -> 0x039b }
            java.util.ArrayList r5 = X.C139666sQ.A00     // Catch:{ 24Y -> 0x039b }
            java.lang.String r3 = "verified"
            java.lang.String r2 = "#elementValue"
            java.lang.String r7 = "email"
            java.lang.String[] r2 = new java.lang.String[]{r7, r3, r2}     // Catch:{ 24Y -> 0x039b }
            java.lang.String r6 = X.C626836d.A0A(r0, r5, r2)     // Catch:{ 24Y -> 0x039b }
            r5 = 0
            X.92Z r3 = new X.92Z     // Catch:{ 24Y -> 0x039b }
            r3.<init>(r8, r5)     // Catch:{ 24Y -> 0x039b }
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ 24Y -> 0x039b }
            X.C626836d.A04(r0, r3, r2)     // Catch:{ 24Y -> 0x039b }
            java.lang.String r2 = "email_address"
            java.lang.String[] r2 = new java.lang.String[]{r7, r2}     // Catch:{ 24Y -> 0x039b }
            java.lang.Object r0 = X.C86614Ku.A0r(r0, r2, r5)     // Catch:{ 24Y -> 0x039b }
            X.1vq r0 = (X.C34801vq) r0     // Catch:{ 24Y -> 0x039b }
            java.lang.Object r3 = r1.A00     // Catch:{ 24Y -> 0x039b }
            X.8rc r3 = (X.C184328rc) r3     // Catch:{ 24Y -> 0x039b }
            if (r0 == 0) goto L_0x0398
            java.lang.String r2 = r0.A00     // Catch:{ 24Y -> 0x039b }
        L_0x038e:
            java.lang.String r0 = "true"
            boolean r0 = X.C162457s7.A0P(r6, r0)     // Catch:{ 24Y -> 0x039b }
            r3.BdF(r2, r0)     // Catch:{ 24Y -> 0x039b }
            goto L_0x039a
        L_0x0398:
            r2 = r4
            goto L_0x038e
        L_0x039a:
            return
        L_0x039b:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EmailVerificationXmppMethods/sendRequestForEmail/CorruptStreamException: "
            X.C18260x0.A1Q(r2, r0, r3)
            java.lang.Object r0 = r1.A00
            X.8rc r0 = (X.C184328rc) r0
            r0.BSq(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EmailVerificationXmppMethods: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r3, r0, r1)
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x03bc:
            r2 = 1
            X.C162457s7.A0J(r0, r2)
            java.lang.Object r2 = r1.A01
            X.2Ir r2 = (X.C41032Ir) r2
            X.36K r3 = X.C41032Ir.A02(r0, r2)
            r2 = 24
            X.AnonymousClass92Z.A02(r3, r0, r2)
            java.lang.String r3 = "linked_groups_participants"
            java.lang.String r2 = "participant"
            java.lang.String[] r4 = new java.lang.String[]{r3, r2}
            r2 = 140(0x8c, float:1.96E-43)
            X.92a r3 = X.C1896292a.A00(r2)
            r5 = 1
            r7 = 19999(0x4e1f, double:9.881E-320)
            r2 = r0
            java.util.List r0 = X.C626836d.A0B(r2, r3, r4, r5, r7)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x03ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0405
            java.lang.Object r0 = r2.next()
            X.6qj r0 = (X.C138626qj) r0
            java.lang.Object r0 = r0.A00
            X.6rn r0 = (X.C139276rn) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            X.C162457s7.A0D(r0)
            r5.add(r0)
            goto L_0x03ec
        L_0x0405:
            java.lang.Object r0 = r1.A00
            X.5HT r0 = (X.AnonymousClass5HT) r0
            X.3Eg r4 = r0.A00
            X.4FS r3 = r4.A0E
            X.1fJ r2 = r0.A01
            r1 = 28
            X.3aJ r0 = new X.3aJ
            r0.<init>(r4, r2, r5, r1)
            r3.BkM(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass93F.BdM(X.36K, java.lang.String):void");
    }

    public static void A00(AnonymousClass7LB r9, AnonymousClass36K r10, C35711xJ r11) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            C139776sb r2 = new C139776sb(r10, r11, 12);
            C18260x0.A1P(AnonymousClass001.A0o(), "SubscribeNewsletterRequest/success ", r2);
            C103865Os r7 = r9.A01;
            C95804uY r8 = r9.A00;
            long A0B = C18310x6.A0B(r2.A01) * 1000;
            Runnable runnable = r7.A08;
            if (runnable != null) {
                r7.A06.BjN(runnable);
            }
            r7.A08 = null;
            C70113Zy r6 = new C70113Zy(r7, 40, r8);
            r7.A08 = r6;
            r7.A06.Bkn(r6, "NewsletterLiveSubscriptionManager/handleSuccess", A0B - 3000);
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("SubscribeToLiveUpdatesResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C139746sY r22 = new C139746sY(r10, r11, 7);
                C18260x0.A1P(AnonymousClass001.A0o(), "SubscribeNewsletterRequest/error ", r22);
                ((C183488q7) r22.A00).Aw7(r9.A02);
            } catch (AnonymousClass24Y e2) {
                C18260x0.A18("SubscribeToLiveUpdatesResponseClientError: ", AnonymousClass001.A0o(), e2, A0s);
                try {
                    C18260x0.A1P(AnonymousClass001.A0o(), "SubscribeNewsletterRequest/server error ", new C139746sY(r10, r11, 8));
                } catch (AnonymousClass24Y e3) {
                    throw AnonymousClass24Y.A03("SubscribeToLiveUpdatesResponseServerError: ", AnonymousClass001.A0o(), e3, A0s);
                }
            }
        }
    }

    public AnonymousClass93F(C95804uY r2, C103865Os r3, AnonymousClass2HO r4, C35711xJ r5) {
        this.A02 = 5;
        this.A00 = r5;
        this.A01 = new AnonymousClass7LB(r2, r3, r4);
    }
}
