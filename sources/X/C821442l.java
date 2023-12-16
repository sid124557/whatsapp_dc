package X;

/* renamed from: X.42l  reason: invalid class name and case insensitive filesystem */
public final class C821442l extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C69903Yy $runningJob;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C821442l(C69903Yy r2) {
        super(1);
        this.$runningJob = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = this.$runningJob.element;
        if (obj2 == null) {
            throw C18270x1.A0S("runningJob");
        }
        ((AnonymousClass47C) obj2).cancel();
        return C59022wD.A00;
    }
}
