package X;

import java.util.HashSet;

/* renamed from: X.5XN  reason: invalid class name */
public final class AnonymousClass5XN {
    public final boolean A00(AnonymousClass1VX r3) {
        C162457s7.A0J(r3, 0);
        if (r3.A0X(5256) || r3.A0X(6743)) {
            return true;
        }
        return false;
    }

    public final boolean A01(AnonymousClass1VX r3) {
        C162457s7.A0J(r3, 0);
        if (r3.A0X(5257) || r3.A0X(6743) || A00(r3)) {
            return true;
        }
        return false;
    }

    public final boolean A02(AnonymousClass1VX r4, String str) {
        String A08 = C56952sp.A08(r4, 6777);
        int length = A08.length();
        HashSet A0K = AnonymousClass002.A0K();
        if (length != 0) {
            for (Object add : AnonymousClass2AB.A01(A08, ":")) {
                A0K.add(add);
            }
        }
        return !A0K.contains(str);
    }
}
