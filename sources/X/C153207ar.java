package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7ar  reason: invalid class name and case insensitive filesystem */
public class C153207ar {
    public final Map builderMap = C161517pp.preservesInsertionOrderOnPutsMap();

    public C129386aE build() {
        return C129636ad.fromMapEntries(this.builderMap.entrySet(), (Comparator) null);
    }

    public C153207ar putAll(Object obj, Iterable iterable) {
        if (obj == null) {
            String valueOf = String.valueOf(C162247rW.toString(iterable));
            throw AnonymousClass001.A0g(AnonymousClass6C7.A0k("null key in entry: null=", valueOf, valueOf.length()));
        }
        Collection collection = (Collection) this.builderMap.get(obj);
        Iterator it = iterable.iterator();
        if (collection != null) {
            while (it.hasNext()) {
                Object next = it.next();
                C160937oh.checkEntryNotNull(obj, next);
                collection.add(next);
            }
        } else if (it.hasNext()) {
            Collection newMutableValueCollection = newMutableValueCollection();
            while (it.hasNext()) {
                Object next2 = it.next();
                C160937oh.checkEntryNotNull(obj, next2);
                newMutableValueCollection.add(next2);
            }
            this.builderMap.put(obj, newMutableValueCollection);
            return this;
        }
        return this;
    }

    public Collection newMutableValueCollection() {
        return AnonymousClass001.A0s();
    }

    public C153207ar put(Object obj, Object obj2) {
        C160937oh.checkEntryNotNull(obj, obj2);
        Collection collection = (Collection) this.builderMap.get(obj);
        if (collection == null) {
            Map map = this.builderMap;
            collection = newMutableValueCollection();
            map.put(obj, collection);
        }
        collection.add(obj2);
        return this;
    }

    public C153207ar putAll(Object obj, Object... objArr) {
        putAll(obj, (Iterable) Arrays.asList(objArr));
        return this;
    }
}
