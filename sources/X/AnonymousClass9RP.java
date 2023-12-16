package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9RP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9RP {
    public final /* synthetic */ AnonymousClass1RR A00;
    public final /* synthetic */ C624034w A01;
    public final /* synthetic */ C1902094n A02;

    public final void A00(AnonymousClass34V r6, String str, String str2) {
        C166557yt r0;
        C1902094n r3 = this.A02;
        C624034w r4 = this.A01;
        AnonymousClass1RR r2 = this.A00;
        if (r6 != null) {
            AnonymousClass9OX.A01(r3.A01);
            C1902094n.A00(r6, r3);
            return;
        }
        r4.A0K = str2;
        AnonymousClass99L r1 = (AnonymousClass99L) r4.A0A;
        C626936e.A06(r1);
        C626936e.A06(r1.A0G);
        AnonymousClass9W2 r12 = r1.A0G;
        if (str != null) {
            r0 = C161527pr.A00(str, "mandateNo");
        } else {
            r0 = null;
        }
        r12.A08 = r0;
        r4.A02 = 417;
        r4.A0E = (UserJid) r2.A0H;
        r3.A0M.BkM(new C200569iX(r4, r3));
    }

    public /* synthetic */ AnonymousClass9RP(AnonymousClass1RR r1, C624034w r2, C1902094n r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
