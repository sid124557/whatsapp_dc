package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.3B5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3B5 implements C181308mY {
    public final /* synthetic */ C56942so A00;

    public final boolean AxD(Object obj) {
        C56942so r3 = this.A00;
        C52882mC r5 = (C52882mC) obj;
        if (r5 == null) {
            return false;
        }
        C56982ss r1 = r3.A06;
        GroupJid groupJid = r5.A02;
        if (r1.A0A(groupJid, false) == null || r1.A0M(groupJid)) {
            return false;
        }
        AnonymousClass1R1 r12 = r3.A0L;
        if (r12.A0L(groupJid) == null || !r12.A0L(groupJid).A0H) {
            return true;
        }
        return false;
    }

    public /* synthetic */ AnonymousClass3B5(C56942so r1) {
        this.A00 = r1;
    }
}
