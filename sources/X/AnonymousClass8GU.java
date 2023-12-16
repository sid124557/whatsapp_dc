package X;

/* renamed from: X.8GU  reason: invalid class name */
public class AnonymousClass8GU implements C184368rg {
    public static final int A05 = Math.max(64, Math.min((int) ((C58152un.A00 / 16) / 16384), 512));
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;

    public int B97() {
        return this.A02;
    }

    public boolean Bdn(int i, boolean z) {
        int i2 = this.A04;
        if (i2 != 0) {
            int i3 = this.A00 + 1;
            this.A00 = i3;
            int i4 = this.A01 + (z ? 1 : 0);
            this.A01 = i4;
            if (i3 > i2 || i4 > this.A03) {
                this.A02 = i;
                return false;
            }
        }
        return true;
    }

    public AnonymousClass8GU(int i, int i2) {
        this.A04 = i != 1 ? i * 3072 : i2;
        this.A03 = A05 * i;
    }
}
