package X;

/* renamed from: X.7bE  reason: invalid class name and case insensitive filesystem */
public abstract class C153387bE {
    public int A00;
    public final int A01;

    public void A00() {
        C138356qD r2 = (C138356qD) this;
        if (!r2.A05) {
            r2.A05 = true;
            C56852sf r0 = r2.A04;
            if (r0 != null) {
                r2.A02 = r0.A06();
            }
            r2.A0B.A02();
        }
    }

    public void A01() {
        C138356qD r1 = (C138356qD) this;
        r1.A0D.A00();
        r1.A0C.A00();
        r1.A0B.A00();
        r1.A0A.A00();
        r1.A00 = 4;
    }

    public void A02() {
        C138356qD r1 = (C138356qD) this;
        if (!r1.A06) {
            r1.A0B.A02();
        }
    }

    public void A03(int i) {
        int i2;
        C138356qD r5 = (C138356qD) this;
        C104965Ta r8 = r5.A0D;
        r8.A00();
        r5.A0C.A00();
        C104965Ta r7 = r5.A0B;
        r7.A00();
        C104965Ta r4 = r5.A0A;
        r4.A00();
        r5.A03 = (long) i;
        C134156iX r6 = new C134156iX();
        C56852sf r2 = r5.A04;
        if (r2 != null) {
            r6.A09 = Long.valueOf(r2.A04());
            r6.A02 = Double.valueOf((double) r2.A05());
            r6.A0A = AnonymousClass0x9.A0n((long) r5.A04.A04, 1);
        }
        r6.A01 = Double.valueOf((double) r5.A02);
        r6.A07 = Long.valueOf(r7.A00);
        r6.A0D = Long.valueOf(r4.A00);
        r6.A0C = AnonymousClass0x9.A0m(r5.A01);
        long j = r8.A00;
        r6.A08 = Long.valueOf(j);
        int i3 = r5.A00;
        if (i3 != 0) {
            if (i3 != 1) {
                int i4 = 3;
                if (i3 != 2) {
                    i4 = 4;
                    if (i3 != 3) {
                        if (i3 == 5) {
                            i4 = 6;
                        }
                    }
                }
                i2 = Integer.valueOf(i4);
            } else {
                i2 = 2;
            }
            r6.A06 = i2;
            r6.A0B = Long.valueOf(r5.A03);
            r6.A00 = Boolean.valueOf(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1))));
            r6.A05 = Integer.valueOf(r5.A07);
            AnonymousClass1nB r42 = r5.A0E;
            r6.A0E = AnonymousClass0x9.A0m(r42.A0B);
            r6.A03 = Double.valueOf((double) r42.A00);
            r6.A04 = Integer.valueOf(AnonymousClass29K.A01(r5.A08, r42, r5.A0F, r5.A0G));
            r5.A09.BhD(r6);
        }
        i2 = 1;
        r6.A06 = i2;
        r6.A0B = Long.valueOf(r5.A03);
        r6.A00 = Boolean.valueOf(AnonymousClass001.A1W((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        r6.A05 = Integer.valueOf(r5.A07);
        AnonymousClass1nB r422 = r5.A0E;
        r6.A0E = AnonymousClass0x9.A0m(r422.A0B);
        r6.A03 = Double.valueOf((double) r422.A00);
        r6.A04 = Integer.valueOf(AnonymousClass29K.A01(r5.A08, r422, r5.A0F, r5.A0G));
        r5.A09.BhD(r6);
    }

    public void A04(Integer num, boolean z) {
        ((C138356qD) this).A0A.A00();
    }

    public void A05(boolean z, int i) {
        int i2;
        C138356qD r2 = (C138356qD) this;
        if (i == 3) {
            C104965Ta r3 = r2.A0B;
            if (r3.A02) {
                r3.A00();
                r2.A06 = true;
            }
            C104965Ta r0 = r2.A0D;
            if (z) {
                r0.A02();
                r2.A0C.A00();
                r2.A00 = 1;
            } else {
                r0.A00();
                r2.A0C.A02();
                r2.A00 = 2;
            }
            r2.A0A.A00();
            return;
        }
        if (i == 4) {
            r2.A0D.A00();
            r2.A0A.A00();
            r2.A0C.A00();
            i2 = 5;
        } else if (i == 2) {
            r2.A0D.A00();
            if (r2.A06) {
                C104965Ta r1 = r2.A0A;
                if (!r1.A02 && z) {
                    r1.A02();
                    synchronized (r2) {
                        r2.A01++;
                    }
                }
            }
            r2.A0C.A00();
            i2 = 3;
        } else {
            return;
        }
        r2.A00 = i2;
    }

    public C153387bE(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
