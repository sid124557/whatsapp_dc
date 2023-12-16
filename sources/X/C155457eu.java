package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.7eu  reason: invalid class name and case insensitive filesystem */
public class C155457eu {
    public static HashMap A00 = AnonymousClass001.A0t();
    public static HashMap A01 = AnonymousClass001.A0t();

    public static void A00(Class cls) {
        Class<Object> cls2 = Object.class;
        HashMap hashMap = A01;
        synchronized (hashMap) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(cls2);
            if (linkedHashSet == null) {
                linkedHashSet = AnonymousClass0x9.A17();
                hashMap.put(cls2, linkedHashSet);
            }
            linkedHashSet.add(cls);
        }
    }

    static {
        A00(C1453775g.class);
        A00(C161987qw.class);
    }
}
