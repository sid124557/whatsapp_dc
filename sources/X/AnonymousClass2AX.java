package X;

/* renamed from: X.2AX  reason: invalid class name */
public class AnonymousClass2AX {
    public static int[] A00(int i, int i2) {
        int i3;
        int i4 = 32 / i2;
        int i5 = (int) ((1 << i4) - 1);
        int[] iArr = new int[i2];
        int i6 = 0;
        while (true) {
            if (i6 >= i2) {
                break;
            }
            iArr[(i2 - i6) - 1] = (i >> (i4 * i6)) & i5;
            i6++;
        }
        for (i3 = 0; i3 < i2 - 1; i3++) {
            iArr[i3] = iArr[i3] + 1;
        }
        return iArr;
    }
}
