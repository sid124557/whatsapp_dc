package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: X.0Wd  reason: invalid class name */
public class AnonymousClass0Wd {
    public static ColorStateList A00(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static PorterDuff.Mode A01(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void A02(ColorStateList colorStateList, ImageView imageView) {
        imageView.setImageTintList(colorStateList);
    }

    public static void A03(PorterDuff.Mode mode, ImageView imageView) {
        imageView.setImageTintMode(mode);
    }
}
