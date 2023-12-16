package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3OT  reason: invalid class name */
public final class AnonymousClass3OT implements AnonymousClass4AI {
    public final UserJid A00;
    public final AnonymousClass2z0 A01;

    public AnonymousClass3OT(UserJid userJid, AnonymousClass2z0 r2) {
        this.A01 = r2;
        this.A00 = userJid;
    }

    public byte[] B40() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0.A0A(this.A01, A0o);
        A0o.append(0);
        C18280x3.A0u(this.A00, A0o);
        return C18290x4.A1b(A0o.toString());
    }
}
