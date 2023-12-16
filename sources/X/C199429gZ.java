package X;

import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.util.Log;

/* renamed from: X.9gZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199429gZ implements Runnable {
    public final /* synthetic */ IndiaUpiSendPaymentActivity A00;

    public final void run() {
        IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = this.A00;
        indiaUpiSendPaymentActivity.A0f.A04("Getting PLE encryption key in background...");
        C69263Wi r4 = indiaUpiSendPaymentActivity.A05;
        AnonymousClass9A8 r1 = new AnonymousClass9A8(indiaUpiSendPaymentActivity, indiaUpiSendPaymentActivity.A03, r4, indiaUpiSendPaymentActivity.A0H, indiaUpiSendPaymentActivity.A0L, indiaUpiSendPaymentActivity.A0K, indiaUpiSendPaymentActivity.A0M);
        AnonymousClass9NV r8 = new AnonymousClass9NV(indiaUpiSendPaymentActivity);
        Log.i("PAY: getPleServerPublicKey called");
        AnonymousClass31C r10 = r1.A03;
        String A03 = r10.A03();
        AnonymousClass9IX r9 = new AnonymousClass9IX(new AnonymousClass9IO(A03));
        r10.A0D(new C203939oY(r1.A00, r1.A02, r1.A04, r1.A00, r1, r8, r9), r9.A00, A03, 204, 0);
    }

    public /* synthetic */ C199429gZ(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        this.A00 = indiaUpiSendPaymentActivity;
    }
}
