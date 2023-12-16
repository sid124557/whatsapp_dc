package X;

import android.util.Pair;
import java.util.Iterator;

/* renamed from: X.2tj  reason: invalid class name and case insensitive filesystem */
public class C57492tj {
    public static int A00(AnonymousClass36K r1) {
        C162457s7.A0J(r1, 1);
        return A01(r1);
    }

    public static Pair A02(AnonymousClass36K r4) {
        Iterator A0M = AnonymousClass36K.A0M(r4, "error");
        while (A0M.hasNext()) {
            AnonymousClass36K A0Y = C18310x6.A0Y(A0M);
            if (A0Y != null) {
                String A0r = A0Y.A0r("code", (String) null);
                String A0r2 = A0Y.A0r("text", (String) null);
                if (A0r != null) {
                    return AnonymousClass0x9.A0C(Integer.valueOf(C615531h.A01(A0r, 0)), A0r2);
                }
            }
        }
        return null;
    }

    public static int A01(AnonymousClass36K r0) {
        Pair A02 = A02(r0);
        if (A02 != null) {
            return C18280x3.A03(A02);
        }
        return 0;
    }
}
