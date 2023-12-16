package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5Ln  reason: invalid class name and case insensitive filesystem */
public class C103095Ln {
    public Bitmap A00(Resources resources, Drawable drawable, ImageView imageView) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        imageView.setBackground((Drawable) null);
        imageView.setPadding(112, 112, 112, 112);
        AnonymousClass001.A19(imageView, 640, 1073741824, View.MeasureSpec.makeMeasureSpec(640, 1073741824));
        imageView.layout(0, 0, imageView.getMeasuredWidth(), imageView.getMeasuredHeight());
        imageView.setImageDrawable(drawable);
        try {
            bitmap2 = Bitmap.createBitmap(640, 640, Bitmap.Config.ARGB_8888);
            bitmap = bitmap2;
        } catch (OutOfMemoryError unused) {
            bitmap2 = null;
            bitmap = null;
        }
        if (bitmap2 == null) {
            return null;
        }
        Canvas A06 = AnonymousClass4L0.A06(bitmap2);
        imageView.setLayerType(1, (Paint) null);
        imageView.draw(A06);
        try {
            bitmap3 = Bitmap.createBitmap(640, 640, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused2) {
            bitmap3 = null;
        }
        if (bitmap3 == null) {
            return null;
        }
        Canvas A062 = AnonymousClass4L0.A06(bitmap3);
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setMaskFilter(new BlurMaskFilter(49.28f, BlurMaskFilter.Blur.NORMAL));
        int[] A1Z = C86664Kz.A1Z();
        Bitmap extractAlpha = bitmap.extractAlpha(A0Z, A1Z);
        Paint A0Z2 = C86664Kz.A0Z();
        C86624Kv.A0k(resources, A0Z2, R.color.f5nameremoved);
        A062.drawBitmap(extractAlpha, (float) A1Z[0], ((float) A1Z[1]) + 32.0f, A0Z2);
        A062.drawBitmap(bitmap, 0.0f, 0.0f, C86664Kz.A0Z());
        bitmap.recycle();
        extractAlpha.recycle();
        return bitmap3;
    }
}
