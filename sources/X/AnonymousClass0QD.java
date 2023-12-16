package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0QD  reason: invalid class name */
public final class AnonymousClass0QD {
    public final Object A00 = AnonymousClass002.A0D();
    public final Map A01 = new LinkedHashMap();

    public final C03440Kd A00(AnonymousClass0PL r3) {
        C03440Kd r0;
        C162457s7.A0J(r3, 0);
        synchronized (this.A00) {
            r0 = (C03440Kd) this.A01.remove(r3);
        }
        return r0;
    }

    public final List A02(String str) {
        List A0F;
        C162457s7.A0J(str, 0);
        synchronized (this.A00) {
            Map map = this.A01;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                if (C162457s7.A0P(((AnonymousClass0PL) A0w.getKey()).A01, str)) {
                    linkedHashMap.put(A0w.getKey(), A0w.getValue());
                }
            }
            for (AnonymousClass0PL remove : linkedHashMap.keySet()) {
                map.remove(remove);
            }
            A0F = C73723fy.A0F(linkedHashMap.values());
        }
        return A0F;
    }

    public final C03440Kd A01(AnonymousClass0PL r4) {
        C03440Kd r0;
        synchronized (this.A00) {
            Map map = this.A01;
            Object obj = map.get(r4);
            if (obj == null) {
                obj = new C03440Kd(r4);
                map.put(r4, obj);
            }
            r0 = (C03440Kd) obj;
        }
        return r0;
    }

    public final boolean A03(AnonymousClass0PL r3) {
        boolean containsKey;
        synchronized (this.A00) {
            containsKey = this.A01.containsKey(r3);
        }
        return containsKey;
    }
}
