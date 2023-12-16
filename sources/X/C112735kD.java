package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5kD  reason: invalid class name and case insensitive filesystem */
public class C112735kD implements C184288rY {
    public final int A00;
    public final AnonymousClass5UX A01;

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Bp2(imageView);
        }
    }

    public void Bp2(ImageView imageView) {
        imageView.setImageBitmap(this.A01.A02(imageView.getContext(), (float) Integer.MIN_VALUE, R.drawable.vec_ic_avatar_community, this.A00));
    }

    public C112735kD(AnonymousClass5UX r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
