package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.PaymentConfiguration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9TA  reason: invalid class name */
public class AnonymousClass9TA {
    public PaymentConfiguration A00;
    public Map A01;
    public final AnonymousClass8EA A02;
    public final C1907099n A03;

    public C42902Py A00(UserJid userJid, String str) {
        C203719oC A012 = this.A00.BCr();
        C133676hl r0 = null;
        if (A012 == null) {
            return null;
        }
        Map map = this.A01;
        if (map != null) {
            r0 = (C133676hl) map.get(userJid);
        }
        return A012.BE8(r0, userJid, str);
    }

    public void A01() {
        Map map = this.A01;
        if (map != null) {
            map.clear();
        }
    }

    public void A02() {
        if (this.A03.A0E()) {
            AnonymousClass8EA r0 = this.A02;
            HashMap A0t = AnonymousClass001.A0t();
            for (C133676hl r1 : r0.A0C()) {
                A0t.put(r1.A05, r1);
            }
            this.A01 = A0t;
        }
    }

    public AnonymousClass9TA(AnonymousClass8EA r1, C1907099n r2) {
        this.A02 = r1;
        this.A03 = r2;
    }
}
