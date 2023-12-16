package X;

/* renamed from: X.0eL  reason: invalid class name and case insensitive filesystem */
public final class C08370eL implements C17190ui {
    public final AnonymousClass0ND[] A00;

    public C08370eL(AnonymousClass0ND... r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public C05550Ty B09(AnonymousClass0N3 r8, Class cls) {
        C162457s7.A0J(cls, 0);
        C162457s7.A0J(r8, 1);
        C05550Ty r1 = null;
        for (AnonymousClass0ND r2 : this.A00) {
            if (C162457s7.A0P(r2.A00, cls)) {
                Object invoke = r2.A00().invoke(r8);
                if (invoke instanceof C05550Ty) {
                    r1 = (C05550Ty) invoke;
                } else {
                    r1 = null;
                }
            }
        }
        if (r1 != null) {
            return r1;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("No initializer set for given class ");
        throw AnonymousClass000.A0F(cls.getName(), A0o);
    }

    public /* synthetic */ C05550Ty Azr(Class cls) {
        throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
}
