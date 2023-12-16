package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass07O;
import X.AnonymousClass07R;
import X.AnonymousClass4GP;
import X.C162457s7;
import X.C16630ti;
import X.C829045j;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$7 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Throwable $t;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        C162457s7.A0J(credentialProviderCreatePublicKeyCredentialController, 0);
        C162457s7.A0J(th, 1);
        C16630ti r3 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (r3 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else {
            r3.BSE(new AnonymousClass07R(new AnonymousClass07O(), th.getMessage()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$t = th;
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C162457s7.A0M("executor");
            throw AnonymousClass000.A0L();
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$t));
        }
    }
}
