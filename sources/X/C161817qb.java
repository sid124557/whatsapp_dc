package X;

/* renamed from: X.7qb  reason: invalid class name and case insensitive filesystem */
public abstract class C161817qb {
    public static void A02(byte[] bArr, int i, int i2) {
        int A0A = AnonymousClass6CA.A0A(bArr, i >>> 16, AnonymousClass6CA.A0A(bArr, i >>> 24, i2));
        AnonymousClass6CA.A0f(bArr, i, A0A);
        bArr[A0A + 1] = (byte) i;
    }

    public static int A00(byte[] bArr, int i) {
        return AnonymousClass6C7.A0C(bArr, i);
    }

    public static int A01(byte[] bArr, int[] iArr, int i, int i2) {
        int A00 = A00(bArr, i);
        iArr[i2] = A00;
        return A00;
    }

    public static void A03(byte[] bArr, int i, long j) {
        A02(bArr, C86664Kz.A06(j), i);
        A02(bArr, (int) (j & 4294967295L), i + 4);
    }

    public static void A05(byte[] bArr, int[] iArr, int i, int i2) {
        iArr[i2] = A00(bArr, i);
    }

    public static void A04(byte[] bArr, int i, long j) {
        AnonymousClass6C8.A1H(bArr, (int) (4294967295L & j), i);
        AnonymousClass6C8.A1H(bArr, C86664Kz.A06(j), i + 4);
    }
}
