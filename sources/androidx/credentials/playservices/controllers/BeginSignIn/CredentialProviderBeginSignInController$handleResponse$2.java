package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass0GQ;
import X.AnonymousClass4GQ;
import X.C162457s7;
import X.C59022wD;
import X.C829045j;

public final class CredentialProviderBeginSignInController$handleResponse$2 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CredentialProviderBeginSignInController this$0;

    public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AnonymousClass0GQ r2) {
        C162457s7.A0J(credentialProviderBeginSignInController, 0);
        C162457s7.A0J(r2, 1);
        credentialProviderBeginSignInController.getCallback().BSE(r2);
    }

    public final void invoke(AnonymousClass0GQ r4) {
        C162457s7.A0J(r4, 0);
        this.this$0.getExecutor().execute(new CredentialProviderBeginSignInController$handleResponse$2$$ExternalSyntheticLambda0(this.this$0, r4));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        super(1);
        this.this$0 = credentialProviderBeginSignInController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnonymousClass0GQ) obj);
        return C59022wD.A00;
    }
}
