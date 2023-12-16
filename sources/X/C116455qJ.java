package X;

import com.whatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.whatsapp.inappbugreporting.InAppBugReportingViewModel$reportBug$1;

/* renamed from: X.5qJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116455qJ implements C84134Bd {
    public final /* synthetic */ InAppBugReportingViewModel A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void AwB(Object obj) {
        AnonymousClass5N4 r0;
        String str;
        InAppBugReportingViewModel inAppBugReportingViewModel = this.A00;
        String str2 = this.A01;
        String str3 = this.A02;
        String str4 = this.A03;
        Iterable<C1451174f> iterable = (Iterable) obj;
        C162457s7.A0J(iterable, 4);
        for (C1451174f r1 : iterable) {
            if (r1 instanceof C134996jx) {
                inAppBugReportingViewModel.A03 = ((C134996jx) r1).A00;
                r0 = inAppBugReportingViewModel.A0E;
                str = "debug_info_fetched";
            } else if (r1 instanceof C135016jz) {
                inAppBugReportingViewModel.A05 = ((C135016jz) r1).A00;
            } else if (r1 instanceof C135006jy) {
                inAppBugReportingViewModel.A04 = ((C135006jy) r1).A00;
                r0 = inAppBugReportingViewModel.A0E;
                str = "device_log_fetched";
            }
            r0.A01.markerPoint(476715896, str);
        }
        C616131n.A02((C85494Gl) null, new InAppBugReportingViewModel$reportBug$1(inAppBugReportingViewModel, str2, str3, str4, (C84814Du) null), AnonymousClass0IV.A00(inAppBugReportingViewModel), (AnonymousClass20D) null, 3);
    }

    public /* synthetic */ C116455qJ(InAppBugReportingViewModel inAppBugReportingViewModel, String str, String str2, String str3) {
        this.A00 = inAppBugReportingViewModel;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }
}
