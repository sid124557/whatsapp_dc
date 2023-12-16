package X;

/* renamed from: X.873  reason: invalid class name */
public final class AnonymousClass873 implements C184888si {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C152597Zm A0A;
    public final C153157al A0B;

    public /* bridge */ /* synthetic */ C184868sg B12() {
        if (this.A07 != 0) {
            return new C1686786i(this);
        }
        return null;
    }

    public long BiG(C187648xa r19) {
        long j;
        long j2;
        int i = this.A00;
        C187648xa r11 = r19;
        if (i == 0) {
            long BBW = r11.BBW();
            this.A03 = BBW;
            this.A00 = 1;
            long j3 = this.A08 - 65307;
            if (j3 > BBW) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j4 = this.A04;
                long j5 = this.A01;
                if (j4 != j5) {
                    long BBW2 = r11.BBW();
                    C152597Zm r6 = this.A0A;
                    if (!r6.A00(r11, j5)) {
                        j = this.A04;
                        if (j == BBW2) {
                            throw AnonymousClass002.A0C("No ogg page can be found.");
                        }
                    } else {
                        r6.A01(r11, false);
                        r11.Bjy();
                        long j6 = this.A06;
                        long j7 = r6.A04;
                        long j8 = j6 - j7;
                        int i2 = r6.A01 + r6.A00;
                        if (0 > j8 || j8 >= 72000) {
                            int i3 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
                            if (i3 < 0) {
                                this.A01 = BBW2;
                                this.A02 = j7;
                            } else {
                                this.A04 = r11.BBW() + ((long) i2);
                                this.A05 = j7;
                            }
                            long j9 = this.A01;
                            j = this.A04;
                            long j10 = j9 - j;
                            if (j10 < 100000) {
                                this.A01 = j;
                            } else {
                                long j11 = (long) i2;
                                if (i3 <= 0) {
                                    j2 = 2;
                                } else {
                                    j2 = 1;
                                }
                                j = Math.max(j, AnonymousClass6C8.A0P(j9, (r11.BBW() - (j11 * j2)) + ((j8 * j10) / (this.A02 - this.A05))));
                            }
                        }
                    }
                    if (j != -1) {
                        return j;
                    }
                }
                this.A00 = 3;
            } else if (i != 3) {
                return -1;
            }
            while (true) {
                C152597Zm r5 = this.A0A;
                r5.A00(r11, -1);
                r5.A01(r11, false);
                if (r5.A04 > this.A06) {
                    r11.Bjy();
                    this.A00 = 4;
                    return -(this.A05 + 2);
                }
                r11.BpP(r5.A01 + r5.A00);
                this.A04 = r11.BBW();
                this.A05 = r5.A04;
            }
        }
        C152597Zm r8 = this.A0A;
        r8.A03 = 0;
        r8.A04 = 0;
        r8.A02 = 0;
        r8.A01 = 0;
        r8.A00 = 0;
        if (!r8.A00(r11, -1)) {
            throw AnonymousClass6CA.A0M();
        }
        do {
            r8.A01(r11, false);
            r11.BpP(r8.A01 + r8.A00);
            if ((r8.A03 & 4) == 4 || !r8.A00(r11, -1) || r11.BBW() >= this.A08) {
                this.A07 = r8.A04;
                this.A00 = 4;
            }
            r8.A01(r11, false);
            r11.BpP(r8.A01 + r8.A00);
            break;
        } while (r11.BBW() >= this.A08);
        this.A07 = r8.A04;
        this.A00 = 4;
        return this.A03;
    }

    public void Bpw(long j) {
        long j2 = this.A07;
        this.A06 = Math.max(0, AnonymousClass6C8.A0P(j2, j));
        this.A00 = 2;
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0;
        this.A02 = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r9 <= r7) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass873(X.C153157al r6, long r7, long r9, long r11, long r13, boolean r15) {
        /*
            r5 = this;
            r5.<init>()
            r3 = 0
            r2 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x000f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            X.C161487pm.A03(r0)
            r5.A0B = r6
            r5.A09 = r7
            r5.A08 = r9
            long r9 = r9 - r7
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            if (r15 != 0) goto L_0x002a
            r5.A00 = r2
        L_0x0022:
            X.7Zm r0 = new X.7Zm
            r0.<init>()
            r5.A0A = r0
            return
        L_0x002a:
            r5.A07 = r13
            r0 = 4
            r5.A00 = r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass873.<init>(X.7al, long, long, long, long, boolean):void");
    }
}
