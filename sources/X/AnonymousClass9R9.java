package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9R9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9R9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IndiaUpiSecureQrCodeViewModel A01;

    public final void A00(AnonymousClass34V r9, String str) {
        C195179Wl A002;
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = this.A01;
        int i = this.A00;
        if (r9 != null) {
            C195179Wl A0D = indiaUpiSecureQrCodeViewModel.A0D();
            A0D.A04 = "01";
            indiaUpiSecureQrCodeViewModel.A00.A0H(A0D);
        } else if (!(TextUtils.isEmpty(str) || (A002 = C195179Wl.A00(Uri.parse(str), "SCANNED_QR_CODE")) == null || A002.A0I == null)) {
            indiaUpiSecureQrCodeViewModel.A00.A0H(A002);
            if (A002.A0A == null) {
                C196629bS r7 = indiaUpiSecureQrCodeViewModel.A09;
                synchronized (r7) {
                    try {
                        C620933l r6 = r7.A03;
                        JSONObject A0g = C1899593h.A0g(r6);
                        A0g.put("signedQrCode", str);
                        A0g.put("signedQrCodeTs", r7.A00.A0H());
                        C1899593h.A1D(r6, A0g);
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeQrSignature threw: ", e);
                    }
                }
            }
        }
        indiaUpiSecureQrCodeViewModel.A01.A0H(new C193369Of(0, i));
        return;
    }

    public /* synthetic */ AnonymousClass9R9(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel, int i) {
        this.A01 = indiaUpiSecureQrCodeViewModel;
        this.A00 = i;
    }
}
