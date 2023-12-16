package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ll  reason: invalid class name and case insensitive filesystem */
public class C159397ll {
    public static AnonymousClass84O A01(AnonymousClass84O r5, List list, int i) {
        if (list != null) {
            if (i < list.size()) {
                AnonymousClass84O A0V = AnonymousClass6C9.A0V(list, i);
                if (A0V.A02 == r5.A02) {
                    return A0V;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass84O r2 = (AnonymousClass84O) it.next();
                if (r2.A02 == r5.A02) {
                    return r2;
                }
            }
        }
        return null;
    }

    public static AnonymousClass84O A00(AnonymousClass84O r2, AnonymousClass84O r3, Object obj, int i) {
        if (r2 != r3 || !AnonymousClass736.A00(AnonymousClass84O.A05(r3, i), obj)) {
            if (r2 == r3) {
                r2 = new AnonymousClass84O(r3, r3, r3.A07, r3.A02);
            }
            r2.A0T(i, obj);
        }
        return r2;
    }

    public static String A02(AnonymousClass84O r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        String A0N = r4.A0N();
        if (A0N != null) {
            A0o.append(" id: ");
            A0o.append(A0N);
        }
        List list = r4.A07;
        if (list != null && !list.isEmpty()) {
            A0o.append(" keyPath: ");
            A0o.append(C18290x4.A0k(list));
            for (int i = 1; i < list.size(); i++) {
                A0o.append("/");
                A0o.append(list.get(i));
            }
        }
        A0o.append(" styleId: ");
        return AnonymousClass000.A0h(A0o, r4.A03);
    }
}
