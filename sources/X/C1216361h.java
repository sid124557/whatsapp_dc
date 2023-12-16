package X;

import android.text.Editable;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.61h  reason: invalid class name and case insensitive filesystem */
public final class C1216361h extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ InAppBugReportingActivity this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C162457s7.A0J(obj, 0);
        if (obj.equals(C134706jU.A00)) {
            InAppBugReportingActivity inAppBugReportingActivity = this.this$0;
            WaEditText waEditText = inAppBugReportingActivity.A09;
            if (waEditText == null) {
                throw C18270x1.A0S("describeBugField");
            }
            waEditText.setBackgroundDrawable(AnonymousClass0RP.A00(inAppBugReportingActivity, R.drawable.describe_problem_edittext_bg_error));
            WDSButton wDSButton = inAppBugReportingActivity.A0M;
            if (wDSButton != null) {
                WaEditText waEditText2 = inAppBugReportingActivity.A09;
                if (waEditText2 == null) {
                    throw C18270x1.A0S("describeBugField");
                }
                Editable text = waEditText2.getText();
                boolean z = true;
                if (text == null || text.length() <= 0 || AnonymousClass4SG.A4B(inAppBugReportingActivity)) {
                    z = false;
                }
                wDSButton.setEnabled(z);
                WaTextView waTextView = inAppBugReportingActivity.A0C;
                if (waTextView == null) {
                    throw C18270x1.A0S("describeBugFieldError");
                }
                waTextView.setText(R.string.f11nameremoved);
                waTextView.setVisibility(0);
            } else {
                throw C18270x1.A0S("submitButton");
            }
        } else if (obj.equals(C134716jV.A00)) {
            InAppBugReportingActivity inAppBugReportingActivity2 = this.this$0;
            WaEditText waEditText3 = inAppBugReportingActivity2.A09;
            if (waEditText3 == null) {
                throw C18270x1.A0S("describeBugField");
            }
            waEditText3.setBackgroundDrawable(AnonymousClass0RP.A00(inAppBugReportingActivity2, R.drawable.description_field_background_state_list));
            WaTextView waTextView2 = inAppBugReportingActivity2.A0C;
            if (waTextView2 == null) {
                throw C18270x1.A0S("describeBugFieldError");
            }
            waTextView2.setVisibility(8);
            WDSButton wDSButton2 = inAppBugReportingActivity2.A0M;
            if (wDSButton2 != null) {
                wDSButton2.setEnabled(!AnonymousClass4SG.A4B(inAppBugReportingActivity2));
            } else {
                throw C18270x1.A0S("submitButton");
            }
        }
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1216361h(InAppBugReportingActivity inAppBugReportingActivity) {
        super(1);
        this.this$0 = inAppBugReportingActivity;
    }
}
