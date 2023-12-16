package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Mt  reason: invalid class name and case insensitive filesystem */
public final class C103405Mt {
    public final Map A00 = AnonymousClass001.A0t();
    public final Map A01 = new C174218Tk(500);

    public final void A00(UserJid userJid) {
        synchronized (this) {
            Map map = this.A00;
            C101665Fq r0 = (C101665Fq) map.get(userJid);
            if (r0 != null) {
                Iterator it = r0.A00.iterator();
                while (it.hasNext()) {
                    this.A01.remove(C86664Kz.A12(it).A0F);
                }
            }
            map.remove(userJid);
        }
    }
}
