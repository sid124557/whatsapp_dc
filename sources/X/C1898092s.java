package X;

import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

/* renamed from: X.92s  reason: invalid class name and case insensitive filesystem */
public class C1898092s implements AnonymousClass499 {
    public Object A00;
    public final int A01;

    public C1898092s(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BNt(C108985dt r6) {
        switch (this.A01) {
            case 0:
                C90244gx r4 = (C90244gx) this.A00;
                if (r6 == null) {
                    r4.A01.A08(new AnonymousClass8EP(r4), r4.A00, (String) null);
                    return;
                }
                r4.A04(r6);
                return;
            case 1:
                ((AnonymousClass5PC) this.A00).A00.A0G(r6);
                return;
            case 2:
                AnonymousClass5PC r0 = (AnonymousClass5PC) this.A00;
                if (r6 != null) {
                    r0.A05.A0G(Boolean.valueOf(r6.A0Y));
                    return;
                }
                return;
            case 3:
                ((ProductDetailActivity) this.A00).A78(r6);
                return;
            default:
                ((CatalogSearchFragment) this.A00).A0F = r6;
                return;
        }
    }
}
