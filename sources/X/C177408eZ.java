package X;

/* renamed from: X.8eZ  reason: invalid class name and case insensitive filesystem */
public class C177408eZ extends AnonymousClass8QN {
    public static void A00(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            AnonymousClass6C8.A0u((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1, bArr, b & 254, i);
        }
    }
}
