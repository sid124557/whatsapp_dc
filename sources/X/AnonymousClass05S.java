package X;

import java.util.List;

/* renamed from: X.05S  reason: invalid class name */
public class AnonymousClass05S extends C07830ct {
    public void A0A() {
        List list;
        C07830ct r0;
        AnonymousClass0R7 r6 = this.A03;
        AnonymousClass05K r02 = (AnonymousClass05K) r6;
        int i = r02.A02;
        int i2 = r02.A03;
        int i3 = r02.A01;
        C07820cs r2 = this.A05;
        if (i3 == 1) {
            if (i != -1) {
                r2.A08.add(r6.A0Z.A0c.A05);
                C07820cs.A00(this.A03.A0Z.A0c.A05, r2);
            } else if (i2 != -1) {
                r2.A08.add(r6.A0Z.A0c.A04);
                C07820cs.A00(this.A03.A0Z.A0c.A04, r2);
                i = -i2;
            } else {
                r2.A09 = true;
                r2.A08.add(r6.A0Z.A0c.A04);
                C07820cs.A00(this.A03.A0Z.A0c.A04, r2);
                C07820cs r03 = this.A03.A0c.A05;
                list = r2.A07;
                C07830ct.A07(r03, r2, list);
                r0 = this.A03.A0c;
            }
            r2.A00 = i;
            C07820cs r032 = this.A03.A0c.A05;
            list = r2.A07;
            C07830ct.A07(r032, r2, list);
            r0 = this.A03.A0c;
        } else {
            if (i != -1) {
                r2.A08.add(r6.A0Z.A0d.A05);
                C07820cs.A00(this.A03.A0Z.A0d.A05, r2);
            } else if (i2 != -1) {
                r2.A08.add(r6.A0Z.A0d.A04);
                C07820cs.A00(this.A03.A0Z.A0d.A04, r2);
                i = -i2;
            } else {
                r2.A09 = true;
                r2.A08.add(r6.A0Z.A0d.A04);
                C07820cs.A00(this.A03.A0Z.A0d.A04, r2);
                C07820cs r04 = this.A03.A0d.A05;
                list = r2.A07;
                C07830ct.A07(r04, r2, list);
                r0 = this.A03.A0d;
            }
            r2.A00 = i;
            C07820cs r042 = this.A03.A0d.A05;
            list = r2.A07;
            C07830ct.A07(r042, r2, list);
            r0 = this.A03.A0d;
        }
        C07830ct.A07(r0.A04, r2, list);
    }

    public void A0B() {
        AnonymousClass0R7 r3 = this.A03;
        int i = ((AnonymousClass05K) r3).A01;
        int i2 = this.A05.A02;
        if (i == 1) {
            r3.A0P = i2;
        } else {
            r3.A0Q = i2;
        }
    }

    public void A0C() {
        this.A05.A01();
    }

    public boolean A0F() {
        return false;
    }

    public void BrU(C15710ro r5) {
        C07820cs r3 = this.A05;
        if (r3.A0A && !r3.A0B) {
            r3.A02(AnonymousClass001.A06((float) ((C07820cs) r3.A08.get(0)).A02, ((AnonymousClass05K) this.A03).A00));
        }
    }

    public AnonymousClass05S(AnonymousClass0R7 r2) {
        super(r2);
        r2.A0c.A0C();
        r2.A0d.A0C();
        this.A01 = ((AnonymousClass05K) r2).A01;
    }
}
