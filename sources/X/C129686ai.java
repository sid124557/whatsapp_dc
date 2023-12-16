package X;

/* renamed from: X.6ai  reason: invalid class name and case insensitive filesystem */
public final class C129686ai<K> extends C129526aS<K> {
    public final transient C129586aY list;
    public final transient AnonymousClass8OQ map;

    public C129586aY asList() {
        return this.list;
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1W(this.map.get(obj));
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.map.size();
    }

    public C129686ai(AnonymousClass8OQ r1, C129586aY r2) {
        this.map = r1;
        this.list = r2;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    public C172878Nf iterator() {
        return asList().iterator();
    }
}
