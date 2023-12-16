package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5OV  reason: invalid class name */
public final class AnonymousClass5OV {
    public int A00;
    public int A01;
    public Handler A02 = new AnonymousClass4ML(Looper.getMainLooper(), this);
    public CharSequence A03;
    public final TextEmojiLabel A04;
    public final C93094nt A05;
    public final AnonymousClass1VX A06;

    public final void A00(int i) {
        SpannableStringBuilder A002 = C18330xA.A00(this.A03);
        AnonymousClass6EA[] r3 = (AnonymousClass6EA[]) A002.getSpans(0, A002.length(), AnonymousClass6EA.class);
        C162457s7.A0H(r3);
        for (AnonymousClass6EA removeSpan : r3) {
            A002.removeSpan(removeSpan);
        }
        if (i < A002.length()) {
            int length = A002.length();
            TextEmojiLabel textEmojiLabel = this.A04;
            A002.setSpan(new AnonymousClass6EA(textEmojiLabel.getCurrentTextColor() & 16777215), i, length, 33);
            textEmojiLabel.setText(A002);
        }
        ImageSpan[] imageSpanArr = (ImageSpan[]) A002.getSpans(0, A002.length(), ImageSpan.class);
        C162457s7.A0H(imageSpanArr);
        for (ImageSpan imageSpan : imageSpanArr) {
            int i2 = 0;
            if (A002.getSpanEnd(imageSpan) <= i) {
                i2 = 255;
            }
            C162457s7.A0H(imageSpan);
            Drawable drawable = imageSpan.getDrawable();
            if (drawable.getAlpha() != i2) {
                int spanStart = A002.getSpanStart(imageSpan);
                int spanEnd = A002.getSpanEnd(imageSpan);
                drawable.setAlpha(i2);
                ImageSpan imageSpan2 = new ImageSpan(drawable);
                A002.removeSpan(imageSpan);
                A002.setSpan(imageSpan2, spanStart, spanEnd, 33);
            }
        }
        TextEmojiLabel textEmojiLabel2 = this.A04;
        textEmojiLabel2.setText(A002);
        textEmojiLabel2.setText(A002);
    }

    public AnonymousClass5OV(C93094nt r3, AnonymousClass1VX r4) {
        this.A06 = r4;
        this.A05 = r3;
        TextEmojiLabel textEmojiLabel = r3.A05;
        C162457s7.A0C(textEmojiLabel);
        this.A04 = textEmojiLabel;
        CharSequence text = textEmojiLabel.getText();
        C162457s7.A0D(text);
        this.A03 = text;
    }
}
