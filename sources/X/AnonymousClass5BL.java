package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.5BL  reason: invalid class name */
public class AnonymousClass5BL implements C185528tp {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass5BL(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public int BD5() {
        if (this.A03 != 0) {
            return C18290x4.A0G((View) this.A02).getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        return ((C114005mL) this.A00).A0K.A05(((View) this.A01).getContext());
    }

    public /* synthetic */ void BTR() {
    }

    public void Bof(Bitmap bitmap, View view, C624134x r5) {
        if (this.A03 != 0) {
            ((C06270Wx) this.A01).A0G(bitmap);
            return;
        }
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            Object obj = this.A02;
            if (!(obj instanceof C30801n8) && !(obj instanceof AnonymousClass1nE)) {
                ImageView imageView = (ImageView) this.A01;
                imageView.setVisibility(0);
                imageView.setImageBitmap(bitmap);
                return;
            }
        }
        C86634Kw.A1R(this.A01);
    }

    public void Bp1(View view) {
        if (this.A03 == 0) {
            C86624Kv.A1B((ImageView) this.A01);
        }
    }
}
