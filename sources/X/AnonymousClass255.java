package X;

/* renamed from: X.255  reason: invalid class name */
public final class AnonymousClass255 {
    public static final int A00(String str) {
        if (str == null || C175738Zn.A0V(str) || "approved".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("deleted".equalsIgnoreCase(str)) {
            return 3;
        }
        return 1;
    }
}
