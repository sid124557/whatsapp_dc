package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter;

/* renamed from: X.53S  reason: invalid class name */
public final class AnonymousClass53S extends C88504Yz {
    public RecyclerView A00;
    public final StatusSeeAllAdapter A01;

    public AnonymousClass53S(View view, StatusSeeAllAdapter statusSeeAllAdapter) {
        super(view);
        this.A01 = statusSeeAllAdapter;
        View findViewById = view.findViewById(R.id.see_all_filter_chips_recycler_view);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        view.getContext();
        C18320x8.A19(recyclerView, 0);
        recyclerView.setItemAnimator((AnonymousClass0UY) null);
        C162457s7.A0D(findViewById);
        this.A00 = recyclerView;
    }
}
