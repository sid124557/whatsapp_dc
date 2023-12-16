package X;

/* renamed from: X.41h  reason: invalid class name and case insensitive filesystem */
public final class C818441h extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4GW $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C818441h(AnonymousClass4GW r2) {
        super(1);
        this.$continuation = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        AnonymousClass4GW r2 = this.$continuation;
        if (th == null) {
            th = AnonymousClass001.A0e("Unknown error during cancellation");
        }
        r2.BkD(new AnonymousClass3Z9(AnonymousClass3Z0.A01(th)));
        return C59022wD.A00;
    }
}
