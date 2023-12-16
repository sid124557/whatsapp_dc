package X;

import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.StickyHeadersRecyclerView;

/* renamed from: X.6HK  reason: invalid class name */
public class AnonymousClass6HK extends AnonymousClass0OM {
    public final /* synthetic */ GridLayoutManager A00;
    public final /* synthetic */ StickyHeadersRecyclerView A01;

    public AnonymousClass6HK(GridLayoutManager gridLayoutManager, StickyHeadersRecyclerView stickyHeadersRecyclerView) {
        this.A01 = stickyHeadersRecyclerView;
        this.A00 = gridLayoutManager;
    }

    public int A00(int i) {
        if ((((C88004Wy) this.A01.A0N).A0K(i) & 4294967295L) == 4294967295L) {
            return this.A00.A00;
        }
        return 1;
    }
}
