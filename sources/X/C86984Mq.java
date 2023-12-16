package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.Set;

/* renamed from: X.4Mq  reason: invalid class name and case insensitive filesystem */
public final class C86984Mq extends CharacterStyle {
    public final String A00;
    public final Set A01;

    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(true);
        }
    }

    public C86984Mq(String str, Set set) {
        C18260x0.A0Q(str, set);
        this.A00 = str;
        this.A01 = set;
    }
}
