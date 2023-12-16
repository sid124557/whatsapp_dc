package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2cl  reason: invalid class name and case insensitive filesystem */
public class C47132cl {
    public C371321b A00;
    public C95814uZ A01;
    public Jid A02;
    public UserJid A03;
    public Boolean A04;
    public Long A05;
    public String A06 = "pn";
    public String A07;

    public AnonymousClass3ST A00() {
        boolean z = true;
        C626936e.A0E(AnonymousClass000.A1W(this.A02), "remoteJid must be provided");
        C626936e.A0E(AnonymousClass000.A1W(this.A07), "id must be provided");
        C626936e.A0E(AnonymousClass000.A1W(this.A05), "timestampMillis must be provided");
        if (this.A04 == null) {
            z = false;
        }
        C626936e.A0E(z, "fromMe must be provided");
        return new AnonymousClass3ST(this);
    }
}
