package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.3UK  reason: invalid class name */
public final class AnonymousClass3UK implements C84624Db {
    public final C64773Ex A00;
    public final C56982ss A01;
    public final C56892sj A02;
    public final AnonymousClass1VX A03;
    public final C66493Lq A04;
    public final C52472lX A05;
    public final C56072rN A06;

    public boolean BIU(C624134x r3) {
        C162457s7.A0J(r3, 0);
        return AnonymousClass2z0.A0D(r3) && A00(r3);
    }

    public boolean BIi(C624134x r6) {
        C162457s7.A0J(r6, 0);
        GroupJid A012 = AnonymousClass32V.A01(r6.A1J.A00);
        if (A012 != null) {
            if (!A01(r6)) {
                AnonymousClass3ZH A07 = this.A00.A07(A012);
                if (A07 != null && this.A06.A04(A07, A012)) {
                    return false;
                }
            }
        }
        return A00(r6);
    }

    public final boolean A00(C624134x r4) {
        GroupJid A012 = AnonymousClass32V.A01(r4.A1J.A00);
        if (A012 == null) {
            return true;
        }
        if ((this.A00.A07(A012) == null || !this.A05.A02(A012)) && this.A02.A0C(A012)) {
            return true;
        }
        return false;
    }

    public AnonymousClass3UK(C64773Ex r1, C56982ss r2, C56892sj r3, AnonymousClass1VX r4, C66493Lq r5, C52472lX r6, C56072rN r7) {
        C18260x0.A0f(r4, r2, r1, r7, r6);
        C18260x0.A0U(r5, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r2.A02(r3) != 1) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r5.A1r(16) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C624134x r5) {
        /*
            r4 = this;
            X.C18300x5.A1I(r5)
            X.2z0 r0 = r5.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.GroupJid r2 = X.AnonymousClass32V.A01(r0)
            X.2ss r0 = r4.A01
            int r1 = r0.A06(r2)
            r0 = 3
            if (r1 != r0) goto L_0x003d
            boolean r0 = r5.A1n()
            if (r0 == 0) goto L_0x003d
            if (r2 == 0) goto L_0x003f
            X.3Ex r0 = r4.A00
            X.3ZH r3 = r0.A07(r2)
            if (r3 == 0) goto L_0x003f
            X.3Lq r2 = r4.A04
            X.2lX r0 = r2.A0w
            boolean r0 = r0.A00(r3)
            r1 = 1
            if (r0 != 0) goto L_0x0035
            int r0 = r2.A02(r3)
            if (r0 != r1) goto L_0x003f
        L_0x0035:
            r0 = 16
            boolean r0 = r5.A1r(r0)
            if (r0 != 0) goto L_0x003f
        L_0x003d:
            r0 = 0
        L_0x003e:
            return r0
        L_0x003f:
            X.1VX r2 = r4.A03
            r1 = 5141(0x1415, float:7.204E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r1 = r2.A0Y(r0, r1)
            r0 = 1
            if (r1 != 0) goto L_0x003e
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UK.A01(X.34x):boolean");
    }
}
