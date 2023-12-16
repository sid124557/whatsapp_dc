package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8JJ  reason: invalid class name */
public abstract class AnonymousClass8JJ implements AnonymousClass4EZ, AnonymousClass4CL {
    public boolean A00 = false;
    public final C620433g A01;

    public boolean A01(UserJid userJid, int i) {
        if (i != 421) {
            return false;
        }
        if (!this.A00) {
            this.A00 = true;
            this.A01.A07(this, userJid, true);
            return true;
        }
        BRC(userJid);
        return true;
    }

    public AnonymousClass8JJ(C620433g r2) {
        this.A01 = r2;
    }
}
