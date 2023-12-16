package X;

/* renamed from: X.0Te  reason: invalid class name and case insensitive filesystem */
public class C05400Te {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public C05400Te(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
    }

    public String toString() {
        StringBuilder A0p = AnonymousClass001.A0p();
        A0p.append(this.A01);
        A0p.append(" ");
        A0p.append(this.A02);
        A0p.append(" ");
        A0p.append(this.A03);
        A0p.append(" ");
        A0p.append(this.A00);
        return AnonymousClass000.A0f(A0p);
    }

    public C05400Te(C05400Te r2) {
        this.A01 = r2.A01;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A00 = r2.A00;
    }
}
