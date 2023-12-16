package X;

import com.whatsapp.registration.report.BanReportViewModel;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.6AP  reason: invalid class name */
public class AnonymousClass6AP implements AnonymousClass66E {
    public Object A00;
    public final int A01;

    public AnonymousClass6AP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRy() {
        if (this.A01 != 0) {
            Log.i("BusinessActivityReportViewModel/export-report/on-error");
            C06270Wx.A04(((BusinessActivityReportViewModel) this.A00).A01, 6);
            return;
        }
        Log.i("BanReportViewModel/export-report/on-error");
        C06270Wx.A03(((BanReportViewModel) this.A00).A02, 1);
    }

    public void BZT(String str) {
        AnonymousClass08M r0;
        int i = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i != 0) {
            C18260x0.A0s("BusinessActivityReportViewModel/export-report/on-ready-to-export :: ", str, A0o);
            r0 = ((BusinessActivityReportViewModel) this.A00).A00;
        } else {
            C18260x0.A0s("BanReportViewModel/export-report/on-ready-to-export :: ", str, A0o);
            r0 = ((BanReportViewModel) this.A00).A01;
        }
        r0.A0G(str);
    }
}
