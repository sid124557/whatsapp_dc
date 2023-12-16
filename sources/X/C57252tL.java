package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.2tL  reason: invalid class name and case insensitive filesystem */
public class C57252tL implements C185528tp {
    public Object A00;
    public final int A01;

    public C57252tL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public int BD5() {
        if (this.A01 != 0) {
            return 400;
        }
        return ((AnonymousClass1Pq) this.A00).A01.getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void Bof(Bitmap bitmap, View view, C624134x r6) {
        if (this.A01 == 0) {
            AnonymousClass1Pq r2 = (AnonymousClass1Pq) this.A00;
            WaImageView waImageView = r2.A00;
            if (bitmap != null) {
                waImageView.setVisibility(0);
                r2.A00.setImageBitmap(bitmap);
                return;
            }
            waImageView.setVisibility(8);
        } else if (bitmap != null) {
            ThumbnailButton thumbnailButton = ((AnonymousClass1h8) this.A00).A0K;
            thumbnailButton.setVisibility(0);
            thumbnailButton.setImageBitmap(bitmap);
        }
    }

    public void Bp1(View view) {
        if (this.A01 == 0) {
            C18290x4.A1A(view.getContext(), ((AnonymousClass1Pq) this.A00).A00, R.drawable.vec_ic_receipt_24dp);
        }
    }

    public /* synthetic */ void BTR() {
    }
}
