package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass0GP;
import X.AnonymousClass4GP;
import X.C162457s7;
import X.C16630ti;
import X.C829045j;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$4 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass0GP $exception;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AnonymousClass0GP r2) {
        C162457s7.A0J(credentialProviderCreatePublicKeyCredentialController, 0);
        C16630ti r0 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (r0 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else {
            r0.BSE(r2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AnonymousClass0GP r3) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$exception = r3;
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C162457s7.A0M("executor");
            throw AnonymousClass000.A0L();
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$exception));
        }
    }
}
