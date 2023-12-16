package X;

/* renamed from: X.8Hl  reason: invalid class name and case insensitive filesystem */
public class C171538Hl implements C179528jI {
    public static byte[] A00(byte[] bArr, long j) {
        byte[] bArr2 = {(byte) ((int) (j >> 56)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 8)), (byte) ((int) j)};
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i = length - 8;
        System.arraycopy(bArr, 0, bArr3, 0, i);
        for (int i2 = i; i2 < length; i2++) {
            AnonymousClass6C7.A1T(bArr2, bArr3, i2 - i, bArr[i2], i2);
        }
        return bArr3;
    }
}
