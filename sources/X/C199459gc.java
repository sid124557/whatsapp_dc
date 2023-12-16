package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import java.math.BigDecimal;

/* renamed from: X.9gc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199459gc implements Runnable {
    public final /* synthetic */ AnonymousClass9GN A00;

    public final void run() {
        BigDecimal bigDecimal;
        C197549dU r4;
        AnonymousClass9W6 r3;
        String valueOf;
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00.A00;
        indiaUpiSendPaymentActivity.A00 = 5;
        indiaUpiSendPaymentActivity.A7u();
        if (indiaUpiSendPaymentActivity.A0U != null) {
            AnonymousClass1VX r1 = indiaUpiSendPaymentActivity.A0D;
            C162457s7.A0J(r1, 0);
            int A0N = r1.A0N(3327);
            if (A0N == 0) {
                A0N = SearchActionVerificationClientService.NOTIFICATION_ID;
            }
            indiaUpiSendPaymentActivity.A0l = Integer.toString(A0N);
        } else {
            String A0d = AnonymousClass97T.A0d(indiaUpiSendPaymentActivity);
            if (!C107575bX.A0F(A0d) && indiaUpiSendPaymentActivity.A0D.A0X(1955)) {
                indiaUpiSendPaymentActivity.A0E.A00 = indiaUpiSendPaymentActivity.A0N.A02(A0d, indiaUpiSendPaymentActivity.A0m, indiaUpiSendPaymentActivity.A0k);
                indiaUpiSendPaymentActivity.A8H();
            } else if (!indiaUpiSendPaymentActivity.A0n && (bigDecimal = indiaUpiSendPaymentActivity.A0I) != null) {
                r4 = indiaUpiSendPaymentActivity.A0E;
                r3 = indiaUpiSendPaymentActivity.A0N;
                valueOf = String.valueOf(bigDecimal);
                r4.A00 = r3.A02(valueOf, indiaUpiSendPaymentActivity.A0m, indiaUpiSendPaymentActivity.A0k);
                indiaUpiSendPaymentActivity.A8H();
            }
        }
        r4 = indiaUpiSendPaymentActivity.A0E;
        r3 = indiaUpiSendPaymentActivity.A0N;
        valueOf = indiaUpiSendPaymentActivity.A0l;
        r4.A00 = r3.A02(valueOf, indiaUpiSendPaymentActivity.A0m, indiaUpiSendPaymentActivity.A0k);
        indiaUpiSendPaymentActivity.A8H();
    }

    public /* synthetic */ C199459gc(AnonymousClass9GN r1) {
        this.A00 = r1;
    }
}
