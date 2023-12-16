package X;

import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.636  reason: invalid class name */
public final class AnonymousClass636 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C183518qA $onQueryTextChangeListener;
    public final /* synthetic */ WDSSearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass636(C183518qA r2, WDSSearchView wDSSearchView) {
        super(1);
        this.this$0 = wDSSearchView;
        this.$onQueryTextChangeListener = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        if (obj == null || (str = obj.toString()) == null) {
            str = "";
        }
        if (!C162457s7.A0P(this.this$0.A05, str)) {
            this.this$0.A05 = str;
            C183518qA r0 = this.$onQueryTextChangeListener;
            if (r0 != null) {
                r0.BZI(str);
            }
        }
        return C59022wD.A00;
    }
}
