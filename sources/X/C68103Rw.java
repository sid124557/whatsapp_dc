package X;

/* renamed from: X.3Rw  reason: invalid class name and case insensitive filesystem */
public final class C68103Rw implements C84094Az {
    public final C64773Ex A00;
    public final C56982ss A01;
    public final C56892sj A02;
    public final C52472lX A03;

    public boolean BIP(C624134x r6) {
        C27991fJ A022 = AnonymousClass2z0.A02(r6);
        if (A022 == null) {
            return true;
        }
        int A06 = this.A01.A06(A022);
        if (A06 == 0 || A06 == 6 || A06 == 2) {
            AnonymousClass3ZH A07 = this.A00.A07(A022);
            if (!(A07 == null || A07.A0s || A07.A03 == 1)) {
                C56892sj r0 = this.A02;
                boolean A0C = r0.A0C(A022);
                boolean A0D = r0.A0D(A022);
                if (!A0C) {
                    return false;
                }
                if (A0D || !A07.A14) {
                    return true;
                }
                return false;
            }
        } else if (A06 != 3) {
            C18260x0.A0y("GroupPinInChatRestriction/isPinnable Unhandled group type ", AnonymousClass001.A0o(), A06);
        } else {
            C52472lX r1 = this.A03;
            if (!r1.A00(r1.A00.A0A(A022))) {
                return this.A02.A0D(A022);
            }
        }
        return false;
    }

    public C68103Rw(C64773Ex r1, C56982ss r2, C56892sj r3, C52472lX r4) {
        C18260x0.A0c(r2, r1, r4, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
