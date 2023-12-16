package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.5BK  reason: invalid class name */
public final class AnonymousClass5BK {
    public static final List A00(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C149807Ny r4 = (C149807Ny) it.next();
            JSONObject A1G = AnonymousClass0x9.A1G();
            JSONObject A0z = C18300x5.A0z(r4.A04, "module", A1G);
            String str = r4.A00;
            if (str != null) {
                A0z.put(r4.A01, str);
            }
            String str2 = r4.A02;
            if (str2 != null) {
                A0z.put("ranking_logic_ver", str2);
            }
            String str3 = r4.A03;
            if (str3 != null) {
                A0z.put("source", str3);
            }
            A1G.put("config", A0z);
            A0s.add(A1G);
        }
        return A0s;
    }
}
