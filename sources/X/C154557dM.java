package X;

/* renamed from: X.7dM  reason: invalid class name and case insensitive filesystem */
public class C154557dM {
    public static final void A00(int i) {
        C175698Zj r1 = new C175698Zj(2, 36);
        if (r1.A00 > i || i > r1.A01) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("radix ");
            A0o.append(i);
            A0o.append(" was not in valid range ");
            A0o.append(new C175698Zj(2, 36));
            throw C18310x6.A0d(A0o);
        }
    }

    public static final boolean A01(char c) {
        if (Character.isWhitespace(c) || Character.isSpaceChar(c)) {
            return true;
        }
        return false;
    }
}
