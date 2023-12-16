package X;

import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.OutcomeReceiver;
import android.util.Log;

/* renamed from: X.0ZI  reason: invalid class name */
public final class AnonymousClass0ZI implements OutcomeReceiver {
    public final /* synthetic */ C16630ti A00;
    public final /* synthetic */ C08210dZ A01;

    /* renamed from: A00 */
    public void onError(GetCredentialException getCredentialException) {
        C162457s7.A0J(getCredentialException, 0);
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        this.A00.BSE(C08210dZ.A05(getCredentialException));
    }

    /* renamed from: A01 */
    public void onResult(GetCredentialResponse getCredentialResponse) {
        C162457s7.A0J(getCredentialResponse, 0);
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        this.A00.onResult(C08210dZ.A00(getCredentialResponse));
    }

    public AnonymousClass0ZI(C16630ti r1, C08210dZ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
