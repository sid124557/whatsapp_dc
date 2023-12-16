package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.9bU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9bU implements C202499m7 {
    public final /* synthetic */ AnonymousClass9D7 A00;
    public final /* synthetic */ String A01;

    public final void BaS(UserJid userJid, C166557yt r11, C166557yt r12, C166557yt r13, AnonymousClass34V r14, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        AnonymousClass9D7 r3 = this.A00;
        String str4 = this.A01;
        r3.BjL();
        if (!z || r14 != null) {
            C1899693i.A0p(r3, R.string.f11nameremoved);
            return;
        }
        r3.A0E = (String) C1899593h.A0X(r11);
        r3.A0F = str4;
        r3.A0I = z2;
        r3.A0Z = str3;
        if (z3) {
            boolean z7 = r3 instanceof IndiaUpiMandatePaymentActivity;
            C193999Re r2 = r3.A07;
            C166557yt A0B = C1899593h.A0B(str4);
            if (z7) {
                z6 = true;
            } else {
                z6 = false;
            }
            r2.A00(r3, r3, (UserJid) null, A0B, z6, false);
            return;
        }
        r3.A7m(r3.A09);
    }

    public /* synthetic */ AnonymousClass9bU(AnonymousClass9D7 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
