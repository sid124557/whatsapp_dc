package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2bd  reason: invalid class name and case insensitive filesystem */
public class C46442bd {
    public UserJid A00;
    public UserJid A01;
    public UserJid A02;
    public String A03;
    public String A04;

    public C54792pI A00() {
        C27981fH r2;
        PhoneUserJid phoneUserJid;
        C626936e.A06(this.A00);
        C626936e.A06(this.A04);
        UserJid userJid = this.A00;
        String str = this.A04;
        UserJid userJid2 = this.A01;
        if (C627336j.A0L(userJid2)) {
            r2 = (C27981fH) userJid2;
        } else {
            r2 = null;
        }
        String str2 = this.A03;
        UserJid userJid3 = this.A02;
        if (userJid3 instanceof PhoneUserJid) {
            phoneUserJid = (PhoneUserJid) userJid3;
        } else {
            phoneUserJid = null;
        }
        return new C54792pI(r2, phoneUserJid, userJid, str, str2);
    }
}
