package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.community.JoinGroupBottomSheetFragment;

/* renamed from: X.5kC  reason: invalid class name and case insensitive filesystem */
public class C112725kC implements C184288rY {
    public final /* synthetic */ JoinGroupBottomSheetFragment A00;
    public final /* synthetic */ AnonymousClass3ZH A01;

    public C112725kC(JoinGroupBottomSheetFragment joinGroupBottomSheetFragment, AnonymousClass3ZH r2) {
        this.A00 = joinGroupBottomSheetFragment;
        this.A01 = r2;
    }

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Bp2(imageView);
        }
    }

    public void Bp2(ImageView imageView) {
        imageView.setImageDrawable(C18310x6.A0G(imageView.getContext(), this.A00.A0S.A00(this.A01)));
    }
}
