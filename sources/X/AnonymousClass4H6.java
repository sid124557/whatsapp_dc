package X;

import android.view.animation.Animation;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.qrcode.WaQrScannerView;

/* renamed from: X.4H6  reason: invalid class name */
public class AnonymousClass4H6 extends C167047zg {
    public Object A00;
    public final int A01;

    public AnonymousClass4H6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            WaQrScannerView waQrScannerView = ((C54172oI) obj).A0G;
            if (waQrScannerView != null) {
                waQrScannerView.Bjp();
                return;
            }
            return;
        }
        ((IdentityVerificationActivity) obj).A02.setVisibility(8);
    }
}
