package X;

import java.util.Map;

/* renamed from: X.2XQ  reason: invalid class name */
public final class AnonymousClass2XQ {
    public final Map A00;
    public final Map A01;

    public final Object A00(Class cls) {
        C183538qC r1 = (C183538qC) this.A00.get(cls);
        Map map = this.A01;
        if (r1 == null) {
            boolean containsKey = map.containsKey(cls);
            StringBuilder A0o = AnonymousClass001.A0o();
            if (containsKey) {
                A0o.append("Binding for ");
                A0o.append(cls);
                A0o.append(" is overridden without a default implementation. This is likely a mistake.");
            } else {
                A0o.append("No binding found for ");
                A0o.append(cls);
                A0o.append('.');
            }
            throw AnonymousClass001.A0e(A0o.toString());
        }
        C183538qC r0 = (C183538qC) map.get(cls);
        if (r0 != null) {
            r1 = r0;
        }
        return r1.get();
    }

    public AnonymousClass2XQ(Map map, Map map2) {
        C18260x0.A0Q(map, map2);
        this.A00 = map;
        this.A01 = map2;
    }
}
