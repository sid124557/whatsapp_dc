package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.5pn  reason: invalid class name and case insensitive filesystem */
public class C116135pn implements C183178pc {
    public Layout B0n(TextPaint textPaint, CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
    }
}
