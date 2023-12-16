package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.9dy  reason: invalid class name and case insensitive filesystem */
public class C197849dy implements C185528tp {
    public final /* synthetic */ AnonymousClass9EM A00;

    public C197849dy(AnonymousClass9EM r1) {
        this.A00 = r1;
    }

    public int BD5() {
        return this.A00.A0H.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void Bof(Bitmap bitmap, View view, C624134x r4) {
        if (bitmap != null) {
            this.A00.A00.setImageBitmap(bitmap);
        } else {
            Bp1(view);
        }
    }

    public void Bp1(View view) {
        AnonymousClass9EM r3 = this.A00;
        Drawable A04 = C107335b8.A04(r3.A0H.getContext(), R.drawable.cart, R.color.f5nameremoved);
        WaImageView waImageView = r3.A00;
        waImageView.setImageDrawable(A04);
        waImageView.setScaleX(0.5f);
        waImageView.setScaleY(0.5f);
    }

    public void BTR() {
    }
}
