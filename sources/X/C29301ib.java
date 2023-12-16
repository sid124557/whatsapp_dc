package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.1ib  reason: invalid class name and case insensitive filesystem */
public class C29301ib extends C29451iq {
    public void A08(C95814uZ r3) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((C54232oO) A03.next()).A01(r3);
        }
    }

    public void A09(UserJid userJid) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ((C54232oO) A03.next()).A03(userJid);
        }
    }
}
