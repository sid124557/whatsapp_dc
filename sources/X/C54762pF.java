package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2pF  reason: invalid class name and case insensitive filesystem */
public class C54762pF {
    public final C56982ss A00;
    public final C52342lK A01 = new C52342lK();
    public final Map A02 = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A03 = AnonymousClass0x9.A1D();
    public final AtomicBoolean A04 = new AtomicBoolean();

    public void A00(C837149m r4) {
        C52342lK r2 = this.A01;
        synchronized (r2) {
            Iterator A0v = AnonymousClass001.A0v(r2.A01.A06());
            while (A0v.hasNext()) {
                r4.BrV(C18300x5.A0T(A0v));
            }
            Iterator A0q = AnonymousClass000.A0q(r2.A02);
            while (A0q.hasNext()) {
                C624134x r0 = (C624134x) ((WeakReference) AnonymousClass0x2.A0W(A0q)).get();
                if (r0 != null) {
                    r4.BrV(r0);
                }
            }
        }
        Iterator A0v2 = AnonymousClass001.A0v(this.A02);
        while (A0v2.hasNext()) {
            r4.BrV(C18300x5.A0T(A0v2));
        }
        for (AnonymousClass31A r02 : this.A00.A0E()) {
            C624134x r03 = r02.A0d;
            if (r03 != null) {
                r4.BrV(r03);
            }
        }
    }

    public void A01(C95814uZ r7) {
        C52342lK r5 = this.A01;
        synchronized (r5) {
            C04840Qw r3 = r5.A01;
            Iterator it = C18310x6.A0s(r3.A06()).iterator();
            while (it.hasNext()) {
                AnonymousClass2z0 r1 = (AnonymousClass2z0) it.next();
                if (r7.equals(r1.A00)) {
                    r3.A05(r1);
                }
            }
            ArrayList A0s = AnonymousClass001.A0s();
            Map map = r5.A02;
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                AnonymousClass2z0 r12 = (AnonymousClass2z0) A0i.next();
                if (r7.equals(r12.A00)) {
                    A0s.add(r12);
                }
            }
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                map.remove((AnonymousClass2z0) it2.next());
            }
        }
        Map map2 = this.A02;
        Iterator it3 = C18310x6.A0s(map2).iterator();
        while (it3.hasNext()) {
            AnonymousClass2z0 r13 = (AnonymousClass2z0) it3.next();
            if (r7.equals(r13.A00)) {
                map2.remove(r13);
            }
        }
        AnonymousClass31A A002 = C56982ss.A00(this.A00, r7);
        if (A002 != null) {
            A002.A0d = null;
            A002.A0c = null;
        }
    }

    public void A02(C624134x r5) {
        C52342lK r0 = this.A01;
        AnonymousClass2z0 r3 = r5.A1J;
        r0.A01(r5, r3);
        C56982ss r2 = this.A00;
        synchronized (r2) {
            AnonymousClass31A A002 = C56982ss.A00(r2, r3.A00);
            if (A002 != null) {
                C624134x r02 = A002.A0d;
                if (r02 != null && r02.A1J.equals(r3)) {
                    A002.A0d = r5;
                }
                C624134x r03 = A002.A0c;
                if (r03 != null && r03.A1J.equals(r3)) {
                    A002.A0c = r5;
                }
            }
        }
        this.A03.remove(r3);
    }

    public void A03(AnonymousClass2z0 r2) {
        this.A01.A02(r2);
        this.A02.remove(r2);
        this.A00.A0K(r2);
        this.A03.remove(r2);
    }

    public C54762pF(C56982ss r2) {
        this.A00 = r2;
    }
}
