package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.4tn  reason: invalid class name and case insensitive filesystem */
public final class C95514tn extends C48642fE {
    public /* bridge */ /* synthetic */ Object A01(Map map, Object obj) {
        C162457s7.A0J(map, 0);
        if (!(!map.isEmpty())) {
            return new C89954fY();
        }
        int size = map.size();
        Collection values = map.values();
        if (size > 1) {
            return new C89934fW(C73723fy.A0F(values));
        }
        return new C89944fX((C618532n) C73723fy.A00(values));
    }
}
