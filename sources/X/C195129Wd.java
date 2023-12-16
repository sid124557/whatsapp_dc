package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.9Wd  reason: invalid class name and case insensitive filesystem */
public class C195129Wd implements C181778nJ {
    public final int A00;

    public final void BVc(Bitmap bitmap, AnonymousClass8EI r2, boolean z) {
        A00(bitmap, r2);
    }

    public C195129Wd(int i) {
        this.A00 = i;
    }

    public static final void A00(Bitmap bitmap, AnonymousClass8EI r3) {
        ImageView B8H = r3.B8H();
        if (B8H != null) {
            B8H.setBackgroundColor(0);
            B8H.setImageBitmap(bitmap);
            B8H.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
