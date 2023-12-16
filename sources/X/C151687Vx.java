package X;

/* renamed from: X.7Vx  reason: invalid class name and case insensitive filesystem */
public abstract class C151687Vx {
    public float A00 = 1.0f;
    public boolean A01 = false;

    public void A01() {
        this.A01 = false;
        this.A00 = 1.0f;
    }

    public float A00() {
        if (this.A01) {
            return (Math.abs(this.A00) / 4.0f) + 0.75f;
        }
        return 1.0f;
    }
}
