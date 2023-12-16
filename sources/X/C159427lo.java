package X;

/* renamed from: X.7lo  reason: invalid class name and case insensitive filesystem */
public class C159427lo {
    public static Number A00(double d) {
        int i = (int) d;
        if (((double) i) == d) {
            return Integer.valueOf(i);
        }
        return Double.valueOf(d);
    }

    public static Number A01(float f) {
        return A00((double) f);
    }

    public static boolean A02(Object obj) {
        String obj2;
        if (obj instanceof Number) {
            return AnonymousClass000.A1S(AnonymousClass001.A0K(obj));
        }
        if (obj instanceof Boolean) {
            return AnonymousClass001.A1Z(obj);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Expected Number or Boolean: ");
        if (obj == null) {
            obj2 = "null";
        } else {
            obj2 = obj.toString();
        }
        throw AnonymousClass000.A0F(obj2, A0o);
    }
}
