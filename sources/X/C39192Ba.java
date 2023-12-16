package X;

/* renamed from: X.2Ba  reason: invalid class name and case insensitive filesystem */
public final class C39192Ba {
    public static final C116975rB A00;

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("[eE][+-]?");
        String A0X = AnonymousClass000.A0X("(\\p{Digit}+)", A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("(0[xX]");
        A0o2.append("(\\p{XDigit}+)");
        A0o2.append("(\\.)?)|(0[xX]");
        A0o2.append("(\\p{XDigit}+)");
        A0o2.append("?(\\.)");
        A0o2.append("(\\p{XDigit}+)");
        String A0j = AnonymousClass001.A0j(A0o2, ')');
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append('(');
        A0o3.append("(\\p{Digit}+)");
        A0o3.append("(\\.)?(");
        A0o3.append("(\\p{Digit}+)");
        A0o3.append("?)(");
        A0o3.append(A0X);
        A0o3.append(")?)|(\\.(");
        A0o3.append("(\\p{Digit}+)");
        A0o3.append(")(");
        A0o3.append(A0X);
        A0o3.append(")?)|((");
        A0o3.append(A0j);
        A0o3.append(")[pP][+-]?");
        A0o3.append("(\\p{Digit}+)");
        String A0j2 = AnonymousClass001.A0j(A0o3, ')');
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        A0o4.append(A0j2);
        A00 = new C116975rB(AnonymousClass000.A0X(")[fFdD]?))[\\x00-\\x20]*", A0o4));
    }
}
