package X;

/* renamed from: X.0eM  reason: invalid class name and case insensitive filesystem */
public class C08380eM implements C17190ui {
    public static C08380eM A00;
    public static final C15120qo A01 = C08400eO.A00;

    public C05550Ty Azr(Class cls) {
        C162457s7.A0J(cls, 0);
        try {
            Object newInstance = cls.newInstance();
            C162457s7.A0D(newInstance);
            return (C05550Ty) newInstance;
        } catch (InstantiationException e) {
            throw new RuntimeException(AnonymousClass000.A0P(cls, "Cannot create an instance of ", AnonymousClass001.A0o()), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(AnonymousClass000.A0P(cls, "Cannot create an instance of ", AnonymousClass001.A0o()), e2);
        }
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return AnonymousClass0IW.A00(this, cls);
    }
}
