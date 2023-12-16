package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8R0  reason: invalid class name */
public class AnonymousClass8R0 implements C183658qP, C188118yL {
    public Collection A00;

    public Collection B9N(C188108yK r5) {
        if (r5 == null) {
            return AnonymousClass002.A0J(this.A00);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : this.A00) {
            if (r5.BKp(next)) {
                A0s.add(next);
            }
        }
        return A0s;
    }

    public Iterator iterator() {
        return AnonymousClass6C7.A0u(this.A00);
    }

    public AnonymousClass8R0(Collection collection) {
        this.A00 = AnonymousClass002.A0J(collection);
    }
}
