package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.70p  reason: invalid class name and case insensitive filesystem */
public class C1442470p implements C181778nJ {
    public final int A00;

    public static final void A00(Bitmap bitmap, AnonymousClass8EI r3) {
        C162457s7.A0J(r3, 0);
        ImageView B8H = r3.B8H();
        if (B8H != null) {
            B8H.setBackgroundColor(0);
            B8H.setImageBitmap(bitmap);
            B8H.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public C1442470p(int i) {
        this.A00 = i;
    }

    public final void BVc(Bitmap bitmap, AnonymousClass8EI r4, boolean z) {
        if (this.A00 != 0) {
            A00(bitmap, r4);
            return;
        }
        ImageView B8H = r4.B8H();
        if (B8H != null) {
            B8H.setBackgroundColor(0);
            B8H.setImageBitmap(bitmap);
            B8H.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
