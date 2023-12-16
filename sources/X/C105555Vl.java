package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Vl  reason: invalid class name and case insensitive filesystem */
public final class C105555Vl {
    public final C73853gB A00;

    public static final AnonymousClass39M A00(Integer num, String str, List list) {
        Object obj;
        C162457s7.A0J(list, 0);
        if (AnonymousClass000.A1W(str)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C162457s7.A0P(str, ((AnonymousClass39M) obj).A05)) {
                    break;
                }
            }
            AnonymousClass39M r2 = (AnonymousClass39M) obj;
            if (r2 != null) {
                return r2;
            }
        }
        int size = list.size();
        int intValue = num.intValue();
        if (size > intValue) {
            return (AnonymousClass39M) list.get(intValue);
        }
        return null;
    }

    public C105555Vl(C73853gB r1) {
        this.A00 = r1;
    }
}
