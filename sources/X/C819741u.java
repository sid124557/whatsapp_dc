package X;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.41u  reason: invalid class name and case insensitive filesystem */
public final class C819741u extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C819741u(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
        CoordinatorLayout coordinatorLayout = searchFunStickersBottomSheet.A04;
        if (coordinatorLayout != null) {
            C88694ab A00 = C88694ab.A00(coordinatorLayout, R.string.f11nameremoved, 0);
            AnonymousClass6FH r4 = A00.A0J;
            ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
            C162457s7.A0K(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize = C08310eF.A09(searchFunStickersBottomSheet).getDimensionPixelSize(R.dimen.f6nameremoved);
            marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, C08310eF.A09(searchFunStickersBottomSheet).getDimensionPixelSize(R.dimen.f6nameremoved));
            r4.setLayoutParams(marginLayoutParams);
            A00.A05();
        }
        return C59022wD.A00;
    }
}
