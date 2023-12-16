package X;

/* renamed from: X.7Qo  reason: invalid class name and case insensitive filesystem */
public final class C150397Qo {
    public final String A00(String str, String str2) {
        String A00;
        if (str == null || (A00 = AnonymousClass2AB.A00(str)) == null) {
            return str;
        }
        String A0U = C175738Zn.A0U(A00, "-", "", false);
        if (!C162457s7.A0P(str2, "cep") || A0U.length() <= 5) {
            return str;
        }
        StringBuilder A0A = C18330xA.A0A(A0U);
        A0A.insert(5, '-');
        return A0A.toString();
    }
}
