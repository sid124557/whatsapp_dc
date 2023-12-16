package X;

import android.widget.ProgressBar;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.identity.ScanQrCodeActivity;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.EnumMap;
import java.util.Set;

/* renamed from: X.3Pd  reason: invalid class name and case insensitive filesystem */
public final class C67403Pd implements AnonymousClass4D4 {
    public final /* synthetic */ ScanQrCodeActivity A00;

    public C67403Pd(ScanQrCodeActivity scanQrCodeActivity) {
        this.A00 = scanQrCodeActivity;
    }

    public void BTV(AnonymousClass2NZ r8, Set set, Set set2) {
        ScanQrCodeActivity scanQrCodeActivity = this.A00;
        ProgressBar progressBar = scanQrCodeActivity.A01;
        if (progressBar == null) {
            throw C18270x1.A0S("progressBar");
        }
        progressBar.setVisibility(8);
        if (r8 != null) {
            if (scanQrCodeActivity.A09 != null) {
                AnonymousClass2NZ r0 = scanQrCodeActivity.A08;
                if (r0 == r8) {
                    return;
                }
                if (r0 != null) {
                    C48482ey r1 = r0.A01;
                    C48482ey r02 = r8.A01;
                    if (!(r1 == null || r02 == null || !r1.equals(r02))) {
                        return;
                    }
                }
            } else {
                throw C18270x1.A0S("fingerprintUtil");
            }
        }
        scanQrCodeActivity.A08 = r8;
        C54172oI r03 = scanQrCodeActivity.A0A;
        if (r03 != null) {
            r03.A0A = r8;
            if (r8 != null) {
                QrImageView qrImageView = (QrImageView) scanQrCodeActivity.findViewById(R.id.qr_code);
                try {
                    EnumMap enumMap = new EnumMap(C141426vY.class);
                    C151137To A002 = C159727mM.A00(AnonymousClass21X.L, new String(r8.A02.A0F(), scanQrCodeActivity.A0F), enumMap);
                    scanQrCodeActivity.A02 = A002;
                    qrImageView.setQrCode(A002);
                    qrImageView.invalidate();
                } catch (C143916zg | UnsupportedEncodingException e) {
                    Log.w("scanqrcode/", e);
                }
            }
        } else {
            throw C18270x1.A0S("qrCodeValidationUtil");
        }
    }

    public void BYc() {
        ProgressBar progressBar = this.A00.A01;
        if (progressBar == null) {
            throw C18270x1.A0S("progressBar");
        }
        progressBar.setVisibility(0);
    }
}
