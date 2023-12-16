package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.93o  reason: invalid class name and case insensitive filesystem */
public class C1900293o extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;
    public final /* synthetic */ IndiaUpiDeviceBindStepActivity A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1900293o(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        this();
        this.A02 = indiaUpiDeviceBindStepActivity;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass2A1.A01(context);
                    this.A01 = true;
                }
            }
        }
        int resultCode = getResultCode();
        IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = this.A02;
        C160757oG r2 = indiaUpiDeviceBindStepActivity.A0h;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SmsSentReceiver onReceive: ");
        C1899593h.A1K(r2, A0o, resultCode);
        if (resultCode == -1) {
            indiaUpiDeviceBindStepActivity.A7j(true, (String) null);
            indiaUpiDeviceBindStepActivity.A0P.A00.A09("smsSend");
            indiaUpiDeviceBindStepActivity.A0P.A00.A0A("deviceBind");
            C153607bd r1 = indiaUpiDeviceBindStepActivity.A0E;
            if (r1 != null) {
                r1.A04("device-binding-sms");
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("IndiaUpiPaymentBankSetupActivity: onSmsSent to psp: ");
            A0o2.append(indiaUpiDeviceBindStepActivity.A0X);
            A0o2.append(" storing verification data sent: ");
            C1899593h.A1J(r2, C195009Vm.A00(indiaUpiDeviceBindStepActivity.A0Z), A0o2);
            if (!TextUtils.isEmpty(indiaUpiDeviceBindStepActivity.A0Z)) {
                indiaUpiDeviceBindStepActivity.A05.A0S(new C199249gH(indiaUpiDeviceBindStepActivity));
                indiaUpiDeviceBindStepActivity.A0e = true;
                indiaUpiDeviceBindStepActivity.A0V = indiaUpiDeviceBindStepActivity.A04.Bkn(new C199259gI(indiaUpiDeviceBindStepActivity), "IndiaUpiDeviceBindSetupActivity/startDeviceBindingForMultipleSms", 3000);
                return;
            }
            return;
        }
        C153607bd r12 = indiaUpiDeviceBindStepActivity.A0E;
        if (r12 != null) {
            r12.A05("device-binding-sms", resultCode);
        }
        indiaUpiDeviceBindStepActivity.A7j(false, "sms_sending_failed");
        indiaUpiDeviceBindStepActivity.A7e(new AnonymousClass9VW(R.string.f11nameremoved), true);
    }

    public C1900293o() {
        this.A01 = false;
        this.A00 = AnonymousClass002.A0D();
    }
}
