package X;

/* renamed from: X.71d  reason: invalid class name and case insensitive filesystem */
public class C1443371d {
    public static String A00(Class cls) {
        String name = cls.getName();
        String simpleName = cls.getSimpleName();
        if (simpleName.length() >= 5) {
            return simpleName;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("<cls>");
        A0o.append(name);
        return AnonymousClass000.A0X("</cls>", A0o);
    }

    public static String A01(Object obj) {
        return A00(obj.getClass());
    }
}
