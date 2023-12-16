package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.3PM  reason: invalid class name */
public final class AnonymousClass3PM implements AnonymousClass4D2 {
    public final C48562f6 A00;
    public final AnonymousClass1VX A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r1 != 0) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C371120z r7, X.AnonymousClass1ES r8, X.C624134x r9) {
        /*
            r6 = this;
            r5 = 1
            X.1VX r2 = r6.A01
            r1 = 6578(0x19b2, float:9.218E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x003d
            X.1B0 r0 = r8.reportingTokenInfo_
            if (r0 != 0) goto L_0x0013
            X.1B0 r0 = X.AnonymousClass1B0.DEFAULT_INSTANCE
        L_0x0013:
            r4 = 0
            if (r0 == 0) goto L_0x003d
            X.8Lq r0 = r0.reportingTag_
            if (r0 == 0) goto L_0x003d
            byte[] r3 = r0.A07()
            int r0 = r3.length
            if (r0 == 0) goto L_0x003d
            r2 = -1
            if (r7 == 0) goto L_0x0030
            int r1 = r7.ordinal()
            if (r1 == r5) goto L_0x0040
            r0 = 2
            if (r1 == r0) goto L_0x003e
            r0 = 0
            if (r1 == r0) goto L_0x0031
        L_0x0030:
            r2 = -5
        L_0x0031:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            X.2lp r0 = new X.2lp
            r0.<init>(r1, r3, r4)
            r9.A1S(r0)
        L_0x003d:
            return
        L_0x003e:
            r2 = -4
            goto L_0x0031
        L_0x0040:
            r2 = -3
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PM.A00(X.20z, X.1ES, X.34x):void");
    }

    public void BYW(C50972j4 r2, AnonymousClass1ES r3, C624134x r4) {
        C162457s7.A0J(r3, 0);
        C18260x0.A0Q(r4, r2);
        A00(r2.A00, r3, r4);
    }

    public final void A01(AnonymousClass1A3 r5, C624134x r6) {
        if (this.A01.A0Y(C58422vE.A02, 6578)) {
            this.A00.A01(r6);
            C52652lp r0 = r6.A0g;
            if (r0 != null) {
                byte[] bArr = r0.A01;
                if (bArr.length != 0) {
                    C130546c9 A0G = AnonymousClass1B0.DEFAULT_INSTANCE.A0G();
                    C172548Lq A09 = C18270x1.A09(A0G, bArr);
                    AnonymousClass1B0 r1 = (AnonymousClass1B0) A0G.A00;
                    r1.bitField0_ |= 1;
                    r1.reportingTag_ = A09;
                    AnonymousClass1B0 r02 = (AnonymousClass1B0) A0G.A06();
                    AnonymousClass1ES A0O = C18280x3.A0O(r5);
                    r02.getClass();
                    A0O.reportingTokenInfo_ = r02;
                    A0O.bitField1_ |= DefaultCrypto.BUFFER_SIZE;
                }
            }
        }
    }

    public AnonymousClass3PM(C48562f6 r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BYV(C52952mJ r1, AnonymousClass1A3 r2, C624134x r3) {
        C18260x0.A0O(r3, r2);
        A01(r2, r3);
    }
}
