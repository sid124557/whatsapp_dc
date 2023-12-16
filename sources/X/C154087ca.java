package X;

import java.util.List;

/* renamed from: X.7ca  reason: invalid class name and case insensitive filesystem */
public class C154087ca {
    public static String A00(C141306vM r4, List list) {
        char c = '|';
        if (r4 == C141306vM.INTERNAL_VARIABLE) {
            c = '/';
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        for (Object next : list) {
            A0o.append(c);
            A0o.append(next);
        }
        return A0o.toString();
    }
}
