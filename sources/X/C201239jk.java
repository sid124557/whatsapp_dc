package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.9jk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201239jk implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ AnonymousClass9AB A01;
    public final /* synthetic */ AnonymousClass9RO A02;
    public final /* synthetic */ String A03;

    public final void run() {
        AnonymousClass9AB r5 = this.A01;
        String str = this.A03;
        UserJid userJid = this.A00;
        AnonymousClass9RO r6 = this.A02;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass39V.A03("action", "upi-get-p2m-config", A0s);
        if (str != null) {
            AnonymousClass39V.A03("payment-config-id", str, A0s);
        }
        UserJid A002 = C192819Ls.A00(r5.A03, r5.A04, userJid);
        if (A002 != null) {
            AnonymousClass39V.A01(A002, "receiver", A0s);
        }
        C153607bd A022 = AnonymousClass9OC.A02(r5, "upi-get-p2m-config");
        r5.A06.A0G(new C203929oX(r5.A00, r5.A01, r5.A05, A022, r5, r6), C1899593h.A0T(A0s), "get", C625635p.A0L);
    }

    public /* synthetic */ C201239jk(UserJid userJid, AnonymousClass9AB r2, AnonymousClass9RO r3, String str) {
        this.A01 = r2;
        this.A03 = str;
        this.A00 = userJid;
        this.A02 = r3;
    }
}
