package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;

/* renamed from: X.61j  reason: invalid class name and case insensitive filesystem */
public final class C1216561j extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ InAppBugReportingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1216561j(InAppBugReportingActivity inAppBugReportingActivity) {
        super(1);
        this.this$0 = inAppBugReportingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1451074e r4 = (C1451074e) obj;
        LinearLayout linearLayout = this.this$0.A03;
        if (linearLayout == null) {
            throw C18270x1.A0S("screenshotsGroup");
        }
        View childAt = linearLayout.getChildAt(0);
        C162457s7.A0K(childAt, "null cannot be cast to non-null type com.whatsapp.inappbugreporting.view.AddScreenshotImageViewWithRemoveButton");
        InAppBugReportingActivity inAppBugReportingActivity = this.this$0;
        C162457s7.A0H(r4);
        InAppBugReportingActivity.A0C(inAppBugReportingActivity, r4, (AnonymousClass4Rx) childAt, 0);
        return C59022wD.A00;
    }
}
