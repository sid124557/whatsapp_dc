package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.AnonymousClass0GP;
import X.AnonymousClass4GR;
import X.AnonymousClass8V2;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

public final /* synthetic */ class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 extends AnonymousClass8V2 implements AnonymousClass4GR {
    public CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    public final AnonymousClass0GP invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
