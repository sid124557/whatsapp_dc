package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.9oT  reason: invalid class name and case insensitive filesystem */
public class C203889oT extends C197739dn {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203889oT(Context context, C40602Ha r2, C84104Ba r3, Object obj, int i) {
        super(context, r2, r3);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A03(AnonymousClass34V r9) {
        AnonymousClass34V r4 = r9;
        switch (this.A01) {
            case 0:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilAddCardAction onRequestError: ", r9);
                ((AnonymousClass9A3) this.A00).A0G.A00((C133736hr) null, r4, (ArrayList) null, false, false);
                return;
            case 1:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilDeviceBindingAction onRequestError: ", r9);
                ((C194359So) this.A00).A0A.BQz((C133736hr) null, r9, (ArrayList) null, false);
                return;
            case 2:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilDeviceBindingAction onRequestError: ", r9);
                ((AnonymousClass9S7) this.A00).A0A.A00((AnonymousClass9Q0) null);
                return;
            case 3:
                AnonymousClass9Q5 r0 = (AnonymousClass9Q5) this.A00;
                r0.A06.A00(C1899693i.A0M(), r0.A07);
                return;
            case 4:
                return;
            case 5:
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilMerchantLinkAction request error: ", r9);
                ((AnonymousClass9Q6) this.A00).A06.A00((C133706ho) null, r9);
                return;
            case 6:
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilMerchantPreLinkAction request error: ", r9);
                ((AnonymousClass9A2) this.A00).A06.A00(r9, (C193709Pr) null);
                return;
            case 7:
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilRetokenizeCardAction onRequestError: ", r9);
                ((AnonymousClass9A0) this.A00).A09.A00((C133736hr) null, r9, (ArrayList) null, false);
                return;
            case 8:
                ((AnonymousClass9A1) this.A00).A07.A00(C1899693i.A0M());
                return;
            case 9:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilVerifyCardOTPSendAction onRequestError: ", r9);
                ((AnonymousClass9A5) this.A00).A05.A00((C133736hr) null, r9);
                return;
            case 10:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilVerifyCardSendAuthCodeAction onRequestError: ", r9);
                ((AnonymousClass9A4) this.A00).A04.A00(r9);
                return;
            default:
                C194099Ro r3 = (C194099Ro) this.A00;
                C1899593h.A1H(r3.A05, r9, "onRequestError: ", AnonymousClass001.A0o());
                r3.A04.BaT(r9, (String) null);
                return;
        }
    }

    public void A04(AnonymousClass34V r9) {
        AnonymousClass34V r4 = r9;
        switch (this.A01) {
            case 0:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilAddCardAction onResponseError: ", r9);
                ((AnonymousClass9A3) this.A00).A0G.A00((C133736hr) null, r4, (ArrayList) null, false, false);
                return;
            case 1:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilDeviceBindingAction onResponseError: ", r9);
                ((C194359So) this.A00).A0A.BQz((C133736hr) null, r9, (ArrayList) null, false);
                return;
            case 2:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilDeviceBindingAction onResponseError: ", r9);
                ((AnonymousClass9S7) this.A00).A0A.A00((AnonymousClass9Q0) null);
                return;
            case 3:
                AnonymousClass9Q5 r0 = (AnonymousClass9Q5) this.A00;
                r0.A06.A00(C1899693i.A0M(), r0.A07);
                return;
            case 4:
                return;
            case 5:
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilMerchantLinkAction response error: ", r9);
                ((AnonymousClass9Q6) this.A00).A06.A00((C133706ho) null, r9);
                return;
            case 6:
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilMerchantPreLinkAction response error: ", r9);
                ((AnonymousClass9A2) this.A00).A06.A00(r9, (C193709Pr) null);
                return;
            case 7:
                C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: BrazilRetokenizeCardAction onResponseError: ", r9);
                ((AnonymousClass9A0) this.A00).A09.A00((C133736hr) null, r9, (ArrayList) null, false);
                return;
            case 8:
                ((AnonymousClass9A1) this.A00).A07.A00(C1899693i.A0M());
                return;
            case 9:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilVerifyCardOTPSendAction onResponseError: ", r9);
                ((AnonymousClass9A5) this.A00).A05.A00((C133736hr) null, r9);
                return;
            case 10:
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: BrazilVerifyCardSendAuthCodeAction onResponseError: ", r9);
                ((AnonymousClass9A4) this.A00).A04.A00(r9);
                return;
            default:
                C194099Ro r3 = (C194099Ro) this.A00;
                C1899593h.A1H(r3.A05, r9, "onResponseError: ", AnonymousClass001.A0o());
                r3.A04.BaT(r9, (String) null);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.9A0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: X.9A3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: X.9A0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: X.9A0} */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0355, code lost:
        r0 = new X.AnonymousClass9WS(r5, r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x035a, code lost:
        r2.A03(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x035d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x038c, code lost:
        r0 = new X.AnonymousClass9Wj(r5, r6, r7, r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x0138;
                case 2: goto L_0x0196;
                case 3: goto L_0x0200;
                case 4: goto L_0x001c;
                case 5: goto L_0x0299;
                case 6: goto L_0x02e9;
                case 7: goto L_0x0308;
                case 8: goto L_0x0065;
                case 9: goto L_0x03be;
                case 10: goto L_0x0400;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.36K r3 = X.C1899693i.A0T(r11)
            r2 = 0
            java.lang.Object r0 = r10.A00
            X.9Ro r0 = (X.C194099Ro) r0
            X.9mL r1 = r0.A04
            if (r3 == 0) goto L_0x005d
            java.lang.String r0 = "token-id"
            java.lang.String r0 = r3.A0r(r0, r2)
            r1.BaT(r2, r0)
        L_0x001b:
            return
        L_0x001c:
            X.36K r7 = X.C1899693i.A0T(r11)
            if (r7 == 0) goto L_0x001b
            java.lang.String r0 = "is-recoverable"
            r5 = 0
            java.lang.String r0 = r7.A0r(r0, r5)
            boolean r4 = X.C1899693i.A0y(r0)
            java.lang.Object r6 = r10.A00
            X.9RU r6 = (X.AnonymousClass9RU) r6
            X.33l r0 = r6.A02
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            java.lang.String r0 = "payment_account_recoverable"
            X.C18270x1.A0l(r1, r0, r4)
            r2 = 0
            if (r4 == 0) goto L_0x0442
            java.lang.String r0 = "suspended-ts"
            java.lang.String r0 = r7.A0r(r0, r5)
            long r4 = X.C615531h.A04(r0, r2)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x043c
            X.33l r2 = r6.A02
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r2)
            java.lang.String r0 = "payment_account_recoverable_time_ms"
            X.C18270x1.A0i(r1, r0, r4)
            return
        L_0x005d:
            X.34V r0 = X.C1899693i.A0M()
            r1.BaT(r0, r2)
            return
        L_0x0065:
            java.lang.String r0 = "account"
            X.36K r4 = r11.A0m(r0)     // Catch:{ 24Y -> 0x00a1 }
            X.34V r1 = X.AnonymousClass34V.A00(r4)     // Catch:{ 24Y -> 0x00a1 }
            if (r1 == 0) goto L_0x007b
            java.lang.Object r0 = r10.A00     // Catch:{ 24Y -> 0x00a1 }
            X.9A1 r0 = (X.AnonymousClass9A1) r0     // Catch:{ 24Y -> 0x00a1 }
            X.9Qk r0 = r0.A07     // Catch:{ 24Y -> 0x00a1 }
            r0.A00(r1)     // Catch:{ 24Y -> 0x00a1 }
            return
        L_0x007b:
            X.99J r3 = new X.99J     // Catch:{ 24Y -> 0x00a1 }
            r3.<init>()     // Catch:{ 24Y -> 0x00a1 }
            java.lang.Object r2 = r10.A00     // Catch:{ 24Y -> 0x00a1 }
            X.9A1 r2 = (X.AnonymousClass9A1) r2     // Catch:{ 24Y -> 0x00a1 }
            X.32a r1 = r2.A03     // Catch:{ 24Y -> 0x00a1 }
            java.lang.String r0 = "merchant"
            X.36K r0 = r4.A0m(r0)     // Catch:{ 24Y -> 0x00a1 }
            X.7yw r3 = X.C1899593h.A0A(r1, r3, r0)     // Catch:{ 24Y -> 0x00a1 }
            X.9U4 r0 = r2.A06     // Catch:{ 24Y -> 0x00a1 }
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)     // Catch:{ 24Y -> 0x00a1 }
            r1 = 10
            X.9WS r0 = new X.9WS     // Catch:{ 24Y -> 0x00a1 }
            r0.<init>(r3, r1, r10)     // Catch:{ 24Y -> 0x00a1 }
            r2.A03(r0, r3)     // Catch:{ 24Y -> 0x00a1 }
            return
        L_0x00a1:
            java.lang.String r0 = "PAY: BrazilMerchantRegAction/regMerchant: invalid response message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r10.A00
            X.9A1 r0 = (X.AnonymousClass9A1) r0
            X.9Qk r1 = r0.A07
            X.34V r0 = X.C1899693i.A0M()
            r1.A00(r0)
            return
        L_0x00b4:
            X.36K r3 = X.C1899693i.A0T(r11)
            if (r3 == 0) goto L_0x0126
            java.lang.String r0 = "card"
            X.36K r1 = r3.A0l(r0)
            if (r1 == 0) goto L_0x0126
            X.99I r2 = new X.99I
            r2.<init>()
            java.lang.Object r6 = r10.A00
            X.9A3 r6 = (X.AnonymousClass9A3) r6
            X.32a r0 = r6.A07
            X.7yw r5 = X.C1899593h.A0A(r0, r2, r1)
            X.9TJ r1 = r6.A0F
            r0 = 0
            r1.A01(r0, r5)
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x00e4
            X.9U4 r0 = r6.A0C
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            r1 = 1
            goto L_0x0355
        L_0x00e4:
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x00f8
            boolean r1 = r2.A07
            X.9U4 r0 = r6.A0C
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            if (r1 == 0) goto L_0x00f5
            r1 = 2
            goto L_0x0355
        L_0x00f5:
            r1 = 3
            goto L_0x0355
        L_0x00f8:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "verify-method-list"
            X.36K r4 = r3.A0l(r0)
            if (r4 == 0) goto L_0x011d
            X.36K[] r0 = r4.A03
            if (r0 == 0) goto L_0x011d
            int r3 = r0.length
            if (r3 <= 0) goto L_0x011d
            r2 = 0
        L_0x010c:
            X.36K r1 = r4.A0k(r2)
            X.9eV r0 = new X.9eV
            r0.<init>(r1)
            r7.add(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x011d
            goto L_0x010c
        L_0x011d:
            X.9U4 r0 = r6.A0C
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            r1 = 0
            goto L_0x038c
        L_0x0126:
            java.lang.Object r0 = r10.A00
            X.9A3 r0 = (X.AnonymousClass9A3) r0
            X.9R4 r0 = r0.A0G
            r1 = 0
            r4 = 0
            X.34V r2 = X.C1899693i.A0M()
            r3 = r1
            r5 = r4
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x0138:
            X.36K r2 = X.C1899693i.A0T(r11)
            r8 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0188
            java.lang.String r0 = "card"
            X.36K r1 = r2.A0l(r0)
            if (r1 == 0) goto L_0x0188
            X.99I r9 = new X.99I
            r9.<init>()
            java.lang.Object r7 = r10.A00
            X.9So r7 = (X.C194359So) r7
            X.32a r0 = r7.A04
            r9.A04(r0, r1, r8)
            X.7yw r5 = r9.A07()
            X.6hr r5 = (X.C133736hr) r5
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "verify-method-list"
            X.36K r3 = r2.A0l(r0)
            if (r3 == 0) goto L_0x0180
            X.36K[] r0 = r3.A03
            if (r0 == 0) goto L_0x0180
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0180
        L_0x016f:
            X.36K r1 = r3.A0k(r8)
            X.9eV r0 = new X.9eV
            r0.<init>(r1)
            r4.add(r0)
            int r8 = r8 + 1
            if (r8 >= r2) goto L_0x0180
            goto L_0x016f
        L_0x0180:
            X.9mB r1 = r7.A0A
            boolean r0 = r9.A0a
            r1.BQz(r5, r6, r4, r0)
            return
        L_0x0188:
            java.lang.Object r0 = r10.A00
            X.9So r0 = (X.C194359So) r0
            X.9mB r1 = r0.A0A
            X.34V r0 = X.C1899693i.A0M()
            r1.BQz(r6, r0, r6, r8)
            return
        L_0x0196:
            X.36K r1 = X.C1899693i.A0T(r11)
            r7 = 0
            if (r1 == 0) goto L_0x01f1
            java.lang.String r0 = "elo"
            X.36K r3 = r1.A0l(r0)
            if (r3 == 0) goto L_0x01f1
            java.lang.String r0 = "challenge_id"
            java.lang.String r2 = r3.A0r(r0, r7)
            r1 = 5
            java.lang.String r0 = "1"
            X.9Q0 r6 = new X.9Q0
            r6.<init>(r0, r2, r7, r1)
            java.lang.String r0 = "ciphered_wallet_secret"
            java.lang.String r1 = r3.A0r(r0, r7)
            java.lang.Object r5 = r10.A00
            X.9S7 r5 = (X.AnonymousClass9S7) r5
            X.9Vc r0 = r5.A05
            X.33l r4 = r0.A01
            android.content.SharedPreferences r0 = r4.A03()
            java.lang.String r3 = "payment_trusted_device_elo_wallet_store"
            java.lang.String r0 = r0.getString(r3, r7)
            r2 = 0
            if (r0 == 0) goto L_0x01d3
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x01dd }
            goto L_0x01d7
        L_0x01d3:
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x01dd }
        L_0x01d7:
            java.lang.String r0 = "wallet_secret"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x01dd }
            goto L_0x01e4
        L_0x01dd:
            X.7oG r1 = r4.A02
            java.lang.String r0 = "Failed to updated the wallet_secret"
            r1.A06(r0)
        L_0x01e4:
            android.content.SharedPreferences$Editor r0 = X.C620933l.A00(r4)
            X.C18270x1.A0e(r0, r2, r3)
            X.9Qg r0 = r5.A0A
            r0.A00(r6)
            return
        L_0x01f1:
            java.lang.Object r0 = r10.A00
            X.9S7 r0 = (X.AnonymousClass9S7) r0
            X.9Qg r1 = r0.A0A
            X.34V r0 = new X.34V
            r0.<init>()
            r1.A00(r7)
            return
        L_0x0200:
            X.36K r1 = X.C1899693i.A0T(r11)
            if (r1 == 0) goto L_0x0289
            java.lang.String r0 = "image"
            X.36K r1 = r1.A0l(r0)
            if (r1 == 0) goto L_0x0289
            java.lang.Object r0 = r10.A00
            X.9Q5 r0 = (X.AnonymousClass9Q5) r0
            X.9RZ r6 = r0.A06
            java.lang.String r0 = "credential-id"
            r4 = 0
            java.lang.String r8 = r1.A0r(r0, r4)
            java.lang.String r0 = "image-content-id"
            r1.A0r(r0, r4)
            java.lang.String r0 = "image-url"
            java.lang.String r7 = r1.A0r(r0, r4)
            java.lang.String r0 = "image-label-color"
            java.lang.String r5 = r1.A0r(r0, r4)
            X.7yw r3 = r6.A01
            java.lang.String r2 = r3.A0A
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0273
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x024b
            X.99I r0 = r6.A02
            r0.A0E = r7
            android.widget.ImageView r1 = r6.A00
            X.9TJ r0 = r6.A03
            X.9De r0 = r0.A07
            if (r1 == 0) goto L_0x0261
            r0.A01(r1, r7)
        L_0x024b:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0255
            X.99I r0 = r6.A02
            r0.A0D = r5
        L_0x0255:
            X.9TJ r0 = r6.A03
            X.9U4 r0 = r0.A06
            X.9Tl r0 = X.AnonymousClass9U4.A00(r0)
            r0.A03(r4, r3)
            return
        L_0x0261:
            X.2pB r1 = r0.A00()
            int r0 = r1.A01
            X.9GH r2 = new X.9GH
            r2.<init>(r7, r0, r0)
            X.7ah r1 = r1.A02
            r0 = 0
            r1.A02(r2, r0)
            goto L_0x024b
        L_0x0273:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: fetchCardArtImageContentDetails credentialIds don't match; request: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " response: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r8, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0289:
            java.lang.Object r0 = r10.A00
            X.9Q5 r0 = (X.AnonymousClass9Q5) r0
            X.9RZ r2 = r0.A06
            java.lang.String r1 = r0.A07
            X.34V r0 = X.C1899693i.A0M()
            r2.A00(r0, r1)
            return
        L_0x0299:
            r4 = 0
            java.lang.String r0 = "account"
            X.36K r5 = r11.A0m(r0)     // Catch:{ 24Y -> 0x02d5 }
            X.34V r1 = X.AnonymousClass34V.A00(r5)     // Catch:{ 24Y -> 0x02d5 }
            if (r1 == 0) goto L_0x02b0
            java.lang.Object r0 = r10.A00     // Catch:{ 24Y -> 0x02d5 }
            X.9Q6 r0 = (X.AnonymousClass9Q6) r0     // Catch:{ 24Y -> 0x02d5 }
            X.9Qi r0 = r0.A06     // Catch:{ 24Y -> 0x02d5 }
            r0.A00(r4, r1)     // Catch:{ 24Y -> 0x02d5 }
            return
        L_0x02b0:
            X.99J r3 = new X.99J     // Catch:{ 24Y -> 0x02d5 }
            r3.<init>()     // Catch:{ 24Y -> 0x02d5 }
            java.lang.Object r2 = r10.A00     // Catch:{ 24Y -> 0x02d5 }
            X.9Q6 r2 = (X.AnonymousClass9Q6) r2     // Catch:{ 24Y -> 0x02d5 }
            X.32a r1 = r2.A02     // Catch:{ 24Y -> 0x02d5 }
            java.lang.String r0 = "merchant"
            X.36K r0 = r5.A0m(r0)     // Catch:{ 24Y -> 0x02d5 }
            X.7yw r3 = X.C1899593h.A0A(r1, r3, r0)     // Catch:{ 24Y -> 0x02d5 }
            X.9U4 r0 = r2.A05     // Catch:{ 24Y -> 0x02d5 }
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)     // Catch:{ 24Y -> 0x02d5 }
            r1 = 7
            X.9WS r0 = new X.9WS     // Catch:{ 24Y -> 0x02d5 }
            r0.<init>(r3, r1, r10)     // Catch:{ 24Y -> 0x02d5 }
            r2.A03(r0, r3)     // Catch:{ 24Y -> 0x02d5 }
            return
        L_0x02d5:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction/regMerchant: invalid response message"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Object r0 = r10.A00
            X.9Q6 r0 = (X.AnonymousClass9Q6) r0
            X.9Qi r1 = r0.A06
            X.34V r0 = X.C1899693i.A0M()
            r1.A00(r4, r0)
            return
        L_0x02e9:
            X.36K r0 = X.C1899693i.A0T(r11)
            X.C626936e.A06(r0)
            X.9Pr r3 = new X.9Pr
            r3.<init>(r0)
            X.34V r2 = r3.A00
            r1 = 0
            java.lang.Object r0 = r10.A00
            X.9A2 r0 = (X.AnonymousClass9A2) r0
            X.9Qj r0 = r0.A06
            if (r2 != 0) goto L_0x0304
            r0.A00(r1, r3)
            return
        L_0x0304:
            r0.A00(r2, r1)
            return
        L_0x0308:
            java.lang.String r0 = "PAY: BrazilRetokenizeCardAction onResponseSuccess: "
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.36K r8 = X.C1899693i.A0T(r11)
            r4 = 0
            r3 = 0
            if (r8 == 0) goto L_0x03b0
            r1 = r8
            java.lang.String r0 = "error-code"
            java.lang.String r0 = r8.A0r(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x039b
            java.lang.String r0 = "token"
            X.36K r1 = r8.A0l(r0)
            if (r1 != 0) goto L_0x039b
            java.lang.String r0 = "card"
            X.36K r2 = r8.A0l(r0)
            if (r2 == 0) goto L_0x03b0
            X.99I r1 = new X.99I
            r1.<init>()
            java.lang.Object r6 = r10.A00
            X.9A0 r6 = (X.AnonymousClass9A0) r6
            X.32a r0 = r6.A04
            r1.A04(r0, r2, r4)
            X.7yw r5 = r1.A07()
            X.9TJ r0 = r6.A08
            r0.A01(r3, r5)
            boolean r0 = r1.A0a
            if (r0 == 0) goto L_0x035e
            X.9U4 r0 = r6.A07
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            r1 = 8
        L_0x0355:
            X.9WS r0 = new X.9WS
            r0.<init>(r5, r1, r10)
        L_0x035a:
            r2.A03(r0, r5)
            return
        L_0x035e:
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0392
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "verify-method-list"
            X.36K r0 = r8.A0l(r0)
            if (r0 == 0) goto L_0x0385
            X.36K[] r4 = r0.A03
            if (r4 == 0) goto L_0x0385
            int r3 = r4.length
            if (r3 <= 0) goto L_0x0385
            r2 = 0
        L_0x0376:
            r1 = r4[r2]
            X.9eV r0 = new X.9eV
            r0.<init>(r1)
            r7.add(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0385
            goto L_0x0376
        L_0x0385:
            X.9U4 r0 = r6.A07
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            r1 = 1
        L_0x038c:
            X.9Wj r0 = new X.9Wj
            r0.<init>(r5, r6, r7, r1)
            goto L_0x035a
        L_0x0392:
            X.9U4 r0 = r6.A07
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            r1 = 9
            goto L_0x0355
        L_0x039b:
            X.34V r2 = new X.34V
            r2.<init>((X.AnonymousClass36K) r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: BrazilRetokenizeCardAction onResponseSuccess error:"
            X.C18260x0.A1Q(r1, r0, r2)
            java.lang.Object r0 = r10.A00
            X.9A0 r0 = (X.AnonymousClass9A0) r0
            X.9R3 r0 = r0.A09
            goto L_0x03ba
        L_0x03b0:
            java.lang.Object r0 = r10.A00
            X.9A0 r0 = (X.AnonymousClass9A0) r0
            X.9R3 r0 = r0.A09
            X.34V r2 = X.C1899693i.A0M()
        L_0x03ba:
            r0.A00(r3, r2, r3, r4)
            return
        L_0x03be:
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.36K r1 = X.C1899693i.A0T(r11)
            if (r1 == 0) goto L_0x03f1
            java.lang.String r0 = "card"
            X.36K r3 = r1.A0l(r0)
            if (r3 == 0) goto L_0x03f1
            X.99I r2 = new X.99I
            r2.<init>()
            java.lang.Object r1 = r10.A00
            X.9A5 r1 = (X.AnonymousClass9A5) r1
            X.32a r0 = r1.A01
            X.7yw r3 = X.C1899593h.A0A(r0, r2, r3)
            X.9U4 r0 = r1.A07
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            r1 = 11
            X.9WS r0 = new X.9WS
            r0.<init>(r3, r1, r10)
            r2.A03(r0, r3)
            return
        L_0x03f1:
            java.lang.Object r0 = r10.A00
            X.9A5 r0 = (X.AnonymousClass9A5) r0
            X.9RK r2 = r0.A05
            X.34V r1 = X.C1899693i.A0M()
            r0 = 0
            r2.A00(r0, r1)
            return
        L_0x0400:
            java.lang.String r0 = "PAY: BrazilVerifyCardSendAuthCodeAction success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.36K r1 = X.C1899693i.A0T(r11)
            if (r1 == 0) goto L_0x0432
            java.lang.String r0 = "card"
            X.36K r3 = r1.A0l(r0)
            if (r3 == 0) goto L_0x0432
            X.99I r2 = new X.99I
            r2.<init>()
            java.lang.Object r1 = r10.A00
            X.9A4 r1 = (X.AnonymousClass9A4) r1
            X.32a r0 = r1.A01
            X.7yw r3 = X.C1899593h.A0A(r0, r2, r3)
            X.9U4 r0 = r1.A07
            X.9Tl r2 = X.AnonymousClass9U4.A00(r0)
            r1 = 12
            X.9WS r0 = new X.9WS
            r0.<init>(r3, r1, r10)
            r2.A03(r0, r3)
        L_0x0432:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: BrazilVerifyCardSendAuthCodeAction onResponseSuccess: "
            X.C18260x0.A1R(r1, r0, r11)
            return
        L_0x043c:
            X.33l r0 = r6.A02
            r0.A0D()
            return
        L_0x0442:
            X.33l r0 = r6.A02
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r0)
            java.lang.String r0 = "payment_account_recoverable_time_ms"
            X.C18270x1.A0i(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203889oT.A05(X.36K):void");
    }
}
