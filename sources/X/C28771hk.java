package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1hk  reason: invalid class name and case insensitive filesystem */
public class C28771hk extends C61102zi {
    public void A08(UserJid userJid, Set set, Set set2) {
        if (!set.isEmpty() || !set2.isEmpty()) {
            Iterator A03 = C61102zi.A03(this);
            while (A03.hasNext()) {
                ((C837449p) A03.next()).Bf8(userJid, set, set2);
            }
        }
    }
}
