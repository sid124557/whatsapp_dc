package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.8Jk  reason: invalid class name and case insensitive filesystem */
public class C172048Jk implements C185528tp {
    public final /* synthetic */ C93464ob A00;

    public C172048Jk(C93464ob r1) {
        this.A00 = r1;
    }

    public int BD5() {
        return this.A00.A01.getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public /* synthetic */ void BTR() {
    }

    public void Bof(Bitmap bitmap, View view, C624134x r5) {
        WaImageView waImageView = this.A00.A00;
        if (bitmap != null) {
            waImageView.setImageBitmap(bitmap);
        } else {
            waImageView.setVisibility(8);
        }
    }

    public void Bp1(View view) {
        this.A00.A00.setVisibility(8);
    }
}
