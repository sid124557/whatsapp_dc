package X;

import android.graphics.Insets;

/* renamed from: X.0XU  reason: invalid class name */
public final class AnonymousClass0XU {
    public static final AnonymousClass0XU A04 = new AnonymousClass0XU(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && AnonymousClass0XU.class == obj.getClass()) {
                AnonymousClass0XU r5 = (AnonymousClass0XU) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass0XU A00(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return A04;
        }
        return new AnonymousClass0XU(i, i2, i3, i4);
    }

    public static AnonymousClass0XU A01(Insets insets) {
        return A00(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static AnonymousClass0XU A02(AnonymousClass0XU r5, AnonymousClass0XU r6) {
        return A00(Math.max(r5.A01, r6.A01), Math.max(r5.A03, r6.A03), Math.max(r5.A02, r6.A02), Math.max(r5.A00, r6.A00));
    }

    public Insets A03() {
        return C02730Hj.A00(this.A01, this.A03, this.A02, this.A00);
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public AnonymousClass0XU(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Insets{left=");
        A0o.append(this.A01);
        A0o.append(", top=");
        A0o.append(this.A03);
        A0o.append(", right=");
        A0o.append(this.A02);
        A0o.append(", bottom=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }
}
