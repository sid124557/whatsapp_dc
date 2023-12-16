package X;

import java.util.Map;

/* renamed from: X.7VN  reason: invalid class name */
public class AnonymousClass7VN {
    public final ThreadLocal A00 = new AnonymousClass8SA(this);

    public synchronized void A00(String str, String str2) {
        Map map = (Map) this.A00.get();
        C626936e.A06(map);
        map.put(str, str2);
    }
}
