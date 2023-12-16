package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: X.5pk  reason: invalid class name and case insensitive filesystem */
public class C116105pk implements C184598sC {
    public void BnO(TextView textView) {
        textView.setBreakStrategy(0);
    }

    public Layout B0m(TextView textView, CharSequence charSequence, int i) {
        Layout layout = textView.getLayout();
        return StaticLayout.Builder.obtain(C107575bX.A03(charSequence), 0, charSequence.length(), textView.getPaint(), i).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
    }
}
