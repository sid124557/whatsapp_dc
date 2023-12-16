package X;

import android.view.ViewTreeObserver;
import com.whatsapp.FAQTextView;

/* renamed from: X.3A1  reason: invalid class name */
public final class AnonymousClass3A1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FAQTextView A00;

    public void onGlobalLayout() {
        FAQTextView fAQTextView = this.A00;
        CharSequence text = fAQTextView.getText();
        fAQTextView.setMaxLines(3);
        if (fAQTextView.getLineCount() > 3) {
            fAQTextView.setText(C382526i.A00(text.toString(), fAQTextView.getLayout().getLineEnd(2)));
        }
        fAQTextView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public AnonymousClass3A1(FAQTextView fAQTextView) {
        this.A00 = fAQTextView;
    }
}
