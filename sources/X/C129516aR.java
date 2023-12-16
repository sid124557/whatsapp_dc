package X;

/* renamed from: X.6aR  reason: invalid class name and case insensitive filesystem */
public final class C129516aR<K, V> extends C174098Sy<V> {
    public static final long serialVersionUID = 0;
    public final transient C129386aE multimap;

    public boolean contains(Object obj) {
        return this.multimap.containsValue(obj);
    }

    public int copyIntoArray(Object[] objArr, int i) {
        C172878Nf it = this.multimap.map.values().iterator();
        while (it.hasNext()) {
            i = ((C174098Sy) it.next()).copyIntoArray(objArr, i);
        }
        return i;
    }

    public boolean isPartialView() {
        return true;
    }

    public C172878Nf iterator() {
        return this.multimap.valueIterator();
    }

    public int size() {
        return this.multimap.size();
    }

    public C129516aR(C129386aE r1) {
        this.multimap = r1;
    }
}
