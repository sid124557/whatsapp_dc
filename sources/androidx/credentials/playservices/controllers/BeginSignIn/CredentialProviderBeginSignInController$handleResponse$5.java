package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass0GQ;
import X.AnonymousClass4GP;
import X.C162457s7;
import X.C829045j;

public final class CredentialProviderBeginSignInController$handleResponse$5 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass0GQ $e;
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AnonymousClass0GQ r2) {
        C162457s7.A0J(credentialProviderBeginSignInController, 0);
        C162457s7.A0J(r2, 1);
        credentialProviderBeginSignInController.getCallback().BSE(r2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AnonymousClass0GQ r3) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.$e = r3;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$5$$ExternalSyntheticLambda0(this.this$0, this.$e));
    }
}
