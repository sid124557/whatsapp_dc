package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.math.BigDecimal;

/* renamed from: X.9dT  reason: invalid class name */
public class AnonymousClass9dT implements C203409ne {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public AnonymousClass9dT(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public String BAu() {
        Object obj;
        C166557yt r0 = this.A00.A0I;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.A00;
        }
        return (String) obj;
    }

    public boolean BIL() {
        String str;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        if (indiaUpiSendPaymentActivity.A0m != null || (str = indiaUpiSendPaymentActivity.A0k) == null) {
            return true;
        }
        if (indiaUpiSendPaymentActivity.A0U == null || BigDecimal.ZERO.compareTo(new BigDecimal(str)) != 0) {
            return false;
        }
        return true;
    }

    public boolean BIt() {
        return this.A00.A7T();
    }

    public C009707r B48() {
        return this.A00;
    }
}
