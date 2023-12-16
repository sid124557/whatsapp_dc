package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4wT  reason: invalid class name and case insensitive filesystem */
public final class C96504wT extends AnonymousClass6mM {
    public final View A00;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C136076lo r7 = (C136076lo) obj;
        C162457s7.A0J(r7, 0);
        View view = this.A00;
        ViewGroup A0I = C86644Kx.A0I(view, R.id.shimmer_items);
        A0I.removeAllViews();
        if (r7.A00) {
            C18280x3.A0D(view).inflate(R.layout.f8nameremoved, A0I, true);
        }
        int i = 0;
        do {
            C18280x3.A0D(view).inflate(R.layout.f8nameremoved, A0I, true);
            i++;
        } while (i < 3);
        C18280x3.A0D(view).inflate(R.layout.f8nameremoved, A0I, true);
    }

    public C96504wT(View view) {
        super(view);
        this.A00 = view;
    }
}
