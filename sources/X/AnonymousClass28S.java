package X;

/* renamed from: X.28S  reason: invalid class name */
public class AnonymousClass28S {
    public static C45442a1 A00(AnonymousClass36K r4) {
        int i;
        String A0r = r4.A0r("v", (String) null);
        if ("1".equals(A0r) || "2".equals(A0r)) {
            int parseInt = Integer.parseInt(A0r);
            String A0K = AnonymousClass36K.A0K(r4);
            if ("msg".equals(A0K)) {
                i = 0;
            } else if ("pkmsg".equals(A0K)) {
                i = 1;
            } else if ("skmsg".equals(A0K)) {
                i = 2;
            } else if ("frskmsg".equals(A0K)) {
                i = 3;
            } else if ("msmsg".equals(A0K)) {
                i = 4;
            } else {
                throw AnonymousClass24Y.A02("invalid encrypted node type provided: ", A0K, AnonymousClass001.A0o());
            }
            return new C45442a1(r4.A01, parseInt, i);
        }
        throw AnonymousClass24Y.A02("invalid encrypted node version provided: ", A0r, AnonymousClass001.A0o());
    }
}
