package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.90k  reason: invalid class name and case insensitive filesystem */
public class C1892090k implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public C1892090k(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        Window window;
        int i;
        switch (this.A01) {
            case 0:
                AnonymousClass6ZQ r1 = (AnonymousClass6ZQ) this.A00;
                r1.A09(r1.A0A());
                return;
            case 1:
                AnonymousClass6ZR r2 = (AnonymousClass6ZR) this.A00;
                r2.A06 = z;
                r2.A02.A05(false);
                if (!z) {
                    r2.A0A(false);
                    r2.A05 = false;
                    return;
                }
                return;
            case 2:
                CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A00;
                if (z) {
                    AnonymousClass66R r0 = catalogSearchFragment.A0Q;
                    CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) r0.getValue();
                    C108985dt r12 = catalogSearchFragment.A0F;
                    String str = (String) ((CatalogSearchViewModel) r0.getValue()).A00.A07();
                    if (str == null) {
                        str = "";
                    }
                    catalogSearchViewModel.A0F(r12, str);
                    return;
                }
                return;
            case 3:
                C1238369y r02 = (C1238369y) this.A00;
                if (z) {
                    ((C113245l7) r02.A00).A2T();
                    return;
                }
                return;
            case 4:
                View view2 = (View) this.A00;
                if (z) {
                    view2.requestLayout();
                    return;
                }
                return;
            case 5:
                AnonymousClass7XM r22 = (AnonymousClass7XM) this.A00;
                Drawable background = r22.A0A.getBackground();
                int i2 = 204;
                if (z) {
                    i2 = 230;
                }
                background.setAlpha(i2);
                C105895Wv r03 = r22.A0E;
                if (z) {
                    r03.A03(view);
                    window = r22.A02.getWindow();
                    i = 5;
                } else {
                    r03.A02(view);
                    window = r22.A02.getWindow();
                    i = 3;
                }
                window.setSoftInputMode(i);
                return;
            case 6:
                ((TokenizedSearchInput) this.A00).A0F.A0h(z);
                return;
            case 7:
                WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) this.A00;
                if (z) {
                    wDSConversationSearchView.A00();
                    return;
                }
                return;
            default:
                WDSSearchView wDSSearchView = (WDSSearchView) this.A00;
                if (z) {
                    wDSSearchView.A01();
                    return;
                }
                return;
        }
    }
}
