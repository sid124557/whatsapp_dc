package X;

/* renamed from: X.2bt  reason: invalid class name and case insensitive filesystem */
public class C46592bt {
    public final C69263Wi A00;
    public final C29291ia A01;
    public final C64773Ex A02;
    public final C56422rx A03;
    public final C66543Lv A04;
    public final AnonymousClass4FS A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A05 != r23) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(com.whatsapp.jid.UserJid r19, X.AnonymousClass3ZC r20, byte[] r21, int r22, long r23) {
        /*
            r18 = this;
            r8 = r18
            X.2rx r5 = r8.A03
            r9 = r19
            X.2qS r4 = r5.A01(r9)
            r2 = r23
            if (r4 == 0) goto L_0x0015
            long r0 = r4.A05
            int r6 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            r7 = 1
            if (r6 == 0) goto L_0x0016
        L_0x0015:
            r7 = 0
        L_0x0016:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BusinessVnameHelper/updateBizVerifiedInformation jid="
            r6.append(r0)
            r6.append(r9)
            java.lang.String r0 = " existingVname.serial="
            r6.append(r0)
            if (r4 != 0) goto L_0x00c7
            java.lang.String r0 = "null!!"
        L_0x002c:
            r6.append(r0)
            java.lang.String r0 = " existingVname.vlevel="
            r6.append(r0)
            java.lang.String r1 = "null!"
            if (r4 != 0) goto L_0x00bf
            r0 = r1
        L_0x003a:
            r6.append(r0)
            java.lang.String r0 = " existingVname.privacyMode="
            r6.append(r0)
            if (r4 != 0) goto L_0x00ba
            r0 = r1
        L_0x0045:
            r6.append(r0)
            java.lang.String r0 = " new serial: "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = " new certBlob=["
            r6.append(r0)
            r2 = r21
            if (r21 == 0) goto L_0x005e
            int r0 = r2.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x005e:
            r6.append(r1)
            java.lang.String r0 = "] new vlevel="
            r6.append(r0)
            r15 = r22
            r6.append(r15)
            java.lang.String r0 = " new privacyMode="
            r1 = r20
            X.C18260x0.A1R(r6, r0, r1)
            if (r21 == 0) goto L_0x00b4
            if (r7 != 0) goto L_0x00b4
            boolean r1 = r5.A05(r9, r1, r2, r15)
        L_0x007a:
            if (r4 == 0) goto L_0x00b2
            int r14 = r4.A03
        L_0x007e:
            r11 = 0
            if (r4 == 0) goto L_0x00b0
            java.lang.String r12 = r4.A08
        L_0x0083:
            X.2qS r0 = r5.A01(r9)
            if (r0 != 0) goto L_0x00ad
            r13 = r11
        L_0x008a:
            if (r4 == 0) goto L_0x00ab
            X.3ZC r10 = r4.A01()
        L_0x0090:
            if (r0 == 0) goto L_0x0096
            X.3ZC r11 = r0.A01()
        L_0x0096:
            int r16 = X.C623134n.A00(r4)
            int r17 = X.C623134n.A00(r0)
            if (r1 == 0) goto L_0x00aa
            X.4FS r0 = r8.A05
            X.3bZ r7 = new X.3bZ
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.BkM(r7)
        L_0x00aa:
            return
        L_0x00ab:
            r10 = r11
            goto L_0x0090
        L_0x00ad:
            java.lang.String r13 = r0.A08
            goto L_0x008a
        L_0x00b0:
            r12 = r11
            goto L_0x0083
        L_0x00b2:
            r14 = 0
            goto L_0x007e
        L_0x00b4:
            r0 = 1
            boolean r1 = r5.A04(r9, r1, r15, r0)
            goto L_0x007a
        L_0x00ba:
            X.3ZC r0 = r4.A01()
            goto L_0x0045
        L_0x00bf:
            int r0 = r4.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x003a
        L_0x00c7:
            long r0 = r4.A05
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46592bt.A00(com.whatsapp.jid.UserJid, X.3ZC, byte[], int, long):void");
    }

    public C46592bt(C69263Wi r1, C29291ia r2, C64773Ex r3, C56422rx r4, C66543Lv r5, AnonymousClass4FS r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }
}
