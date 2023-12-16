package X;

import java.util.Map;

/* renamed from: X.2A9  reason: invalid class name */
public final class AnonymousClass2A9 {
    public static final void A00(Object obj, C85424Ge r4) {
        boolean isInstance;
        Class cls = ((AnonymousClass8PJ) r4).A00;
        Map map = AnonymousClass8PJ.A04;
        C162457s7.A0K(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Number A0q = AnonymousClass0x9.A0q(cls, map);
        if (A0q != null) {
            isInstance = AnonymousClass360.A05(A0q.intValue(), obj);
        } else {
            if (cls.isPrimitive()) {
                cls = C154547dL.A01(AnonymousClass0x9.A1E(cls));
            }
            isInstance = cls.isInstance(obj);
        }
        if (isInstance) {
            C162457s7.A0K(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Value cannot be cast to ");
        throw new ClassCastException(AnonymousClass000.A0X(r4.BBo(), A0o));
    }
}
