package X;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: X.4N2  reason: invalid class name */
public final class AnonymousClass4N2 extends URLSpan {
    public void updateDrawState(TextPaint textPaint) {
        C162457s7.A0J(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public AnonymousClass4N2(String str) {
        super(str);
    }
}
