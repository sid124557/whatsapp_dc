package X;

import android.os.Parcelable;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

/* renamed from: X.5wV  reason: invalid class name and case insensitive filesystem */
public final class C119145wV extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119145wV(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Parcelable parcelable = this.this$0.A0H().getParcelable("category_biz_id");
        if (parcelable != null) {
            return parcelable;
        }
        throw C18290x4.A0Y();
    }
}
