package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2fs  reason: invalid class name and case insensitive filesystem */
public class C49032fs {
    public int A00;
    public final Map A01 = AnonymousClass001.A0t();
    public final AnonymousClass4C1 A02;

    public C56702sQ A00(String str, String str2, int i) {
        if (i != this.A00) {
            Map map = this.A01;
            Iterator A0v = AnonymousClass001.A0v(map);
            while (A0v.hasNext()) {
                C56702sQ r0 = (C56702sQ) A0v.next();
                if (r0 != null) {
                    r0.A03();
                }
            }
            map.clear();
            this.A00 = i;
        }
        Map map2 = this.A01;
        if (!map2.containsKey(str)) {
            AnonymousClass4GK r2 = (AnonymousClass4GK) this.A02.get();
            try {
                map2.put(str, ((AnonymousClass3H0) r2).A03.A0G(str, str2));
                r2.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        return (C56702sQ) map2.get(str);
    }

    public C49032fs(AnonymousClass4C1 r2, int i) {
        this.A00 = i;
        this.A02 = r2;
    }
}
