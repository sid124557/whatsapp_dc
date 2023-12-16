package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.1gm  reason: invalid class name and case insensitive filesystem */
public final class C28381gm extends AnonymousClass6mM {
    public final View A00;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C162457s7.A0J(obj, 0);
        View view = this.A00;
        ViewGroup viewGroup = (ViewGroup) C06560Yg.A02(view, R.id.shimmer_items);
        viewGroup.removeAllViews();
        C18280x3.A0D(view).inflate(R.layout.f8nameremoved, viewGroup, true);
    }

    public C28381gm(View view) {
        super(view);
        this.A00 = view;
    }
}
