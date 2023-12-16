package X;

/* renamed from: X.8CG  reason: invalid class name */
public final class AnonymousClass8CG implements C181278mV {
    public static final Object A02 = AnonymousClass002.A0D();
    public volatile C181278mV A00;
    public volatile Object A01 = A02;

    public final Object Avs() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.Avs();
                Object obj4 = this.A01;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A01 = obj;
                    this.A00 = null;
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Scoped provider was invoked recursively returning different results: ");
                    A0o.append(obj4);
                    A0o.append(" & ");
                    A0o.append(obj);
                    throw AnonymousClass000.A0I(". This is likely due to a circular dependency.", A0o);
                }
            }
        }
        return obj;
    }

    public AnonymousClass8CG(C181278mV r2) {
        this.A00 = r2;
    }
}
