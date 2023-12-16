package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3F0  reason: invalid class name */
public final class AnonymousClass3F0 implements C184288rY {
    public static final AnonymousClass3F0 A00 = new AnonymousClass3F0();

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        C162457s7.A0J(imageView, 0);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Bp2(imageView);
        }
    }

    public void Bp2(ImageView imageView) {
        C162457s7.A0J(imageView, 0);
        imageView.setImageResource(R.drawable.avatar_contact);
    }
}
