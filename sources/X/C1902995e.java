package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;

/* renamed from: X.95e  reason: invalid class name and case insensitive filesystem */
public class C1902995e extends C08790f7 {
    public final /* synthetic */ IndiaUpiQrTabActivity A00;

    public C1902995e(IndiaUpiQrTabActivity indiaUpiQrTabActivity) {
        this.A00 = indiaUpiQrTabActivity;
    }

    public void BXe(int i, float f, int i2) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        boolean z = false;
        if (i == (!indiaUpiQrTabActivity.A00.A0T()) || f != 0.0f) {
            z = true;
        }
        if (indiaUpiQrTabActivity.A0F != z) {
            indiaUpiQrTabActivity.A0F = z;
            if (z) {
                View currentFocus = indiaUpiQrTabActivity.getCurrentFocus();
                if (currentFocus != null) {
                    indiaUpiQrTabActivity.A0B.A02(currentFocus);
                }
                indiaUpiQrTabActivity.A74();
            }
        }
    }

    public void BXf(int i) {
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = this.A00;
        indiaUpiQrTabActivity.A5T();
        AnonymousClass94b r4 = indiaUpiQrTabActivity.A0A;
        int i2 = 0;
        while (true) {
            C102095Hl[] r1 = r4.A00;
            if (i2 >= r1.length) {
                break;
            }
            C102095Hl r0 = r1[i2];
            r0.A00.setSelected(AnonymousClass000.A1U(i2, i));
            i2++;
        }
        if (i == 0) {
            View currentFocus = indiaUpiQrTabActivity.getCurrentFocus();
            if (currentFocus != null) {
                indiaUpiQrTabActivity.A0B.A02(currentFocus);
            }
            if (!indiaUpiQrTabActivity.A0F) {
                indiaUpiQrTabActivity.A0F = true;
                indiaUpiQrTabActivity.A74();
            }
            if (!indiaUpiQrTabActivity.A07.A0F()) {
                indiaUpiQrTabActivity.A05.A0H(R.string.f11nameremoved, 1);
            }
        } else if (i == 1) {
            indiaUpiQrTabActivity.A0B.A1J();
        }
    }
}
