package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.5pl  reason: invalid class name and case insensitive filesystem */
public class C116115pl implements C184598sC {
    public Layout B0m(TextView textView, CharSequence charSequence, int i) {
        Layout layout = textView.getLayout();
        return new StaticLayout(charSequence, textView.getPaint(), i, layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), true);
    }

    public void BnO(TextView textView) {
    }
}
