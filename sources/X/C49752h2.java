package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.2h2  reason: invalid class name and case insensitive filesystem */
public class C49752h2 {
    public final C129526aS A00;
    public final AnonymousClass36K A01;
    public final String A02;
    public final Map A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49752h2)) {
            return false;
        }
        C49752h2 r4 = (C49752h2) obj;
        return this.A02.equals(r4.A02) && this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return (this.A02.hashCode() ^ this.A00.hashCode()) ^ this.A01.hashCode();
    }

    public C49752h2(AnonymousClass36K r2, String str, Map map, Map map2, Set set) {
        this.A02 = str;
        this.A01 = r2;
        C129496aP r0 = new C129496aP();
        r0.addAll(set);
        this.A00 = r0.build();
        this.A04 = map;
        this.A03 = map2;
    }
}
