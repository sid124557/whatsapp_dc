package androidx.credentials.playservices.controllers.CreatePassword;

import X.AnonymousClass000;
import X.C162457s7;
import X.C16630ti;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.concurrent.Executor;

public final class CredentialProviderCreatePasswordController$resultReceiver$1 extends ResultReceiver {
    public final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    public void onReceiveResult(int i, Bundle bundle) {
        Bundle bundle2 = bundle;
        C162457s7.A0J(bundle, 1);
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor == null) {
            C162457s7.A0M("executor");
            throw AnonymousClass000.A0L();
        }
        C16630ti r5 = credentialProviderCreatePasswordController.callback;
        if (r5 == null) {
            C162457s7.A0M("callback");
            throw AnonymousClass000.A0L();
        } else if (!credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(bundle2, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, r5, credentialProviderCreatePasswordController.cancellationSignal)) {
            this.this$0.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreatePasswordController$resultReceiver$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Handler handler) {
        super(handler);
        this.this$0 = credentialProviderCreatePasswordController;
    }
}
