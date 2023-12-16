package X;

import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.9gJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199269gJ implements Runnable {
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A00;

    public final void run() {
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A00;
        if (!indiaUpiDeviceBindStepActivity.A0f) {
            indiaUpiDeviceBindStepActivity.A0h.A06("IndiaUpiDeviceBindActivity: device binding canceled");
            indiaUpiDeviceBindStepActivity.A0S.BKB(1, 117, "device_binding", (String) null);
            indiaUpiDeviceBindStepActivity.A0f = true;
            indiaUpiDeviceBindStepActivity.A0G.A01 = null;
            AnonymousClass97T.A0w(indiaUpiDeviceBindStepActivity.A0L, indiaUpiDeviceBindStepActivity.A0M, indiaUpiDeviceBindStepActivity);
            indiaUpiDeviceBindStepActivity.A0m = false;
        }
    }

    public /* synthetic */ C199269gJ(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this.A00 = indiaUpiDeviceBindStepActivity;
    }
}
