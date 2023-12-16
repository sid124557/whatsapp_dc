package X;

/* renamed from: X.8Yl  reason: invalid class name and case insensitive filesystem */
public final class C175458Yl extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Runnable $dismissToolTipRunnable;
    public final /* synthetic */ C69263Wi $globalUI;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175458Yl(C69263Wi r2, Runnable runnable) {
        super(1);
        this.$globalUI = r2;
        this.$dismissToolTipRunnable = runnable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        C152567Zj r5 = (C152567Zj) obj;
        C162457s7.A0J(r5, 0);
        this.$globalUI.A0R(this.$dismissToolTipRunnable);
        if (r5.A05) {
            if (r5.A01 == 1) {
                j = 7000;
            } else {
                j = 3500;
            }
            this.$globalUI.A0T(this.$dismissToolTipRunnable, j);
        }
        return C59022wD.A00;
    }
}
