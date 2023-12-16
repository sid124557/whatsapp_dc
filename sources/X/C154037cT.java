package X;

/* renamed from: X.7cT  reason: invalid class name and case insensitive filesystem */
public final class C154037cT {
    public static void A00(char[] cArr, byte b, byte b2, byte b3, byte b4, int i) {
        if (b2 > -65 || AnonymousClass6C9.A08(b, b2) != 0 || b3 > -65 || b4 > -65) {
            throw new C140576ty("Protocol message had invalid UTF-8.");
        }
        cArr[i + 1] = (char) ((AnonymousClass6C9.A0H(cArr, b3, ((b & 7) << 18) | ((b2 & 63) << 12), b4, i) & 1023) + 56320);
    }

    public static void A01(char[] cArr, byte b, byte b2, byte b3, int i) {
        if (b2 > -65 || (b != -32 ? !(b != -19 || b2 < -96) : b2 < -96) || b3 > -65) {
            throw new C140576ty("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }
}
