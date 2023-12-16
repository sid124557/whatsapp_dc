package X;

import java.io.Serializable;

/* renamed from: X.8A9  reason: invalid class name */
public final class AnonymousClass8A9 implements C180948lt, Serializable {
    public transient Object A00;
    public volatile transient boolean A01;
    public final C180948lt zza;

    public final Object BtG() {
        if (!this.A01) {
            synchronized (this) {
                if (!this.A01) {
                    Object BtG = this.zza.BtG();
                    this.A00 = BtG;
                    this.A01 = true;
                    return BtG;
                }
            }
        }
        return this.A00;
    }

    public AnonymousClass8A9(C180948lt r1) {
        this.zza = r1;
    }

    public final String toString() {
        Object obj;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Suppliers.memoize(");
        if (this.A01) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("<supplier that returned ");
            A0o2.append(this.A00);
            obj = AnonymousClass000.A0X(">", A0o2);
        } else {
            obj = this.zza;
        }
        A0o.append(obj);
        return AnonymousClass000.A0e(A0o);
    }
}
