package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9Ls  reason: invalid class name and case insensitive filesystem */
public class C192819Ls {
    public static UserJid A00(C56662sM r2, AnonymousClass1VX r3, UserJid userJid) {
        boolean z = userJid instanceof C27981fH;
        if (r3.A0X(5143)) {
            if (!z) {
                return r2.A01((PhoneUserJid) userJid);
            }
        } else if (z) {
            return r2.A02((C27981fH) userJid);
        }
        return userJid;
    }
}
