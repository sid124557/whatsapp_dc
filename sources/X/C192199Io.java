package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.9Io  reason: invalid class name and case insensitive filesystem */
public final class C192199Io extends C35201wU {
    public static final ArrayList A00 = C18260x0.A0C("false", "true");

    public C192199Io(UserJid userJid, C35371wl r6, String str) {
        C56052rL A01 = C56052rL.A01();
        C56052rL.A0E(A01, "xmlns", "w:pay");
        C56052rL A0U = C1899593h.A0U();
        C56052rL.A0D(A0U, "action", "upi-get-vpa");
        C56052rL.A06(userJid, A0U, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        A0U.A0K(str, "is_first_send", A00);
        C35201wU.A01(A0U, A01, r6, this);
    }
}
