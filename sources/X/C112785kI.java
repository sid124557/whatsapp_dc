package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.5kI  reason: invalid class name and case insensitive filesystem */
public class C112785kI implements C184288rY {
    public boolean A00;
    public final C33131sU A01;
    public final AnonymousClass5UX A02;
    public final HashSet A03 = AnonymousClass002.A0K();

    public final void A00(Bitmap bitmap, ImageView imageView, String str) {
        Bitmap bitmap2;
        if (C86624Kv.A1a(this.A03, imageView.hashCode())) {
            if (str == null || this.A00) {
                bitmap2 = null;
            } else {
                bitmap2 = (Bitmap) this.A01.A06(str);
            }
            this.A00 = false;
            if (bitmap2 != null) {
                imageView.setImageBitmap(bitmap2);
                return;
            }
            try {
                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                if (copy != null) {
                    FilterUtils.blurNative(copy, 30, 2);
                    if (str != null) {
                        this.A01.A09(str, copy);
                    }
                    imageView.setImageBitmap(copy);
                }
            } catch (Throwable th) {
                Log.d(AnonymousClass000.A0a("Failed applying blur: ", AnonymousClass001.A0o(), th));
            }
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void Bog(Bitmap bitmap, ImageView imageView, boolean z) {
        String str;
        if (bitmap != null) {
            if (imageView.getTag() instanceof String) {
                str = (String) imageView.getTag();
            } else {
                str = null;
            }
            A00(bitmap, imageView, str);
            return;
        }
        Bp2(imageView);
    }

    public void Bp2(ImageView imageView) {
        A00(this.A02.A03(imageView.getContext(), R.drawable.avatar_contact_voip), imageView, "default_avatar");
    }

    public C112785kI(C33131sU r2, AnonymousClass5UX r3) {
        this.A02 = r3;
        this.A01 = r2;
    }
}
