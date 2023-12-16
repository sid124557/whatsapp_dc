package X;

/* renamed from: X.6WY  reason: invalid class name */
public final class AnonymousClass6WY extends AnonymousClass6WZ {
    public int A00;
    public final int A01;
    public final AnonymousClass6WS A02;

    public final boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01);
    }

    public final boolean hasPrevious() {
        return AnonymousClass001.A1W(this.A00);
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public AnonymousClass6WY(AnonymousClass6WS r3, int i) {
        int size = r3.size();
        if (i <= size) {
            this.A01 = size;
            this.A00 = i;
            this.A02 = r3;
            return;
        }
        throw new IndexOutOfBoundsException(C159327le.A00("index", i, size));
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return this.A02.get(i);
        }
        throw AnonymousClass6CA.A0c();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return this.A02.get(i);
        }
        throw AnonymousClass6CA.A0c();
    }
}
