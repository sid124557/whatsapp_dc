package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass4GP;
import X.C008206v;
import X.C162457s7;
import X.C829045j;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderBeginSignInController$invokePlayServices$1 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        C162457s7.A0J(credentialProviderBeginSignInController, 0);
        credentialProviderBeginSignInController.getCallback().BSE(new C008206v(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$invokePlayServices$1(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public final void invoke() {
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$invokePlayServices$1$$ExternalSyntheticLambda0(this.this$0));
    }
}
