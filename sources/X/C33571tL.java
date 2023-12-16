package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.biz.catalog.view.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.1tL  reason: invalid class name and case insensitive filesystem */
public class C33571tL extends AnonymousClass5ZM {
    public int A00;
    public Bitmap A01;
    public View A02;
    public ThumbnailButton A03;
    public String A04;
    public Map A05;
    public final /* synthetic */ CatalogCarouselDetailImageView A06;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass2JZ r3 = (AnonymousClass2JZ) obj;
        this.A05.put(this.A04, r3);
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A06;
        Bitmap bitmap = this.A01;
        catalogCarouselDetailImageView.setImageAndGradient(r3, AnonymousClass001.A1Y(bitmap.getWidth(), bitmap.getHeight()), this.A03, bitmap, this.A02);
    }

    public C33571tL(Bitmap bitmap, View view, CatalogCarouselDetailImageView catalogCarouselDetailImageView, ThumbnailButton thumbnailButton, String str, Map map, int i) {
        this.A06 = catalogCarouselDetailImageView;
        this.A02 = view;
        this.A03 = thumbnailButton;
        this.A01 = bitmap;
        this.A00 = i;
        this.A05 = map;
        this.A04 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass0TJ A002;
        AnonymousClass0OY r3;
        Bitmap bitmap = this.A01;
        int i = this.A00;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            return new AnonymousClass2JZ(i, i);
        }
        boolean A1Y = AnonymousClass001.A1Y(width, height);
        AnonymousClass0OY r10 = new AnonymousClass0OY(bitmap);
        if (A1Y) {
            double d = (double) width;
            r10.A01(0, 0, (int) (0.05d * d), height);
            A002 = r10.A00();
            r3 = new AnonymousClass0OY(bitmap);
            r3.A01((int) (d * 0.95d), 0, width, height);
        } else {
            double d2 = (double) height;
            r10.A01(0, 0, width, (int) (0.05d * d2));
            A002 = r10.A00();
            r3 = new AnonymousClass0OY(bitmap);
            r3.A01(0, (int) (d2 * 0.95d), width, height);
        }
        AnonymousClass0TJ A003 = r3.A00();
        int i2 = i;
        AnonymousClass0QX r0 = A002.A01;
        if (r0 != null) {
            i2 = r0.A08;
        }
        AnonymousClass0QX r02 = A003.A01;
        if (r02 != null) {
            i = r02.A08;
        }
        return new AnonymousClass2JZ(i2, i);
    }
}
