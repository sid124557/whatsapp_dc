package X;

import android.app.ProgressDialog;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;

/* renamed from: X.61i  reason: invalid class name and case insensitive filesystem */
public final class C1216461i extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ InAppBugReportingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1216461i(InAppBugReportingActivity inAppBugReportingActivity) {
        super(1);
        this.this$0 = inAppBugReportingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2WS r2;
        String str;
        int i;
        ProgressDialog progressDialog;
        ProgressDialog progressDialog2;
        ProgressDialog progressDialog3;
        C1450974d r8 = (C1450974d) obj;
        if (r8 instanceof C134746jY) {
            InAppBugReportingActivity inAppBugReportingActivity = this.this$0;
            if (inAppBugReportingActivity.A00 == null) {
                ProgressDialog progressDialog4 = new ProgressDialog(inAppBugReportingActivity);
                inAppBugReportingActivity.A00 = progressDialog4;
                progressDialog4.setCancelable(false);
                ProgressDialog progressDialog5 = inAppBugReportingActivity.A00;
                if (progressDialog5 != null) {
                    progressDialog5.setIndeterminate(true);
                }
                ProgressDialog progressDialog6 = inAppBugReportingActivity.A00;
                if (progressDialog6 != null) {
                    C18320x8.A0w(progressDialog6, inAppBugReportingActivity, R.string.f11nameremoved);
                }
            }
            ProgressDialog progressDialog7 = inAppBugReportingActivity.A00;
            if (!(progressDialog7 == null || progressDialog7.isShowing() || (progressDialog3 = inAppBugReportingActivity.A00) == null)) {
                progressDialog3.show();
            }
        } else {
            if (r8 instanceof C134736jX) {
                InAppBugReportingActivity inAppBugReportingActivity2 = this.this$0;
                ProgressDialog progressDialog8 = inAppBugReportingActivity2.A00;
                if (!(progressDialog8 == null || !progressDialog8.isShowing() || (progressDialog2 = inAppBugReportingActivity2.A00) == null)) {
                    progressDialog2.cancel();
                }
                InAppBugReportingActivity inAppBugReportingActivity3 = this.this$0;
                String str2 = ((C134736jX) r8).A00;
                ConstraintLayout constraintLayout = (ConstraintLayout) C18290x4.A0N(inAppBugReportingActivity3, R.id.bug_report_form);
                inAppBugReportingActivity3.A06 = constraintLayout;
                if (constraintLayout == null) {
                    throw C18270x1.A0S("bugReportForm");
                }
                constraintLayout.setVisibility(8);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) C18290x4.A0N(inAppBugReportingActivity3, R.id.bug_reporting_bottom_bar);
                inAppBugReportingActivity3.A05 = constraintLayout2;
                if (constraintLayout2 == null) {
                    throw C18270x1.A0S("bugReportBottomBar");
                }
                constraintLayout2.setVisibility(8);
                ViewStub viewStub = (ViewStub) C18290x4.A0N(inAppBugReportingActivity3, R.id.bug_submitted_confirmation);
                inAppBugReportingActivity3.A02 = viewStub;
                if (viewStub == null) {
                    throw C18270x1.A0S("bugSubmittedConfirmation");
                }
                viewStub.inflate();
                inAppBugReportingActivity3.A04 = (TextView) C18290x4.A0N(inAppBugReportingActivity3, R.id.task_creation_message);
                String A0e = AnonymousClass0x2.A0e(str2, AnonymousClass001.A0o(), 'T');
                String A0m = C86604Kt.A0m(inAppBugReportingActivity3, A0e, R.string.f11nameremoved);
                C162457s7.A0D(A0m);
                SpannableString A0A = AnonymousClass4L0.A0A(A0m);
                C87014Mt r3 = new C87014Mt(inAppBugReportingActivity3, AnonymousClass000.A0V("https://www.internalfb.com/tasks/?t=", str2, AnonymousClass001.A0o()));
                int A0G = C175728Zm.A0G(A0m, A0e, 0, false);
                A0A.setSpan(r3, A0G, C86664Kz.A0L(A0e, A0G), 33);
                TextView textView = inAppBugReportingActivity3.A04;
                if (textView == null) {
                    throw C18270x1.A0S("taskCreationMessage");
                }
                textView.setText(A0A);
                TextView textView2 = inAppBugReportingActivity3.A04;
                if (textView2 == null) {
                    throw C18270x1.A0S("taskCreationMessage");
                }
                textView2.setMovementMethod(new C86954Mn());
                r2 = this.this$0.A74();
                str = null;
                i = 7;
            } else if (r8 instanceof C134726jW) {
                InAppBugReportingActivity inAppBugReportingActivity4 = this.this$0;
                ProgressDialog progressDialog9 = inAppBugReportingActivity4.A00;
                if (!(progressDialog9 == null || !progressDialog9.isShowing() || (progressDialog = inAppBugReportingActivity4.A00) == null)) {
                    progressDialog.cancel();
                }
                boolean A1b = C86614Ku.A1b(this.this$0.A0Q);
                InAppBugReportingActivity inAppBugReportingActivity5 = this.this$0;
                if (A1b) {
                    View A0G2 = C86654Ky.A0G(inAppBugReportingActivity5, R.layout.f8nameremoved);
                    View A0E = C18280x3.A0E(A0G2, R.id.button_try_again);
                    View A0E2 = C18280x3.A0E(A0G2, R.id.button_submit_via_email);
                    View A0E3 = C18280x3.A0E(A0G2, R.id.button_cancel);
                    C19340zH A02 = AnonymousClass5V0.A02(inAppBugReportingActivity5, A0G2);
                    A02.A0i(false);
                    AnonymousClass043 A0H = C18300x5.A0H(A02);
                    C18310x6.A19(A0E, A0H, inAppBugReportingActivity5, 18);
                    C18310x6.A19(A0E2, A0H, inAppBugReportingActivity5, 19);
                    C18310x6.A19(A0E3, A0H, inAppBugReportingActivity5, 20);
                    A0H.show();
                } else {
                    inAppBugReportingActivity5.Bot(R.string.f11nameremoved);
                }
                r2 = this.this$0.A74();
                str = ((C134726jW) r8).A00;
                i = 8;
            }
            r2.A00(i, str);
        }
        return C59022wD.A00;
    }
}
