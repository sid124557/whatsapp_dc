package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.2or  reason: invalid class name and case insensitive filesystem */
public class C54522or {
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01 = new WeakHashMap();

    public synchronized void A00(C84114Bb r4, Class cls, Object obj) {
        synchronized (this) {
            Map map = this.A00;
            Map A1B = AnonymousClass0x9.A1B(cls, map);
            if (A1B == null) {
                A1B = new WeakHashMap();
                map.put(cls, A1B);
            }
            A1B.put(obj, r4);
            Map map2 = this.A01;
            Set set = (Set) map2.get(obj);
            if (set == null) {
                set = AnonymousClass002.A0K();
                map2.put(obj, set);
            }
            set.add(cls);
        }
    }

    public synchronized void A01(AnonymousClass48Z r4) {
        Log.d(String.format("UIObserver.fire: %s", AnonymousClass000.A1b(r4)));
        Map A1B = AnonymousClass0x9.A1B(r4.getClass(), this.A00);
        if (A1B != null) {
            Iterator A0i = C18280x3.A0i(A1B);
            while (A0i.hasNext()) {
                C84114Bb r0 = (C84114Bb) A1B.get(A0i.next());
                if (r0 != null) {
                    r0.BSV(r4);
                }
            }
        }
    }

    public synchronized void A02(Class cls, Object obj) {
        Map A1B = AnonymousClass0x9.A1B(cls, this.A00);
        if (A1B != null) {
            A1B.remove(obj);
        }
        Set set = (Set) this.A01.get(obj);
        if (set != null) {
            set.remove(cls);
        }
    }

    public synchronized void A03(Object obj) {
        Set set = (Set) this.A01.get(obj);
        if (set != null) {
            Iterator it = AnonymousClass0x9.A15(set).iterator();
            while (it.hasNext()) {
                A02((Class) it.next(), obj);
            }
        }
    }
}
