package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.93V  reason: invalid class name */
public class AnonymousClass93V implements C181778nJ {
    public Object A00;
    public final int A01;

    public AnonymousClass93V(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final void A00(Bitmap bitmap, AnonymousClass93V r3) {
        ImageView imageView = (ImageView) r3.A00;
        imageView.setBackgroundColor(0);
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public final void BVc(Bitmap bitmap, AnonymousClass8EI r4, boolean z) {
        ImageView imageView;
        switch (this.A01) {
            case 0:
                imageView = (ImageView) this.A00;
                imageView.setBackgroundColor(0);
                break;
            case 1:
                A00(bitmap, this);
                return;
            case 2:
                ((PhotoView) this.A00).A06(bitmap);
                return;
            case 5:
                C162457s7.A0J(bitmap, 2);
                ((AnonymousClass4GQ) this.A00).invoke(bitmap);
                return;
            default:
                imageView = (ImageView) this.A00;
                break;
        }
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
