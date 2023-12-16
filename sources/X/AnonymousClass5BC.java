package X;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.widget.TextView;

/* renamed from: X.5BC  reason: invalid class name */
public class AnonymousClass5BC {
    public static void A00(TextView textView, AnonymousClass1VX r11, Object[] objArr, int i) {
        Context context = textView.getContext();
        Spannable spannable = (Spannable) Html.fromHtml(context.getString(i, objArr));
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            spannable.setSpan(new AnonymousClass4N3(context, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
            spannable.removeSpan(uRLSpan);
        }
        textView.setText(spannable);
        C18270x1.A0q(textView, r11);
    }
}
