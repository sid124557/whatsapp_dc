package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.4We  reason: invalid class name and case insensitive filesystem */
public class C87804We extends AnonymousClass0R6 {
    public final Map A00 = AnonymousClass001.A0t();
    public final /* synthetic */ CatalogCarouselDetailImageView A01;

    public C87804We(CatalogCarouselDetailImageView catalogCarouselDetailImageView) {
        this.A01 = catalogCarouselDetailImageView;
    }

    public int A0G() {
        return this.A01.A01.A07.size();
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r3) {
        ThumbnailButton thumbnailButton = ((AnonymousClass4Z1) r3).A01;
        thumbnailButton.setImageBitmap((Bitmap) null);
        thumbnailButton.setOnClickListener((View.OnClickListener) null);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r23, int i) {
        ThumbnailButton thumbnailButton;
        AnonymousClass4Z1 r3 = (AnonymousClass4Z1) r23;
        Map map = this.A00;
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = r3.A02;
        if (!catalogCarouselDetailImageView.A01.A07.isEmpty()) {
            C109015dw r1 = catalogCarouselDetailImageView.A01;
            if (!r1.A02()) {
                boolean z = true;
                if (r1.A07.size() <= 1) {
                    z = false;
                }
                int i2 = i;
                if (catalogCarouselDetailImageView.A01.A07.get(i2) != null) {
                    C108815db r11 = (C108815db) catalogCarouselDetailImageView.A01.A07.get(i2);
                    int i3 = r11.A03;
                    int i4 = r11.A02;
                    if (!(i3 == 0 || i4 == 0)) {
                        r3.A07(i3, i4, z);
                    }
                    String A0Y = AnonymousClass000.A0Y("_", AnonymousClass000.A0l(catalogCarouselDetailImageView.A01.A0F), i2);
                    thumbnailButton = r3.A01;
                    if (!A0Y.equals(thumbnailButton.getTag())) {
                        thumbnailButton.setImageResource(R.color.f5nameremoved);
                    }
                    thumbnailButton.setTag(A0Y);
                    int i5 = i3;
                    Map map2 = map;
                    String str = A0Y;
                    AnonymousClass4Z1 r16 = r3;
                    catalogCarouselDetailImageView.A03.A01(thumbnailButton, r11, (C181758nH) null, catalogCarouselDetailImageView.getImageLoadContext(), (C181768nI) null, new C111895ir(r16, str, map2, i5, i4, z), 1);
                } else {
                    thumbnailButton = r3.A01;
                    thumbnailButton.setImageResource(R.color.f5nameremoved);
                }
                if (catalogCarouselDetailImageView.A0B) {
                    int i6 = 2;
                    if (!z) {
                        i6 = 1;
                    }
                    thumbnailButton.setOnClickListener(new AnonymousClass541(r3, i2, i6));
                    return;
                }
                return;
            }
        }
        C1448873i.A00(r3.A01);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A01;
        return new AnonymousClass4Z1(AnonymousClass001.A0R(C18280x3.A0D(catalogCarouselDetailImageView), viewGroup, R.layout.f8nameremoved), catalogCarouselDetailImageView);
    }
}
