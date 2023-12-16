package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.1ia  reason: invalid class name and case insensitive filesystem */
public class C29291ia extends C29451iq {
    public final HashMap A00 = AnonymousClass001.A0t();

    public void A08(C108985dt r4) {
        UserJid userJid;
        if (r4 != null && (userJid = r4.A08) != null) {
            HashMap hashMap = this.A00;
            Object obj = hashMap.get(userJid);
            hashMap.put(userJid, r4);
            if (obj == null || !obj.equals(r4)) {
                Iterator A03 = C61102zi.A03(this);
                while (A03.hasNext()) {
                    ((AnonymousClass4CK) A03.next()).BNs(userJid);
                }
            }
        }
    }

    public C29291ia(C183538qC r2) {
        super(r2);
    }
}
