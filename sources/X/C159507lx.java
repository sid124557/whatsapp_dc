package X;

import java.util.List;

/* renamed from: X.7lx  reason: invalid class name and case insensitive filesystem */
public class C159507lx {
    public static final List A0f() {
        return new AnonymousClass8U9();
    }

    public static final List A0h(List list) {
        AnonymousClass8U9 r1 = (AnonymousClass8U9) list;
        if (r1.backing == null) {
            r1.A06();
            r1.isReadOnly = true;
            if (r1.length <= 0) {
                return AnonymousClass8U9.A00;
            }
            return r1;
        }
        throw AnonymousClass6CA.A0O();
    }

    public static final List A0g(Object obj) {
        return C18290x4.A12(obj);
    }
}
