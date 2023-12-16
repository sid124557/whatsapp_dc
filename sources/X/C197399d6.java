package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

/* renamed from: X.9d6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197399d6 implements C202779mZ {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void BTC(C166587yw r7) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        if (r7 != null) {
            Intent A06 = C1899593h.A06(indiaUpiQrTabActivity, r7, IndiaUpiInternationalActivationActivity.class);
            A06.putExtra("INTERNATIONAL_QR_SOURCE", str);
            A06.putExtra("EXTRA_INTERNATIONAL_QR_ACTIVATION_FROM_SCAN", true);
            A06.putExtra("INTERNATIONAL_QR_PAYLOAD", C1899693i.A0F(AnonymousClass3QD.A00(), String.class, str2, "invoiceUrl"));
            indiaUpiQrTabActivity.BpY(A06, 1019);
        }
    }

    public /* synthetic */ C197399d6(IndiaUpiQrTabActivity indiaUpiQrTabActivity, String str, String str2) {
        this.A00 = indiaUpiQrTabActivity;
        this.A01 = str;
        this.A02 = str2;
    }
}
