package X;

import java.util.Map;

/* renamed from: X.7SC  reason: invalid class name */
public class AnonymousClass7SC {
    public final Object A00 = AnonymousClass002.A0D();
    public final Map A01 = AnonymousClass001.A0t();

    public int A00(AnonymousClass84O r5, AnonymousClass84O r6, String str) {
        int incrementAndGet;
        C48842fZ r3 = new C48842fZ(r6.A02, r5.A02, str);
        synchronized (this.A00) {
            Map map = this.A01;
            Integer num = (Integer) map.get(r3);
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = AnonymousClass77G.A00.incrementAndGet();
                C18280x3.A1D(r3, map, incrementAndGet);
            }
        }
        return incrementAndGet;
    }
}
