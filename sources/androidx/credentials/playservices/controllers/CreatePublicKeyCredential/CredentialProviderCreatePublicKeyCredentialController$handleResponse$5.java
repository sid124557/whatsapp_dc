package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass0KR;
import X.AnonymousClass4GP;
import X.C162457s7;
import X.C16630ti;
import X.C829045j;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$5 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass0KR $response;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AnonymousClass0KR r2) {
        C162457s7.A0J(credentialProviderCreatePublicKeyCredentialController, 0);
        C162457s7.A0J(r2, 1);
        C16630ti r0 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (r0 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else {
            r0.onResult(r2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, AnonymousClass0KR r3) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$response = r3;
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C162457s7.A0M("executor");
            throw AnonymousClass000.A0L();
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$response));
        }
    }
}
