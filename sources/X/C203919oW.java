package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.9oW  reason: invalid class name and case insensitive filesystem */
public class C203919oW extends C1908099x {
    public Object A00;
    public final int A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C203919oW(android.content.Context r13, X.C69263Wi r14, X.C40602Ha r15, X.C153607bd r16, X.AnonymousClass9VD r17, X.C197109ca r18, X.AnonymousClass9B3 r19, java.lang.String r20, int r21) {
        /*
            r12 = this;
            r2 = r12
            r0 = r21
            r12.A01 = r0
            r1 = r17
            int r21 = 2 - r21
            if (r21 == 0) goto L_0x0020
            java.lang.String r9 = "upi-get-accounts"
            r12.A00 = r1
            r11 = 18
        L_0x0011:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r18
            r8 = r19
            r10 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0020:
            java.lang.String r9 = "upi-bind-device"
            r12.A00 = r1
            r11 = 20
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203919oW.<init>(android.content.Context, X.3Wi, X.2Ha, X.7bd, X.9VD, X.9ca, X.9B3, java.lang.String, int):void");
    }

    public void A03(AnonymousClass34V r3) {
        switch (this.A01) {
            case 0:
                super.A03(r3);
                C203309nU r1 = ((AnonymousClass9AC) this.A00).A04;
                if (r1 != null) {
                    r1.BU4(r3, false);
                    return;
                }
                return;
            case 1:
                super.A03(r3);
                C202559mD r0 = ((AnonymousClass9AA) this.A00).A00;
                if (r0 != null) {
                    r0.BZ8(r3);
                    return;
                }
                return;
            case 2:
                super.A03(r3);
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", r3);
                A06(r3);
                return;
            case 3:
                super.A03(r3);
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", r3);
                C203039n1 r12 = ((AnonymousClass9VD) this.A00).A01;
                if (r12 != null) {
                    r12.BNT(r3, (ArrayList) null);
                    return;
                }
                return;
            default:
                super.A03(r3);
                C203049n2 r02 = ((AnonymousClass9AL) this.A00).A01;
                if (r02 != null) {
                    r02.BbO(r3);
                    return;
                }
                return;
        }
    }

    public void A04(AnonymousClass34V r3) {
        switch (this.A01) {
            case 0:
                super.A04(r3);
                C203309nU r1 = ((AnonymousClass9AC) this.A00).A04;
                if (r1 != null) {
                    r1.BU4(r3, false);
                    return;
                }
                return;
            case 1:
                super.A04(r3);
                C202559mD r0 = ((AnonymousClass9AA) this.A00).A00;
                if (r0 != null) {
                    r0.BZ8(r3);
                    return;
                }
                return;
            case 2:
                super.A04(r3);
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", r3);
                A06(r3);
                return;
            case 3:
                super.A04(r3);
                C18260x0.A1R(AnonymousClass001.A0o(), "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", r3);
                C203039n1 r12 = ((AnonymousClass9VD) this.A00).A01;
                if (r12 != null) {
                    r12.BNT(r3, (ArrayList) null);
                    return;
                }
                return;
            default:
                super.A04(r3);
                C203049n2 r02 = ((AnonymousClass9AL) this.A00).A01;
                if (r02 != null) {
                    r02.BbO(r3);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r2 == null) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass36K r14) {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x004b;
                case 2: goto L_0x00fd;
                case 3: goto L_0x0129;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A05(r14)
            java.lang.Object r0 = r13.A00
            X.9AL r0 = (X.AnonymousClass9AL) r0
            X.9n2 r1 = r0.A01
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.BbO(r0)
        L_0x0014:
            return
        L_0x0015:
            super.A05(r14)
            X.36K r0 = X.C1899693i.A0T(r14)
            r6 = 0
            r8 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.String r11 = "token"
            java.lang.String r9 = r0.A0r(r11, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x003f
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/token stored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r4 = r13.A00
            X.9AC r4 = (X.AnonymousClass9AC) r4
            X.9bS r1 = r4.A03
            monitor-enter(r1)
            goto L_0x013c
        L_0x003a:
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/token missing account node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x003f:
            java.lang.Object r0 = r13.A00
            X.9AC r0 = (X.AnonymousClass9AC) r0
            X.9nU r0 = r0.A04
            if (r0 == 0) goto L_0x0014
            r0.BU4(r6, r8)
            return
        L_0x004b:
            super.A05(r14)
            java.lang.Object r6 = r13.A00
            X.9AA r6 = (X.AnonymousClass9AA) r6
            X.9U4 r0 = r6.A07
            X.9oC r0 = X.AnonymousClass9U4.A07(r0)
            X.9mA r1 = r0.BAY()
            X.C626936e.A06(r1)
            X.32a r0 = r6.A03
            java.util.ArrayList r0 = r1.BgU(r0, r14)
            X.9U1 r1 = r6.A05
            X.7bd r4 = r6.A00
            X.9Ox r0 = r1.A02(r4, r0)
            java.util.ArrayList r5 = r0.A02
            X.99E r2 = r0.A00
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x007a
            r0 = 1
            if (r2 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            java.lang.String r3 = "upi-get-psp-routing-and-list-keys"
            if (r0 == 0) goto L_0x00e0
            r1.A07 = r5
            r1.A03 = r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: "
            X.C18260x0.A1R(r1, r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: "
            X.C18260x0.A1R(r1, r0, r2)
            r4.A04(r3)
            X.9mD r7 = r6.A00
            if (r7 == 0) goto L_0x00ba
            X.9Bb r7 = (X.AnonymousClass9Bb) r7
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x00c8
            if (r2 == 0) goto L_0x00c8
            r6 = 0
            X.4FS r5 = r7.A04
            X.9U4 r2 = r7.A0P
            X.9NR r0 = new X.9NR
            r0.<init>(r7)
            X.9GR r1 = new X.9GR
            r1.<init>(r7, r2, r0)
            X.0sA[] r0 = new X.C15910sA[r6]
            r5.BkL(r1, r0)
        L_0x00ba:
            java.util.ArrayList r0 = r4.A05
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0014
            r0 = 500(0x1f4, float:7.0E-43)
            r4.A05(r3, r0)
            return
        L_0x00c8:
            X.7oG r2 = r7.A0p
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "onPspRoutingAndListKeys error. showGenericError error: "
            r1.append(r0)
            X.7bd r0 = r7.A01
            int r0 = r0.A00(r3)
            X.C1899593h.A1K(r2, r1, r0)
            r7.A7V()
            goto L_0x00ba
        L_0x00e0:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: received invalid data from upi-get-psp-routing-and-list-keys: psps: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " pspRouting: "
            X.C18260x0.A1S(r1, r0, r2)
            X.9mD r1 = r6.A00
            if (r1 == 0) goto L_0x00ba
            X.34V r0 = X.C1899693i.A0M()
            r1.BZ8(r0)
            goto L_0x00ba
        L_0x00fd:
            super.A05(r14)
            java.lang.Object r5 = r13.A00
            X.9VD r5 = (X.AnonymousClass9VD) r5
            X.9VY r0 = r5.A0H
            java.lang.String r4 = r0.A03()
            X.9bS r0 = r5.A0B
            java.lang.String r3 = r5.A03
            java.lang.String r2 = r5.A04
            r0.A0J(r3, r2, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: "
            java.lang.String r0 = X.C1908099x.A01(r0, r3, r2, r4, r1)
            X.C18260x0.A1L(r1, r0)
            X.9n1 r1 = r5.A01
            if (r1 == 0) goto L_0x0014
            r0 = 0
            r1.BQy(r0)
            return
        L_0x0129:
            super.A05(r14)
            java.lang.Object r0 = r13.A00
            X.9VD r0 = (X.AnonymousClass9VD) r0
            X.4FS r2 = r0.A0J
            r1 = 0
            X.9oe r0 = new X.9oe
            r0.<init>(r14, r1, r13)
            X.AnonymousClass0x7.A1B(r0, r2)
            return
        L_0x013c:
            X.33l r10 = r1.A03     // Catch:{ JSONException -> 0x016a }
            java.lang.String r5 = r10.A06()     // Catch:{ JSONException -> 0x016a }
            X.2sH r0 = r1.A00     // Catch:{ JSONException -> 0x016a }
            long r2 = r0.A0H()     // Catch:{ JSONException -> 0x016a }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x016a }
            if (r0 == 0) goto L_0x0165
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1G()     // Catch:{ JSONException -> 0x016a }
        L_0x0152:
            java.lang.String r5 = "v"
            java.lang.String r0 = "2"
            r7.put(r5, r0)     // Catch:{ JSONException -> 0x016a }
            r7.put(r11, r9)     // Catch:{ JSONException -> 0x016a }
            java.lang.String r0 = "tokenTs"
            r7.put(r0, r2)     // Catch:{ JSONException -> 0x016a }
            X.C1899593h.A1D(r10, r7)     // Catch:{ JSONException -> 0x016a }
            goto L_0x0170
        L_0x0165:
            org.json.JSONObject r7 = X.AnonymousClass0x9.A1H(r5)     // Catch:{ JSONException -> 0x016a }
            goto L_0x0152
        L_0x016a:
            r2 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs storeToken threw: "
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x023a }
        L_0x0170:
            monitor-exit(r1)
            byte[] r5 = android.util.Base64.decode(r9, r8)
            X.9nU r8 = r4.A04
            if (r8 == 0) goto L_0x017d
            r0 = 1
            r8.BU4(r6, r0)
        L_0x017d:
            X.5o9 r9 = r4.A07
            java.lang.String r12 = r4.A0A
            X.4FS r3 = r4.A09
            X.9Se r10 = r4.A08
            java.lang.Class<X.9S0> r1 = X.AnonymousClass9S0.class
            monitor-enter(r1)
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/registerApp called"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x023a }
            java.lang.String r4 = r10.A01()     // Catch:{ all -> 0x023a }
            java.lang.String r6 = "|"
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01eb }
            java.lang.String r0 = "com.whatsapp"
            r2.append(r0)     // Catch:{ Exception -> 0x01eb }
            r2.append(r6)     // Catch:{ Exception -> 0x01eb }
            r2.append(r12)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r6 = X.AnonymousClass000.A0V(r6, r4, r2)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x01e4 }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r6.getBytes(r0)     // Catch:{ Exception -> 0x01e4 }
            r2.update(r0)     // Catch:{ Exception -> 0x01e4 }
            byte[] r7 = r2.digest()     // Catch:{ Exception -> 0x01e4 }
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x01eb }
            r6.<init>(r5, r0)     // Catch:{ Exception -> 0x01eb }
            r0 = 16
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x01eb }
            javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ Exception -> 0x01eb }
            r5.<init>(r0)     // Catch:{ Exception -> 0x01eb }
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x01dd }
            r0 = 1
            r2.init(r0, r6, r5)     // Catch:{ Exception -> 0x01dd }
            byte[] r2 = r2.doFinal(r7)     // Catch:{ Exception -> 0x01dd }
            r0 = 2
            java.lang.String r11 = android.util.Base64.encodeToString(r2, r0)     // Catch:{ Exception -> 0x01eb }
            goto L_0x01f2
        L_0x01dd:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x01eb }
            r2.<init>(r0)     // Catch:{ Exception -> 0x01eb }
            goto L_0x01ea
        L_0x01e4:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x01eb }
            r2.<init>(r0)     // Catch:{ Exception -> 0x01eb }
        L_0x01ea:
            throw r2     // Catch:{ Exception -> 0x01eb }
        L_0x01eb:
            r2 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/registerApp threw: "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x023a }
            r11 = 0
        L_0x01f2:
            r2 = 0
            if (r11 == 0) goto L_0x022e
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x023a }
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x023a }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x023a }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x023a }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x023a }
            boolean r0 = X.AnonymousClass000.A1T(r0)
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x023a }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x023a }
            if (r0 == 0) goto L_0x0220
            r2 = 0
        L_0x0220:
            X.C626936e.A0C(r2)     // Catch:{ all -> 0x023a }
            X.9Gn r7 = new X.9Gn     // Catch:{ all -> 0x023a }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x023a }
            X.AnonymousClass9S0.A0A = r7     // Catch:{ all -> 0x023a }
            X.AnonymousClass0x7.A1B(r7, r3)     // Catch:{ all -> 0x023a }
            goto L_0x0238
        L_0x022e:
            java.lang.String r0 = "PAY: IndiaUpiSetupCoordinator/registerApp got null intent"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x023a }
            if (r8 == 0) goto L_0x0238
            r8.BZe(r2)     // Catch:{ all -> 0x023a }
        L_0x0238:
            monitor-exit(r1)
            return
        L_0x023a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203919oW.A05(X.36K):void");
    }

    public final void A06(AnonymousClass34V r7) {
        AnonymousClass9VD r5 = (AnonymousClass9VD) this.A00;
        if (r5.A01 != null) {
            if (r7.A00 == 11453) {
                String A03 = r5.A0H.A03();
                C196629bS r0 = r5.A0B;
                String str = r5.A03;
                String str2 = r5.A04;
                r0.A0J(str, str2, A03);
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A1L(A0o, C1908099x.A01("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ", str, str2, A03, A0o));
            }
            r5.A01.BQy(r7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203919oW(Context context, C69263Wi r11, C40602Ha r12, C153607bd r13, AnonymousClass9AL r14, C197109ca r15) {
        super(context, r11, r12, r13, r15, "upi-change-mpin", 7);
        this.A01 = 5;
        this.A00 = r14;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203919oW(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass9AA r12) {
        super(context, r9, r10, r11, "upi-get-psp-routing-and-list-keys");
        this.A01 = 1;
        this.A00 = r12;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203919oW(Context context, C69263Wi r9, C40602Ha r10, C153607bd r11, AnonymousClass9AL r12) {
        super(context, r9, r10, r11, "upi-set-mpin");
        this.A01 = 4;
        this.A00 = r12;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C203919oW(Context context, C69263Wi r9, AnonymousClass9AC r10, C40602Ha r11, C153607bd r12) {
        super(context, r9, r11, r12, "upi-get-token");
        this.A01 = 0;
        this.A00 = r10;
    }
}
