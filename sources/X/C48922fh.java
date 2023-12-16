package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.2fh  reason: invalid class name and case insensitive filesystem */
public final class C48922fh {
    public final C620433g A00;
    public final C104975Tb A01;
    public final C41312Jt A02;

    public C48922fh(C620433g r2, C104975Tb r3, C41312Jt r4) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final C52332lJ A00(C108985dt r4, Set set) {
        if (!this.A01.A01(r4) || set == null) {
            return null;
        }
        C41312Jt r0 = this.A02;
        return new C52332lJ(set, r0.A01, r0.A00);
    }

    public final void A01(UserJid userJid, Set set, AnonymousClass4GQ r5) {
        this.A00.A06(new C64423Dk(this, set, r5), userJid);
    }
}
