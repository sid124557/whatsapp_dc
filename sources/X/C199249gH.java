package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.9gH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199249gH implements Runnable {
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A00;

    public final void run() {
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A00;
        indiaUpiDeviceBindStepActivity.A0W = "2";
        indiaUpiDeviceBindStepActivity.markStepDone(indiaUpiDeviceBindStepActivity.A06);
        indiaUpiDeviceBindStepActivity.markStepProcessing(indiaUpiDeviceBindStepActivity.A04);
        indiaUpiDeviceBindStepActivity.markStepDisabled(indiaUpiDeviceBindStepActivity.A05);
        C18290x4.A1A(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A07, R.drawable.ic_verify_bank);
    }

    public /* synthetic */ C199249gH(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this.A00 = indiaUpiDeviceBindStepActivity;
    }
}
