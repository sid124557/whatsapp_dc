package X;

import java.util.Random;

/* renamed from: X.7dV  reason: invalid class name and case insensitive filesystem */
public class C154637dV {
    public static final Random A00 = new Random();

    public static String A00(long j) {
        if (j < 0) {
            throw AnonymousClass6C7.A0V("Cannot internalEncode negative integer ", AnonymousClass001.A0o(), j);
        } else if (j <= (1 << Math.min(63, 66)) - 1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            int i = 0;
            do {
                A0o.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((int) (j % 64)));
                j >>= 6;
                i++;
            } while (i < 11);
            if (j <= 0) {
                A0o.reverse();
                return A0o.toString();
            }
            throw AnonymousClass001.A0c("Number won't fit in string");
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Cannot internalEncode integer ");
            A0o2.append(j);
            A0o2.append(" in ");
            A0o2.append(11);
            throw AnonymousClass000.A0F(" chars", A0o2);
        }
    }
}
