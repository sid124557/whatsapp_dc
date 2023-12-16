package X;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2su  reason: invalid class name and case insensitive filesystem */
public class C57002su {
    public static SpannableStringBuilder A00(TextAppearanceSpan textAppearanceSpan, String str, Map map, int i, boolean z) {
        Object r0;
        Spanned A0B = AnonymousClass0x9.A0B(str);
        SpannableStringBuilder A00 = C18330xA.A00(A0B);
        URLSpan[] uRLSpanArr = (URLSpan[]) A0B.getSpans(0, A0B.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (map.containsKey(uRLSpan.getURL())) {
                    int spanStart = A00.getSpanStart(uRLSpan);
                    int spanEnd = A00.getSpanEnd(uRLSpan);
                    int spanFlags = A00.getSpanFlags(uRLSpan);
                    A00.removeSpan(uRLSpan);
                    if (z) {
                        r0 = new C19020yd(uRLSpan, map, i);
                    } else {
                        r0 = new C22111Eo(uRLSpan, map, i);
                    }
                    A00.setSpan(r0, spanStart, spanEnd, spanFlags);
                    if (textAppearanceSpan != null) {
                        A00.setSpan(textAppearanceSpan, spanStart, spanEnd, spanFlags);
                    }
                }
            }
        }
        return A00;
    }

    public static SpannableStringBuilder A01(Runnable runnable, String str, String str2) {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put(str2, runnable);
        return A00((TextAppearanceSpan) null, str, A0t, 0, false);
    }
}
