package X;

import java.util.AbstractMap;

/* renamed from: X.8Ap  reason: invalid class name and case insensitive filesystem */
public final class C169778Ap implements C181048m3 {
    public final Object BtI(Object obj, Object obj2) {
        C174268Tp r0;
        C174268Tp r3 = (C174268Tp) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!r3.zza) {
                if (!r3.isEmpty()) {
                    r0 = new C174268Tp(r3);
                }
                r3 = r0;
            }
            if (!r3.zza) {
                throw C18320x8.A0m();
            } else if (!abstractMap.isEmpty()) {
                r3.putAll(abstractMap);
            }
        }
        return r3;
    }
}
