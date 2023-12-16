package X;

/* renamed from: X.8Ce  reason: invalid class name and case insensitive filesystem */
public class C170178Ce implements C183988qz {
    public C183988qz[] A00;

    public boolean BJ4(Class cls) {
        for (C183988qz BJ4 : this.A00) {
            if (BJ4.BJ4(cls)) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass7MO BLD(Class cls) {
        for (C183988qz r1 : this.A00) {
            if (r1.BJ4(cls)) {
                return r1.BLD(cls);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("No factory is available for message type: ");
        throw AnonymousClass002.A0G(AnonymousClass000.A0X(cls.getName(), A0o));
    }

    public C170178Ce(C183988qz... r1) {
        this.A00 = r1;
    }
}
