package X;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7li  reason: invalid class name and case insensitive filesystem */
public class C159367li {
    public static int A00(Object obj, Object obj2, int i) {
        AbstractMap abstractMap = (AbstractMap) obj;
        AnonymousClass7K4 r9 = (AnonymousClass7K4) obj2;
        int i2 = 0;
        if (!abstractMap.isEmpty()) {
            Iterator A0u = AnonymousClass001.A0u(abstractMap);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                Object key = A0w.getKey();
                Object value = A0w.getValue();
                int A04 = AnonymousClass730.A04(i);
                AnonymousClass7MN r3 = r9.A00;
                int A00 = C161737qL.A00(r3.A00, key, 1) + C161737qL.A00(r3.A01, value, 2);
                i2 += A04 + AnonymousClass6C7.A00(A00) + A00;
            }
        }
        return i2;
    }

    public static C174278Tq A01(Object obj, Object obj2) {
        C174278Tq r1 = (C174278Tq) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!r1.isMutable) {
                r1 = r1.A01();
            }
            if (!r1.isMutable) {
                throw C18320x8.A0m();
            } else if (!abstractMap.isEmpty()) {
                r1.putAll(abstractMap);
            }
        }
        return r1;
    }
}
