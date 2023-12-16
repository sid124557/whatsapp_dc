package X;

/* renamed from: X.8A7  reason: invalid class name */
public final class AnonymousClass8A7 implements C180948lt {
    public Object A00;
    public volatile C180948lt A01;
    public volatile boolean A02;

    public final Object BtG() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    C180948lt r0 = this.A01;
                    r0.getClass();
                    Object BtG = r0.BtG();
                    this.A00 = BtG;
                    this.A02 = true;
                    this.A01 = null;
                    return BtG;
                }
            }
        }
        return this.A00;
    }

    public final String toString() {
        Object obj = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Suppliers.memoize(");
        if (obj == null) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("<supplier that returned ");
            A0o2.append(this.A00);
            obj = AnonymousClass000.A0X(">", A0o2);
        }
        A0o.append(obj);
        return AnonymousClass000.A0e(A0o);
    }

    public AnonymousClass8A7(C180948lt r1) {
        this.A01 = r1;
    }
}
