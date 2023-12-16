package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9PT  reason: invalid class name */
public class AnonymousClass9PT {
    public final int A00;
    public final int A01;
    public final String A02;
    public final Map A03 = new ConcurrentHashMap();

    public AnonymousClass9PT(String str, Map map, int i, int i2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
        if (map != null) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                this.A03.put(A0w.getKey(), A0w.getValue());
            }
        }
    }
}
