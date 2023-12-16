package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3Ey  reason: invalid class name */
public class AnonymousClass3Ey implements C184288rY {
    public final /* synthetic */ AnonymousClass5UX A00;

    public AnonymousClass3Ey(AnonymousClass5UX r1) {
        this.A00 = r1;
    }

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Bp2(imageView);
        }
    }

    public void Bp2(ImageView imageView) {
        this.A00.A06(imageView, R.drawable.avatar_contact_voip);
    }
}
