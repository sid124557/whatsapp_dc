package X;

import java.io.IOException;
import java.math.RoundingMode;

/* renamed from: X.7hl  reason: invalid class name and case insensitive filesystem */
public abstract class C157117hl {
    public static final C157117hl A00 = new C128426Wa('=', "base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final C157117hl A01 = new C128426Wa('=', "base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public static final C157117hl A02 = new C128446Wc(new C152537Zg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
    public static final C157117hl A03 = new C128446Wc(new C152537Zg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
    public static final C157117hl A04 = new C128436Wb();

    public final String A00(byte[] bArr, int i) {
        int length = bArr.length;
        C159327le.A02(0, i, length);
        C152537Zg r0 = ((C128446Wc) this).A00;
        StringBuilder A0Y = AnonymousClass6CA.A0Y(r0.A01 * AnonymousClass72X.A00(RoundingMode.CEILING, i, r0.A02));
        try {
            C128436Wb r4 = (C128436Wb) this;
            C159327le.A02(0, i, length);
            for (int i2 = 0; i2 < i; i2++) {
                byte b = bArr[i2] & 255;
                char[] cArr = r4.A00;
                A0Y.append(cArr[b]);
                A0Y.append(cArr[b | 256]);
            }
            return A0Y.toString();
        } catch (IOException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
