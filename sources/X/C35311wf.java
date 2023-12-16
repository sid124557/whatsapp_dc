package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.1wf  reason: invalid class name and case insensitive filesystem */
public final class C35311wf extends C35561x4 {
    public static final ArrayList A00 = AnonymousClass0x2.A0i(new String[]{"futureproof", "invite", "request", "request-cancel", "request-decline", "send"});

    public C35311wf(UserJid userJid, UserJid userJid2, String str, String str2) {
        C56052rL A04 = C56052rL.A04("pay");
        String str3 = str;
        if (str != null && C626836d.A0M(str3, 0, 100, true)) {
            C56052rL.A0D(A04, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        if (userJid != null) {
            C56052rL.A06(userJid, A04, "sender");
        }
        if (userJid2 != null) {
            C56052rL.A06(userJid2, A04, "receiver");
        }
        A04.A0L(str2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        C41032Ir.A0A(A04, this);
    }
}
