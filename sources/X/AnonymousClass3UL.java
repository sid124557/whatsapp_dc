package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.report.BusinessActivityReportViewModel;
import com.whatsapp.report.ReportActivity;

/* renamed from: X.3UL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3UL implements C182978pI {
    public final /* synthetic */ ReportActivity A00;

    public final void B1P() {
        boolean z;
        BusinessActivityReportViewModel businessActivityReportViewModel = this.A00.A05;
        if (businessActivityReportViewModel.A03.A0Y()) {
            C06270Wx.A03(businessActivityReportViewModel.A01, 1);
            AnonymousClass3T4 r6 = businessActivityReportViewModel.A0B;
            if (r6.A04.A0F()) {
                AnonymousClass31C r5 = r6.A05;
                String A03 = r5.A03();
                AnonymousClass39V[] r2 = new AnonymousClass39V[1];
                boolean A0F = AnonymousClass39V.A0F("action", "delete", r2);
                AnonymousClass36K A0I = AnonymousClass36K.A0I("p2b", r2);
                AnonymousClass39V[] r22 = new AnonymousClass39V[6];
                AnonymousClass39V.A0E(r22, A0F ? 1 : 0);
                AnonymousClass39V.A0B("from", C56972sr.A06(r6.A03), r22, 1);
                AnonymousClass39V.A06("xmlns", "w:biz:p2b_report", r22);
                AnonymousClass39V.A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22);
                AnonymousClass39V.A08("smax_id", "31", r22);
                r22[5] = new AnonymousClass39V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A03);
                r5.A0E(r6, AnonymousClass36K.A0G(A0I, r22), A03, 266, 32000);
                z = true;
            } else {
                z = false;
            }
            C18260x0.A1E("app/sendDeleteReport success:", AnonymousClass001.A0o(), z);
        }
    }

    public /* synthetic */ AnonymousClass3UL(ReportActivity reportActivity) {
        this.A00 = reportActivity;
    }
}
