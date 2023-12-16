package X;

/* renamed from: X.7BP  reason: invalid class name */
public final class AnonymousClass7BP {
    public final String A00;

    public AnonymousClass7BP(String str, String str2) {
        C162177rO.A03(str, "log tag cannot be null");
        boolean A1P = AnonymousClass6C8.A1P(str.length(), 23);
        Object[] A1b = C18310x6.A1b(str, 0);
        AnonymousClass000.A1P(A1b, 23, 1);
        if (!A1P) {
            throw AnonymousClass6C7.A0W("tag \"%s\" is longer than the %d character maximum", A1b);
        } else if (str2 == null || str2.length() <= 0) {
            this.A00 = null;
        } else {
            this.A00 = str2;
        }
    }
}
