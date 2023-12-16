package X;

/* renamed from: X.6aO  reason: invalid class name and case insensitive filesystem */
public final class C129486aO extends C129506aQ {
    public C129486aO(int i) {
        super(4);
    }

    public C129586aY build() {
        this.forceCopy = true;
        return C129586aY.asImmutableList(this.contents, this.size);
    }

    public C129486aO add(Object obj) {
        super.add(obj);
        return this;
    }

    public C129486aO addAll(Iterable iterable) {
        super.addAll(iterable);
        return this;
    }

    public C129486aO() {
        this(4);
    }
}
