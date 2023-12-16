package X;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: X.7jQ  reason: invalid class name and case insensitive filesystem */
public class C158097jQ {
    public static final Map A03 = new IdentityHashMap();
    public int A00 = 1;
    public Object A01;
    public final C180368kv A02;

    public synchronized Object A00() {
        return this.A01;
    }

    public final void A01() {
        boolean A1W;
        synchronized (this) {
            A1W = AnonymousClass001.A1W(this.A00);
        }
        if (!A1W) {
            throw new AnonymousClass8RD();
        }
    }

    public C158097jQ(C180368kv r4, Object obj) {
        this.A01 = obj;
        this.A02 = r4;
        Map map = A03;
        synchronized (map) {
            Integer num = (Integer) map.get(obj);
            if (num == null) {
                C18280x3.A1D(obj, map, 1);
            } else {
                C18280x3.A1D(obj, map, num.intValue() + 1);
            }
        }
    }
}
