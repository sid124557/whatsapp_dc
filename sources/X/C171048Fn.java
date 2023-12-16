package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.8Fn  reason: invalid class name and case insensitive filesystem */
public class C171048Fn implements C184288rY {
    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Bp2(imageView);
        }
    }

    public void Bp2(ImageView imageView) {
        imageView.setImageResource(R.drawable.avatar_contact);
    }
}
