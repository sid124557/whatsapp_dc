package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2ZH  reason: invalid class name */
public class AnonymousClass2ZH {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public AnonymousClass2ZH(UserJid userJid, String str, long j) {
        this.A00 = j;
        this.A01 = userJid;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("id=");
        A0o.append(this.A00);
        A0o.append(" jid=");
        A0o.append(this.A01);
        A0o.append(" display=");
        return AnonymousClass000.A0X(this.A02, A0o);
    }
}
