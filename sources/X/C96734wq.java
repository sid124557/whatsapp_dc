package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.4wq  reason: invalid class name and case insensitive filesystem */
public class C96734wq extends AnonymousClass6mM {
    public final RecyclerView A00;
    public final AnonymousClass4XC A01;

    public void A07() {
        this.A00.setAdapter((AnonymousClass0R6) null);
    }

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C135996lg r4 = (C135996lg) obj;
        RecyclerView recyclerView = this.A00;
        AnonymousClass4XC r2 = this.A01;
        recyclerView.setAdapter(r2);
        r2.A02 = r4.A01;
        r2.A05();
        C185648u1 r1 = r4.A00;
        C162457s7.A0J(r1, 0);
        r2.A01 = r1;
    }

    public C96734wq(View view, AnonymousClass4XC r4) {
        super(view);
        RecyclerView A0P = C86654Ky.A0P(view, R.id.search_filter_recycler_view);
        this.A00 = A0P;
        view.getContext();
        C18320x8.A19(A0P, 0);
        this.A01 = r4;
    }
}
