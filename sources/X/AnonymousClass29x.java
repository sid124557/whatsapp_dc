package X;

/* renamed from: X.29x  reason: invalid class name */
public final class AnonymousClass29x {
    public static Object A00(Class cls, Object obj) {
        if (obj instanceof C833948f) {
            return cls.cast(obj);
        }
        if (obj instanceof AnonymousClass4C0) {
            return A00(cls, ((AnonymousClass4C0) obj).generatedComponent());
        }
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = obj.getClass();
        A1X[1] = C833948f.class;
        A1X[2] = AnonymousClass4C0.class;
        throw AnonymousClass001.A0e(String.format("Given component holder %s does not implement %s or %s", A1X));
    }
}
