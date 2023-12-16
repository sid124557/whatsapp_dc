package X;

import com.whatsapp.framework.alerts.ui.AlertCardListFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.42U  reason: invalid class name */
public final class AnonymousClass42U extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AlertCardListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42U(AlertCardListFragment alertCardListFragment) {
        super(1);
        this.this$0 = alertCardListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        C195711s r3 = this.this$0.A04;
        if (r3 == null) {
            throw C18270x1.A0S("alertsListAdapter");
        }
        C162457s7.A0H(iterable);
        List A0E = C73723fy.A0E(iterable);
        C162457s7.A0J(A0E, 0);
        ArrayList A0J = AnonymousClass002.A0J(A0E);
        List list = r3.A01;
        C18280x3.A0s(new AnonymousClass11U(list, A0J), r3, A0J, list);
        return C59022wD.A00;
    }
}
