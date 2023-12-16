package X;

/* renamed from: X.6WW  reason: invalid class name */
public final class AnonymousClass6WW extends C172868Ne {
    public boolean A00;
    public final /* synthetic */ Object A01;

    public AnonymousClass6WW(Object obj) {
        this.A01 = obj;
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1T(this.A00 ? 1 : 0);
    }

    public final Object next() {
        if (!this.A00) {
            this.A00 = true;
            return this.A01;
        }
        throw AnonymousClass6CA.A0c();
    }
}
