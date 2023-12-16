package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Ws  reason: invalid class name and case insensitive filesystem */
public final class C44602Ws {
    public final C41332Jv A00;

    public final void A00(UserJid userJid, AnonymousClass4B0 r7, boolean z) {
        int i;
        C162457s7.A0J(userJid, 0);
        if (z) {
            C41332Jv r4 = this.A00;
            C55502qS A01 = r4.A01.A01(userJid);
            if (A01 != null) {
                if (A01.A03()) {
                    i = 1;
                } else if (A01.A02()) {
                    r4.A00.A05(new AnonymousClass365(r7, 1), userJid);
                    return;
                }
            }
            r7.BVe((Integer) null);
            return;
        }
        i = null;
        r7.BVe(i);
    }

    public C44602Ws(C41332Jv r1) {
        this.A00 = r1;
    }
}
