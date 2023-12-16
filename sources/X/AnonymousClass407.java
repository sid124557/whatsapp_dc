package X;

/* renamed from: X.407  reason: invalid class name */
public final class AnonymousClass407 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass4EJ $fbUserEntityOperationCallback;
    public final /* synthetic */ AnonymousClass24F $iqResponseErrorException;
    public final /* synthetic */ C54662p5 $operationRetryState;
    public final /* synthetic */ Runnable $retryRunnable;
    public final /* synthetic */ C43052Qo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass407(C43052Qo r2, AnonymousClass4EJ r3, C54662p5 r4, AnonymousClass24F r5, Runnable runnable) {
        super(0);
        this.this$0 = r2;
        this.$retryRunnable = runnable;
        this.$iqResponseErrorException = r5;
        this.$fbUserEntityOperationCallback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Runnable runnable = this.$retryRunnable;
        AnonymousClass24F r2 = this.$iqResponseErrorException;
        AnonymousClass4EJ r1 = this.$fbUserEntityOperationCallback;
        if (this.$operationRetryState.A04()) {
            runnable.run();
        } else {
            r1.BSB(r2);
        }
        return C59022wD.A00;
    }
}
