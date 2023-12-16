package X;

import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5zu  reason: invalid class name and case insensitive filesystem */
public final class C121245zu extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ProductBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121245zu(ProductBottomSheet productBottomSheet) {
        super(1);
        this.this$0 = productBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C162457s7.A0J(str, 0);
        ProductBottomSheet productBottomSheet = this.this$0;
        ProductBottomSheetViewModel productBottomSheetViewModel = productBottomSheet.A09;
        if (productBottomSheetViewModel == null) {
            throw C86604Kt.A0j();
        }
        UserJid userJid = productBottomSheet.A0B;
        if (userJid == null) {
            throw C18270x1.A0S("productOwnerJid");
        }
        productBottomSheetViewModel.A0F(userJid, str);
        if (!productBottomSheetViewModel.A07.getAndSet(true)) {
            productBottomSheetViewModel.A0W.A00(userJid, 45);
        }
        return C59022wD.A00;
    }
}
