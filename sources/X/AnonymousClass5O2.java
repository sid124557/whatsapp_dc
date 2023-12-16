package X;

/* renamed from: X.5O2  reason: invalid class name */
public final class AnonymousClass5O2 {
    public final C56972sr A00;
    public final C102535Jf A01;
    public final C41242Jm A02;
    public final C64773Ex A03;
    public final AnonymousClass1VX A04;

    public AnonymousClass5O2(C56972sr r1, C102535Jf r2, C41242Jm r3, C64773Ex r4, AnonymousClass1VX r5) {
        C18260x0.A0V(r5, r1, r4);
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (r8 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r5.A02.A00.A01(r7).A0T() != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.text.Spannable r6, X.C95814uZ r7, X.C95814uZ r8) {
        /*
            r5 = this;
            boolean r0 = X.C155477ey.A00(r8)
            if (r0 != 0) goto L_0x0022
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0023
            X.1VX r0 = r5.A04
            boolean r0 = X.AnonymousClass75P.A00(r0)
            if (r0 == 0) goto L_0x0023
            X.2Jm r0 = r5.A02
            if (r8 == 0) goto L_0x0032
            X.3Lo r0 = r0.A00
            X.3ZH r0 = r0.A01(r8)
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0025
        L_0x0022:
            return
        L_0x0023:
            if (r8 == 0) goto L_0x0032
        L_0x0025:
            X.3Ex r0 = r5.A03
            X.3ZH r0 = r0.A0A(r8)
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x0032
            return
        L_0x0032:
            X.3Ex r0 = r5.A03
            X.3ZH r1 = r0.A0A(r7)
            boolean r0 = r7 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0053
            X.1VX r0 = r5.A04
            boolean r0 = X.AnonymousClass75P.A00(r0)
            if (r0 == 0) goto L_0x0053
            X.2Jm r0 = r5.A02
            X.3Lo r0 = r0.A00
            X.3ZH r0 = r0.A01(r7)
            boolean r0 = r0.A0T()
            r3 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            boolean r2 = r1.A0R()
            if (r3 != 0) goto L_0x006a
            X.1VX r1 = r5.A04
            r0 = 5811(0x16b3, float:8.143E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00da
            boolean r0 = X.C155477ey.A00(r7)
            if (r0 == 0) goto L_0x00da
        L_0x006a:
            X.5Jf r0 = r5.A01
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            if (r7 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x00e3
            X.8qC r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.2ff r0 = (X.C48902ff) r0
            X.2o1 r0 = r0.A00(r7)
            if (r0 == 0) goto L_0x0022
            java.util.List r1 = r0.A09
        L_0x0082:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0022
            java.util.List r0 = X.C73723fy.A0C(r1)
            if (r0 == 0) goto L_0x0022
            java.util.Iterator r4 = r0.iterator()
        L_0x0092:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r4.next()
            X.3ZL r0 = (X.AnonymousClass3ZL) r0
            java.lang.String r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = 47
            java.lang.String r1 = X.AnonymousClass0x2.A0e(r2, r1, r0)
            r0 = 0
            int r3 = X.C175728Zm.A0G(r6, r1, r0, r0)
            int r2 = X.C86664Kz.A0L(r1, r3)
            r0 = -1
            if (r3 == r0) goto L_0x0092
            int r0 = r6.length()
            if (r2 >= r0) goto L_0x00c5
            char r1 = r6.charAt(r2)
            r0 = 32
            if (r1 == r0) goto L_0x00c5
            goto L_0x0092
        L_0x00c5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "commands"
            r1.append(r0)
            java.lang.CharSequence r0 = r6.subSequence(r3, r2)
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            X.C86644Kx.A0t(r6, r0, r3, r2)
            goto L_0x0092
        L_0x00da:
            if (r2 == 0) goto L_0x0022
            X.5Jf r0 = r5.A01
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            if (r7 != 0) goto L_0x00e3
            return
        L_0x00e3:
            X.33g r0 = r0.A00
            X.5dt r0 = r0.A02(r7)
            if (r0 == 0) goto L_0x0022
            java.util.List r1 = r0.A0P
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5O2.A00(android.text.Spannable, X.4uZ, X.4uZ):void");
    }
}
