package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.CatalogImageListActivity;
import java.util.Objects;

/* renamed from: X.5aZ  reason: invalid class name and case insensitive filesystem */
public class C107025aZ implements C181778nJ {
    public Object A00;
    public final int A01;

    public C107025aZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BVc(Bitmap bitmap, AnonymousClass8EI r6, boolean z) {
        if (this.A01 != 0) {
            ImageView imageView = (ImageView) this.A00;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                C86644Kx.A1A(imageView);
                return;
            }
            return;
        }
        AnonymousClass4YU r1 = (AnonymousClass4YU) this.A00;
        ImageView imageView2 = r1.A01;
        imageView2.setImageBitmap(bitmap);
        if (r1.A00) {
            r1.A00 = false;
            CatalogImageListActivity catalogImageListActivity = r1.A03;
            Objects.requireNonNull(catalogImageListActivity);
            imageView2.post(new C117115rP(catalogImageListActivity, 32));
        }
    }
}
