package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8ES  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8ES implements C181708nC {
    public final /* synthetic */ AnonymousClass7KL A00;
    public final /* synthetic */ C90194gs A01;
    public final /* synthetic */ UserJid A02;

    public final void BaR(boolean z) {
        C90194gs r5 = this.A01;
        AnonymousClass7KL r4 = this.A00;
        UserJid userJid = this.A02;
        if (z) {
            C18270x1.A0j(C18270x1.A03(r5.A05), "latest_biz_backend_request_id", "252");
            r5.A01.A07(new AnonymousClass8EN(r4, r5), userJid, true);
            return;
        }
        r5.A02(r4);
    }

    public /* synthetic */ AnonymousClass8ES(AnonymousClass7KL r1, C90194gs r2, UserJid userJid) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = userJid;
    }
}
