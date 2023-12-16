package X;

import android.content.Context;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.text.ReadMoreTextView;
import java.util.List;

/* renamed from: X.9F6  reason: invalid class name */
public class AnonymousClass9F6 extends AnonymousClass95V {
    public final C69263Wi A00;
    public final C85244Fm A01;
    public final AnonymousClass5OL A02;
    public final C620633i A03;
    public final C106195Xz A04;
    public final ReadMoreTextView A05;

    public AnonymousClass9F6(View view, C69263Wi r3, C85244Fm r4, AnonymousClass5OL r5, C620633i r6, C106195Xz r7) {
        super(view);
        this.A00 = r3;
        this.A04 = r7;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = (ReadMoreTextView) C06560Yg.A02(view, R.id.payment_note_text);
    }

    public final void A07(Spannable spannable, TextEmojiLabel textEmojiLabel, boolean z) {
        Context context = textEmojiLabel.getContext();
        List<URLSpan> A0C = C107635bd.A0C(spannable);
        if (A0C != null && !A0C.isEmpty()) {
            int i = 0;
            for (URLSpan uRLSpan : A0C) {
                String url = uRLSpan.getURL();
                spannable.setSpan(new C88944b3(context, this.A01, this.A00, this.A03, url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                i++;
            }
            for (Object removeSpan : A0C) {
                spannable.removeSpan(removeSpan);
            }
            if (i > 0) {
                if (textEmojiLabel.A06 == null) {
                    AnonymousClass0x2.A12(textEmojiLabel, this.A03);
                }
                textEmojiLabel.A0K((List) null, spannable);
            }
        }
        if (textEmojiLabel.A06 != null) {
            textEmojiLabel.setFocusable(false);
            AnonymousClass0YY.A06(textEmojiLabel, 0);
        }
        textEmojiLabel.setAccessibilityHelper((AnonymousClass066) null);
        if (!z) {
            return;
        }
        textEmojiLabel.A0K((List) null, spannable);
    }
}
