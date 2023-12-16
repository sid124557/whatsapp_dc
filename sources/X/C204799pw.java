package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.9pw  reason: invalid class name and case insensitive filesystem */
public class C204799pw implements C202499m7 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204799pw(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BaS(UserJid userJid, C166557yt r11, C166557yt r12, C166557yt r13, AnonymousClass34V r14, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i;
        int i2;
        String str4 = str2;
        String str5 = str3;
        boolean z6 = z2;
        boolean z7 = z5;
        if (this.A02 != 0) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
            Runnable runnable = (Runnable) this.A01;
            indiaUpiSendPaymentActivity.A0n = z6;
            if (!C107575bX.A0F(str5)) {
                indiaUpiSendPaymentActivity.A0T = str5;
                indiaUpiSendPaymentActivity.A0Z = str5;
            }
            indiaUpiSendPaymentActivity.BjL();
            if (z && r14 == null) {
                indiaUpiSendPaymentActivity.A0G = r11;
                indiaUpiSendPaymentActivity.A0h = str;
                UserJid userJid2 = userJid;
                indiaUpiSendPaymentActivity.A0E = userJid;
                indiaUpiSendPaymentActivity.A0q = str4;
                indiaUpiSendPaymentActivity.A0t = z7;
                indiaUpiSendPaymentActivity.A0v = z6;
                if (z3) {
                    indiaUpiSendPaymentActivity.A06.A00(indiaUpiSendPaymentActivity, new C204079om(runnable, 1, indiaUpiSendPaymentActivity), userJid2, indiaUpiSendPaymentActivity.A0I, true, false);
                    return;
                }
                runnable.run();
            } else if (indiaUpiSendPaymentActivity.A0L) {
                if (r14 == null || !((i2 = r14.A00) == -2 || i2 == 6 || i2 == 7)) {
                    i = 4;
                } else {
                    i = 2;
                }
                indiaUpiSendPaymentActivity.A00 = i;
                indiaUpiSendPaymentActivity.A8H();
            } else {
                C1899693i.A0p(indiaUpiSendPaymentActivity, R.string.f11nameremoved);
            }
        } else {
            C203339nX r0 = (C203339nX) this.A00;
            AnonymousClass99D r4 = (AnonymousClass99D) this.A01;
            if (r14 != null) {
                if (r0 != null) {
                    r0.BPu(r4);
                }
            } else if (z) {
                r4.A02 = r12;
                r4.A01 = r11;
                r4.A03 = str;
                if (r0 != null) {
                    r0.BXD(new AnonymousClass9TG(r13, r4, str4, str5, z7, z6));
                }
            }
        }
    }
}
