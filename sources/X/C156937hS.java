package X;

/* renamed from: X.7hS  reason: invalid class name and case insensitive filesystem */
public final class C156937hS {
    public long A00 = -9223372036854775807L;
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C161467pi A06 = new C161467pi();
    public final C153267ax A07 = new C153267ax(0);

    public static long A00(C161467pi r15) {
        int i = r15.A01;
        if (r15.A00 - i >= 9) {
            byte[] bArr = new byte[9];
            r15.A0V(bArr, 0, 9);
            r15.A0S(i);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = (long) b;
                        long j2 = (long) b2;
                        return (((j & 56) >> 3) << 30) | ((j & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                    }
                }
            }
        }
        return -9223372036854775807L;
    }
}
