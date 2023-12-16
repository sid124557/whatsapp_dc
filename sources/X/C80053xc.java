package X;

/* renamed from: X.3xc  reason: invalid class name and case insensitive filesystem */
public final class C80053xc extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass4GP $extrasProducer = null;
    public final /* synthetic */ AnonymousClass66R $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80053xc(AnonymousClass66R r2) {
        super(0);
        this.$owner$delegate = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C16640tj r1;
        Object invoke;
        AnonymousClass4GP r0 = this.$extrasProducer;
        if (r0 != null && (invoke = r0.invoke()) != null) {
            return invoke;
        }
        C15940sD A06 = C829045j.A06(this.$owner$delegate);
        if (!(A06 instanceof C16640tj) || (r1 = (C16640tj) A06) == null) {
            return AnonymousClass08b.A00;
        }
        return r1.B6t();
    }
}
