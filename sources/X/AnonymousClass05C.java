package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.05C  reason: invalid class name */
public class AnonymousClass05C<K, V> extends C06290Wz<K, V> implements Map<K, V> {
    public AnonymousClass0UU A00;

    public Set entrySet() {
        AnonymousClass0UU r1 = this.A00;
        if (r1 == null) {
            r1 = new C17540vk(this, 0);
            this.A00 = r1;
        }
        C13550nM r0 = r1.A00;
        if (r0 != null) {
            return r0;
        }
        C13550nM r02 = new C13550nM(r1);
        r1.A00 = r02;
        return r02;
    }

    public Set keySet() {
        AnonymousClass0UU r1 = this.A00;
        if (r1 == null) {
            r1 = new C17540vk(this, 0);
            this.A00 = r1;
        }
        C13560nN r0 = r1.A01;
        if (r0 != null) {
            return r0;
        }
        C13560nN r02 = new C13560nN(r1);
        r1.A01 = r02;
        return r02;
    }

    public void putAll(Map map) {
        A08(this.A00 + map.size());
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            put(A0w.getKey(), A0w.getValue());
        }
    }

    public Collection values() {
        AnonymousClass0UU r1 = this.A00;
        if (r1 == null) {
            r1 = new C17540vk(this, 0);
            this.A00 = r1;
        }
        C13390n6 r0 = r1.A02;
        if (r0 != null) {
            return r0;
        }
        C13390n6 r02 = new C13390n6(r1);
        r1.A02 = r02;
        return r02;
    }

    public AnonymousClass05C(C06290Wz r1) {
        A09(r1);
    }

    public AnonymousClass05C(int i) {
        super(i);
    }

    public AnonymousClass05C() {
    }
}
