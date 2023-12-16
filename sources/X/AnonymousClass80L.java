package X;

/* renamed from: X.80L  reason: invalid class name */
public class AnonymousClass80L implements C17190ui {
    public C05550Ty Azr(Class cls) {
        Class<AnonymousClass6H6> cls2 = AnonymousClass6H6.class;
        if (cls.equals(cls2)) {
            return new AnonymousClass6H6();
        }
        Class<C125226Gy> cls3 = C125226Gy.class;
        if (cls.equals(cls3)) {
            return new C125226Gy();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Model class must be one of: [");
        A0o.append(cls2.getCanonicalName());
        AnonymousClass001.A1M(A0o);
        A0o.append(cls3.getCanonicalName());
        throw AnonymousClass000.A0F("]", A0o);
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return AnonymousClass0IW.A00(this, cls);
    }
}
