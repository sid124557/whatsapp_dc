package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.5kE  reason: invalid class name and case insensitive filesystem */
public class C112745kE implements C184288rY {
    public final AnonymousClass5UX A00;
    public final AnonymousClass3ZH A01;

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Bp2(imageView);
        }
    }

    public void Bp2(ImageView imageView) {
        imageView.setImageDrawable(C18310x6.A0G(imageView.getContext(), this.A00.A00(this.A01)));
    }

    public C112745kE(AnonymousClass5UX r1, AnonymousClass3ZH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
