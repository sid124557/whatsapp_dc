package X;

import com.whatsapp.R;
import com.whatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

/* renamed from: X.67n  reason: invalid class name and case insensitive filesystem */
public class C1232067n extends C08790f7 {
    public Object A00;
    public final int A01;

    public C1232067n(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXe(int i, float f, int i2) {
        if (1 - this.A01 != 0) {
            super.BXe(i, f, i2);
            return;
        }
        C97654yv r2 = (C97654yv) this.A00;
        boolean z = true;
        if (i != C620733j.A04(r2.A0H) && f == 0.0f) {
            z = false;
        }
        if (r2.A0Y != z) {
            r2.A0Y = z;
            if (z) {
                r2.A76();
                return;
            }
            QrScanCodeFragment qrScanCodeFragment = r2.A0U;
            qrScanCodeFragment.A02.A0T(qrScanCodeFragment.A0D, 200);
            qrScanCodeFragment.A02.A0R(qrScanCodeFragment.A0C);
        }
    }

    public void BXf(int i) {
        int i2;
        if (this.A01 != 0) {
            C97654yv r3 = (C97654yv) this.A00;
            r3.A5T();
            C87464Ta r4 = r3.A0S;
            int i3 = 0;
            do {
                r4.A00[i3].A00.setSelected(AnonymousClass000.A1U(i3, i));
                i3++;
            } while (i3 < 2);
            boolean A04 = C620733j.A04(r3.A0H);
            if (i == 0) {
                A04 = !A04;
            } else if (i != 1) {
                return;
            }
            if (!A04) {
                C107405bG.A09(r3, AnonymousClass5Yj.A02(r3, R.attr.f3nameremoved, R.color.f5nameremoved), 1);
            } else if (A04) {
                C107405bG.A09(r3, R.color.f5nameremoved, 2);
                if (!r3.A0Y) {
                    r3.A0Y = true;
                    r3.A76();
                }
                if (!AnonymousClass4SG.A40(r3)) {
                    r3.A05.A0H(R.string.f11nameremoved, 1);
                }
            }
        } else {
            GreenAlertActivity greenAlertActivity = (GreenAlertActivity) this.A00;
            int currentLogicalItem = greenAlertActivity.A06.getCurrentLogicalItem();
            C51922kb r2 = greenAlertActivity.A0A;
            if (currentLogicalItem == 1) {
                i2 = 7;
                if (AnonymousClass31f.A02(greenAlertActivity.A0B)) {
                    i2 = 3;
                }
            } else {
                i2 = 11;
            }
            r2.A01(Integer.valueOf(i2));
            greenAlertActivity.A76(currentLogicalItem);
            greenAlertActivity.A77(currentLogicalItem);
        }
    }
}
