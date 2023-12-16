package X;

/* renamed from: X.83v  reason: invalid class name and case insensitive filesystem */
public class C1680283v implements C185288tO {
    public C185558ts A00;
    public C185568tt A01;
    public C1680583y A02;
    public C1680183u A03;
    public final C157207hv A04 = C157207hv.A01;
    public final C157207hv A05;

    public final void release() {
        this.A01 = null;
    }

    public final void AxN(C185558ts r3) {
        C185558ts r0 = this.A00;
        if (!(r0 == null || r0 == r3)) {
            this.A04.A00(C142216wp.A02);
        }
        this.A00 = r3;
    }

    public final void B1c() {
        C1680583y r0 = this.A02;
        if (r0 != null) {
            r0.B1c();
            this.A02 = null;
        }
        this.A00 = null;
        C1680183u r02 = this.A03;
        if (r02 != null) {
            r02.B1c();
            this.A03 = null;
        }
    }

    public final void BFr(C185568tt r3) {
        C185568tt r0 = this.A01;
        if (!(r0 == null || r0 == r3)) {
            this.A04.A00(C142216wp.A04);
        }
        this.A01 = r3;
    }

    public C1680283v(C157207hv r2) {
        this.A05 = r2;
    }

    public C1680283v() {
    }
}
