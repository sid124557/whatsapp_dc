package X;

import android.animation.ValueAnimator;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5O7  reason: invalid class name */
public final class AnonymousClass5O7 {
    public ForegroundColorSpan A00;
    public final int A01;
    public final ValueAnimator A02;
    public final TextEmojiLabel A03;
    public final CharSequence A04;

    public final void A00(Spannable spannable, int i, int i2) {
        TextEmojiLabel textEmojiLabel = this.A03;
        int A06 = AnonymousClass0YI.A06(textEmojiLabel.getCurrentTextColor(), i2);
        spannable.removeSpan(this.A00);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(A06);
        this.A00 = foregroundColorSpan;
        spannable.setSpan(foregroundColorSpan, i, spannable.length(), 33);
        textEmojiLabel.setText(spannable);
    }

    public AnonymousClass5O7(TextEmojiLabel textEmojiLabel, int i) {
        this.A03 = textEmojiLabel;
        this.A01 = i;
        CharSequence text = textEmojiLabel.getText();
        C162457s7.A0D(text);
        this.A04 = text;
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 0;
        A1Z[1] = 255;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1Z);
        C162457s7.A0D(ofInt);
        this.A02 = ofInt;
    }
}
