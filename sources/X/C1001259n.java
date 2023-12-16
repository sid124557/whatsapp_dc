package X;

import android.text.Spannable;

/* renamed from: X.59n  reason: invalid class name and case insensitive filesystem */
public final class C1001259n {
    public static void A00(Spannable spannable, Object obj, int i, int i2) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, 33);
    }
}
