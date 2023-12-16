package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.28a  reason: invalid class name and case insensitive filesystem */
public class C385228a {
    public static AnonymousClass36K A00(GroupJid groupJid, C27991fJ r4, String str) {
        AnonymousClass39V[] r1;
        if (groupJid != null) {
            r1 = new AnonymousClass39V[1];
            AnonymousClass39V.A02(groupJid, "sub_group_jid", r1, 0);
        } else {
            r1 = null;
        }
        AnonymousClass36K A0I = AnonymousClass36K.A0I("sub_groups", r1);
        AnonymousClass39V[] A0H = AnonymousClass39V.A0H(str, 0);
        AnonymousClass39V.A09("xmlns", "w:g2", A0H);
        return AnonymousClass36K.A0C(r4, A0I, A0H);
    }
}
