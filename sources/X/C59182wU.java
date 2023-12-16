package X;

import java.util.Map;

/* renamed from: X.2wU  reason: invalid class name and case insensitive filesystem */
public final class C59182wU {
    public static final C48082eJ A01 = new C48082eJ((Object) null);
    public final Map A00 = AnonymousClass001.A0t();

    public final void A00(int i, Object obj) {
        if (obj == null) {
            this.A00.remove(Integer.valueOf(i));
            return;
        }
        C48082eJ r3 = new C48082eJ(obj);
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !map.get(valueOf).equals(r3)) {
            map.put(valueOf, r3);
        }
    }
}
