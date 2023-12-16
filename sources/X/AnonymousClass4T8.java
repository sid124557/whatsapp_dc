package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.whatsapp.WaTextView;

/* renamed from: X.4T8  reason: invalid class name */
public class AnonymousClass4T8 extends AnonymousClass0WH {
    public void A0D(View view, C05650Ui r5) {
        super.A0D(view, r5);
        r5.A08(C06220Ws.A08);
        r5.A0H(false);
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A01;
        accessibilityNodeInfo.setLongClickable(false);
        if (view instanceof WaTextView) {
            accessibilityNodeInfo.setText(((TextView) view).getText());
        }
        view.setClickable(false);
        view.setLongClickable(false);
    }
}
