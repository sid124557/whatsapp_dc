package X;

import java.util.AbstractSet;
import java.util.Set;

/* renamed from: X.8TN  reason: invalid class name */
public abstract class AnonymousClass8TN<E> extends AbstractSet<E> implements Set<E>, C85394Gb {
    public abstract boolean add(Object obj);

    public final /* bridge */ int size() {
        AnonymousClass8OR r0;
        if (this instanceof AnonymousClass8UB) {
            r0 = ((AnonymousClass8UB) this).backing;
        } else if (this instanceof AnonymousClass8UC) {
            r0 = ((AnonymousClass8UC) this).A00;
        } else {
            r0 = ((AnonymousClass8UA) this).A00;
        }
        return r0.size();
    }
}
