package X;

/* renamed from: X.83t  reason: invalid class name and case insensitive filesystem */
public class C1680083t implements C185288tO {
    public C185558ts A00;
    public C185568tt A01;
    public C1680283v A02;
    public final C157207hv A03;
    public final C180458l6 A04;
    public final AnonymousClass7AW A05;

    public void B1c() {
        this.A00 = null;
        C180458l6 r1 = this.A04;
        if (r1 instanceof C185288tO) {
            ((C185288tO) r1).B1c();
        }
        C1680283v r0 = this.A02;
        if (r0 != null) {
            r0.B1c();
            this.A02.A01 = null;
            this.A02 = null;
        }
    }

    public void release() {
        this.A01 = null;
        C180458l6 r1 = this.A04;
        if (r1 instanceof C185288tO) {
            ((C185288tO) r1).release();
        }
    }

    public void AxN(C185558ts r3) {
        this.A00 = r3;
        C180458l6 r1 = this.A04;
        if (r1 instanceof C185288tO) {
            ((C185288tO) r1).AxN(r3);
        }
    }

    public void BFr(C185568tt r3) {
        this.A01 = r3;
        C180458l6 r1 = this.A04;
        if (r1 instanceof C185288tO) {
            ((C185288tO) r1).BFr(r3);
        }
    }

    public C1680083t(C157207hv r2, C180458l6 r3) {
        this.A03 = r2;
        this.A05 = new AnonymousClass7AW(r2);
        this.A04 = r3;
    }
}
