package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass0GQ;
import X.AnonymousClass4GR;
import X.AnonymousClass8V2;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public final /* synthetic */ class CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 extends AnonymousClass8V2 implements AnonymousClass4GR {
    public CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    public final AnonymousClass0GQ invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
