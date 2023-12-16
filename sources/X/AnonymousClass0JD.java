package X;

/* renamed from: X.0JD  reason: invalid class name */
public final class AnonymousClass0JD {
    public static final int A00(AnonymousClass84O r2) {
        String A0O = r2.A0O(42);
        if (A0O == null || A0O.equals("column")) {
            return 1;
        }
        if (A0O.equals("row")) {
            return 0;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Unknown direction ");
        throw AnonymousClass000.A0F(A0O, A0o);
    }
}
