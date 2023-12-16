package X;

import java.util.Arrays;

/* renamed from: X.7j8  reason: invalid class name and case insensitive filesystem */
public class C157917j8 {
    public final int[] A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C157917j8)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C157917j8) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public C157917j8(long j) {
        int[] iArr = new int[5];
        int i = ((int) ((j >> 4) & 4095)) + 1;
        int i2 = 0;
        do {
            iArr[i2] = i;
            i2++;
            i = ((int) ((j >> ((i2 * 12) + 4)) & 4095)) + 1;
            if (i <= 1) {
                break;
            }
        } while (i2 < 5);
        this.A00 = Arrays.copyOf(iArr, i2);
    }

    public C157917j8(int[] iArr) {
        C626936e.A0B(AnonymousClass6C8.A1P(iArr.length, 5));
        this.A00 = iArr;
    }
}
