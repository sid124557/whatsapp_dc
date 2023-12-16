package X;

import com.whatsapp.biz.product.viewmodel.ProductBottomSheetViewModel;

/* renamed from: X.5ik  reason: invalid class name and case insensitive filesystem */
public final class C111825ik implements C184048rA {
    public final /* synthetic */ ProductBottomSheetViewModel A00;

    public C111825ik(ProductBottomSheetViewModel productBottomSheetViewModel) {
        this.A00 = productBottomSheetViewModel;
    }

    public void BTH(String str, int i) {
        ProductBottomSheetViewModel productBottomSheetViewModel = this.A00;
        if (C162457s7.A0P(str, productBottomSheetViewModel.A05)) {
            C49732h0 r1 = productBottomSheetViewModel.A0X;
            r1.A01(new AnonymousClass41A(r1));
            productBottomSheetViewModel.A0G(true);
        }
    }

    public void BTI(AnonymousClass7PB r6, String str) {
        ProductBottomSheetViewModel productBottomSheetViewModel = this.A00;
        if (C162457s7.A0P(str, productBottomSheetViewModel.A05)) {
            C109015dw A08 = productBottomSheetViewModel.A0R.A08(productBottomSheetViewModel.A04, str);
            productBottomSheetViewModel.A02 = A08;
            if (A08 == null || productBottomSheetViewModel.A0G(false)) {
                C49732h0 r1 = productBottomSheetViewModel.A0X;
                r1.A01(new AnonymousClass41A(r1));
                return;
            }
            if (!productBottomSheetViewModel.A09) {
                productBottomSheetViewModel.A01 = productBottomSheetViewModel.A02;
            }
            C49732h0 r12 = productBottomSheetViewModel.A0X;
            r12.A01(new AnonymousClass43W(r12, false));
            productBottomSheetViewModel.A0G.A0G((Object) null);
            productBottomSheetViewModel.A0A = true;
            productBottomSheetViewModel.A09 = true;
            productBottomSheetViewModel.A0D();
        }
    }
}
