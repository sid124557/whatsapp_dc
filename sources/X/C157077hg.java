package X;

import java.util.List;

/* renamed from: X.7hg  reason: invalid class name and case insensitive filesystem */
public final class C157077hg {
    public static final String A00(C141306vM r2, String str, List list, int i) {
        String A00;
        C18260x0.A0R(str, r2);
        if (!(list == null || (A00 = C154087ca.A00(r2, list.subList(0, i))) == null || A00.equals(""))) {
            str = AnonymousClass000.A0V("#", A00, AnonymousClass000.A0l(str));
        }
        C162457s7.A0D(str);
        return str;
    }

    public final Object A01(C131266dJ r3, String str, int i) {
        C18260x0.A0O(r3, str);
        List list = r3.A04;
        if (list == null) {
            throw AnonymousClass001.A0c("Keypath must be set on environment if trying to getVariableWithScope on a depth larger than 0.");
        } else if (i <= list.size()) {
            Object A01 = C154097cb.A01(r3, A00(C141306vM.INTERNAL_VARIABLE, str, list, i));
            if (A01 == null) {
                return C154097cb.A01(r3, str);
            }
            return A01;
        } else {
            throw AnonymousClass001.A0c("Depth supplied should never exceed the size of the key path.");
        }
    }
}
