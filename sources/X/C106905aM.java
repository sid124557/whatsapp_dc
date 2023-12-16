package X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import java.util.Map;

/* renamed from: X.5aM  reason: invalid class name and case insensitive filesystem */
public final class C106905aM {
    public static final Map A00 = C18320x8.A0r();

    public static final void A04(TextView textView) {
        C162457s7.A0J(textView, 0);
        textView.getContext();
        textView.setTypeface(A02(), 0);
    }

    public static final Typeface A00() {
        Map map = A00;
        Object obj = map.get("sans_serif_bold");
        if (obj == null) {
            obj = Typeface.create(A01(), 1);
            C162457s7.A0D(obj);
            map.put("sans_serif_bold", obj);
        }
        return (Typeface) obj;
    }

    public static final Typeface A01() {
        Map map = A00;
        Object obj = map.get("sans_serif");
        if (obj == null) {
            obj = Typeface.create("sans-serif", 0);
            C162457s7.A0H(obj);
            map.put("sans_serif", obj);
        }
        return (Typeface) obj;
    }

    public static final Typeface A02() {
        Map map = A00;
        Object obj = map.get("sans_serif_medium");
        if (obj == null) {
            obj = Typeface.create("sans-serif-medium", 0);
            C162457s7.A0H(obj);
            map.put("sans_serif_medium", obj);
        }
        return (Typeface) obj;
    }

    public static void A03(View view, int i) {
        A04((TextView) C06560Yg.A02(view, i));
    }

    public static void A05(TextView textView, TextView textView2, TextView textView3, float f) {
        textView.setTextSize(f);
        textView2.setTextSize(f);
        textView3.setTextSize(f);
        A04(textView);
        A04(textView2);
        A04(textView3);
    }
}
