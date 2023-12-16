package androidx.credentials.playservices.controllers.BeginSignIn;

import X.AnonymousClass4GP;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C59022wD;
import X.C829045j;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;

public final class CredentialProviderBeginSignInController$handleResponse$1 extends C829045j implements AnonymousClass4GR {
    public static final CredentialProviderBeginSignInController$handleResponse$1 INSTANCE = new CredentialProviderBeginSignInController$handleResponse$1();

    public CredentialProviderBeginSignInController$handleResponse$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (AnonymousClass4GP) obj2);
        return C59022wD.A00;
    }

    public final void invoke(CancellationSignal cancellationSignal, AnonymousClass4GP r3) {
        C162457s7.A0J(r3, 1);
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, r3);
    }
}
