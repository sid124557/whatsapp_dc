package X;

import androidx.recyclerview.widget.GridLayoutManager;
import java.util.List;

/* renamed from: X.442  reason: invalid class name */
public final class AnonymousClass442 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C194811i $adapter;
    public final /* synthetic */ GridLayoutManager $layoutManager;
    public final /* synthetic */ int $position;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass442(GridLayoutManager gridLayoutManager, C194811i r3, int i) {
        super(1);
        this.$position = i;
        this.$layoutManager = gridLayoutManager;
        this.$adapter = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C194811i r1;
        List list;
        AnonymousClass2l4 r2 = (AnonymousClass2l4) C73723fy.A06(((C51222jT) obj).A00, this.$position);
        if (r2 != null) {
            this.$layoutManager.A1o(C18280x3.A01(r2.A02 ? 1 : 0));
            r1 = this.$adapter;
            list = r2.A01;
        } else {
            r1 = this.$adapter;
            list = C72023d3.A00;
        }
        r1.A0L(list);
        return C59022wD.A00;
    }
}
