package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.9I8  reason: invalid class name */
public final class AnonymousClass9I8 extends C41022Iq {
    public static final ArrayList A02 = C1899593h.A0e("ACTIVE", "ELIGIBLE", "INELIGIBLE");
    public final UserJid A00;
    public final String A01;

    public AnonymousClass9I8(AnonymousClass36K r3) {
        AnonymousClass36K.A0N(r3, "contact");
        this.A00 = (UserJid) AnonymousClass6C7.A0c(r3, UserJid.class, new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_USER});
        this.A01 = C626836d.A0A(r3, A02, new String[]{"payment-status"});
        this.A00 = r3;
    }
}
