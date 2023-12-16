package X;

/* renamed from: X.0Ps  reason: invalid class name */
public class AnonymousClass0Ps {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02;
    public float A03;
    public boolean A04 = false;
    public final /* synthetic */ AnonymousClass0YF A05;

    public AnonymousClass0Ps(AnonymousClass0YF r6, float f, float f2, float f3, float f4) {
        this.A05 = r6;
        this.A02 = f;
        this.A03 = f2;
        double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
        if (sqrt != 0.0d) {
            this.A00 = (float) (((double) f3) / sqrt);
            this.A01 = (float) (((double) f4) / sqrt);
        }
    }

    public void A00(float f, float f2) {
        float f3 = f - this.A02;
        float f4 = f2 - this.A03;
        double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
        if (sqrt != 0.0d) {
            f3 = (float) (((double) f3) / sqrt);
            f4 = (float) (((double) f4) / sqrt);
        }
        float f5 = this.A00;
        if (f3 == (-f5) && f4 == (-this.A01)) {
            this.A04 = true;
            this.A00 = -f4;
        } else {
            this.A00 = f5 + f3;
            f3 = this.A01 + f4;
        }
        this.A01 = f3;
    }

    public void A01(AnonymousClass0Ps r5) {
        float f = r5.A00;
        float f2 = this.A00;
        if (f == (-f2)) {
            float f3 = r5.A01;
            if (f3 == (-this.A01)) {
                this.A04 = true;
                this.A00 = -f3;
                this.A01 = r5.A00;
                return;
            }
        }
        this.A00 = f2 + f;
        this.A01 += r5.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("(");
        A0o.append(this.A02);
        A0o.append(",");
        A0o.append(this.A03);
        AnonymousClass001.A1L(A0o);
        A0o.append(this.A00);
        A0o.append(",");
        A0o.append(this.A01);
        return AnonymousClass000.A0e(A0o);
    }
}
