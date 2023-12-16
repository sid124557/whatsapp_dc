package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: X.0Rr  reason: invalid class name and case insensitive filesystem */
public class C05040Rr {
    public static void A00(ColorStateList colorStateList, ImageView imageView) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        AnonymousClass0Wd.A02(colorStateList, imageView);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && AnonymousClass0Wd.A00(imageView) != null) {
            AnonymousClass000.A0t(drawable, imageView);
            imageView.setImageDrawable(drawable);
        }
    }

    public static void A01(PorterDuff.Mode mode, ImageView imageView) {
        Drawable drawable;
        int i = Build.VERSION.SDK_INT;
        AnonymousClass0Wd.A03(mode, imageView);
        if (i == 21 && (drawable = imageView.getDrawable()) != null && AnonymousClass0Wd.A00(imageView) != null) {
            AnonymousClass000.A0t(drawable, imageView);
            imageView.setImageDrawable(drawable);
        }
    }
}
