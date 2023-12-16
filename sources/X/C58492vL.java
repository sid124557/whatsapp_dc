package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2vL  reason: invalid class name and case insensitive filesystem */
public class C58492vL {
    public final Object A00;
    public final Object A01;

    public static Map A00(Set set) {
        AnonymousClass05C r3 = new AnonymousClass05C();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C58492vL r0 = (C58492vL) it.next();
            r3.put(r0.A00, r0.A01);
        }
        return r3;
    }

    public C58492vL(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
