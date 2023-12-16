package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5Rj  reason: invalid class name and case insensitive filesystem */
public class C104545Rj {
    public final C60722z3 A00;
    public final UserJid A01;

    public int A00() {
        if (this instanceof C93564om) {
            return ((C93564om) this).A01;
        }
        if (this instanceof C93554ol) {
            return Integer.MAX_VALUE;
        }
        return this.A00.A00();
    }

    public long A01(int i) {
        if ((this instanceof C93564om) || (this instanceof C93554ol)) {
            return 0;
        }
        return this.A00.A01(i);
    }

    public C995557a A02() {
        if (this instanceof C93564om) {
            return C995557a.REMAINING;
        }
        if (this instanceof C93554ol) {
            return C995557a.KEEP_IN_CHAT;
        }
        return C995557a.RECEIPT;
    }

    public C104545Rj(C60722z3 r1, UserJid userJid) {
        this.A01 = userJid;
        this.A00 = r1;
    }
}
