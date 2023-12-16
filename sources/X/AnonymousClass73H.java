package X;

import java.util.Map;

/* renamed from: X.73H  reason: invalid class name */
public class AnonymousClass73H {
    public static Object A00(C151147Tp r4, Map map) {
        if (!map.containsKey("initial_lispy")) {
            return map.get("initial");
        }
        try {
            String A0o = C18310x6.A0o("initial_lispy", map);
            return C154167ci.A00(C157967jD.A01, new AnonymousClass8DF(new C156077fz(A0o), (AnonymousClass7KA) null, r4.A04), r4);
        } catch (C143296ye e) {
            C159737mN.A00((C153427bI) null, "StateModule", "Exception gettin initial_lispy value", e);
            return null;
        }
    }
}
