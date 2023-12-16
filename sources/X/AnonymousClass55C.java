package X;

import java.util.ArrayList;

/* renamed from: X.55C  reason: invalid class name */
public final class AnonymousClass55C extends AnonymousClass5ZM {
    public String A00;
    public String A01;
    public final C56972sr A02;
    public final AnonymousClass5ZU A03;
    public final AnonymousClass3ZH A04;
    public final AnonymousClass5ON A05;
    public final AnonymousClass4GQ A06;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0107, code lost:
        r12.A01 = r0;
        r12.A02 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010b, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            r4 = r18
            X.5ZU r2 = r4.A03
            X.3ZH r3 = r4.A04
            java.lang.String r1 = r2.A0H(r3)
            r0 = -1
            boolean r0 = r2.A0e(r3, r0)
            r15 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r3.A0b
            if (r0 == 0) goto L_0x0020
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = X.AnonymousClass5ZU.A03(r2, r3)
        L_0x0020:
            r4.A00 = r1
            X.7rN r2 = X.C162167rN.A00()     // Catch:{ 6zC -> 0x0067 }
            java.lang.String r1 = X.AnonymousClass36P.A02(r3)     // Catch:{ 6zC -> 0x0067 }
            r0 = 0
            X.8LC r1 = r2.A0F(r1, r0)     // Catch:{ 6zC -> 0x0067 }
            int r0 = r1.countryCode_     // Catch:{ 6zC -> 0x0067 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ 6zC -> 0x0067 }
            long r0 = r1.nationalNumber_     // Catch:{ 6zC -> 0x0067 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ 6zC -> 0x0067 }
            java.lang.String r2 = X.C106675Zy.A01(r2, r0)     // Catch:{ 6zC -> 0x0067 }
            X.C162457s7.A0D(r2)     // Catch:{ 6zC -> 0x0067 }
            X.2sr r0 = r4.A02     // Catch:{ 6zC -> 0x0067 }
            r0.A0P()     // Catch:{ 6zC -> 0x0067 }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ 6zC -> 0x0067 }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = X.AnonymousClass0x9.A0w(r0)     // Catch:{ 6zC -> 0x0067 }
            boolean r0 = r2.equals(r0)     // Catch:{ 6zC -> 0x0067 }
            if (r0 != 0) goto L_0x006b
        L_0x0055:
            java.lang.String r0 = ""
            java.util.Locale r1 = new java.util.Locale     // Catch:{ 6zC -> 0x0067 }
            r1.<init>(r0, r2)     // Catch:{ 6zC -> 0x0067 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ 6zC -> 0x0067 }
            java.lang.String r0 = r1.getDisplayCountry(r0)     // Catch:{ 6zC -> 0x0067 }
            r4.A01 = r0     // Catch:{ 6zC -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
        L_0x006b:
            boolean r0 = r3.A0R()
            if (r0 == 0) goto L_0x007f
            r13 = 0
            r17 = 7
            X.5XS r12 = new X.5XS
            r14 = r13
            r16 = r15
            r12.<init>(r13, r14, r15, r16, r17)
            r12.A00 = r15
        L_0x007e:
            return r12
        L_0x007f:
            X.5ON r8 = r4.A05
            java.util.Map r7 = r8.A00(r3)
            X.5XS r12 = new X.5XS
            r12.<init>()
            int r0 = r7.size()
            r12.A00 = r0
            int r0 = r7.size()
            if (r0 == 0) goto L_0x007e
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = X.AnonymousClass001.A0v(r7)
        L_0x009e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00e0
            X.3ZH r5 = X.C18310x6.A0R(r6)
            com.whatsapp.jid.GroupJid r3 = X.C86664Kz.A1C(r5)
            if (r3 == 0) goto L_0x009e
            boolean r0 = X.AnonymousClass3ZH.A0E(r5)
            if (r0 != 0) goto L_0x009e
            X.5XY r2 = new X.5XY
            r2.<init>()
            java.lang.String r0 = r5.A0J()
            X.C162457s7.A0J(r0, r15)
            r2.A03 = r0
            X.2sr r1 = r8.A00
            com.whatsapp.jid.UserJid r0 = r5.A0I
            boolean r0 = r1.A0a(r0)
            r2.A05 = r0
            X.2sj r0 = r8.A03
            boolean r0 = r0.A0D(r3)
            r2.A04 = r0
            X.2ss r0 = r8.A02
            long r0 = r0.A09(r3)
            r2.A02 = r0
            r4.add(r2)
            goto L_0x009e
        L_0x00e0:
            r0 = 38
            X.C86614Ku.A1U(r4, r0)
            int r0 = r4.size()
            if (r0 == 0) goto L_0x007e
            int r0 = r4.size()
            r3 = 1
            if (r0 == r3) goto L_0x01f1
            java.util.Iterator r1 = r4.iterator()
        L_0x00f6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r2 = r1.next()
            X.5XY r2 = (X.AnonymousClass5XY) r2
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x00f6
            r0 = 2
        L_0x0107:
            r12.A01 = r0
            r12.A02 = r2
            return r12
        L_0x010c:
            java.util.Iterator r1 = r4.iterator()
        L_0x0110:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r2 = r1.next()
            X.5XY r2 = (X.AnonymousClass5XY) r2
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0110
            r0 = 3
            goto L_0x0107
        L_0x0122:
            r4.clear()
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r11 = X.AnonymousClass001.A0v(r7)
        L_0x012d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0191
            X.3ZH r9 = X.C18310x6.A0R(r11)
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r5 = r9.A0I(r0)
            X.1fL r5 = (X.C28011fL) r5
            if (r5 == 0) goto L_0x012d
            boolean r0 = X.AnonymousClass3ZH.A0E(r9)
            if (r0 != 0) goto L_0x012d
            X.2ss r0 = r8.A02
            long r1 = r0.A09(r5)
            X.2sj r0 = r8.A03
            X.33k r0 = X.C56892sj.A01(r0, r5)
            X.6aS r10 = r0.A03()
            X.6aY r0 = r10.asList()
            X.8Nf r7 = r0.iterator()
            r6 = 0
        L_0x0160:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0175
            com.whatsapp.jid.UserJid r5 = X.C18310x6.A0T(r7)
            X.3Ex r0 = r8.A01
            boolean r0 = r0.A0l(r5)
            if (r0 == 0) goto L_0x0160
            int r6 = r6 + 1
            goto L_0x0160
        L_0x0175:
            X.5XY r5 = new X.5XY
            r5.<init>()
            java.lang.String r0 = r9.A0J()
            X.C162457s7.A0J(r0, r15)
            r5.A03 = r0
            r5.A02 = r1
            int r0 = r10.size()
            r5.A00 = r0
            r5.A01 = r6
            r4.add(r5)
            goto L_0x012d
        L_0x0191:
            int r0 = r4.size()
            if (r0 == 0) goto L_0x007e
            int r0 = r4.size()
            if (r0 == r3) goto L_0x01f1
            r0 = 36
            X.C86614Ku.A1U(r4, r0)
            java.util.Iterator r2 = r4.iterator()
        L_0x01a6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r2.next()
            X.5XY r1 = (X.AnonymousClass5XY) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x01a6
            r0 = 4
            r12.A01 = r0
            r12.A02 = r1
            return r12
        L_0x01bc:
            r0 = 37
            X.C86614Ku.A1U(r4, r0)
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x01d5
            r0 = 5
            r12.A01 = r0
            java.lang.Object r0 = r4.get(r15)
            X.5XY r0 = (X.AnonymousClass5XY) r0
            X.C162457s7.A0J(r0, r15)
            r12.A02 = r0
        L_0x01d5:
            int r0 = r4.size()
            if (r0 <= r3) goto L_0x007e
            java.lang.Object r0 = r4.get(r15)
            X.5XY r0 = (X.AnonymousClass5XY) r0
            int r1 = r0.A00
            java.lang.Object r0 = r4.get(r3)
            X.5XY r0 = (X.AnonymousClass5XY) r0
            int r0 = r0.A00
            if (r1 != r0) goto L_0x007e
            r0 = 6
            r12.A01 = r0
            return r12
        L_0x01f1:
            r12.A01 = r3
            java.lang.Object r0 = r4.get(r15)
            X.5XY r0 = (X.AnonymousClass5XY) r0
            X.C162457s7.A0J(r0, r15)
            r12.A02 = r0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55C.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5XS r4 = (AnonymousClass5XS) obj;
        ArrayList A0r = C18300x5.A0r(r4);
        String str = this.A00;
        if (str != null) {
            A0r.add(new C134286il(str));
        }
        String str2 = this.A01;
        if (str2 != null) {
            A0r.add(new C134276ik(str2));
        }
        if (r4.A00 != 0) {
            A0r.add(new C134266ij(r4));
        }
        this.A06.invoke(A0r);
    }

    public AnonymousClass55C(C56972sr r1, AnonymousClass5ZU r2, AnonymousClass3ZH r3, AnonymousClass5ON r4, AnonymousClass4GQ r5) {
        C18260x0.A0Q(r1, r2);
        this.A02 = r1;
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = r5;
    }
}
