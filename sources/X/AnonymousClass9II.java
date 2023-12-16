package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9II  reason: invalid class name */
public final class AnonymousClass9II extends C41032Ir {
    public AnonymousClass9II(UserJid userJid) {
        C56052rL A04 = C56052rL.A04("contact");
        if (C626836d.A0L(userJid, PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
            C56052rL.A06(userJid, A04, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        C41032Ir.A0A(A04, this);
    }
}
