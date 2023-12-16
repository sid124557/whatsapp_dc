package X;

import java.util.Map;

/* renamed from: X.2WZ  reason: invalid class name */
public class AnonymousClass2WZ {
    public final Map A00 = AnonymousClass001.A0t();

    public synchronized void A00(int i, int i2, int i3) {
        Map map = (Map) AnonymousClass001.A0i(this.A00, i);
        if (map != null) {
            Integer valueOf = Integer.valueOf(i2);
            if (!map.containsKey(valueOf)) {
                C18280x3.A1D(valueOf, map, i3);
            }
        }
    }
}
