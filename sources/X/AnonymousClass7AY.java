package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.7AY  reason: invalid class name */
public final class AnonymousClass7AY {
    public final Bundle A00;

    public AnonymousClass7AY(Bundle bundle) {
        if (bundle != null) {
            C160857oT.A03(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, bundle);
            this.A00 = bundle;
            return;
        }
        throw AnonymousClass001.A0c("Bundle is null");
    }
}
