package X;

import java.util.Random;

/* renamed from: X.5ZC  reason: invalid class name */
public class AnonymousClass5ZC {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Random A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass5ZC r5 = (AnonymousClass5ZC) obj;
            return this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A05 == r5.A05;
        }
        return false;
    }

    public boolean A00() {
        int i = this.A01;
        if (i <= 0 || this.A04.nextInt(i) != 0) {
            return false;
        }
        return true;
    }

    public boolean A01(Object obj) {
        if (obj == null) {
            int i = this.A01;
            if (i <= 0 || this.A04.nextInt(i) != 0) {
                return false;
            }
        } else if (obj.hashCode() % this.A01 == 0) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A02 * 31) + this.A00) * 31) + this.A01) * 31) + this.A03) * 31) + (this.A05 ? 1 : 0);
    }

    public AnonymousClass5ZC(int i, int i2, int i3, int i4, boolean z) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A05 = z;
        this.A04 = new Random();
    }

    public AnonymousClass5ZC(int i, int i2) {
        this(1, i, i, i2, true);
    }

    public AnonymousClass5ZC(int i, int i2, int i3, boolean z) {
        this(i, i2, i2, i3, z);
    }
}
