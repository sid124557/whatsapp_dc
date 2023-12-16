package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5Pq  reason: invalid class name and case insensitive filesystem */
public final class C104095Pq {
    public final C620433g A00;
    public final C56422rx A01;
    public final AnonymousClass1VX A02;

    public final boolean A00(UserJid userJid) {
        if (userJid != null && C106945aQ.A00(this.A01.A00(userJid)) == 2) {
            AnonymousClass1VX r1 = this.A02;
            if (!r1.A0X(4893) || !r1.A0X(5114)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C104095Pq(C620433g r1, C56422rx r2, AnonymousClass1VX r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
