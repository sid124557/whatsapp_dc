package X;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.ActionMode;
import android.widget.TextView;

/* renamed from: X.0Y9  reason: invalid class name */
public final class AnonymousClass0Y9 {
    public static ActionMode.Callback A00(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof C06890Zz) || callback == null) {
            return callback;
        }
        return new C06890Zz(callback, textView);
    }

    public static void A02(PorterDuff.Mode mode, TextView textView) {
        if (Build.VERSION.SDK_INT >= 24) {
            C06370Xj.A03(mode, textView);
        } else if (textView instanceof C16620th) {
            ((C16620th) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void A03(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C05070Ru.A00(textView, i);
        } else if (textView instanceof C17170ug) {
            ((C17170ug) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void A06(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void A07(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            C05070Ru.A01(textView, i, i2, i3, i4);
        } else if (textView instanceof C17170ug) {
            ((C17170ug) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    public static void A01(ColorStateList colorStateList, TextView textView) {
        textView.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            C06370Xj.A02(colorStateList, textView);
        } else if (textView instanceof C16620th) {
            ((C16620th) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void A04(TextView textView, int i) {
        int i2;
        C04890Rb.A00(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C05080Rv.A01(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C05060Rt.A01(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void A05(TextView textView, int i) {
        int i2;
        C04890Rb.A00(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C05060Rt.A01(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }
}
