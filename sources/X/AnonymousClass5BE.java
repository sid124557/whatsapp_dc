package X;

import android.text.SpannableString;
import android.text.style.URLSpan;
import android.widget.TextView;

/* renamed from: X.5BE  reason: invalid class name */
public final class AnonymousClass5BE {
    public static final void A00(TextView textView) {
        C162457s7.A0J(textView, 0);
        SpannableString A0A = AnonymousClass4L0.A0A(textView.getText());
        Object[] spans = A0A.getSpans(0, A0A.length(), URLSpan.class);
        C162457s7.A0D(spans);
        for (URLSpan uRLSpan : (URLSpan[]) spans) {
            A0A.setSpan(new AnonymousClass4N2(uRLSpan.getURL()), A0A.getSpanStart(uRLSpan), A0A.getSpanEnd(uRLSpan), 0);
        }
        textView.setText(A0A);
    }
}
