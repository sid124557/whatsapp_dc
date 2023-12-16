package X;

/* renamed from: X.0UT  reason: invalid class name */
public abstract class AnonymousClass0UT {
    public AnonymousClass0XU[] A00;
    public final AnonymousClass0XY A01;

    public abstract AnonymousClass0XY A00();

    public abstract void A05(AnonymousClass0XU r1);

    public abstract void A06(AnonymousClass0XU r1);

    public final void A01() {
        AnonymousClass0XU[] r1 = this.A00;
        if (r1 != null) {
            AnonymousClass0XU r2 = r1[0];
            AnonymousClass0XU r12 = r1[1];
            if (r12 == null) {
                r12 = this.A01.A00.A0C(2);
            }
            if (r2 == null) {
                r2 = this.A01.A00.A0C(1);
            }
            A06(AnonymousClass0XU.A02(r2, r12));
            AnonymousClass0XU r0 = this.A00[4];
            if (r0 != null) {
                A03(r0);
            }
            AnonymousClass0XU r02 = this.A00[5];
            if (r02 != null) {
                A02(r02);
            }
            AnonymousClass0XU r03 = this.A00[6];
            if (r03 != null) {
                A04(r03);
            }
        }
    }

    public void A07(AnonymousClass0XU r6, int i) {
        AnonymousClass0XU[] r4 = this.A00;
        if (r4 == null) {
            r4 = new AnonymousClass0XU[9];
            this.A00 = r4;
        }
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                char c = 1;
                char c2 = 0;
                if (i2 != 1) {
                    c2 = 2;
                    if (i2 != 2) {
                        c = 4;
                        if (i2 != 4) {
                            c2 = 8;
                            if (i2 == 8) {
                                c2 = 3;
                            } else if (i2 != 16) {
                                if (i2 == 32) {
                                    c2 = 5;
                                } else if (i2 == 64) {
                                    c2 = 6;
                                } else if (i2 == 128) {
                                    c2 = 7;
                                } else if (i2 != 256) {
                                    throw AnonymousClass000.A0G("type needs to be >= FIRST and <= LAST, type=", AnonymousClass001.A0o(), i2);
                                }
                            }
                        }
                    }
                    c2 = c;
                }
                r4[c2] = r6;
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    public AnonymousClass0UT(AnonymousClass0XY r1) {
        this.A01 = r1;
    }

    public void A02(AnonymousClass0XU r1) {
    }

    public void A03(AnonymousClass0XU r1) {
    }

    public void A04(AnonymousClass0XU r1) {
    }

    public AnonymousClass0UT() {
        this(new AnonymousClass0XY());
    }
}
