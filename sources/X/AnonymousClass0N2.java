package X;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0N2  reason: invalid class name */
public class AnonymousClass0N2 {
    public final HashMap A00 = AnonymousClass001.A0t();

    public final void A00() {
        HashMap hashMap = this.A00;
        for (C05550Ty r3 : hashMap.values()) {
            r3.A02 = true;
            Map map = r3.A00;
            synchronized (map) {
                Iterator A0v = AnonymousClass001.A0v(map);
                while (A0v.hasNext()) {
                    C05550Ty.A06(A0v.next());
                }
            }
            Set<Closeable> set = r3.A01;
            synchronized (set) {
                for (Closeable A06 : set) {
                    C05550Ty.A06(A06);
                }
            }
            r3.A0C();
        }
        hashMap.clear();
    }
}
