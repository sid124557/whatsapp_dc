package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.1gk  reason: invalid class name and case insensitive filesystem */
public final class C28361gk extends AnonymousClass6mM {
    public /* bridge */ /* synthetic */ void A09(Object obj) {
        View view = this.A0H;
        LayoutInflater from = LayoutInflater.from(C18290x4.A0F(view));
        ViewGroup viewGroup = (ViewGroup) C18280x3.A0E(view, R.id.popular_biz_shimmer_items);
        viewGroup.removeAllViews();
        int i = 0;
        do {
            from.inflate(R.layout.f8nameremoved, viewGroup, true);
            i++;
        } while (i < 6);
    }

    public C28361gk(View view) {
        super(view);
    }
}
