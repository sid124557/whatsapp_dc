package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;

/* renamed from: X.6Hn  reason: invalid class name */
public class AnonymousClass6Hn extends C04640Qa {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchFragment A01;

    public AnonymousClass6Hn(RecyclerView recyclerView, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        this.A01 = businessDirectoryContextualSearchFragment;
        this.A00 = recyclerView;
    }

    public void A06(int i, int i2) {
        C06440Xs layoutManager;
        if (i == 0 && (layoutManager = this.A00.getLayoutManager()) != null) {
            ((LinearLayoutManager) layoutManager).A1Y(0, 0);
        }
    }
}
