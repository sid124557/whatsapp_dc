package X;

import android.app.Activity;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;

/* renamed from: X.9Wu  reason: invalid class name and case insensitive filesystem */
public class C195249Wu implements C202949ms {
    public Object A00;
    public final int A01;

    public C195249Wu(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bal() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = ((IndiaUpiQrTabActivity) obj).A0B;
            indiaUpiScanQrCodeFragment.A07 = null;
            indiaUpiScanQrCodeFragment.A06.Bjp();
            return;
        }
        ((Activity) obj).finish();
    }

    public void Bam() {
        if (this.A01 == 0) {
            ((Activity) this.A00).finish();
        }
    }
}
