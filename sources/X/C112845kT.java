package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.5kT  reason: invalid class name and case insensitive filesystem */
public final class C112845kT implements C1225864y {
    public final C56662sM A00;

    public C112845kT(C56662sM r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public C95814uZ Bk3(C95814uZ r4) {
        C95814uZ r2;
        if ((r4 instanceof PhoneUserJid) || !(r4 instanceof C27981fH) || (r2 = this.A00.A02((C27981fH) r4)) == null) {
            r2 = r4;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WaChatJidMapper/resolveChatJid ");
        A0o.append(r4);
        C18260x0.A1R(A0o, " => ", r2);
        return r2;
    }
}
