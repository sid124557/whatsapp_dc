package X;

import com.whatsapp.R;
import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.63A  reason: invalid class name */
public final class AnonymousClass63A extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ String $productId;
    public final /* synthetic */ UserJid $productOwnerJid;
    public final /* synthetic */ ProductBottomSheetViewModel this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C52332lJ r4 = (C52332lJ) obj;
        if (r4 == null) {
            ProductBottomSheetViewModel productBottomSheetViewModel = this.this$0;
            C49732h0 r2 = productBottomSheetViewModel.A0X;
            r2.A01(new AnonymousClass43X(r2, AnonymousClass000.A1W(productBottomSheetViewModel.A02)));
        }
        ProductBottomSheetViewModel productBottomSheetViewModel2 = this.this$0;
        productBottomSheetViewModel2.A0U.A09(new AnonymousClass7PB(r4, this.$productOwnerJid, C86624Kv.A0X(productBottomSheetViewModel2.A0C.getResources(), R.dimen.f6nameremoved), C86624Kv.A0X(this.this$0.A0C.getResources(), R.dimen.f6nameremoved), this.$productId, this.this$0.A0S.A02, false));
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63A(ProductBottomSheetViewModel productBottomSheetViewModel, UserJid userJid, String str) {
        super(1);
        this.this$0 = productBottomSheetViewModel;
        this.$productOwnerJid = userJid;
        this.$productId = str;
    }
}
