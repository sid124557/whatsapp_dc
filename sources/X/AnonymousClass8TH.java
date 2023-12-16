package X;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: X.8TH  reason: invalid class name */
public abstract class AnonymousClass8TH<K, V, T> extends AbstractSet<T> {
    public final AnonymousClass8TE biMap;

    public abstract Object forEntry(int i);

    public void clear() {
        this.biMap.clear();
    }

    public Iterator iterator() {
        return new C173018Nz(this);
    }

    public int size() {
        return this.biMap.size;
    }

    public AnonymousClass8TH(AnonymousClass8TE r1) {
        this.biMap = r1;
    }
}
