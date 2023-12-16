package X;

import com.whatsapp.R;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

/* renamed from: X.5j7  reason: invalid class name and case insensitive filesystem */
public class C112055j7 implements C181888nV {
    public final /* synthetic */ ProductDetailActivity A00;

    public C112055j7(ProductDetailActivity productDetailActivity) {
        this.A00 = productDetailActivity;
    }

    public void BZz(String str) {
        ProductDetailActivity productDetailActivity = this.A00;
        C109015dw r0 = productDetailActivity.A0V;
        if (r0 != null) {
            String str2 = r0.A0F;
            C105145Tt r02 = productDetailActivity.A0X;
            String str3 = r02.A02;
            String str4 = str;
            C149847Od r2 = new C149847Od(productDetailActivity.A0r, str2, str4, str3, productDetailActivity.A0X.A0C.get(), (long) r02.A0D.getAndIncrement());
            if (productDetailActivity.A0Y.A08(r2)) {
                productDetailActivity.Bp9(R.string.f11nameremoved);
            } else {
                productDetailActivity.A0Y.A04(r2, false);
            }
        }
    }
}
