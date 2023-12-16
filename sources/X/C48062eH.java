package X;

import java.util.Map;

/* renamed from: X.2eH  reason: invalid class name and case insensitive filesystem */
public class C48062eH {
    public final Map A00;

    public AnonymousClass485 A02(Class cls) {
        C183538qC r0 = (C183538qC) this.A00.get(cls);
        if (r0 != null) {
            return (AnonymousClass485) r0.get();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("No bridge with type ");
        A0o.append(cls);
        throw AnonymousClass000.A0I(" was registered.", A0o);
    }

    public C48062eH(Map map) {
        this.A00 = map;
    }

    public static AnonymousClass3LB A00(C183538qC r1) {
        return (AnonymousClass3LB) ((C48062eH) r1.get()).A02(AnonymousClass3LB.class);
    }

    public static AnonymousClass485 A01(C48062eH r0, Class cls) {
        AnonymousClass485 A02 = r0.A02(cls);
        C162457s7.A0D(A02);
        return A02;
    }
}
