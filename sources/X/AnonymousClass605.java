package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;
import java.util.List;

/* renamed from: X.605  reason: invalid class name */
public final class AnonymousClass605 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass605(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        super(1);
        this.this$0 = businessDirectorySERPMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        RecyclerView recyclerView = this.this$0.A02;
        if (recyclerView == null) {
            throw C18270x1.A0S("horizontalBusinessListView");
        }
        if (recyclerView.getVisibility() != 0) {
            RecyclerView recyclerView2 = this.this$0.A02;
            if (recyclerView2 == null) {
                throw C18270x1.A0S("horizontalBusinessListView");
            }
            recyclerView2.setVisibility(4);
        }
        C96254w4 r0 = this.this$0.A06;
        if (r0 != null) {
            r0.A0L(list);
            BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.this$0;
            RecyclerView recyclerView3 = businessDirectorySERPMapViewActivity.A02;
            if (recyclerView3 == null) {
                throw C18270x1.A0S("horizontalBusinessListView");
            }
            recyclerView3.post(new C117175rV(businessDirectorySERPMapViewActivity, 40, list));
            return C59022wD.A00;
        }
        throw C18270x1.A0S("horizontalBusinessListAdapter");
    }
}
