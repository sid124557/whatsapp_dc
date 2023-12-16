package X;

/* renamed from: X.7JC  reason: invalid class name */
public class AnonymousClass7JC {
    public long A00 = -1;
    public int[] A01;
    public int[] A02;

    public AnonymousClass7JC(int[] iArr) {
        int length = iArr.length;
        if (length % 2 == 0) {
            int i = length / 2;
            int[] iArr2 = new int[i];
            this.A01 = iArr2;
            int[] iArr3 = new int[i];
            this.A02 = iArr3;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i2 + 1;
                iArr2[i3] = iArr[i2];
                i2 = i4 + 1;
                int i5 = iArr[i4];
                iArr3[i3] = i5;
                if (iArr2[i3] < 0 || i5 < 0) {
                    throw AnonymousClass001.A0c("Int conditions should be > 0");
                }
            }
            return;
        }
        throw AnonymousClass001.A0c("Int conditions should come in pairs");
    }
}
