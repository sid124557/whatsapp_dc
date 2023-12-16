package X;

import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: X.0Rv  reason: invalid class name and case insensitive filesystem */
public class C05080Rv {
    public static PrecomputedText.Params A00(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void A01(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
