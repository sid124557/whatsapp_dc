package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;

/* renamed from: X.9Gz  reason: invalid class name and case insensitive filesystem */
public class C191929Gz extends AnonymousClass5ZM {
    public final boolean A00;
    public final /* synthetic */ IndiaUpiSendPaymentActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C191929Gz(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, boolean z) {
        super(indiaUpiSendPaymentActivity, true);
        this.A01 = indiaUpiSendPaymentActivity;
        this.A00 = z;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        AnonymousClass99D r4 = (AnonymousClass99D) AnonymousClass9U4.A03(indiaUpiSendPaymentActivity.A0P).A05(indiaUpiSendPaymentActivity.A0E);
        C1899593h.A1H(indiaUpiSendPaymentActivity.A0f, r4, "got contact vpa: ", AnonymousClass001.A0o());
        if (r4 == null || C161527pr.A02(r4.A02)) {
            A0G(indiaUpiSendPaymentActivity.A0E, new C204109op(indiaUpiSendPaymentActivity, 1));
            indiaUpiSendPaymentActivity.A0d = true;
            indiaUpiSendPaymentActivity.Bp9(R.string.f11nameremoved);
            return null;
        }
        if (C161527pr.A02(r4.A01)) {
            A0G(indiaUpiSendPaymentActivity.A0E, new C204109op(indiaUpiSendPaymentActivity, 2));
        }
        return r4;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass99D r3 = (AnonymousClass99D) obj;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        if (r3 != null) {
            indiaUpiSendPaymentActivity.A0I = r3.A02;
            indiaUpiSendPaymentActivity.A0h = r3.A03;
            if (!C161527pr.A02(r3.A01)) {
                indiaUpiSendPaymentActivity.A0G = r3.A01;
            }
        } else {
            indiaUpiSendPaymentActivity.A0I = null;
            indiaUpiSendPaymentActivity.A0h = null;
        }
        indiaUpiSendPaymentActivity.A8N(this.A00);
    }

    public final void A0G(UserJid userJid, C203339nX r10) {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A01;
        C1899593h.A1H(indiaUpiSendPaymentActivity.A0f, userJid, "sendGetContactInfoForJid: ", AnonymousClass001.A0o());
        indiaUpiSendPaymentActivity.A07.A00(indiaUpiSendPaymentActivity, userJid, indiaUpiSendPaymentActivity.A05, r10, indiaUpiSendPaymentActivity.A0P.A05());
    }
}
