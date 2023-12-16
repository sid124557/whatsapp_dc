package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.4wr  reason: invalid class name and case insensitive filesystem */
public class C96744wr extends AnonymousClass6mM {
    public final RecyclerView A00;
    public final C87794Wd A01;

    public void A07() {
        this.A00.setAdapter((AnonymousClass0R6) null);
    }

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        this.A00.setAdapter(this.A01);
        throw AnonymousClass001.A0g("historyBarItems");
    }

    public C96744wr(View view, C87794Wd r4) {
        super(view);
        RecyclerView A0P = C86654Ky.A0P(view, R.id.search_history_recycler_view);
        this.A00 = A0P;
        view.getContext();
        C18320x8.A19(A0P, 0);
        this.A01 = r4;
    }
}
