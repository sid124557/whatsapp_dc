package X;

/* renamed from: X.9ZH  reason: invalid class name */
public class AnonymousClass9ZH implements C185288tO, C202019lF {
    public float A00 = 1.0f;
    public C185568tt A01;
    public C1680583y A02;
    public C1680583y A03;
    public boolean A04;
    public final C157207hv A05;
    public final C194439Sw A06 = new C194439Sw();

    public synchronized void release() {
        this.A02 = null;
        this.A03 = null;
    }

    public final C1680583y A00() {
        if (this.A04) {
            if (this.A02 == null) {
                C1680583y r1 = new C1680583y(this.A05, new C126196Mv(), new C126176Mt(), true);
                this.A02 = r1;
                this.A01.AxO(r1);
            }
            return this.A02;
        }
        if (this.A03 == null) {
            C1680583y r12 = new C1680583y(this.A05, new C126196Mv(), new C126176Mt(), true);
            this.A03 = r12;
            this.A01.AxO(r12);
        }
        return this.A03;
    }

    public AnonymousClass9ZH(C157207hv r2) {
        this.A05 = r2;
    }

    public void B1c() {
    }

    public void AxN(C185558ts r1) {
    }

    public void BFr(C185568tt r1) {
        this.A01 = r1;
    }
}
