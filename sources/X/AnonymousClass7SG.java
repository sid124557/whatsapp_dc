package X;

import java.util.Map;

/* renamed from: X.7SG  reason: invalid class name */
public class AnonymousClass7SG {
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01 = AnonymousClass001.A0t();

    public void A00(Object obj, Object obj2) {
        Map map = this.A01;
        if (map.containsKey(obj2) && !AnonymousClass75J.A00(map.get(obj2), obj)) {
            map.put(obj2, obj);
            Object obj3 = this.A00.get(obj2);
            C626936e.A06(obj3);
            ((C15930sC) obj3).BOf(obj);
        }
    }
}
