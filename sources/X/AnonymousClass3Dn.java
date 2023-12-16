package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Dn  reason: invalid class name */
public class AnonymousClass3Dn implements AnonymousClass4CK {
    public final /* synthetic */ C33981u0 A00;
    public final /* synthetic */ UserJid A01;

    public AnonymousClass3Dn(C33981u0 r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public void BNp(UserJid userJid) {
        if (this.A01.equals(userJid)) {
            this.A00.A06.countDown();
        }
    }

    public /* synthetic */ void BNs(UserJid userJid) {
    }
}
