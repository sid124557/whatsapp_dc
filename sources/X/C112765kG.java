package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5kG  reason: invalid class name and case insensitive filesystem */
public final class C112765kG implements C184288rY {
    public int A00 = R.drawable.avatar_contact;
    public final C54292oU A01;

    public C112765kG(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        C162457s7.A0J(imageView, 0);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Bp2(imageView);
        }
    }

    public void Bp2(ImageView imageView) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        C162457s7.A0J(imageView, 0);
        Drawable A002 = AnonymousClass0RP.A00(this.A01.A00, this.A00);
        if ((A002 instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) A002) != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
