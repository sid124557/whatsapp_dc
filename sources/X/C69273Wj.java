package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3Wj  reason: invalid class name and case insensitive filesystem */
public final class C69273Wj implements C185528tp {
    public static final Bitmap.Config A02 = Bitmap.Config.RGB_565;
    public final int A00;
    public final int A01;

    public void Bof(Bitmap bitmap, View view, C624134x r6) {
        C162457s7.A0J(view, 0);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, A02);
            bitmap.setPixel(0, 0, this.A00);
        }
        ((ImageView) view).setImageBitmap(bitmap);
    }

    public void Bp1(View view) {
        ImageView imageView;
        C162457s7.A0J(view, 0);
        if ((view instanceof ImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageResource(R.drawable.circle_shade_big);
        }
    }

    public C69273Wj(Context context) {
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A00 = AnonymousClass0Y8.A04(context, C107405bG.A0D(context) ? R.color.f5nameremoved : R.color.f5nameremoved);
    }

    public int BD5() {
        return this.A01;
    }

    public /* synthetic */ void BTR() {
    }
}
