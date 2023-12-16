package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.7AX  reason: invalid class name */
public final class AnonymousClass7AX {
    public final Bundle A00;

    public AnonymousClass7AX(Bundle bundle) {
        C160857oT.A03(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, bundle);
        Class<Bundle> cls = Bundle.class;
        C160857oT.A01(bundle, cls, "auxArguments");
        C160857oT.A01(bundle, cls, "additionalKeyMaterial");
        Class<Boolean> cls2 = Boolean.class;
        C160857oT.A01(bundle, cls2, "refreshVerifier");
        C160857oT.A01(bundle, cls2, "useDebugKey");
        this.A00 = bundle;
    }
}
