package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9VP  reason: invalid class name */
public class AnonymousClass9VP {
    public static List A02 = Arrays.asList(new String[]{"urn:xmpp:whatsapp:account", "w:pay"});
    public final C69263Wi A00;
    public final AnonymousClass31C A01;

    public final AnonymousClass36K A00(AnonymousClass9OA r6, String str, Map map) {
        Map map2 = (Map) map.get("properties");
        Map map3 = (Map) map.get("children");
        if ("accept_pay".equals(str) && map2 != null && map2.containsKey("merchant")) {
            map2.containsKey("merchant-fees");
        }
        ArrayList A0s = AnonymousClass001.A0s();
        if (map2 != null && map2.size() > 0) {
            Iterator A0q = AnonymousClass000.A0q(map2);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                AnonymousClass39V.A03(C18310x6.A0q(A0w), (String) A0w.getValue(), A0s);
            }
        }
        return new AnonymousClass36K(str, C18300x5.A1Z(A0s, 0), A02(r6, map3));
    }

    public AnonymousClass9VP(C69263Wi r1, AnonymousClass31C r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Map A01(AnonymousClass36K r8) {
        HashMap A0t = AnonymousClass001.A0t();
        if (r8 != null) {
            HashMap A0t2 = AnonymousClass001.A0t();
            AnonymousClass39V[] A0u = r8.A0u();
            if (A0u != null) {
                for (AnonymousClass39V r0 : A0u) {
                    A0t2.put(r0.A02, r0.A03);
                }
            }
            A0t.put("properties", C57102t5.A01(A0t2));
            HashMap A0t3 = AnonymousClass001.A0t();
            AnonymousClass36K[] r2 = r8.A03;
            if (r2 != null) {
                for (AnonymousClass36K r02 : r2) {
                    A0t3.put(r02.A00, A01(r02));
                }
            }
            HashMap A0t4 = AnonymousClass001.A0t();
            Iterator A0u2 = AnonymousClass001.A0u(A0t3);
            while (A0u2.hasNext()) {
                C18270x1.A1N(A0t4, AnonymousClass001.A0w(A0u2));
            }
            A0t.put("children", A0t4);
        }
        HashMap A0t5 = AnonymousClass001.A0t();
        Iterator A0u3 = AnonymousClass001.A0u(A0t);
        while (A0u3.hasNext()) {
            C18270x1.A1N(A0t5, AnonymousClass001.A0w(A0u3));
        }
        return A0t5;
    }

    public final AnonymousClass36K[] A02(AnonymousClass9OA r5, Map map) {
        ArrayList A0s = AnonymousClass001.A0s();
        if (map != null && map.size() > 0) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A0s.add(A00(r5, C18310x6.A0q(A0w), (Map) A0w.getValue()));
            }
        }
        return C18280x3.A1a(A0s, 0);
    }
}
