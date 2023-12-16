package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: X.6aC  reason: invalid class name and case insensitive filesystem */
public abstract class C129366aC extends AnonymousClass8CM implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient Map map;
    public transient int totalSize;

    public abstract Collection createCollection();

    public abstract Collection unmodifiableCollectionSubclass(Collection collection);

    public abstract Collection wrapCollection(Object obj, Collection collection);

    public static /* synthetic */ int access$208(C129366aC r2) {
        int i = r2.totalSize;
        r2.totalSize = i + 1;
        return i;
    }

    public static /* synthetic */ int access$210(C129366aC r2) {
        int i = r2.totalSize;
        r2.totalSize = i - 1;
        return i;
    }

    public static /* synthetic */ int access$212(C129366aC r1, int i) {
        int i2 = r1.totalSize + i;
        r1.totalSize = i2;
        return i2;
    }

    public static /* synthetic */ int access$220(C129366aC r1, int i) {
        int i2 = r1.totalSize - i;
        r1.totalSize = i2;
        return i2;
    }

    public static Iterator iteratorOrListIterator(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* access modifiers changed from: private */
    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) C162057r9.safeRemove(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Map backingMap() {
        return this.map;
    }

    public void clear() {
        Iterator A0v = AnonymousClass001.A0v(this.map);
        while (A0v.hasNext()) {
            ((Collection) A0v.next()).clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    public final Map createMaybeNavigableAsMap() {
        Map map2 = this.map;
        if (map2 instanceof NavigableMap) {
            return new C129216Zx(this, (NavigableMap) map2);
        }
        if (map2 instanceof SortedMap) {
            return new C129226Zy(this, (SortedMap) map2);
        }
        return new C129756ap(this, map2);
    }

    public final Set createMaybeNavigableKeySet() {
        Map map2 = this.map;
        if (map2 instanceof NavigableMap) {
            return new C129246a0(this, (NavigableMap) map2);
        }
        if (map2 instanceof SortedMap) {
            return new C129256a1(this, (SortedMap) map2);
        }
        return new C129746ao(this, map2);
    }

    public Collection createValues() {
        return new C174028Sr(this);
    }

    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.map.get(obj);
        if (collection == null) {
            Collection createCollection = createCollection(obj);
            if (createCollection.add(obj2)) {
                this.totalSize++;
                this.map.put(obj, createCollection);
                return true;
            }
            throw AnonymousClass0x9.A0i("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.totalSize++;
            return true;
        }
    }

    public final void setMap(Map map2) {
        this.map = map2;
        this.totalSize = 0;
        Iterator A0v = AnonymousClass001.A0v(map2);
        while (A0v.hasNext()) {
            Collection collection = (Collection) A0v.next();
            C162187rP.A06(C18310x6.A1X(collection));
            this.totalSize += collection.size();
        }
    }

    public int size() {
        return this.totalSize;
    }

    public Iterator valueIterator() {
        return new C129236Zz(this);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List, X.6a3] */
    public final List wrapList(Object obj, List list, C174068Sv r4) {
        if (list instanceof RandomAccess) {
            return new C129276a3(this, obj, list, r4);
        }
        return new C129286a4(this, obj, list, r4);
    }

    public C129366aC(Map map2) {
        C162187rP.A06(map2.isEmpty());
        this.map = map2;
    }

    public Collection createCollection(Object obj) {
        return createCollection();
    }
}
