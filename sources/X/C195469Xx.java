package X;

import android.view.View;
import android.widget.Button;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9Xx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195469Xx implements View.OnClickListener {
    public final /* synthetic */ Button A00;
    public final /* synthetic */ C624034w A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C194599Tr A03;
    public final /* synthetic */ C202509m8 A04;

    public final void onClick(View view) {
        C194599Tr r10 = this.A03;
        Button button = this.A00;
        C202509m8 r11 = this.A04;
        C624034w r8 = this.A01;
        UserJid userJid = this.A02;
        if (r10.A00.A0Y()) {
            r10.A05(button, r8, true);
            AnonymousClass9U5 r5 = r10.A09;
            String str = r8.A0K;
            C193989Rd r6 = new C193989Rd(button, r8, userJid, r10, r11);
            AnonymousClass39V[] r2 = new AnonymousClass39V[2];
            AnonymousClass39V.A04("action", "cancel-payment-request", r2);
            AnonymousClass39V.A0B("request-id", str, r2, 1);
            AnonymousClass36K A0U = C1899693i.A0U(r2);
            r5.A0G(new C203899oU(r5.A04.A00, r5.A0A, r5.A00, r5, r6, 2), A0U, "set", C625635p.A0L);
        }
    }

    public /* synthetic */ C195469Xx(Button button, C624034w r2, UserJid userJid, C194599Tr r4, C202509m8 r5) {
        this.A03 = r4;
        this.A00 = button;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = userJid;
    }
}
