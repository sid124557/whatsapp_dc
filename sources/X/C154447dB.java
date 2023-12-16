package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.7dB  reason: invalid class name and case insensitive filesystem */
public final class C154447dB {
    public static final Integer A00(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length != 8) {
            if (length != 6) {
                return null;
            }
            str = AnonymousClass000.A0V("FF", str, AnonymousClass001.A0o());
        }
        C172438Lc A00 = C1453475d.A00(str, 16);
        if (A00 != null) {
            return Integer.valueOf((int) A00.A00);
        }
        return null;
    }

    public static final String A01(Integer num) {
        if (num != null) {
            return C86654Ky.A0n(Locale.US, "%08X", Arrays.copyOf(AnonymousClass6C9.A1Z(num, 1), 1));
        }
        return null;
    }
}
