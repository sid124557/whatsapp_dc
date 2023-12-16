package androidx.credentials.playservices.controllers;

import X.AnonymousClass4GP;
import X.C162457s7;
import X.C16630ti;
import X.C829045j;
import java.util.concurrent.Executor;

public final class CredentialProviderController$maybeReportErrorFromResultReceiver$1 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C16630ti $callback;
    public final /* synthetic */ Object $exception;
    public final /* synthetic */ Executor $executor;

    public static final void invoke$lambda$0(C16630ti r1, Object obj) {
        C162457s7.A0J(r1, 0);
        C162457s7.A0J(obj, 1);
        r1.BSE(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$maybeReportErrorFromResultReceiver$1(Executor executor, C16630ti r3, Object obj) {
        super(0);
        this.$executor = executor;
        this.$callback = r3;
        this.$exception = obj;
    }

    public final void invoke() {
        this.$executor.execute(new CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0(this.$callback, this.$exception));
    }
}
