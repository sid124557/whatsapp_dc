package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.AndroidOreoOrientationIssueHandler$1;

/* renamed from: X.7SI  reason: invalid class name */
public class AnonymousClass7SI {
    public Integer A00 = null;
    public final C15110qn A01 = new AndroidOreoOrientationIssueHandler$1(this);

    public void A00(Activity activity) {
        if (Build.VERSION.SDK_INT == 26 && (activity instanceof C004805c)) {
            ((C004805c) activity).A06.A00(this.A01);
            this.A00 = Integer.valueOf(activity.getRequestedOrientation());
            activity.setRequestedOrientation(1);
        }
    }
}
