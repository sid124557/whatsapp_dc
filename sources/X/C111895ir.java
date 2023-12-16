package X;

import android.graphics.Bitmap;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.5ir  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111895ir implements C181778nJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass4Z1 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ boolean A05;

    public final void BVc(Bitmap bitmap, AnonymousClass8EI r19, boolean z) {
        AnonymousClass4Z1 r4 = this.A02;
        Map map = this.A04;
        String str = this.A03;
        boolean z2 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        ThumbnailButton thumbnailButton = r4.A01;
        if (thumbnailButton.getTag().equals(str)) {
            Bitmap bitmap2 = bitmap;
            if (i == 0 || i2 == 0) {
                i = bitmap2.getWidth();
                i2 = bitmap2.getHeight();
                r4.A07(i, i2, z2);
            }
            boolean A1Y = AnonymousClass001.A1Y(i, i2);
            if (i == i2 || (z2 && A1Y)) {
                thumbnailButton.setImageBitmap(bitmap2);
                return;
            }
            CatalogCarouselDetailImageView catalogCarouselDetailImageView = r4.A02;
            int A032 = AnonymousClass5Yj.A03(catalogCarouselDetailImageView.getContext(), catalogCarouselDetailImageView.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
            AnonymousClass2JZ r12 = (AnonymousClass2JZ) map.get(str);
            if (r12 != null) {
                catalogCarouselDetailImageView.setImageAndGradient(r12, A1Y, thumbnailButton, bitmap2, r4.A00);
                return;
            }
            AnonymousClass0x7.A1B(new C33571tL(bitmap2, r4.A00, catalogCarouselDetailImageView, thumbnailButton, str, map, A032), catalogCarouselDetailImageView.A08);
        }
    }

    public /* synthetic */ C111895ir(AnonymousClass4Z1 r1, String str, Map map, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A04 = map;
        this.A03 = str;
        this.A05 = z;
        this.A00 = i;
        this.A01 = i2;
    }
}
