package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.7cb  reason: invalid class name and case insensitive filesystem */
public class C154097cb {
    public static C158847ke A00(C131266dJ r3) {
        C158847ke r0 = r3.A01;
        if (r0 != null) {
            return r0;
        }
        C153427bI r02 = r3.A00;
        if (r02 != null) {
            C160817oM A02 = C162377rs.A02(r02);
            C161827qc.A03("Tree resources can only be read from the UI Thread");
            return A02.A04.A01((Map) null, A02.A09);
        }
        throw AnonymousClass001.A0g("No tree resources available in the Scripting Environment. This is an infra error that you should post in the Bloks Q&A group about.");
    }

    public static Object A01(C131266dJ r2, String str) {
        Object obj = A00(r2).A07.get(str);
        Set set = r2.A0A;
        if (set != null) {
            set.add(str);
        }
        return obj;
    }
}
