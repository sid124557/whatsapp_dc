package X;

import android.widget.TextView;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

/* renamed from: X.60X  reason: invalid class name */
public final class AnonymousClass60X extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60X(CatalogSearchFragment catalogSearchFragment) {
        super(1);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        TextView textView = this.this$0.A08;
        if (textView != null) {
            textView.setText(str);
        }
        return C59022wD.A00;
    }
}
