package X;

/* renamed from: X.2AU  reason: invalid class name */
public final class AnonymousClass2AU {
    public static final Object A00(Object obj, AnonymousClass4GR r2, C830645z r3) {
        Object obj2;
        Object A0D;
        try {
            AnonymousClass360.A03(r2, 2);
            obj2 = r2.invoke(obj, r3);
        } catch (Throwable th) {
            obj2 = new AnonymousClass333(th);
        }
        AnonymousClass218 r22 = AnonymousClass218.COROUTINE_SUSPENDED;
        if (obj2 == r22 || (A0D = r3.A0D(obj2)) == AnonymousClass36I.A04) {
            return r22;
        }
        if (!(A0D instanceof AnonymousClass333)) {
            return AnonymousClass36I.A01(A0D);
        }
        throw ((AnonymousClass333) A0D).A00;
    }
}
