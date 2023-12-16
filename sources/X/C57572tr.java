package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2tr  reason: invalid class name and case insensitive filesystem */
public final class C57572tr {
    public static final String A01(Map map) {
        String str;
        boolean z = true;
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String A0q2 = C18310x6.A0q(A0w);
            int A08 = AnonymousClass0x2.A08(A0w);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            if (z) {
                str = "";
            } else {
                str = ",";
            }
            A0o2.append(str);
            A0o2.append(A0q2);
            A0o2.append(':');
            A0o2.append(A08);
            AnonymousClass000.A1B(A0o2, A0o);
            z = false;
        }
        return A0o.toString();
    }

    public static final UserJid A00(C624134x r1) {
        if (r1.A1J.A02) {
            return AnonymousClass1fY.A00;
        }
        return AnonymousClass32Y.A05(r1.A0n());
    }
}
