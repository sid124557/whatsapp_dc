package X;

import com.whatsapp.report.ReportActivity;

/* renamed from: X.3SU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3SU implements AnonymousClass4B6 {
    public final /* synthetic */ C66453Lm A00;
    public final /* synthetic */ ReportActivity A01;

    public final void BkI(int i) {
        ReportActivity reportActivity = this.A01;
        C66453Lm r2 = this.A00;
        C18260x0.A0x("send-get-gdpr-report/failed/error ", AnonymousClass001.A0o(), i);
        if (i == 404) {
            r2.A07();
        } else {
            reportActivity.A05.A0S(new C71283br((Object) reportActivity, 5));
        }
    }

    public /* synthetic */ AnonymousClass3SU(C66453Lm r1, ReportActivity reportActivity) {
        this.A01 = reportActivity;
        this.A00 = r1;
    }
}
