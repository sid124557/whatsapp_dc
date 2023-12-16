package X;

/* renamed from: X.2h4  reason: invalid class name and case insensitive filesystem */
public final class C49772h4 {
    public final C55682qk A00;
    public final AnonymousClass314 A01;
    public final C56662sM A02;
    public final AnonymousClass311 A03;
    public final AnonymousClass1VX A04;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r0 = r7.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.jid.UserJid A00(X.C95814uZ r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C27981fH
            r6 = 0
            if (r0 == 0) goto L_0x0047
            X.1fH r8 = (X.C27981fH) r8
            if (r8 == 0) goto L_0x0047
            X.1VX r2 = r7.A04
            r1 = 2479(0x9af, float:3.474E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x0016
            return r6
        L_0x0016:
            X.2sM r0 = r7.A02
            com.whatsapp.jid.PhoneUserJid r5 = r0.A02(r8)
            if (r5 != 0) goto L_0x001f
            return r6
        L_0x001f:
            X.1fH r4 = r0.A01(r5)
            X.314 r0 = r7.A01
            boolean r3 = r0.A0D(r5)
            X.311 r0 = r7.A03
            boolean r2 = r0.A0A(r8)
            r1 = 1
            if (r3 == 0) goto L_0x0036
            r7.A01(r8, r2, r1)
            return r5
        L_0x0036:
            if (r4 == 0) goto L_0x0042
            boolean r0 = r8.equals(r4)
            if (r0 != 0) goto L_0x0042
            r7.A01(r8, r2, r1)
            return r4
        L_0x0042:
            r0 = 0
            r7.A01(r8, r2, r0)
            return r6
        L_0x0047:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49772h4.A00(X.4uZ):com.whatsapp.jid.UserJid");
    }

    public final void A01(C27981fH r6, boolean z, boolean z2) {
        String str;
        if (z != z2) {
            this.A03.A08(r6, z2);
            if (z2) {
                str = "deprecating";
            } else {
                str = "reactivating";
            }
            boolean A0D = this.A01.A0D(r6);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("jid = ");
            A0o.append(r6);
            StringBuilder A032 = C55682qk.A03(this.A00, AnonymousClass000.A0X("-lid-chat-pnh-ctwa-mat", AnonymousClass000.A0l(str)), AnonymousClass000.A0b(", hasLidChat = ", A0o, A0D), true);
            A032.append("DuplicateLidThreadManager/setDuplicateFlag ");
            A032.append(str);
            C18260x0.A1R(A032, " a lid chat, chatJid=", r6);
        }
    }

    public C49772h4(C55682qk r1, AnonymousClass314 r2, C56662sM r3, AnonymousClass311 r4, AnonymousClass1VX r5) {
        C18260x0.A0f(r5, r1, r2, r3, r4);
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
