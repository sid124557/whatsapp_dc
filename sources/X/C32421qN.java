package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1qN  reason: invalid class name and case insensitive filesystem */
public class C32421qN extends C66953Nk {
    public final C56972sr A00;

    public C32421qN(C56972sr r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass1A1 r2, C30441mS r3) {
        super.A00(r2, r3);
        r2.A0D(false);
        if (r3.A0o() != null) {
            r2.A0B(r3.A0o().getRawString());
        }
    }

    public C624134x BgW(C55962rC r8) {
        if (C385428c.A00(r8) != AnonymousClass23O.REVOKE || r8.A01 != 8) {
            return null;
        }
        AnonymousClass1EM A002 = C55962rC.A00(r8);
        C626936e.A06(A002);
        AnonymousClass1ET r0 = A002.key_;
        if (r0 == null) {
            r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        C95814uZ A0S = C18310x6.A0S(r0.remoteJid_);
        AnonymousClass2z0 r6 = r8.A0D;
        C95814uZ r5 = r6.A00;
        if (AnonymousClass75J.A00(r5, A0S)) {
            AnonymousClass1ET r02 = A002.key_;
            AnonymousClass1ET r1 = r02;
            if (r02 == null) {
                r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            if (!r02.fromMe_) {
                if (r1 == null) {
                    r1 = AnonymousClass1ET.DEFAULT_INSTANCE;
                }
                UserJid A08 = AnonymousClass32Y.A08(r1.participant_);
                AnonymousClass272.A00(new C86404Jz(4), AnonymousClass000.A1W(A08));
                C626936e.A06(A08);
                C30961nV r12 = new C30961nV(AnonymousClass2z0.A05(r5, r6.A01, this.A00.A0a(A08)), r8.A05);
                UserJid A05 = AnonymousClass32Y.A05(r8.A08);
                C626936e.A06(A05);
                r12.A1v(A05);
                AnonymousClass1ET r03 = A002.key_;
                if (r03 == null) {
                    r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
                }
                r12.A01 = r03.id_;
                return r12;
            }
        }
        throw AnonymousClass24W.A00(27);
    }
}
