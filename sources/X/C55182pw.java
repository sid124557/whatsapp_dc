package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2pw  reason: invalid class name and case insensitive filesystem */
public class C55182pw {
    public final Map A00 = AnonymousClass001.A0t();
    public final Set A01 = AnonymousClass0x9.A17();

    public synchronized C59402wr A01(C54562ov r2) {
        this.A01.remove(r2);
        return (C59402wr) this.A00.get(r2);
    }

    public synchronized void A04(C59402wr r8, C54562ov r9) {
        synchronized (this) {
            Map map = this.A00;
            if (map.size() > 1000) {
                Iterator it = this.A01.iterator();
                while (it.hasNext() && map.size() > 1000) {
                    C54562ov r2 = (C54562ov) it.next();
                    map.remove(r2);
                    it.remove();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SessionCache/removed ");
                    A0o.append(r2);
                    C18260x0.A1J(A0o, " from cache");
                }
            }
            if (map.containsKey(r9)) {
                this.A01.add(r9);
            }
            map.put(r9, r8);
        }
    }

    public synchronized void A05(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C54562ov r2 = (C54562ov) it.next();
            Map map = this.A00;
            if (!map.containsKey(r2)) {
                map.put(r2, new C59402wr());
            }
        }
    }

    public static void A00(C55182pw r1, C54562ov r2, byte[] bArr) {
        C59402wr r0 = new C59402wr(bArr);
        C621133n.A01(r0);
        r1.A04(r0, r2);
    }

    public Set A02(List list) {
        HashSet A0p = C18320x8.A0p(list);
        synchronized (this) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C54562ov r1 = (C54562ov) it.next();
                C59402wr r0 = (C59402wr) this.A00.get(r1);
                if (r0 != null && r0.A00) {
                    A0p.add(r1);
                }
            }
        }
        return A0p;
    }

    public Set A03(List list) {
        HashSet A0p = C18320x8.A0p(list);
        synchronized (this) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C54562ov r1 = (C54562ov) it.next();
                if (!this.A00.containsKey(r1)) {
                    A0p.add(r1);
                }
            }
        }
        return A0p;
    }
}
