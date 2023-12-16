package X;

/* renamed from: X.3dZ  reason: invalid class name and case insensitive filesystem */
public final class C72343dZ implements AnonymousClass4C1, C183538qC {
    public static final Object A02 = AnonymousClass002.A0D();
    public volatile Object A00 = A02;
    public volatile AnonymousClass4C1 A01;

    public static C183538qC A00(AnonymousClass4C1 r1) {
        if (r1 instanceof C183538qC) {
            return (C183538qC) r1;
        }
        r1.getClass();
        return new C72343dZ(r1);
    }

    public Object get() {
        Object obj;
        Object obj2 = this.A00;
        Object obj3 = A02;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.A00;
            if (obj == obj3) {
                obj = this.A01.get();
                Object obj4 = this.A00;
                if (obj4 == obj3 || obj4 == obj) {
                    this.A00 = obj;
                    this.A01 = null;
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

    public C72343dZ(AnonymousClass4C1 r2) {
        this.A01 = r2;
    }

    public static AnonymousClass4C1 A01(AnonymousClass4C1 r1) {
        r1.getClass();
        if (r1 instanceof C72343dZ) {
            return r1;
        }
        return new C72343dZ(r1);
    }
}
