package X;

import android.os.Vibrator;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;
import com.whatsapp.util.Log;

/* renamed from: X.9Wv  reason: invalid class name */
public class AnonymousClass9Wv implements C84874Eb {
    public Object A00;
    public final int A01;

    public AnonymousClass9Wv(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BOF(int i) {
        C69263Wi r1;
        int i2;
        C69263Wi r12;
        int i3;
        if (this.A01 != 0) {
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = (IndiaUpiScanQrCodeFragment) this.A00;
            if (indiaUpiScanQrCodeFragment.A04.A04()) {
                r12 = indiaUpiScanQrCodeFragment.A03;
                i3 = R.string.f11nameremoved;
            } else if (i != 2) {
                r12 = indiaUpiScanQrCodeFragment.A03;
                i3 = R.string.f11nameremoved;
            } else {
                return;
            }
            r12.A0H(i3, 1);
            return;
        }
        C32241pq r3 = (C32241pq) this.A00;
        if (r3.A03.A04()) {
            r1 = r3.A05;
            i2 = R.string.f11nameremoved;
        } else {
            if (i != 2) {
                r1 = r3.A05;
                i2 = R.string.f11nameremoved;
            }
            r3.finish();
        }
        r1.A0H(i2, 1);
        r3.finish();
    }

    public void BYs() {
        AnonymousClass5Q3 r1;
        if (this.A01 != 0) {
            Log.i("qractivity/previewready");
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = (IndiaUpiScanQrCodeFragment) this.A00;
            indiaUpiScanQrCodeFragment.A07 = null;
            indiaUpiScanQrCodeFragment.A1K();
            r1 = indiaUpiScanQrCodeFragment.A05;
        } else {
            IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = (IndiaUpiQrCodeScanActivity) this.A00;
            indiaUpiQrCodeScanActivity.A02.A06("indiaupiqractivity/previewready");
            indiaUpiQrCodeScanActivity.A08 = true;
            r1 = indiaUpiQrCodeScanActivity.A00;
        }
        r1.A00("payments_camera");
    }

    public void BZC(String str) {
        int i = this.A01;
        Object obj = this.A00;
        String str2 = str;
        if (i != 0) {
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = (IndiaUpiScanQrCodeFragment) obj;
            indiaUpiScanQrCodeFragment.A05.A01(2);
            if (str == null || str.equals(indiaUpiScanQrCodeFragment.A07)) {
                indiaUpiScanQrCodeFragment.A06.Bjp();
                return;
            }
            indiaUpiScanQrCodeFragment.A07 = str;
            IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) indiaUpiScanQrCodeFragment.A0R();
            Vibrator A0K = indiaUpiQrTabActivity.A08.A0K();
            if (A0K != null) {
                A0K.vibrate(75);
            }
            if (!C161957qt.A02(indiaUpiQrTabActivity.A0D, indiaUpiQrTabActivity.A04.A07()) || !C161957qt.A03(indiaUpiQrTabActivity.A0D, str)) {
                if (indiaUpiQrTabActivity.A0D.A0X(1354)) {
                    indiaUpiQrTabActivity.A03.A00(indiaUpiQrTabActivity, (C95814uZ) null, new C195249Wu(indiaUpiQrTabActivity, 1), str2, "SCANNED_QR_CODE", "payments_camera");
                } else {
                    indiaUpiQrTabActivity.Bon(IndiaUpiQrCodeScannedDialogFragment.A00((C95814uZ) null, str, "SCANNED_QR_CODE", "payments_camera"), "SCANNED_QR_CODE");
                }
            } else if (indiaUpiQrTabActivity.A05.A0C() && indiaUpiQrTabActivity.A08.A03()) {
                indiaUpiQrTabActivity.A03.A00(indiaUpiQrTabActivity, (C95814uZ) null, (C202949ms) null, str2, "SCANNED_QR_CODE", "payments_camera_gallery");
            } else if (!indiaUpiQrTabActivity.A08.A03()) {
                indiaUpiQrTabActivity.A04.BkL(new AnonymousClass9GU(indiaUpiQrTabActivity, indiaUpiQrTabActivity.A06, new C197399d6(indiaUpiQrTabActivity, "SCANNED_QR_CODE", str)), new C15910sA[0]);
            }
        } else {
            IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = (IndiaUpiQrCodeScanActivity) obj;
            indiaUpiQrCodeScanActivity.A00.A01(2);
            indiaUpiQrCodeScanActivity.A77(str);
        }
    }
}
