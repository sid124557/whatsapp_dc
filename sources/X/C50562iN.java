package X;

/* renamed from: X.2iN  reason: invalid class name and case insensitive filesystem */
public class C50562iN {
    public final C55682qk A00;
    public final C56972sr A01;
    public final AnonymousClass36E A02;
    public final C56612sH A03;
    public final C52852m9 A04;
    public final C28871hu A05;
    public final C66543Lv A06;
    public final C55672qj A07;
    public final C66483Lp A08;
    public final C49502gd A09;
    public final C55332qB A0A;
    public final C620333f A0B;
    public final AnonymousClass33Y A0C;
    public final C49092fy A0D;
    public final C55892r5 A0E;
    public final C619933b A0F;
    public final C55832qz A0G;
    public final C183538qC A0H;

    public void A00(C30331mH r4) {
        this.A04.A01(new C71343bx(this, 8, r4), 53);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0.A02 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r13 == 8) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        if (r13 == 9) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b7, code lost:
        if (r1 == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C30331mH r12, int r13) {
        /*
            r11 = this;
            X.2z0 r0 = r12.A1J
            X.4uZ r7 = r0.A00
            X.2sr r3 = r11.A01
            boolean r0 = X.C627636p.A0P(r3, r12)
            r6 = 0
            if (r0 != 0) goto L_0x0019
            X.2z0 r0 = r12.A1v()
            X.C626936e.A06(r0)
            boolean r0 = r0.A02
            r1 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            X.33f r5 = r11.A0B
            byte r0 = r12.A1I
            java.util.List r8 = r5.A0Z
            java.lang.Byte r2 = java.lang.Byte.valueOf(r0)
            boolean r0 = r8.contains(r2)
            if (r0 == 0) goto L_0x002d
            r0 = 1
            if (r1 != 0) goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r7 == 0) goto L_0x0038
            if (r0 != 0) goto L_0x0039
            boolean r0 = r5.A0I(r12)
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            return
        L_0x0039:
            boolean r4 = X.AnonymousClass31T.A01(r12)
            boolean r0 = X.C627636p.A0P(r3, r12)
            if (r0 != 0) goto L_0x0056
            X.2z0 r0 = r12.A1v()
            X.C626936e.A06(r0)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x009b
            int r1 = r12.A0D
            r0 = 17
            if (r1 != r0) goto L_0x009b
            if (r4 != 0) goto L_0x009b
        L_0x0056:
            long r0 = r12.A1L
            boolean r2 = r8.contains(r2)
            if (r2 == 0) goto L_0x0063
            X.2sm r2 = r5.A07
            r2.A0L(r7, r0)
        L_0x0063:
            X.2qz r1 = r11.A0G
            X.2z0 r0 = r12.A1v()
            X.34x r2 = r1.A05(r0)
            if (r2 == 0) goto L_0x0038
            boolean r0 = r12 instanceof X.C30571mf
            if (r0 != 0) goto L_0x007b
            boolean r0 = r12 instanceof X.C30591mh
            if (r0 != 0) goto L_0x007b
            boolean r0 = r12 instanceof X.C30601mi
            if (r0 == 0) goto L_0x0038
        L_0x007b:
            X.2Lw r1 = new X.2Lw
            r1.<init>(r2, r12)
            X.2ss r0 = r5.A08
            X.31A r0 = r0.A0A(r7, r6)
            if (r0 != 0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/last/message/no chat for "
            X.C18260x0.A1S(r1, r0, r7)
        L_0x0092:
            X.1hu r0 = r11.A05
            r0.A0A(r7, r6)
            return
        L_0x0098:
            r0.A0f = r1
            goto L_0x0092
        L_0x009b:
            r0 = 1
            if (r13 == r0) goto L_0x00a3
            r0 = 8
            r3 = 0
            if (r13 != r0) goto L_0x00a4
        L_0x00a3:
            r3 = 1
        L_0x00a4:
            r0 = 2
            if (r13 == r0) goto L_0x00ac
            r0 = 9
            r1 = 0
            if (r13 != r0) goto L_0x00ad
        L_0x00ac:
            r1 = 1
        L_0x00ad:
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1U(r13, r0)
            if (r4 == 0) goto L_0x00e8
            if (r0 != 0) goto L_0x00b9
            r10 = -1
            if (r1 != 0) goto L_0x00ba
        L_0x00b9:
            r10 = 0
        L_0x00ba:
            long r3 = r12.A1L
            boolean r0 = r8.contains(r2)
            if (r0 == 0) goto L_0x0063
            X.2sm r9 = r5.A07
            X.2ss r0 = r9.A02
            X.31A r8 = r0.A0A(r7, r6)
            if (r8 == 0) goto L_0x0063
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0063
            long r1 = r8.A0M
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00da
            r8.A0M = r3
        L_0x00da:
            int r0 = r8.A07
            int r0 = r0 + r10
            r8.A07 = r0
            if (r0 >= 0) goto L_0x00e3
            r8.A07 = r6
        L_0x00e3:
            r9.A0H(r8)
            goto L_0x0063
        L_0x00e8:
            if (r3 != 0) goto L_0x00ec
            if (r0 == 0) goto L_0x00b9
        L_0x00ec:
            r10 = 1
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50562iN.A01(X.1mH, int):void");
    }

    public C50562iN(C55682qk r2, C56972sr r3, AnonymousClass36E r4, C56612sH r5, C52852m9 r6, C28871hu r7, C66543Lv r8, C55672qj r9, C66483Lp r10, C49502gd r11, C55332qB r12, C620333f r13, AnonymousClass33Y r14, C49092fy r15, C55892r5 r16, C619933b r17, C55832qz r18, C183538qC r19) {
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A0C = r14;
        this.A05 = r7;
        this.A02 = r4;
        this.A06 = r8;
        this.A0G = r18;
        this.A04 = r6;
        this.A0D = r15;
        this.A0H = r19;
        this.A0E = r16;
        this.A0B = r13;
        this.A0F = r17;
        this.A07 = r9;
        this.A09 = r11;
        this.A0A = r12;
        this.A08 = r10;
    }
}
