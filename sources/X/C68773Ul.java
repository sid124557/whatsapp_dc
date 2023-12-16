package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.3Ul  reason: invalid class name and case insensitive filesystem */
public class C68773Ul implements C84934Eh {
    public final String A00;
    public final WeakReference A01;

    public void BVF(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void BVV() {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageResource(R.drawable.selector_sticker_pack_error);
        }
    }

    public void BVb(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public C68773Ul(ImageView imageView, String str) {
        this.A01 = AnonymousClass0x9.A14(imageView);
        this.A00 = str;
        imageView.setTag(str);
    }
}
