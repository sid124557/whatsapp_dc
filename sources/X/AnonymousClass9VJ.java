package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.9VJ  reason: invalid class name */
public class AnonymousClass9VJ {
    public boolean A00;
    public final C1001959y A01;
    public final Map A02 = AnonymousClass001.A0t();
    public final Map A03 = AnonymousClass001.A0t();
    public final Map A04 = AnonymousClass001.A0t();
    public final Map A05 = AnonymousClass001.A0t();

    public AnonymousClass9VJ(C1001959y r2) {
        this.A01 = r2;
    }

    public static List A00(Object obj, Map map, Map map2) {
        List list = (List) map.remove(obj);
        if (list != null) {
            for (Object next : list) {
                if (!((List) map2.get(next)).remove(obj)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Value was not in map: ");
                    A0o.append(next);
                    throw AnonymousClass000.A0H(map2, " ", A0o);
                }
            }
            return list;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("Key was not in map: ");
        A0o2.append(obj);
        throw AnonymousClass000.A0H(map, " ", A0o2);
    }
}
