package X;

import java.util.AbstractMap;

/* renamed from: X.7cS  reason: invalid class name and case insensitive filesystem */
public final class C154027cS {
    public static final Object A00(Object obj, Object obj2) {
        C174248Tn r0;
        C174248Tn r2 = (C174248Tn) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!r2.zzb) {
                if (!r2.isEmpty()) {
                    r0 = new C174248Tn(r2);
                }
                r2 = r0;
            }
            if (!r2.zzb) {
                throw C18320x8.A0m();
            } else if (!abstractMap.isEmpty()) {
                r2.putAll(abstractMap);
            }
        }
        return r2;
    }
}
