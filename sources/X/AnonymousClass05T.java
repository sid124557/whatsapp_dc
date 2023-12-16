package X;

import java.util.List;

/* renamed from: X.05T  reason: invalid class name */
public class AnonymousClass05T extends C07830ct {
    public void A0C() {
        this.A07 = null;
        this.A05.A01();
    }

    public void A0A() {
        List list;
        C07830ct r0;
        AnonymousClass0R7 r6 = this.A03;
        if (r6 instanceof AnonymousClass05N) {
            C07820cs r2 = this.A05;
            r2.A09 = true;
            AnonymousClass05N r62 = (AnonymousClass05N) r6;
            int i = r62.A00;
            boolean z = r62.A02;
            int i2 = 0;
            if (i == 0) {
                r2.A04 = AnonymousClass0G1.LEFT;
                while (i2 < r62.A00) {
                    AnonymousClass0R7 r1 = r62.A01[i2];
                    if (z || r1.A0N != 8) {
                        C07820cs r12 = r1.A0c.A05;
                        C07830ct.A07(r2, r12, r12.A07);
                    }
                    i2++;
                }
            } else if (i != 1) {
                if (i == 2) {
                    r2.A04 = AnonymousClass0G1.TOP;
                    while (i2 < r62.A00) {
                        AnonymousClass0R7 r13 = r62.A01[i2];
                        if (z || r13.A0N != 8) {
                            C07820cs r14 = r13.A0d.A05;
                            C07830ct.A07(r2, r14, r14.A07);
                        }
                        i2++;
                    }
                } else if (i == 3) {
                    r2.A04 = AnonymousClass0G1.BOTTOM;
                    while (i2 < r62.A00) {
                        AnonymousClass0R7 r15 = r62.A01[i2];
                        if (z || r15.A0N != 8) {
                            C07820cs r16 = r15.A0d.A04;
                            C07830ct.A07(r2, r16, r16.A07);
                        }
                        i2++;
                    }
                } else {
                    return;
                }
                C07820cs r02 = this.A03.A0d.A05;
                list = r2.A07;
                C07830ct.A07(r02, r2, list);
                r0 = this.A03.A0d;
                C07830ct.A07(r0.A04, r2, list);
            } else {
                r2.A04 = AnonymousClass0G1.RIGHT;
                while (i2 < r62.A00) {
                    AnonymousClass0R7 r17 = r62.A01[i2];
                    if (z || r17.A0N != 8) {
                        C07820cs r18 = r17.A0c.A04;
                        C07830ct.A07(r2, r18, r18.A07);
                    }
                    i2++;
                }
            }
            C07820cs r03 = this.A03.A0c.A05;
            list = r2.A07;
            C07830ct.A07(r03, r2, list);
            r0 = this.A03.A0c;
            C07830ct.A07(r0.A04, r2, list);
        }
    }

    public void A0B() {
        AnonymousClass0R7 r2 = this.A03;
        if (r2 instanceof AnonymousClass05N) {
            int i = ((AnonymousClass05N) r2).A00;
            if (i == 0 || i == 1) {
                r2.A0P = this.A05.A02;
            } else {
                r2.A0Q = this.A05.A02;
            }
        }
    }

    public boolean A0F() {
        return false;
    }

    public void BrU(C15710ro r9) {
        AnonymousClass05N r7 = (AnonymousClass05N) this.A03;
        int i = r7.A00;
        C07820cs r5 = this.A05;
        int i2 = 0;
        int i3 = -1;
        for (C07820cs r0 : r5.A08) {
            int i4 = r0.A02;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            r5.A02(i3 + r7.A01);
        } else {
            r5.A02(i2 + r7.A01);
        }
    }

    public AnonymousClass05T(AnonymousClass0R7 r1) {
        super(r1);
    }
}
