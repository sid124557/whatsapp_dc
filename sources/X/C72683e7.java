package X;

/* renamed from: X.3e7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72683e7 implements AnonymousClass4C7 {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ C831346g A01;

    public final void dispose() {
        C831346g r0 = this.A01;
        r0.A00.removeCallbacks(this.A00);
    }

    public /* synthetic */ C72683e7(Runnable runnable, C831346g r2) {
        this.A01 = r2;
        this.A00 = runnable;
    }
}
