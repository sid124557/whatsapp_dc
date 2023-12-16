package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.4xd  reason: invalid class name and case insensitive filesystem */
public class C97104xd extends C29451iq {
    public void A08(UserJid userJid) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            C111965iy r1 = (C111965iy) A03.next();
            if (AnonymousClass75J.A00(r1.A06.A07, userJid)) {
                r1.BTJ(userJid);
            }
        }
    }
}
