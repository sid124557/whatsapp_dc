package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.25b  reason: invalid class name and case insensitive filesystem */
public final class C380125b {
    public static final String A00(C61252zx r7, C60092xz r8) {
        String str;
        Long l = r7.A02;
        if (l == null || l.longValue() == 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            String str2 = r7.A03;
            Map A10 = AnonymousClass0x7.A10(r8.A01);
            LinkedHashMap A0r = C18320x8.A0r();
            Iterator A0q = AnonymousClass000.A0q(A10);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (C162457s7.A0P(((AnonymousClass9PF) A0w.getValue()).A01, str2)) {
                    C18270x1.A1N(A0r, A0w);
                }
            }
            A0o.append((String) C73723fy.A00(A0r.keySet()));
            A0o.append(':');
            return AnonymousClass000.A0X(r7.A06, A0o);
        }
        StringBuilder A0v = C18290x4.A0v(l);
        A0v.append(':');
        A0v.append(r7.A06);
        String str3 = r7.A07;
        if (str3 == null || (str = AnonymousClass0x2.A0e(str3, AnonymousClass001.A0o(), ':')) == null) {
            str = "";
        }
        return AnonymousClass000.A0X(str, A0v);
    }
}
