package X;

/* renamed from: X.7iH  reason: invalid class name and case insensitive filesystem */
public final class C157427iH {
    public static final long[] A03 = {128, 64, 32, 16, 8, 4, 2, 1};
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public long A00(C187648xa r11, int i, boolean z, boolean z2) {
        if (this.A01 == 0) {
            byte[] bArr = this.A02;
            if (!r11.BiM(bArr, 0, 1, z)) {
                return -1;
            }
            byte b = bArr[0] & 255;
            int i2 = 0;
            while (true) {
                long[] jArr = A03;
                if (i2 >= jArr.length) {
                    i2 = -1;
                    break;
                }
                int i3 = ((jArr[i2] & ((long) b)) > 0 ? 1 : ((jArr[i2] & ((long) b)) == 0 ? 0 : -1));
                i2++;
                if (i3 != 0) {
                    break;
                }
            }
            this.A00 = i2;
            if (i2 != -1) {
                this.A01 = 1;
            } else {
                throw AnonymousClass001.A0e("No valid varint length mask found");
            }
        }
        int i4 = this.A00;
        if (i4 > i) {
            this.A01 = 0;
            return -2;
        }
        if (i4 != 1) {
            r11.readFully(this.A02, 1, i4 - 1);
        }
        this.A01 = 0;
        byte[] bArr2 = this.A02;
        int i5 = this.A00;
        long j = ((long) bArr2[0]) & 255;
        if (z2) {
            j &= ~A03[i5 - 1];
        }
        for (int i6 = 1; i6 < i5; i6++) {
            j = (j << 8) | (((long) bArr2[i6]) & 255);
        }
        return j;
    }
}
