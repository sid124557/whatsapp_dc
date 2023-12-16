package X;

/* renamed from: X.7UF  reason: invalid class name */
public final class AnonymousClass7UF {
    public final int A00;
    public final C166387yb A01;
    public final int[] A02;
    public final int[] A03;
    public final C166387yb[] A04;
    public final String[] A05;
    public final int[][][] A06;

    public int A00(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.A00; i3++) {
            if (this.A03[i3] == i) {
                int[][] iArr = this.A06[i3];
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    for (int i6 : iArr[i4]) {
                        int i7 = i6 & 7;
                        int i8 = 1;
                        if (!(i7 == 0 || i7 == 1 || i7 == 2)) {
                            if (i7 == 3) {
                                i8 = 2;
                            } else if (i7 == 4) {
                                i5 = 3;
                            } else {
                                throw AnonymousClass6CA.A0O();
                            }
                        }
                        i5 = Math.max(i5, i8);
                    }
                    i4++;
                }
                i2 = Math.max(i2, i5);
            }
        }
        return i2;
    }

    public AnonymousClass7UF(C166387yb r2, int[] iArr, int[] iArr2, C166387yb[] r5, String[] strArr, int[][][] iArr3) {
        this.A05 = strArr;
        this.A03 = iArr;
        this.A04 = r5;
        this.A06 = iArr3;
        this.A02 = iArr2;
        this.A01 = r2;
        this.A00 = iArr.length;
    }
}
