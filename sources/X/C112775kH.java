package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5kH  reason: invalid class name and case insensitive filesystem */
public class C112775kH implements C184288rY {
    public final AnonymousClass5UX A00;
    public final AnonymousClass3ZH A01;
    public final C59862xc A02;
    public final C56072rN A03;

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null || z) {
                imageView.setImageBitmap(bitmap);
                return;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                if (layerDrawable.getNumberOfLayers() > 0) {
                    drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
                }
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(bitmap)});
            transitionDrawable.setCrossFadeEnabled(false);
            transitionDrawable.startTransition(300);
            imageView.setImageDrawable(transitionDrawable);
            return;
        }
        Bp2(imageView);
    }

    public C112775kH(AnonymousClass5UX r1, AnonymousClass3ZH r2, C59862xc r3, C56072rN r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void Bp2(ImageView imageView) {
        int i = R.drawable.avatar_contact;
        C181298mX r3 = new AnonymousClass6B0(1);
        AnonymousClass3ZH r2 = this.A01;
        if (r2 != null) {
            i = this.A00.A00(r2);
            if (this.A03.A06(AnonymousClass34R.A01(r2.A0H))) {
                r3 = new AnonymousClass922(1);
            }
        }
        C59862xc r0 = this.A02;
        imageView.setImageDrawable(C59862xc.A00(C86614Ku.A0C(imageView), imageView.getResources(), r3, r0.A00, i));
    }
}
