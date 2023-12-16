package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.2WM  reason: invalid class name */
public final class AnonymousClass2WM {
    public final C56662sM A00;

    public AnonymousClass2WM(C56662sM r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public String A00(Jid jid) {
        String str;
        if (jid instanceof PhoneUserJid) {
            return jid.user;
        }
        if (jid instanceof C27981fH) {
            PhoneUserJid A002 = C56662sM.A00(this.A00, jid);
            if (A002 == null || (str = A002.user) == null) {
                return "-1";
            }
            return str;
        } else if (jid instanceof DeviceJid) {
            return A00(((DeviceJid) jid).userJid);
        }
        return "-1";
    }
}
