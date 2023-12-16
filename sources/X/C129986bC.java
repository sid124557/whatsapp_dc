package X;

/* renamed from: X.6bC  reason: invalid class name and case insensitive filesystem */
public abstract class C129986bC extends C129996bD {
    public int position;
    public final int size;

    public abstract Object get(int i);

    public final boolean hasNext() {
        return AnonymousClass001.A1Y(this.position, this.size);
    }

    public final boolean hasPrevious() {
        return AnonymousClass001.A1W(this.position);
    }

    public final int nextIndex() {
        return this.position;
    }

    public final int previousIndex() {
        return this.position - 1;
    }

    public C129986bC(int i, int i2) {
        C162187rP.A02(i2, i);
        this.size = i;
        this.position = i2;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.position;
            this.position = i + 1;
            return get(i);
        }
        throw AnonymousClass6CA.A0c();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.position - 1;
            this.position = i;
            return get(i);
        }
        throw AnonymousClass6CA.A0c();
    }
}
