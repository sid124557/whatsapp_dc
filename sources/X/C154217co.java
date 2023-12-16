package X;

import java.util.Map;

/* renamed from: X.7co  reason: invalid class name and case insensitive filesystem */
public final class C154217co {
    public static final C166027y1 A00(C165977xw r1, C165977xw r2, Map map) {
        C162457s7.A0J(r1, 1);
        C166027y1 r0 = (C166027y1) map.get(AnonymousClass3Z6.A02(r1, r2));
        if (r0 != null) {
            return r0;
        }
        if (r2 != null) {
            return (C166027y1) map.get(AnonymousClass3Z6.A02(r2, r1));
        }
        return null;
    }

    public static final C165977xw A01(C166107y9 r3, int i) {
        C162457s7.A0J(r3, 0);
        return new C165977xw(r3.A00, ((C165827xh) r3.A01.get(i)).A00());
    }
}
