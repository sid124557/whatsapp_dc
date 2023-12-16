package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2fk  reason: invalid class name and case insensitive filesystem */
public final class C48952fk {
    public final C42712Pf A00;
    public final AnonymousClass318 A01;
    public final AnonymousClass3LP A02;

    public final boolean A01(UserJid userJid) {
        C60212yB A07 = this.A01.A07(userJid);
        return A07 != null && A07.A00 == 1;
    }

    public final boolean A00(UserJid userJid) {
        if (userJid == null || !this.A02.A00.A0Y(C58422vE.A02, 5968) || !A01(userJid)) {
            return false;
        }
        return true;
    }

    public C48952fk(C42712Pf r1, AnonymousClass318 r2, AnonymousClass3LP r3) {
        C18260x0.A0V(r3, r2, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
