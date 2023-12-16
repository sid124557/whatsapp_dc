package X;

import java.util.Arrays;
import java.util.Random;

/* renamed from: X.889  reason: invalid class name */
public class AnonymousClass889 implements C186108ul {
    public final Random A00;
    public final int[] A01;
    public final int[] A02;

    public C186108ul Ayz(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            Random random = this.A00;
            iArr[i3] = random.nextInt(this.A02.length + 1);
            int i4 = i3 + 1;
            int nextInt = random.nextInt(i4);
            iArr2[i3] = iArr2[nextInt];
            iArr2[nextInt] = i3;
            i3 = i4;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.A02;
        int length = iArr3.length + i2;
        int[] iArr4 = new int[length];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (i5 >= i2 || i6 != iArr[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr3[i6];
                iArr4[i7] = i9;
                if (i9 >= 0) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr2[i5];
                i5++;
            }
        }
        return new AnonymousClass889(new Random(this.A00.nextLong()), iArr4);
    }

    public C186108ul Az1(int i, int i2) {
        int[] iArr = this.A02;
        int length = iArr.length;
        int[] iArr2 = new int[(length - i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 < 0 || i5 >= i2) {
                int i6 = i4 - i3;
                if (i5 >= 0) {
                    i5 -= i2;
                }
                iArr2[i6] = i5;
            } else {
                i3++;
            }
        }
        return new AnonymousClass889(new Random(this.A00.nextLong()), iArr2);
    }

    public C186108ul Ayx() {
        return new AnonymousClass889(new Random(this.A00.nextLong()), new int[0]);
    }

    public int B7g() {
        int[] iArr = this.A02;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public int B91() {
        int[] iArr = this.A02;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public int B9z(int i) {
        int i2 = this.A01[i] + 1;
        int[] iArr = this.A02;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public int BBf(int i) {
        int i2 = this.A01[i] - 1;
        if (i2 >= 0) {
            return this.A02[i2];
        }
        return -1;
    }

    public int getLength() {
        return this.A02.length;
    }

    public AnonymousClass889(Random random, int[] iArr) {
        this.A02 = iArr;
        this.A00 = random;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        this.A01 = iArr2;
        for (int i = 0; i < length; i++) {
            iArr2[iArr[i]] = i;
        }
    }
}
