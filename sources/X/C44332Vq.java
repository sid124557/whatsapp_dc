package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.2Vq  reason: invalid class name and case insensitive filesystem */
public class C44332Vq {
    public final AnonymousClass31C A00;

    public void A00(String str) {
        Log.d("companion/registration/send-companion-reg-pair-device-result");
        AnonymousClass31C r4 = this.A00;
        AnonymousClass39V[] r2 = new AnonymousClass39V[3];
        r2[0] = AnonymousClass39V.A00();
        AnonymousClass39V.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "result", r2);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r2);
        r4.A0G(AnonymousClass36K.A0I("iq", r2), 305);
    }

    public C44332Vq(AnonymousClass31C r1) {
        this.A00 = r1;
    }
}
