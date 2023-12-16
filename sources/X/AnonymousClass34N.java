package X;

/* renamed from: X.34N  reason: invalid class name */
public final class AnonymousClass34N {
    public static final AnonymousClass4GR A00 = C828445d.A00;
    public static final AnonymousClass4GR A01 = C828545e.A00;
    public static final AnonymousClass4GR A02 = C828645f.A00;
    public static final AnonymousClass2XH A03 = new AnonymousClass2XH("NO_THREAD_ELEMENTS");

    public static final Object A00(Object obj, C85494Gl r2) {
        if (obj == null) {
            obj = r2.fold(C18290x4.A0Z(), A00);
            C162457s7.A0H(obj);
        }
        if (obj == C18290x4.A0Z()) {
            return A03;
        }
        if (obj instanceof Integer) {
            return r2.fold(new C41982Mi(r2, AnonymousClass001.A0K(obj)), A02);
        }
        C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        throw AnonymousClass001.A0g("updateThreadContext");
    }

    public static final void A01(Object obj, C85494Gl r2) {
        if (obj == A03) {
            return;
        }
        if (obj instanceof C41982Mi) {
            AnonymousClass4GX[] r1 = ((C41982Mi) obj).A01;
            int length = r1.length - 1;
            if (length >= 0) {
                C162457s7.A0H(r1[length]);
                throw AnonymousClass001.A0g("restoreThreadContext");
            }
            return;
        }
        C162457s7.A0K(r2.fold((Object) null, A01), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        throw AnonymousClass001.A0g("restoreThreadContext");
    }
}
