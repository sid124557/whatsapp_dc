package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.9op  reason: invalid class name and case insensitive filesystem */
public class C204109op implements C203339nX {
    public Object A00;
    public final int A01;

    public C204109op(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, int i) {
        this.A01 = i;
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void BPu(AnonymousClass99D r3) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass9D8) this.A00).A7c();
                return;
            case 1:
                IndiaUpiSendPaymentActivity.A0C(r3, (IndiaUpiSendPaymentActivity) this.A00);
                return;
            default:
                if (r3 != null && !C161527pr.A02(r3.A01)) {
                    ((AnonymousClass9DA) this.A00).A0G = r3.A01;
                    return;
                }
                return;
        }
    }

    public void BS6(AnonymousClass34V r5) {
        int i = this.A01;
        AnonymousClass9Bs r3 = (AnonymousClass9Bs) this.A00;
        switch (i) {
            case 0:
                if (!C196719bd.A02(r3, "upi-get-vpa", r5.A00, false)) {
                    r3.A0f.A06("could not get account vpa: showErrorAndFinish");
                    break;
                } else {
                    return;
                }
            case 1:
                r3.A0d = false;
                r3.BjL();
                if (!C196719bd.A02(r3, "upi-get-vpa", r5.A00, false)) {
                    C160757oG r2 = r3.A0f;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("could not get vpa for jid: ");
                    A0o.append(r3.A0E);
                    C1899593h.A1J(r2, "; showErrorAndFinish", A0o);
                    break;
                } else {
                    return;
                }
            default:
                C160757oG r22 = r3.A0f;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("could not get payee name for jio: ");
                r22.A05(AnonymousClass000.A0R(r3.A0E, A0o2));
                return;
        }
        r3.A85(r5);
    }

    public /* synthetic */ void BXD(AnonymousClass9TG r4) {
        if (1 - this.A01 == 0) {
            IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
            IndiaUpiSendPaymentActivity.A0C(r4.A01, indiaUpiSendPaymentActivity);
            indiaUpiSendPaymentActivity.A8J();
            indiaUpiSendPaymentActivity.A0n = r4.A05;
            String str = r4.A02;
            indiaUpiSendPaymentActivity.A0T = str;
            if (str != null && !str.equals("0000")) {
                indiaUpiSendPaymentActivity.A0p = "p2m";
            }
        }
    }
}
