package X;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.04W  reason: invalid class name */
public class AnonymousClass04W extends AnonymousClass04X {
    public void A00(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    public boolean A01(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
