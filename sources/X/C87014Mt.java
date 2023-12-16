package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;

/* renamed from: X.4Mt  reason: invalid class name and case insensitive filesystem */
public final class C87014Mt extends ClickableSpan implements AnonymousClass4CF {
    public final /* synthetic */ InAppBugReportingActivity A00;
    public final /* synthetic */ String A01;

    public void updateDrawState(TextPaint textPaint) {
        C162457s7.A0J(textPaint, 0);
        super.updateDrawState(textPaint);
        C86614Ku.A10(this.A00, textPaint, R.color.f5nameremoved);
        textPaint.setUnderlineText(false);
    }

    public C87014Mt(InAppBugReportingActivity inAppBugReportingActivity, String str) {
        this.A00 = inAppBugReportingActivity;
        this.A01 = str;
    }

    public void BP4(MotionEvent motionEvent, View view) {
        Intent A09 = AnonymousClass0x9.A09("android.intent.action.VIEW");
        A09.setData(Uri.parse(this.A01));
        this.A00.startActivity(A09);
    }

    public void BVw(MotionEvent motionEvent, View view) {
        InAppBugReportingActivity inAppBugReportingActivity = this.A00;
        AnonymousClass5VR.A01(inAppBugReportingActivity.A05, inAppBugReportingActivity.A08, this.A01);
    }

    public void onClick(View view) {
    }
}
