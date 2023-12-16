package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.whatsapp.R;
import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;

/* renamed from: X.5j0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111985j0 implements C181858nS {
    public final /* synthetic */ ProductBottomSheet A00;

    public final void BV4(long j) {
        Window window;
        View decorView;
        ProductBottomSheet productBottomSheet = this.A00;
        Dialog dialog = productBottomSheet.A03;
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            C620733j r2 = productBottomSheet.A0A;
            if (r2 != null) {
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass000.A1Q(A0L, 0, j);
                C86644Kx.A16(decorView, r2.A0L(A0L, R.plurals.f9nameremoved, j), -1);
                return;
            }
            throw C18270x1.A0S("whatsAppLocale");
        }
    }

    public /* synthetic */ C111985j0(ProductBottomSheet productBottomSheet) {
        this.A00 = productBottomSheet;
    }
}
