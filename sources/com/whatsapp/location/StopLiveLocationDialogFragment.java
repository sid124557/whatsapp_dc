package com.whatsapp.location;

import X.AnonymousClass371;
import X.AnonymousClass4FS;
import X.C18300x5;
import X.C18310x6;
import X.C19340zH;
import X.C621233o;
import android.app.Dialog;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;

public class StopLiveLocationDialogFragment extends Hilt_StopLiveLocationDialogFragment {
    public C621233o A00;
    public AnonymousClass4FS A01;

    public Dialog A1J(Bundle bundle) {
        String A0k = C18310x6.A0k(A0H(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A0k2 = C18310x6.A0k(A0H(), "jid");
        C19340zH A0L = C18300x5.A0L(this);
        A0L.A0T(R.string.f11nameremoved);
        A0L.A0Y(new AnonymousClass371(this, A0k, A0k2), R.string.f11nameremoved);
        C19340zH.A05(A0L);
        return A0L.create();
    }
}
