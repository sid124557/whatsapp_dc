package X;

/* renamed from: X.8CV  reason: invalid class name */
public class AnonymousClass8CV implements C181338mb {
    public static final Object A02 = AnonymousClass002.A0D();
    public volatile C181338mb A00;
    public volatile Object A01 = A02;

    public Object get() {
        Object obj;
        Object obj2 = this.A01;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A01;
            if (obj == obj3) {
                obj = this.A00.get();
                this.A01 = obj;
                this.A00 = null;
            }
        }
        return obj;
    }

    public AnonymousClass8CV(C181338mb r2) {
        this.A00 = r2;
    }
}
