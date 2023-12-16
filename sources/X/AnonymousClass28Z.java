package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;

/* renamed from: X.28Z  reason: invalid class name */
public class AnonymousClass28Z {
    public static AnonymousClass36K A00(GroupJid groupJid, GroupJid groupJid2, C27991fJ r7, String str) {
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "sub_group", A0s);
        AnonymousClass39V.A01(groupJid, "jid", A0s);
        if (groupJid2 != null) {
            AnonymousClass39V.A01(groupJid2, "sub_group_jid", A0s);
        }
        AnonymousClass36K A0I = AnonymousClass36K.A0I("query_linked", C18300x5.A1Z(A0s, A0s.size()));
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A1W);
        AnonymousClass39V.A05("xmlns", "w:g2", A1W);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W);
        return AnonymousClass36K.A0C(r7, A0I, A1W);
    }
}
