package X;

import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.statusmuting.MutedStatusesActivity;
import com.whatsapp.updates.ui.statusmuting.MutedStatusesAdapter;
import java.util.List;

/* renamed from: X.62Y  reason: invalid class name */
public final class AnonymousClass62Y extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ MutedStatusesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass62Y(MutedStatusesActivity mutedStatusesActivity) {
        super(1);
        this.this$0 = mutedStatusesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        WaTextView waTextView = this.this$0.A04;
        if (waTextView == null) {
            throw C18270x1.A0S("noStatusesTextView");
        }
        waTextView.setVisibility(AnonymousClass001.A08(list.isEmpty() ? 1 : 0));
        MutedStatusesAdapter mutedStatusesAdapter = this.this$0.A05;
        if (mutedStatusesAdapter == null) {
            throw C18270x1.A0S("adapter");
        }
        C86604Kt.A1R(mutedStatusesAdapter.A00);
        AnonymousClass4q5 r3 = new AnonymousClass4q5(mutedStatusesAdapter.A02, list);
        ((C103445Mz) mutedStatusesAdapter.A05.getValue()).A02(new C1237969u(mutedStatusesAdapter, 4, list), r3);
        mutedStatusesAdapter.A00 = r3;
        return C59022wD.A00;
    }
}
