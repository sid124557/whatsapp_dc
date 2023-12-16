package X;

import com.whatsapp.R;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.util.Log;

/* renamed from: X.26p  reason: invalid class name and case insensitive filesystem */
public class C382626p implements AnonymousClass4FK {
    public Object A00;
    public final int A01;

    public C382626p(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void A00() {
        C89654ea r3 = (C89654ea) this.A00;
        if (!r3.BHW()) {
            C19340zH A002 = AnonymousClass5V0.A00(r3);
            C19340zH.A02(r3, A002);
            A002.A0b(r3, new AnonymousClass4K2(this, 180));
            A002.A0U(R.string.device_linking_failed_title);
            A002.A0T(R.string.device_linking_failed_message);
            A002.A0S();
        }
    }

    public void BUi() {
        if (this.A01 != 0) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A00;
            devicePairQrScannerActivity.A07.BK7(1, -5, 1);
            DevicePairQrScannerActivity.A0C(devicePairQrScannerActivity);
            devicePairQrScannerActivity.A05.A0H(R.string.f11nameremoved, 1);
            return;
        }
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onInvalidDeviceTime");
        LinkedDevicesEnterCodeActivity linkedDevicesEnterCodeActivity = (LinkedDevicesEnterCodeActivity) this.A00;
        linkedDevicesEnterCodeActivity.A74();
        linkedDevicesEnterCodeActivity.A05.A0H(R.string.f11nameremoved, 1);
    }

    public void BUj() {
        if (this.A01 != 0) {
            DevicePairQrScannerActivity devicePairQrScannerActivity = (DevicePairQrScannerActivity) this.A00;
            DevicePairQrScannerActivity.A0C(devicePairQrScannerActivity);
            devicePairQrScannerActivity.A07.BK7(1, -6, 1);
            C19340zH A002 = AnonymousClass5V0.A00(devicePairQrScannerActivity);
            C19340zH.A02(devicePairQrScannerActivity, A002);
            A002.A0b(devicePairQrScannerActivity, new AnonymousClass4K2(this, 181));
            A002.A0U(R.string.f11nameremoved);
            A002.A0T(R.string.f11nameremoved);
            A002.A0S();
            devicePairQrScannerActivity.A0D.A00(1);
            return;
        }
        Log.i("LinkedDevicesEnterCodeActivity/devicePairScannerCallback/onInvalidQrCode");
        ((C89654ea) this.A00).A03.A0A("LinkedDevicesEnterCodeActivity/onInvalidQrCode", true, (String) null);
    }
}
