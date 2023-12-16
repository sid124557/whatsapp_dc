package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.74F  reason: invalid class name */
public final class AnonymousClass74F {
    public static AnonymousClass5XW A00(C116825qv r8, AnonymousClass36K r9) {
        Map map;
        UserJid userJid;
        String str;
        C35721xK r4 = (C35721xK) r8.A03.getValue();
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            C35771xP r82 = new C35771xP(r9, r4);
            ArrayList A0s2 = AnonymousClass001.A0s();
            LinkedHashMap A0r = C18320x8.A0r();
            for (C138716qs r0 : r82.A03) {
                UserJid userJid2 = (UserJid) r0.A00;
                C162457s7.A0D(userJid2);
                C138706qr r02 = (C138706qr) r0.A01;
                if (r02 != null) {
                    AnonymousClass7HQ r1 = new AnonymousClass7HQ(userJid2, A0r);
                    switch (r02.A00) {
                        case 0:
                            map = r1.A01;
                            userJid = r1.A00;
                            str = "406";
                            break;
                        case 1:
                            map = r1.A01;
                            userJid = r1.A00;
                            str = "405";
                            break;
                        case 2:
                            map = r1.A01;
                            userJid = r1.A00;
                            str = "404";
                            break;
                        default:
                            map = r1.A01;
                            userJid = r1.A00;
                            str = "500";
                            break;
                    }
                    map.put(userJid, str);
                } else {
                    A0s2.add(userJid2);
                }
            }
            C27991fJ r5 = r82.A00;
            C162457s7.A0D(r5);
            return new AnonymousClass5XW(r5, C73723fy.A0F(A0s2), C73813g7.A0D(A0r));
        } catch (AnonymousClass24Y e) {
            C18260x0.A18("RemoveParticipantsResponseSuccess: ", AnonymousClass001.A0o(), e, A0s);
            try {
                C184628sF r2 = (C184628sF) new C139776sb(r9, r4, 8).A00;
                C162457s7.A0D(r2);
                return new AnonymousClass5XW(String.valueOf(r2.B5b().longValue()), r2.BDZ());
            } catch (AnonymousClass24Y e2) {
                C18260x0.A18("RemoveParticipantsResponseClientError: ", AnonymousClass001.A0o(), e2, A0s);
                try {
                    C184618sE r22 = (C184618sE) ((C138956rH) new C139746sY(r9, r4, 1).A00).A00;
                    C162457s7.A0D(r22);
                    return new AnonymousClass5XW(String.valueOf(r22.B5b().longValue()), r22.BDZ());
                } catch (AnonymousClass24Y e3) {
                    throw AnonymousClass24Y.A03("RemoveParticipantsResponseServerError: ", AnonymousClass001.A0o(), e3, A0s);
                }
            }
        }
    }
}
