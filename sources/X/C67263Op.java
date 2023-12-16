package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Op  reason: invalid class name and case insensitive filesystem */
public final class C67263Op implements AnonymousClass4EN {
    public final /* synthetic */ C54662p5 A00;
    public final /* synthetic */ C108895dj A01;
    public final /* synthetic */ C46242bJ A02;
    public final /* synthetic */ C46252bK A03;
    public final /* synthetic */ C72393de A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a6 A[LOOP:5: B:121:0x02a0->B:123:0x02a6, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AyP(X.AnonymousClass2SI r17) {
        /*
            r16 = this;
            r0 = 0
            r1 = r17
            X.C162457s7.A0J(r1, r0)
            boolean r0 = X.C615631i.A02()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02ca
            int r0 = r1.A00
            r3 = r16
            if (r0 == 0) goto L_0x003e
            X.2bK r10 = r3.A03
            X.2wV r4 = r10.A03
            X.2fE r2 = r1.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor"
            X.C162457s7.A0K(r2, r0)
            X.1dK r2 = (X.C27131dK) r2
            X.2p5 r6 = r3.A00
            X.5dj r7 = r3.A01
            java.lang.String r12 = r3.A05
            java.util.List r11 = r3.A06
            X.2bJ r9 = r3.A02
            X.3de r8 = r3.A04
            r13 = 1
            X.3bJ r5 = new X.3bJ
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 3
            X.4JD r0 = new X.4JD
            r0.<init>(r9, r1)
            r4.A00(r6, r0, r2, r5)
            return
        L_0x003e:
            X.2WN r0 = r1.A03
            java.lang.Object r7 = r0.A00
            X.2ly r7 = (X.C52742ly) r7
            if (r7 != 0) goto L_0x004e
            X.2bJ r2 = r3.A02
            r1 = 2
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x004e:
            X.2no r2 = r7.A00
            X.3de r4 = r3.A04
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A00
            boolean r0 = r1.get()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02c3
            byte[] r0 = r4.A02
            r2.A01 = r0
            X.2no r2 = r7.A00
            boolean r0 = r1.get()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02bc
            byte[] r0 = r4.A01
            r2.A00 = r0
            X.2bJ r3 = r3.A02
            X.2cn r1 = r3.A01
            X.8qC r0 = r1.A05
            java.lang.Object r0 = r0.get()
            X.2vD r0 = (X.C58412vD) r0
            r6 = 0
            X.2UU r5 = r0.A00     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            java.lang.String r4 = r2.A02     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            java.lang.String r0 = "CN=Facebook Purpose Encryption Signature"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            java.security.cert.X509Certificate r4 = r5.A00(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            java.lang.String r0 = "SHA256withRSA"
            java.security.Signature r5 = java.security.Signature.getInstance(r0)     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            java.security.PublicKey r0 = r4.getPublicKey()     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            r5.initVerify(r0)     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            byte[] r8 = r2.A07     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            r5.update(r8)     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            java.lang.String r4 = r2.A03     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            r0 = 8
            byte[] r0 = android.util.Base64.decode(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            boolean r0 = r5.verify(r0)     // Catch:{ UnsupportedEncodingException -> 0x0288, GeneralSecurityException -> 0x028b }
            if (r0 == 0) goto L_0x0290
            byte[] r9 = r2.A06
            byte[] r10 = r2.A01
            java.lang.String r6 = "Required value was null."
            if (r10 == 0) goto L_0x0283
            byte[] r11 = r2.A00
            if (r11 == 0) goto L_0x027e
            byte[] r12 = X.C58412vD.A01
            r13 = 2
            byte[] r5 = X.C161227pF.A02(r8, r9, r10, r11, r12, r13)
            byte[] r4 = r2.A05
            byte[] r0 = r2.A04
            byte[] r4 = X.C159457lr.A01(r5, r4, r0)
            byte[] r0 = r2.A01
            if (r0 == 0) goto L_0x0279
            java.lang.String r0 = X.AnonymousClass0x7.A0s(r0)
            X.C162457s7.A0D(r0)
            byte[] r0 = X.AnonymousClass0x2.A1a(r0)
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L_0x0290
            java.util.List r13 = r3.A03
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.List r0 = r7.A01
            java.util.Iterator r15 = r0.iterator()
            r4 = 0
        L_0x00ea:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r15.next()
            int r14 = r4 + 1
            if (r4 >= 0) goto L_0x00fd
            java.lang.RuntimeException r0 = X.C18280x3.A0X()
            throw r0
        L_0x00fd:
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            X.34x r12 = X.C18320x8.A0R(r13, r4)
            if (r0 == 0) goto L_0x010c
            r11.add(r12)
        L_0x010a:
            r4 = r14
            goto L_0x00ea
        L_0x010c:
            java.util.List r0 = r7.A02
            java.lang.Object r10 = r0.get(r4)
            X.5dj r10 = (X.C108895dj) r10
            X.8qC r0 = r1.A06
            java.lang.Object r9 = r0.get()
            X.30J r9 = (X.AnonymousClass30J) r9
            long r4 = r12.A1L
            r0 = 1
            X.C162457s7.A0J(r10, r0)
            X.3zl r6 = new X.3zl
            r6.<init>(r9, r10, r4)
            r0 = 2
            X.C617031x.A01(r6, r0)
            r8.add(r12)
            goto L_0x010a
        L_0x012f:
            boolean r0 = X.AnonymousClass0x7.A1S(r11)
            if (r0 == 0) goto L_0x0151
            java.util.ArrayList r7 = X.C73783g4.A0d(r11)
            java.util.Iterator r4 = r11.iterator()
        L_0x013d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0147
            X.C624134x.A0Z(r7, r4)
            goto L_0x013d
        L_0x0147:
            X.3Wi r6 = r1.A01
            X.1iN r5 = r1.A02
            X.8qC r4 = r1.A06
            r0 = 3
            X.AnonymousClass36X.A06(r6, r5, r4, r7, r0)
        L_0x0151:
            X.8qC r0 = r1.A06
            java.lang.Object r6 = r0.get()
            X.30J r6 = (X.AnonymousClass30J) r6
            java.util.ArrayList r5 = X.C73783g4.A0d(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x0161:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x016b
            X.C624134x.A0Z(r5, r4)
            goto L_0x0161
        L_0x016b:
            java.util.Map r0 = r6.A01(r5)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            java.lang.String r5 = r3.A02
            r7 = 1
            java.util.Iterator r11 = r8.iterator()
        L_0x017b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0267
            X.34x r10 = X.C18300x5.A0T(r11)
            java.lang.Long r0 = X.C624134x.A0A(r10)
            java.lang.Object r9 = r6.get(r0)
            X.2mc r9 = (X.C53142mc) r9
            r4 = 0
            if (r9 == 0) goto L_0x0263
            X.5dj r0 = r9.A02
            if (r0 == 0) goto L_0x0263
            int r0 = r9.A00
            if (r0 != r7) goto L_0x0263
            java.lang.String r9 = r9.A04
            if (r9 == 0) goto L_0x017b
            int r0 = r9.length()
            if (r0 == 0) goto L_0x017b
            X.8qC r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.2a9 r0 = (X.C45522a9) r0
            X.2WV r0 = r0.A00
            java.lang.String r0 = r0.A00(r9, r7)
            if (r0 == 0) goto L_0x01ba
            int r0 = r0.length()
            if (r0 != 0) goto L_0x017b
        L_0x01ba:
            boolean r0 = r10 instanceof X.C30481mW
            if (r0 != 0) goto L_0x0253
            java.lang.String r2 = "XFamilyCrosspostEligibilityManager/Invalid directURL path for non-text status"
        L_0x01c0:
            r0 = 0
            X.C626936e.A0D(r0, r2)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01e2
            r0 = -17
        L_0x01cc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x01d0:
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r0, r4)
        L_0x01d4:
            X.4Em r2 = r3.A00
            int r1 = X.AnonymousClass3Z6.A00(r0)
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.BRz(r1, r0)
            return
        L_0x01e2:
            java.util.Iterator r10 = r8.iterator()
        L_0x01e6:
            boolean r0 = r10.hasNext()
            r9 = -9999(0xffffffffffffd8f1, float:NaN)
            if (r0 == 0) goto L_0x024d
            X.34x r8 = X.C18300x5.A0T(r10)
            java.lang.Long r0 = X.C624134x.A0A(r8)
            java.lang.Object r5 = r6.get(r0)
            X.2mc r5 = (X.C53142mc) r5
            if (r5 != 0) goto L_0x0201
            r0 = -18
            goto L_0x01cc
        L_0x0201:
            X.5dj r0 = r5.A02
            if (r0 != 0) goto L_0x0208
            r0 = -22
            goto L_0x01cc
        L_0x0208:
            int r2 = r5.A00
            if (r2 == r7) goto L_0x0217
            r0 = -19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.3Z6 r0 = X.AnonymousClass3Z6.A01(r0, r2)
            goto L_0x01d4
        L_0x0217:
            java.lang.String r2 = r5.A04
            if (r2 == 0) goto L_0x024d
            int r0 = r2.length()
            if (r0 == 0) goto L_0x024d
            X.8qC r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.2a9 r0 = (X.C45522a9) r0
            X.2WV r0 = r0.A00
            java.lang.String r0 = r0.A00(r2, r7)
            if (r0 == 0) goto L_0x0237
            int r0 = r0.length()
            if (r0 != 0) goto L_0x024d
        L_0x0237:
            boolean r0 = r8 instanceof X.C30481mW
            if (r0 != 0) goto L_0x023e
            r0 = -20
            goto L_0x01cc
        L_0x023e:
            X.3Dh r0 = r1.A00
            java.io.File r0 = X.C64393Dh.A00(r0, r2)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x01e6
            r0 = -21
            goto L_0x01cc
        L_0x024d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x01d0
        L_0x0253:
            X.3Dh r0 = r1.A00
            java.io.File r0 = X.C64393Dh.A00(r0, r9)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x017b
            java.lang.String r2 = "XFamilyCrosspostEligibilityManager/Media file not exist for text status"
            goto L_0x01c0
        L_0x0263:
            java.lang.String r2 = "XFamilyCrosspostEligibilityManager/DB Data UniqueID or State Invalid"
            goto L_0x01c0
        L_0x0267:
            X.6aY r0 = X.C129586aY.copyOf((java.util.Collection) r8)
            X.C162457s7.A0D(r0)
            X.2lx r1 = new X.2lx
            r1.<init>(r0, r5, r6)
            X.4Em r0 = r3.A00
            r0.BdB(r1, r2)
            return
        L_0x0279:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r6)
            throw r0
        L_0x027e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r6)
            throw r0
        L_0x0283:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r6)
            throw r0
        L_0x0288:
            java.lang.String r0 = "XFamilyCrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams UnsupportedEncodingException: Credential data cannot be validated"
            goto L_0x028d
        L_0x028b:
            java.lang.String r0 = "XFamilyCrosspostPurposeEncryptionHelper/validatePurposeEncryptionParams GeneralSecurityException: Credential data cannot be validated"
        L_0x028d:
            X.C106245Ye.A02(r0, r6)
        L_0x0290:
            java.lang.String r0 = "XFamilyCrosspostEligibilityManager/generateEligibilityGraphqlCallback purpose encryption validation failed"
            r6 = 0
            X.C106245Ye.A02(r0, r6)
            java.util.List r0 = r3.A03
            java.util.ArrayList r5 = X.C73783g4.A0d(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x02a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02aa
            X.C624134x.A0Z(r5, r2)
            goto L_0x02a0
        L_0x02aa:
            X.3Wi r4 = r1.A01
            X.1iN r2 = r1.A02
            X.8qC r1 = r1.A06
            r0 = 4
            X.AnonymousClass36X.A06(r4, r2, r1, r5, r0)
            X.4Em r1 = r3.A00
            r0 = -14
            r1.BRz(r0, r6)
            return
        L_0x02bc:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x02c3:
            java.lang.String r0 = "key has been destroyed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x02ca:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67263Op.AyP(X.2SI):void");
    }

    public void BSB(Exception exc) {
        int i;
        Integer num;
        C162457s7.A0J(exc, 0);
        boolean z = exc instanceof AnonymousClass244;
        C46242bJ r2 = this.A02;
        if (z) {
            C618532n r0 = ((AnonymousClass244) exc).error;
            i = r0.A01;
            num = Integer.valueOf(r0.A02);
        } else {
            i = 2;
            num = null;
        }
        r2.A00(i, num);
    }

    public C67263Op(C54662p5 r1, C108895dj r2, C46242bJ r3, C46252bK r4, C72393de r5, String str, List list) {
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = str;
        this.A06 = list;
    }

    public void BQq(IOException iOException) {
        C46242bJ r5 = this.A02;
        C106245Ye.A02("XFamilyCrosspostEligibilityManager/generateEligibilityGraphqlCallback delivery failure", (Throwable) null);
        C48582f8 r4 = (C48582f8) r5.A01.A07.get();
        String str = r5.A02;
        List list = r5.A03;
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x.A0Z(A0c, it);
        }
        r4.A01(str, A0c);
        r5.A00.BQp();
    }
}
