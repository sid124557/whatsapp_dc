package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;

/* renamed from: X.9pY  reason: invalid class name and case insensitive filesystem */
public class C204559pY implements AnonymousClass8s2 {
    public Object A00;
    public final int A01;

    public C204559pY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BkB() {
        if (this.A01 != 0) {
            IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) this.A00;
            AnonymousClass9AF r4 = indiaUpiDeviceBindStepActivity.A0H;
            AnonymousClass99H r3 = indiaUpiDeviceBindStepActivity.A0B;
            boolean z = indiaUpiDeviceBindStepActivity.A0k;
            r4.A00(r3, new C204669pj(indiaUpiDeviceBindStepActivity, 2), z, z);
            return;
        }
        ((IndiaUpiBankAccountPickerActivity) this.A00).A7W();
    }

    public void Boq() {
        AnonymousClass9DA r4 = (AnonymousClass9DA) this.A00;
        C19340zH A002 = AnonymousClass5V0.A00(r4);
        A002.A0i(false);
        A002.A0T(R.string.f11nameremoved);
        A002.A0Y(new C204379pG(r4, 11, r4), R.string.f11nameremoved);
        C18280x3.A0q(A002);
    }
}
