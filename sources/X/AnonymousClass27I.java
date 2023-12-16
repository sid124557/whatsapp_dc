package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.27I  reason: invalid class name */
public class AnonymousClass27I {
    public static AnonymousClass36K A00(GroupJid groupJid, GroupJid groupJid2, String str, String str2, String str3, String str4, String str5) {
        int i;
        String str6;
        GroupJid groupJid3;
        AnonymousClass36K A0F;
        Jid jid;
        boolean A1W = AnonymousClass000.A1W(str3);
        boolean A1W2 = AnonymousClass000.A1W(str2);
        String str7 = str4;
        boolean A1W3 = AnonymousClass000.A1W(str7);
        String str8 = str5;
        boolean A1W4 = AnonymousClass000.A1W(str8);
        AnonymousClass39V[] r2 = new AnonymousClass39V[((A1W ? 1 : 0) + (A1W2 ? 1 : 0) + (A1W3 ? 1 : 0) + (A1W4 ? 1 : 0))];
        if (A1W2) {
            AnonymousClass39V.A0B("query", str2, r2, 0);
            i = 1;
        } else {
            i = 0;
        }
        if (A1W) {
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3, r2, i);
            i++;
        }
        if (A1W3) {
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str7, r2, i);
            i++;
        }
        if (A1W4) {
            AnonymousClass39V.A0B("invite", str8, r2, i);
            A0F = AnonymousClass36K.A0I("picture", r2);
            jid = groupJid2;
            if (groupJid2 == null) {
                jid = C28041fO.A00;
            }
        } else {
            C626936e.A06(groupJid);
            if (groupJid2 == null) {
                str6 = "parent_group";
                groupJid3 = groupJid;
            } else {
                str6 = "sub_group";
                groupJid3 = groupJid2;
            }
            AnonymousClass39V[] r1 = new AnonymousClass39V[2];
            AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str6, r1, 0);
            AnonymousClass39V.A02(groupJid3, "jid", r1, 1);
            A0F = AnonymousClass36K.A0F(AnonymousClass36K.A0I("query_linked", r1), "picture", r2);
            jid = groupJid;
        }
        AnonymousClass39V[] A1W5 = AnonymousClass0x9.A1W();
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, A1W5, 0);
        AnonymousClass39V.A0B("xmlns", "w:g2", A1W5, 1);
        AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A1W5, 2);
        return AnonymousClass36K.A0C(jid, A0F, A1W5);
    }
}
