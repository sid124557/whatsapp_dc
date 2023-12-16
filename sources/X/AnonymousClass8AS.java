package X;

import java.util.AbstractMap;

/* renamed from: X.8AS  reason: invalid class name */
public final class AnonymousClass8AS implements C180998ly {
    public final Object Btd(Object obj, Object obj2) {
        C174258To r0;
        C174258To r3 = (C174258To) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!r3.zzfa) {
                if (!r3.isEmpty()) {
                    r0 = new C174258To(r3);
                }
                r3 = r0;
            }
            if (!r3.zzfa) {
                throw C18320x8.A0m();
            } else if (!abstractMap.isEmpty()) {
                r3.putAll(abstractMap);
            }
        }
        return r3;
    }
}
