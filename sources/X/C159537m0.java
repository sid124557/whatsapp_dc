package X;

/* renamed from: X.7m0  reason: invalid class name and case insensitive filesystem */
public class C159537m0 {
    public static void A00(byte[] bArr, int[] iArr) {
        byte[] bArr2 = bArr;
        long A0M = AnonymousClass6C7.A0M(bArr2, 0) | AnonymousClass6C7.A0L(bArr2, 0);
        long A0L = (AnonymousClass6C7.A0L(bArr2, 4) | AnonymousClass6C7.A0M(bArr2, 4)) << 6;
        long A0M2 = AnonymousClass6C7.A0M(bArr2, 7);
        long A0L2 = (AnonymousClass6C7.A0L(bArr2, 10) | AnonymousClass6C7.A0M(bArr2, 10)) << 3;
        long A0M3 = AnonymousClass6C7.A0M(bArr2, 13);
        long A0M4 = ((((long) bArr[19]) << 24) & 4278190080L) | AnonymousClass6C7.A0M(bArr2, 16) | AnonymousClass6C7.A0L(bArr2, 16);
        long A0M5 = AnonymousClass6C7.A0M(bArr2, 20);
        long A0L3 = (AnonymousClass6C7.A0L(bArr2, 23) | AnonymousClass6C7.A0M(bArr2, 23)) << 5;
        long A0M6 = AnonymousClass6C7.A0M(bArr2, 26);
        long A0L4 = ((AnonymousClass6C7.A0L(bArr2, 29) | AnonymousClass6C7.A0M(bArr2, 29)) & 8388607) << 2;
        long j = (A0L4 + 16777216) >> 25;
        long j2 = (((((long) bArr[3]) << 24) & 4278190080L) | A0M) + (19 * j);
        long j3 = (A0L + 16777216) >> 25;
        long A0L5 = ((AnonymousClass6C7.A0L(bArr2, 7) | A0M2) << 5) + j3;
        long j4 = A0L - (j3 << 25);
        long j5 = (A0L2 + 16777216) >> 25;
        long A0L6 = ((AnonymousClass6C7.A0L(bArr2, 13) | A0M3) << 2) + j5;
        long j6 = A0L2 - (j5 << 25);
        long j7 = (A0M4 + 16777216) >> 25;
        long A0L7 = ((AnonymousClass6C7.A0L(bArr2, 20) | A0M5) << 7) + j7;
        long j8 = A0M4 - (j7 << 25);
        long j9 = (A0L3 + 16777216) >> 25;
        long A0L8 = ((AnonymousClass6C7.A0L(bArr2, 26) | A0M6) << 4) + j9;
        long j10 = A0L3 - (j9 << 25);
        long j11 = (j2 + 33554432) >> 26;
        long j12 = j4 + j11;
        long j13 = j2 - (j11 << 26);
        long j14 = (A0L5 + 33554432) >> 26;
        long j15 = j6 + j14;
        long j16 = A0L5 - (j14 << 26);
        long j17 = (A0L6 + 33554432) >> 26;
        long j18 = j8 + j17;
        long j19 = A0L6 - (j17 << 26);
        long j20 = (A0L7 + 33554432) >> 26;
        long j21 = j10 + j20;
        long j22 = A0L7 - (j20 << 26);
        long j23 = (A0L8 + 33554432) >> 26;
        iArr[0] = (int) j13;
        iArr[1] = (int) j12;
        iArr[2] = (int) j16;
        iArr[3] = (int) j15;
        iArr[4] = (int) j19;
        iArr[5] = (int) j18;
        iArr[6] = (int) j22;
        iArr[7] = (int) j21;
        iArr[8] = (int) (A0L8 - (j23 << 26));
        iArr[9] = (int) ((A0L4 - (j << 25)) + j23);
    }
}
