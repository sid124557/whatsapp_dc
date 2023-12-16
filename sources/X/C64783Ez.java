package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.3Ez  reason: invalid class name and case insensitive filesystem */
public final class C64783Ez implements C184288rY {
    public final /* synthetic */ C22671Pc A00;
    public final /* synthetic */ AnonymousClass3ZH A01;

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
        imageView.setImageDrawable(C18310x6.A0G(imageView.getContext(), this.A00.getContactAvatars().A00(this.A01)));
    }

    public C64783Ez(C22671Pc r1, AnonymousClass3ZH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
