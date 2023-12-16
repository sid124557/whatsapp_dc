package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5QK  reason: invalid class name */
public final class AnonymousClass5QK {
    public AnonymousClass495 A00;
    public final C69263Wi A01;
    public final C45372Zu A02;
    public final C103605Nq A03;

    public final void A00(C95804uY r5, UserJid userJid, AnonymousClass66A r7) {
        C136736nB r1;
        C162457s7.A0J(r5, 0);
        AnonymousClass495 r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
        this.A01.A0G(R.string.f11nameremoved, R.string.f11nameremoved);
        C103605Nq r3 = this.A03;
        C124216Bk r2 = new C124216Bk(userJid, r7, this, 1);
        if (!r3.A00()) {
            r1 = null;
        } else {
            r1 = new C136736nB(r5, userJid, r2);
            r3.A01.A02(r1);
        }
        this.A00 = r1;
    }

    public AnonymousClass5QK(C69263Wi r1, C45372Zu r2, C103605Nq r3) {
        C18260x0.A0V(r1, r3, r2);
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }
}
