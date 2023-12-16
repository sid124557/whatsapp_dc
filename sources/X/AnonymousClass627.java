package X;

import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import java.util.List;

/* renamed from: X.627  reason: invalid class name */
public final class AnonymousClass627 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CountrySelectorBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass627(CountrySelectorBottomSheet countrySelectorBottomSheet) {
        super(1);
        this.this$0 = countrySelectorBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C162457s7.A0J(list, 0);
        AnonymousClass4WG r2 = this.this$0.A05;
        if (r2 != null && !list.isEmpty()) {
            r2.A02 = list;
            r2.A01 = list;
            ((C148977Kl) list.get(0)).A00 = true;
            r2.A00 = (C148977Kl) r2.A02.get(0);
            r2.A0L(list);
        }
        return C59022wD.A00;
    }
}
