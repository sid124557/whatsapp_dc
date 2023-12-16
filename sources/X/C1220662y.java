package X;

/* renamed from: X.62y  reason: invalid class name and case insensitive filesystem */
public final class C1220662y extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Runnable $dismissToolTipRunnable;
    public final /* synthetic */ C69263Wi $globalUI;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1220662y(C69263Wi r2, Runnable runnable) {
        super(1);
        this.$globalUI = r2;
        this.$dismissToolTipRunnable = runnable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C152107Xo r5 = (C152107Xo) obj;
        C162457s7.A0J(r5, 0);
        this.$globalUI.A0R(this.$dismissToolTipRunnable);
        if (r5.A00) {
            this.$globalUI.A0T(this.$dismissToolTipRunnable, 3500);
        }
        return C59022wD.A00;
    }
}
