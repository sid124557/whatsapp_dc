package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5q4  reason: invalid class name and case insensitive filesystem */
public final class C116305q4 implements C185528tp {
    public final int A00;

    public C116305q4(C54292oU r3) {
        C162457s7.A0J(r3, 1);
        this.A00 = C54292oU.A00(r3).getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void Bof(Bitmap bitmap, View view, C624134x r4) {
        C162457s7.A0J(view, 0);
        if (bitmap != null) {
            ((ImageView) view).setImageBitmap(bitmap);
        } else {
            Bp1(view);
        }
    }

    public void Bp1(View view) {
        ImageView imageView;
        Drawable A002;
        Bitmap A003;
        C162457s7.A0J(view, 0);
        if ((view instanceof ImageView) && (imageView = (ImageView) view) != null && (A002 = AnonymousClass0RP.A00(imageView.getContext(), R.drawable.ic_gallery_placeholder)) != null && (A003 = AnonymousClass5C7.A00(A002)) != null) {
            imageView.setImageBitmap(A003);
        }
    }

    public int BD5() {
        return this.A00;
    }

    public /* synthetic */ void BTR() {
    }
}
