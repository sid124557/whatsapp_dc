package X;

import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;

/* renamed from: X.8zs  reason: invalid class name and case insensitive filesystem */
public class C189028zs extends AnonymousClass2UT {
    public Object A00;
    public final int A01;

    public C189028zs(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        C104325Qn r0;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                r0 = ((C90504hW) obj).A0I.A0O;
                break;
            case 1:
                r0 = ((ProductListActivity) obj).A0I.A06;
                break;
            case 2:
                r0 = ((C90514ha) obj).A0k.A0F;
                break;
            case 3:
                r0 = ((ProductBottomSheetViewModel) obj).A03;
                if (r0 == null) {
                    return;
                }
                break;
            case 4:
                r0 = ((C90604hu) obj).A0H.A05;
                break;
            case 5:
                r0 = ((C125216Gu) ((BusinessProductListBaseFragment) obj).A0L.getValue()).A02;
                break;
            default:
                r0 = ((AnonymousClass6H0) obj).A04;
                break;
        }
        r0.A00();
    }
}
