package X;

import java.util.Collection;
import java.util.Comparator;

/* renamed from: X.6ac  reason: invalid class name and case insensitive filesystem */
public final class C129626ac extends C153207ar {
    public C129656af build() {
        return C129656af.fromMapEntries(this.builderMap.entrySet(), (Comparator) null);
    }

    public Collection newMutableValueCollection() {
        return C161517pp.preservesInsertionOrderOnAddsSet();
    }

    public C129626ac put(Object obj, Object obj2) {
        super.put(obj, obj2);
        return this;
    }

    public C129626ac putAll(Object obj, Iterable iterable) {
        super.putAll(obj, iterable);
        return this;
    }
}
