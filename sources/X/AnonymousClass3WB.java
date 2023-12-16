package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3WB  reason: invalid class name */
public final class AnonymousClass3WB implements AnonymousClass4BW {
    public final C183538qC A00;
    public final C183538qC A01;

    public void BhY(C624134x r6, C378824k r7, int i) {
        C162457s7.A0J(r6, 0);
        if (i == 5 || i == 6) {
            C183538qC r4 = this.A00;
            ((AnonymousClass313) r4.get()).A04(r6, r6.A0K);
            C95814uZ r1 = r6.A1J.A00;
            if (r1 instanceof UserJid) {
                if (r6.A05 > 0) {
                    ((AnonymousClass313) r4.get()).A09(r6);
                }
            } else if (C627336j.A0K(r1)) {
                ((AnonymousClass313) r4.get()).A0A(r6);
            }
            Integer A03 = AnonymousClass0x9.A0N(this.A01).A03(r6);
            if (A03 == null) {
                A03 = 0;
            }
            if (A03.intValue() != r6.A05 && !AnonymousClass000.A1U(r6.A0A & 16384, 16384)) {
                r6.A1B(512);
            }
            if (r7 != null) {
                throw C18260x0.A02(AnonymousClass3WB.class);
            }
        }
    }

    public AnonymousClass3WB(C183538qC r1, C183538qC r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
