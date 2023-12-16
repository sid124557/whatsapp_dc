package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.AnonymousClass4GP;
import X.C162457s7;
import X.C16630ti;
import X.C829045j;
import java.util.concurrent.Executor;
import org.json.JSONException;

public final class CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ JSONException $e;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        C162457s7.A0J(credentialProviderCreatePublicKeyCredentialController, 0);
        C162457s7.A0J(jSONException, 1);
        C16630ti r1 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (r1 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else {
            r1.BSE(credentialProviderCreatePublicKeyCredentialController.JSONExceptionToPKCError(jSONException));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$e = jSONException;
    }

    public final void invoke() {
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C162457s7.A0M("executor");
            throw AnonymousClass000.A0L();
        } else {
            executor.execute(new CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1$$ExternalSyntheticLambda0(credentialProviderCreatePublicKeyCredentialController, this.$e));
        }
    }
}
