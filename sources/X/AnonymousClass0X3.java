package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.0X3  reason: invalid class name */
public class AnonymousClass0X3 {
    public static int A00(View view) {
        return view.getLayoutDirection();
    }

    public static int A01(View view) {
        return view.getTextDirection();
    }

    public static void A03(View view, int i) {
        view.setTextDirection(i);
    }

    public static Drawable[] A04(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static void A02(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, TextView textView) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }
}
