package X;

import java.util.List;

/* renamed from: X.9ZF  reason: invalid class name */
public class AnonymousClass9ZF implements C185288tO {
    public C185568tt A00;
    public C1680183u A01;
    public final C157207hv A02;
    public final C194439Sw A03 = new C194439Sw();
    public volatile C202009lE A04;
    public volatile boolean A05;

    static {
        new Object();
    }

    public void A01(AnonymousClass7Ow r4) {
        C185558ts B6O = this.A00.B6O();
        if (this.A01 == null) {
            C1680183u r0 = new C1680183u(this.A02);
            this.A01 = r0;
            r0.AxN(B6O);
        }
        this.A01.A01(B6O, r4, this.A03.A00);
    }

    public void A02(Object obj) {
        C194439Sw r5 = this.A03;
        List list = r5.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C186198uu r1 = (C186198uu) list.get(i);
            if (r1.contains(obj) || r1.equals(obj)) {
                r5.A02(r1);
                if (r1 instanceof C185288tO) {
                    C185288tO r12 = (C185288tO) r1;
                    this.A00.B1d(r12);
                    r12.release();
                    return;
                }
                return;
            }
        }
    }

    public void AxN(C185558ts r2) {
        C1680183u r0 = this.A01;
        if (r0 != null) {
            r0.AxN(r2);
        }
    }

    public void B1c() {
        C1680183u r0 = this.A01;
        if (r0 != null) {
            r0.B1c();
        }
    }

    public void release() {
        C194439Sw r0 = this.A03;
        List list = r0.A00;
        r0.A00();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C186198uu r1 = (C186198uu) list.get(i);
            if (r1 instanceof C185288tO) {
                ((C185288tO) r1).release();
            }
        }
    }

    public AnonymousClass9ZF(C157207hv r2) {
        this.A02 = r2;
    }

    public void A00(C185568tt r8, C186198uu r9) {
        Object B9B = r9.B9B();
        C194439Sw r5 = this.A03;
        List list = r5.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            C186198uu r1 = (C186198uu) list.get(i);
            if (!r1.contains(B9B) && !r1.equals(B9B)) {
                i++;
            } else {
                return;
            }
        }
        r5.A01(r9);
        if (r9 instanceof C185288tO) {
            r8.AxO((C185288tO) r9);
        }
    }

    public void BFr(C185568tt r1) {
        this.A00 = r1;
    }
}
