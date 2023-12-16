package X;

import com.whatsapp.WaTextView;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.identity.QrCodeValidationResultBottomSheet;
import com.whatsapp.identity.ScanQrCodeActivity;
import com.whatsapp.qrcode.WaQrScannerView;

/* renamed from: X.4Kj  reason: invalid class name and case insensitive filesystem */
public class C86504Kj implements AnonymousClass4AW {
    public Object A00;
    public final int A01;

    public C86504Kj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BZE(boolean z) {
        if (this.A01 != 0) {
            ScanQrCodeActivity scanQrCodeActivity = (ScanQrCodeActivity) this.A00;
            QrCodeValidationResultBottomSheet qrCodeValidationResultBottomSheet = new QrCodeValidationResultBottomSheet();
            AnonymousClass3Z6[] r2 = new AnonymousClass3Z6[1];
            AnonymousClass3Z6.A04("is_valid", Boolean.valueOf(z), r2);
            qrCodeValidationResultBottomSheet.A0u(C02820Hs.A00(r2));
            qrCodeValidationResultBottomSheet.A01 = new C635439q((Object) scanQrCodeActivity, 23);
            qrCodeValidationResultBottomSheet.A00 = new C635439q((Object) scanQrCodeActivity, 24);
            WaTextView waTextView = scanQrCodeActivity.A03;
            if (waTextView == null) {
                throw C18270x1.A0S("errorIndicatorView");
            }
            waTextView.setVisibility(8);
            C18300x5.A1B(qrCodeValidationResultBottomSheet, scanQrCodeActivity.getSupportFragmentManager(), "QrCodeValidationResultBottomSheet");
            WaQrScannerView waQrScannerView = scanQrCodeActivity.A0C;
            if (waQrScannerView == null) {
                throw C18270x1.A0S("qrScannerView");
            }
            waQrScannerView.BqA();
            return;
        }
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
        identityVerificationActivity.A0P.A02(new C71703cX(40, (Object) identityVerificationActivity, z));
    }
}
