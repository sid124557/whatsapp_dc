package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass000;
import X.AnonymousClass4GP;
import X.C007506o;
import X.C162457s7;
import X.C16630ti;
import X.C829045j;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$invokePlayServices$1 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        C162457s7.A0J(credentialProviderCreatePasswordController, 0);
        C16630ti r2 = credentialProviderCreatePasswordController.callback;
        if (r2 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else {
            r2.BSE(new C007506o(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$invokePlayServices$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public final void invoke() {
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            C162457s7.A0M("executor");
            throw AnonymousClass000.A0L();
        } else {
            executor.execute(new CredentialProviderCreatePasswordController$invokePlayServices$1$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController));
        }
    }
}
