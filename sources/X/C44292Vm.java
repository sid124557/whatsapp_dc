package X;

import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2Vm  reason: invalid class name and case insensitive filesystem */
public class C44292Vm {
    public final /* synthetic */ C55642qg A00;

    public C44292Vm(C55642qg r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass2S3 r8, int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CompanionDeviceQrHandler/onError code=");
        A0o.append(i);
        A0o.append("; pairing device=");
        C18260x0.A0o(r8.A01, A0o);
        C55642qg r3 = this.A00;
        C55642qg.A00(r3);
        C29041iB r2 = r3.A0E;
        synchronized (r2.A0P) {
            r2.A01 = null;
        }
        r3.A00 = null;
        C382626p r6 = (C382626p) r3.A0G;
        if (r6.A01 != 0) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) r6.A00;
            devicePairQrScannerActivity.A07.BK7(2, (long) i, 1);
            DevicePairQrScannerActivity.A0C(devicePairQrScannerActivity);
            if (i != 403) {
                if (i != 405) {
                    if (i == 419) {
                        devicePairQrScannerActivity.A05.A0H(R.string.f11nameremoved, 1);
                        devicePairQrScannerActivity.finish();
                        return;
                    } else if (i != 450) {
                        if (i != 452) {
                            r6.A00();
                            return;
                        } else if (!devicePairQrScannerActivity.BHW()) {
                            C50472iE A002 = LegacyMessageDialogFragment.A00(new Object[0], R.string.f11nameremoved);
                            A002.A01(new C85804Hr(devicePairQrScannerActivity, 82), R.string.f11nameremoved);
                            C85804Hr r1 = new C85804Hr(devicePairQrScannerActivity, 83);
                            A002.A04 = R.string.f11nameremoved;
                            A002.A07 = r1;
                            A002.A00 = 1000;
                            C18270x1.A0t(A002.A00(), devicePairQrScannerActivity);
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (!devicePairQrScannerActivity.BHW()) {
                    Log.w("QrScannerActivity/onConsumerSmbCrossPairingError receive 405 error");
                    C19340zH A003 = AnonymousClass5V0.A00(devicePairQrScannerActivity);
                    C19340zH.A02(devicePairQrScannerActivity, A003);
                    A003.A0b(devicePairQrScannerActivity, new AnonymousClass4K2(devicePairQrScannerActivity, 179));
                    A003.A0T(R.string.f11nameremoved);
                    A003.A0U(R.string.device_linking_failed_title);
                    A003.A0S();
                    return;
                } else {
                    return;
                }
            }
            devicePairQrScannerActivity.A05.Bjp();
            devicePairQrScannerActivity.A05.A0T(devicePairQrScannerActivity.A0J, DevicePairQrScannerActivity.A0L);
            return;
        }
        C18260x0.A0y("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onError errorCode: ", AnonymousClass001.A0o(), i);
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = (LinkedDevicesEnterCodeActivity) r6.A00;
        linkedDevicesEnterCodeActivity.A09.BK7(2, (long) i, 2);
        if (!linkedDevicesEnterCodeActivity.BHW()) {
            linkedDevicesEnterCodeActivity.A74();
            linkedDevicesEnterCodeActivity.A75(0);
        }
    }
}
