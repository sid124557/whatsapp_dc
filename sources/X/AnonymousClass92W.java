package X;

import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;

/* renamed from: X.92W  reason: invalid class name */
public class AnonymousClass92W implements C84134Bd {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass92W(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void AwB(Object obj) {
        AnonymousClass1I2 r2;
        C1451074e r0;
        switch (this.A02) {
            case 0:
                r2 = (AnonymousClass1I2) this.A01;
                int i = this.A00;
                synchronized (r2) {
                    r2.A02.set(i, obj);
                    r2.A01 = true;
                    int i2 = r2.A00 - 1;
                    r2.A00 = i2;
                    if (i2 != 0) {
                        return;
                    }
                }
                break;
            case 1:
                r2 = (AnonymousClass1I2) this.A01;
                int i3 = this.A00;
                synchronized (r2) {
                    r2.A03.set(i3, obj);
                    int i4 = r2.A00 - 1;
                    r2.A00 = i4;
                    if (i4 != 0) {
                        return;
                    }
                }
                break;
            case 2:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A01;
                int i5 = this.A00;
                deepLinkActivity.A00.removeMessages(1);
                deepLinkActivity.BjL();
                if (((Boolean) obj).booleanValue()) {
                    deepLinkActivity.finish();
                    return;
                } else {
                    deepLinkActivity.Bot(i5);
                    return;
                }
            default:
                InAppBugReportingViewModel inAppBugReportingViewModel = (InAppBugReportingViewModel) this.A01;
                int i6 = this.A00;
                C152497Zc r6 = (C152497Zc) obj;
                C162457s7.A0J(r6, 2);
                int i7 = r6.A00;
                if (i7 == 0) {
                    inAppBugReportingViewModel.A0E(C134776jb.A00, i6);
                    inAppBugReportingViewModel.A06[i6] = r6;
                    return;
                }
                if (i7 == 1) {
                    r0 = C134766ja.A00;
                } else {
                    r0 = C134756jZ.A00;
                }
                inAppBugReportingViewModel.A0E(r0, i6);
                inAppBugReportingViewModel.A06[i6] = null;
                return;
        }
        r2.A07();
    }
}
