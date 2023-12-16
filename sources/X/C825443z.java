package X;

/* renamed from: X.43z  reason: invalid class name and case insensitive filesystem */
public final class C825443z extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Runnable $block;
    public final /* synthetic */ C831346g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C825443z(Runnable runnable, C831346g r3) {
        super(1);
        this.this$0 = r3;
        this.$block = runnable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A00.removeCallbacks(this.$block);
        return C59022wD.A00;
    }
}
