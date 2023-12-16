package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;

/* renamed from: X.9do  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197749do implements C182958pG {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;

    public final void BaP(String str, int i) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        indiaUpiQrTabActivity.BjL();
        if (!indiaUpiQrTabActivity.BHW()) {
            int i2 = R.string.f11nameremoved;
            if (i != 0) {
                i2 = R.string.f11nameremoved;
                if (i != 1) {
                    if (i == 2) {
                        String str2 = str;
                        if (!C161957qt.A02(indiaUpiQrTabActivity.A0D, indiaUpiQrTabActivity.A04.A07()) || !C161957qt.A03(indiaUpiQrTabActivity.A0D, str)) {
                            indiaUpiQrTabActivity.Bon(IndiaUpiQrCodeScannedDialogFragment.A00((C95814uZ) null, str, "GALLERY_QR_CODE", "payments_camera_gallery"), "GALLERY_QR_CODE");
                            return;
                        } else if (indiaUpiQrTabActivity.A05.A0C() && indiaUpiQrTabActivity.A08.A03()) {
                            indiaUpiQrTabActivity.A03.A00(indiaUpiQrTabActivity, (C95814uZ) null, (C202949ms) null, str2, "GALLERY_QR_CODE", "payments_camera_gallery");
                            return;
                        } else if (!indiaUpiQrTabActivity.A08.A03()) {
                            indiaUpiQrTabActivity.A04.BkL(new AnonymousClass9GU(indiaUpiQrTabActivity, indiaUpiQrTabActivity.A06, new C197399d6(indiaUpiQrTabActivity, "GALLERY_QR_CODE", str)), new C15910sA[0]);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            String string = indiaUpiQrTabActivity.getString(i2);
            C19340zH A002 = AnonymousClass5V0.A00(indiaUpiQrTabActivity);
            C19340zH.A06(A002);
            A002.A0g(string);
            C18280x3.A0q(A002);
        }
    }

    public /* synthetic */ C197749do(IndiaUpiQrTabActivity indiaUpiQrTabActivity) {
        this.A00 = indiaUpiQrTabActivity;
    }
}
