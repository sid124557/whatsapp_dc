package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass000;
import X.C162457s7;
import X.C16630ti;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        Bundle bundle2 = bundle;
        C162457s7.A0J(bundle, 1);
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            C162457s7.A0M("executor");
            throw AnonymousClass000.A0L();
        }
        C16630ti r6 = credentialProviderCreatePublicKeyCredentialController.callback;
        if (r6 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else if (!credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(bundle2, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, r6, credentialProviderCreatePublicKeyCredentialController.cancellationSignal)) {
            this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
    }
}
