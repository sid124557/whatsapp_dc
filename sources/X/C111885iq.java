package X;

import android.graphics.Bitmap;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.Objects;

/* renamed from: X.5iq  reason: invalid class name and case insensitive filesystem */
public class C111885iq implements C181778nJ {
    public boolean A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CatalogMediaViewFragment A02;
    public final /* synthetic */ PhotoView A03;

    public C111885iq(CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView, int i) {
        this.A02 = catalogMediaViewFragment;
        this.A03 = photoView;
        this.A01 = i;
    }

    public void BVc(Bitmap bitmap, AnonymousClass8EI r8, boolean z) {
        if (this.A00) {
            CatalogMediaViewFragment catalogMediaViewFragment = this.A02;
            C114905nn r1 = new C114905nn(bitmap, this, this.A03);
            if (!catalogMediaViewFragment.A0F) {
                r1.Bed(true);
            } else {
                catalogMediaViewFragment.A0A = r1;
            }
        } else {
            this.A00 = true;
            PhotoView photoView = this.A03;
            photoView.A06(bitmap);
            CatalogMediaViewFragment catalogMediaViewFragment2 = this.A02;
            String str = catalogMediaViewFragment2.A0A;
            if (str != null) {
                String str2 = catalogMediaViewFragment2.A02.A0F;
                if (str.equals(AnonymousClass000.A0Y("_", AnonymousClass000.A0l(str2), this.A01))) {
                    C003203q A0R = catalogMediaViewFragment2.A0R();
                    Objects.requireNonNull(A0R);
                    photoView.post(new C117115rP(A0R, 23));
                }
            }
        }
    }
}
