package X;

/* renamed from: X.4qr  reason: invalid class name and case insensitive filesystem */
public class C94274qr extends C157857j0 {
    public int A00;
    public int[] A01;

    public int A00() {
        int i = this.A00;
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            return 0;
        }
        int i2 = iArr[i];
        this.A00 = i + 1;
        return i2;
    }

    public int[] A01() {
        return this.A01;
    }

    public C94274qr(int[] iArr) {
        this.A01 = iArr;
    }
}
