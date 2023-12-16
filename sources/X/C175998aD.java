package X;

/* renamed from: X.8aD  reason: invalid class name and case insensitive filesystem */
public final class C175998aD extends AnonymousClass8Lk {
    public final transient int[] A00;
    public final transient byte[][] A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AnonymousClass8Lk)) {
                return false;
            }
            AnonymousClass8Lk r4 = (AnonymousClass8Lk) obj;
            if (r4.A02() != A02() || !A04(r4, A02())) {
                return false;
            }
        }
        return true;
    }

    public C175998aD(int[] iArr, byte[][] bArr) {
        super(AnonymousClass8Lk.A02.data);
        this.A01 = bArr;
        this.A00 = iArr;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.A01;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            int[] iArr = this.A00;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.A00 = i4;
        return i4;
    }

    private final Object writeReplace() {
        return new AnonymousClass8Lk(A06());
    }

    public byte[] A06() {
        byte[] bArr = new byte[A02()];
        byte[][] bArr2 = this.A01;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.A00;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            byte[] bArr3 = bArr2[i];
            int i6 = i5 - i2;
            C162457s7.A0I(bArr3, 0);
            System.arraycopy(bArr3, i4, bArr, i3, i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public String toString() {
        return new AnonymousClass8Lk(A06()).toString();
    }
}
