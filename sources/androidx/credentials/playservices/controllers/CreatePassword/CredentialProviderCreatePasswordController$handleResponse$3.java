package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass000;
import X.AnonymousClass0KR;
import X.AnonymousClass4GP;
import X.C162457s7;
import X.C16630ti;
import X.C829045j;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$handleResponse$3 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass0KR $response;
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AnonymousClass0KR r2) {
        C162457s7.A0J(credentialProviderCreatePasswordController, 0);
        C162457s7.A0J(r2, 1);
        C16630ti r0 = credentialProviderCreatePasswordController.callback;
        if (r0 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else {
            r0.onResult(r2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AnonymousClass0KR r3) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = r3;
    }

    public final void invoke() {
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            C162457s7.A0M("executor");
            throw AnonymousClass000.A0L();
        } else {
            executor.execute(new CredentialProviderCreatePasswordController$handleResponse$3$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController, this.$response));
        }
    }
}
