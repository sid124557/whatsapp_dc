package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.5pm  reason: invalid class name and case insensitive filesystem */
public class C116125pm implements C183178pc {
    public Layout B0n(TextPaint textPaint, CharSequence charSequence, int i) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setBreakStrategy(1).build();
    }
}
