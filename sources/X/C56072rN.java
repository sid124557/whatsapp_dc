package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2rN  reason: invalid class name and case insensitive filesystem */
public class C56072rN {
    public final C56972sr A00;
    public final C56982ss A01;
    public final C56892sj A02;
    public final AnonymousClass1VX A03;
    public final C52472lX A04;

    public boolean A02(int i) {
        if (i != 6 || !A01() || !this.A03.A0Y(C58422vE.A02, 5021)) {
            return false;
        }
        return true;
    }

    public boolean A01() {
        AnonymousClass1VX r3 = this.A03;
        C58422vE r2 = C58422vE.A02;
        boolean A0Y = r3.A0Y(r2, 982);
        if (!this.A00.A0Y()) {
            return A0Y;
        }
        if (!A0Y || !r3.A0Y(r2, 2695)) {
            return false;
        }
        return true;
    }

    public C56072rN(C56972sr r1, C56982ss r2, C56892sj r3, AnonymousClass1VX r4, C52472lX r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r3.A01.A06(r4) != 2) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.C27991fJ r4) {
        /*
            r3 = this;
            boolean r0 = r3.A06(r4)
            if (r0 == 0) goto L_0x0008
            r1 = 4
        L_0x0007:
            return r1
        L_0x0008:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x001a
            if (r4 == 0) goto L_0x002d
            X.2ss r0 = r3.A01
            int r2 = r0.A06(r4)
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r1 = 2
            if (r0 != 0) goto L_0x0007
            if (r4 == 0) goto L_0x002d
            X.2ss r0 = r3.A01
            int r0 = r0.A06(r4)
            boolean r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x002d
            return r1
        L_0x002d:
            boolean r0 = r3.A05(r4)
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r1 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56072rN.A00(X.1fJ):int");
    }

    public boolean A03(int i) {
        if (!A01() || i != 1) {
            return false;
        }
        return true;
    }

    public boolean A04(AnonymousClass3ZH r5, C95814uZ r6) {
        int i;
        if (r5.A0U() && C627336j.A0K(r6)) {
            C52472lX r1 = this.A04;
            if (r1.A01(r5) || r1.A00(r5) || (i = r5.A03) == 1 || i == 2 || (r5.A0e && !this.A02.A0D((GroupJid) r6))) {
                return true;
            }
        }
        return false;
    }

    public boolean A05(C27991fJ r4) {
        if (!A01() || r4 == null || this.A01.A06(r4) != 3) {
            return false;
        }
        return true;
    }

    public boolean A06(C27991fJ r3) {
        if (!A01() || r3 == null || this.A01.A06(r3) != 1) {
            return false;
        }
        return true;
    }
}
