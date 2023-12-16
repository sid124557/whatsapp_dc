package X;

/* renamed from: X.6aj  reason: invalid class name and case insensitive filesystem */
public final class C129696aj<E> extends C129526aS<E> {
    public final transient Object element;

    public C129586aY asList() {
        return C129586aY.of(this.element);
    }

    public boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    public int copyIntoArray(Object[] objArr, int i) {
        objArr[i] = this.element;
        return i + 1;
    }

    public final int hashCode() {
        return this.element.hashCode();
    }

    public boolean isPartialView() {
        return false;
    }

    public C172878Nf iterator() {
        return C162467s8.singletonIterator(this.element);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.element.toString();
        StringBuilder A0Y = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(obj) + 2);
        A0Y.append('[');
        A0Y.append(obj);
        return AnonymousClass0x2.A0f(A0Y);
    }

    public C129696aj(Object obj) {
        obj.getClass();
        this.element = obj;
    }
}
