package X;

import java.util.regex.Pattern;

/* renamed from: X.7mB  reason: invalid class name and case insensitive filesystem */
public final class C159617mB {
    public static final Pattern A00 = Pattern.compile("^NOTE([ \t].*)?$");

    public static long A01(String str) {
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : AnonymousClass6CA.A0j(split[0], ":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static float A00(String str) {
        if (AnonymousClass6C9.A1P(str)) {
            return Float.parseFloat(AnonymousClass0x7.A0r(str, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
