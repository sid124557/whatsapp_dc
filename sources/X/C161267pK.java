package X;

/* renamed from: X.7pK  reason: invalid class name and case insensitive filesystem */
public class C161267pK {
    public static final C161267pK A01 = new C161267pK(33023);
    public int A00;

    public C161267pK(C177048dz r8) {
        byte[] bArr = r8.A01;
        int min = Math.min(4, bArr.length - 1);
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            i |= (255 & bArr[i2]) << (i2 * 8);
        }
        if (min >= 0 && min < 4) {
            i |= (((byte) (bArr[min] & (255 << r8.A00))) & 255) << (min * 8);
        }
        this.A00 = i;
    }

    public C161267pK() {
        this(0);
    }

    public C161267pK(int i) {
        this.A00 = i;
    }
}
