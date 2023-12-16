package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass000;
import X.AnonymousClass0GP;
import X.AnonymousClass4GQ;
import X.C162457s7;
import X.C16630ti;
import X.C59022wD;
import X.C829045j;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$handleResponse$2 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, AnonymousClass0GP r2) {
        C162457s7.A0J(credentialProviderCreatePasswordController, 0);
        C162457s7.A0J(r2, 1);
        C16630ti r0 = credentialProviderCreatePasswordController.callback;
        if (r0 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else {
            r0.BSE(r2);
        }
    }

    public final void invoke(AnonymousClass0GP r4) {
        C162457s7.A0J(r4, 0);
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            C162457s7.A0M("executor");
            throw AnonymousClass000.A0L();
        } else {
            executor.execute(new CredentialProviderCreatePasswordController$handleResponse$2$$ExternalSyntheticLambda0(credentialProviderCreatePasswordController, r4));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$handleResponse$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        super(1);
        this.this$0 = credentialProviderCreatePasswordController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AnonymousClass0GP) obj);
        return C59022wD.A00;
    }
}
