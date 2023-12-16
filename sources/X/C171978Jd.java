package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.8Jd  reason: invalid class name and case insensitive filesystem */
public class C171978Jd implements C84934Eh {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C137906pS A01;
    public final /* synthetic */ String A02;

    public C171978Jd(ImageView imageView, C137906pS r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = imageView;
    }

    public void BVF(Bitmap bitmap) {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void BVV() {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageResource(R.drawable.selector_sticker_pack_error);
        }
    }

    public void BVb(Bitmap bitmap) {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
