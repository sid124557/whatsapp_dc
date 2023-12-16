package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.9Qw  reason: invalid class name and case insensitive filesystem */
public class C193949Qw {
    public String A00;
    public Map A01;

    public synchronized Map A00(UserJid userJid) {
        if (this.A01 == null || !userJid.getRawString().equals(this.A00)) {
            this.A00 = userJid.getRawString();
            this.A01 = AnonymousClass001.A0t();
        }
        return this.A01;
    }
}
