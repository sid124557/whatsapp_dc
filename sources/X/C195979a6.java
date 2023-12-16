package X;

import com.whatsapp.QrImageView;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;

/* renamed from: X.9a6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C195979a6 implements C181608n2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IndiaUpiDisplaySecureQrCodeView A01;

    public final void BPW(QrImageView qrImageView) {
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A01;
        int i = this.A00;
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = indiaUpiDisplaySecureQrCodeView.A0G;
        indiaUpiSecureQrCodeViewModel.A01.A0H(new C193369Of(3, i));
    }

    public /* synthetic */ C195979a6(IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView, int i) {
        this.A01 = indiaUpiDisplaySecureQrCodeView;
        this.A00 = i;
    }
}
