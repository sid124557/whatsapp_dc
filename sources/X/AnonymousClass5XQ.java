package X;

import java.util.Map;

/* renamed from: X.5XQ  reason: invalid class name */
public class AnonymousClass5XQ {
    public Map A00;
    public final AnonymousClass1VX A01;

    public synchronized int A00(C31981pC r11) {
        int i;
        long j;
        AnonymousClass0PJ r0;
        long j2;
        AnonymousClass0PJ r02;
        synchronized (this) {
            AnonymousClass1VX r1 = this.A01;
            if (r1.A0X(2281)) {
                int A0N = r1.A0N(3683);
                double A06 = (double) (C56952sp.A06(r1, 3684) * 1000);
                if (r11.A0B <= 1) {
                    j2 = 600;
                } else {
                    j2 = ((long) r11.A0B) * 1000;
                }
                i = Math.min(A0N, (int) Math.ceil(A06 / ((double) j2)));
                Map map = this.A00;
                if (!(map == null || (r02 = (AnonymousClass0PJ) map.get(r11.A1J)) == null)) {
                    i -= ((Integer) r02.A01).intValue();
                }
            } else {
                if (r11.A0B <= 1) {
                    j = 600;
                } else {
                    j = C18290x4.A0A(r11.A0B);
                }
                i = Math.max(3, (int) Math.ceil(6000.0d / ((double) j)));
                Map map2 = this.A00;
                if (!(map2 == null || (r0 = (AnonymousClass0PJ) map2.get(r11.A1J)) == null)) {
                    i -= ((Integer) r0.A01).intValue();
                }
            }
        }
        return i;
    }

    public synchronized void A01(AnonymousClass2z0 r4) {
        Map map = this.A00;
        if (map == null) {
            map = AnonymousClass001.A0t();
            this.A00 = map;
        }
        map.put(r4, AnonymousClass0x9.A0G(AnonymousClass0x2.A0T(), C18290x4.A0Z()));
    }

    public synchronized void A02(AnonymousClass2z0 r2) {
        Map map = this.A00;
        if (map != null) {
            map.remove(r2);
        }
    }

    public AnonymousClass5XQ(AnonymousClass1VX r1) {
        this.A01 = r1;
    }
}
