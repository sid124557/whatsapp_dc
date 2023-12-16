package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5Nl  reason: invalid class name and case insensitive filesystem */
public final class C103555Nl {
    public final C06270Wx A00;
    public final C46922cQ A01;
    public final C101755Fz A02;
    public final AnonymousClass66R A03;

    public final void A00(C141526vi r8, UserJid userJid, String str) {
        C51322jd r3 = new C51322jd(userJid, str);
        C175448Yk r4 = new C175448Yk(r8, this);
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        do {
            A0s.add(C133146gl.A00);
            i++;
        } while (i < 3);
        Object r5 = new C133206gr(A0s);
        Object r2 = new C133196gq(A0s);
        int ordinal = r8.ordinal();
        if (ordinal != 0) {
            r5 = r2;
        }
        ((C06270Wx) this.A03.getValue()).A0H(r5);
        if (ordinal != 0) {
            this.A01.A00(r3, r4);
            return;
        }
        C46922cQ r22 = this.A01;
        AnonymousClass7HN r1 = r22.A04;
        r1.A00 = null;
        ((AtomicReference) r1.A01.getValue()).set(r3);
        r22.A00(r3, r4);
    }

    public C103555Nl(C46922cQ r2, C101755Fz r3) {
        this.A01 = r2;
        this.A02 = r3;
        AnonymousClass66R A012 = C154517dI.A01(AnonymousClass8XP.A00);
        this.A03 = A012;
        this.A00 = (C06270Wx) A012.getValue();
    }
}
