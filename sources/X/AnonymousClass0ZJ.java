package X;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

/* renamed from: X.0ZJ  reason: invalid class name */
public final class AnonymousClass0ZJ implements OutcomeReceiver {
    public final /* synthetic */ C03710Lg A00;
    public final /* synthetic */ C16630ti A01;
    public final /* synthetic */ C08210dZ A02;

    /* renamed from: A01 */
    public void onError(CreateCredentialException createCredentialException) {
        C162457s7.A0J(createCredentialException, 0);
        Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
        this.A01.BSE(C08210dZ.A03(createCredentialException));
    }

    /* renamed from: A02 */
    public void onResult(CreateCredentialResponse createCredentialResponse) {
        Object obj;
        C162457s7.A0J(createCredentialResponse, 0);
        Log.i("CredManProvService", "Create Result returned from framework: ");
        C16630ti r2 = this.A01;
        Bundle data = createCredentialResponse.getData();
        C162457s7.A0D(data);
        try {
            obj = A00(data);
        } catch (AnonymousClass0GL unused) {
            obj = new AnonymousClass06Y(data);
        }
        r2.onResult(obj);
    }

    public AnonymousClass0ZJ(C03710Lg r1, C16630ti r2, C08210dZ r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static final AnonymousClass06Z A00(Bundle bundle) {
        try {
            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
            C162457s7.A0H(string);
            return new AnonymousClass06Z(string, bundle);
        } catch (Exception unused) {
            throw new AnonymousClass0GL();
        }
    }
}
