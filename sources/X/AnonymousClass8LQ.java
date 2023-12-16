package X;

import java.util.Arrays;

/* renamed from: X.8LQ  reason: invalid class name */
public final class AnonymousClass8LQ implements Cloneable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;

    public void A00(int i, int i2) {
        int i3 = (i2 * this.A01) + (i / 32);
        int[] iArr = this.A03;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public void A01(int i, int i2) {
        int i3 = (i2 * this.A01) + (i / 32);
        int[] iArr = this.A03;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void A02(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw AnonymousClass001.A0c("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw AnonymousClass001.A0c("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.A00 || i5 > this.A02) {
                throw AnonymousClass001.A0c("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.A01 * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.A03;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public boolean A03(int i, int i2) {
        if (((this.A03[(i2 * this.A01) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return new AnonymousClass8LQ((int[]) this.A03.clone(), this.A02, this.A00, this.A01);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass8LQ) {
            AnonymousClass8LQ r4 = (AnonymousClass8LQ) obj;
            if (this.A02 == r4.A02 && this.A00 == r4.A00 && this.A01 == r4.A01 && Arrays.equals(this.A03, r4.A03)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A02;
        return (((((((i * 31) + i) * 31) + this.A00) * 31) + this.A01) * 31) + Arrays.hashCode(this.A03);
    }

    public String toString() {
        int i = this.A00;
        int i2 = this.A02;
        StringBuilder A0Y = AnonymousClass6CA.A0Y((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                String str = "  ";
                if (A03(i4, i3)) {
                    str = "X ";
                }
                A0Y.append(str);
            }
            A0Y.append("\n");
        }
        return A0Y.toString();
    }

    public AnonymousClass8LQ(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw AnonymousClass001.A0c("Both dimensions must be greater than 0");
        }
        this.A02 = i;
        this.A00 = i2;
        int i3 = (i + 31) / 32;
        this.A01 = i3;
        this.A03 = new int[(i3 * i2)];
    }

    public AnonymousClass8LQ(int[] iArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
    }
}
