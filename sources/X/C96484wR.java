package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4wR  reason: invalid class name and case insensitive filesystem */
public class C96484wR extends AnonymousClass6mM {
    public final ViewGroup A00;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C96314wA r10 = (C96314wA) obj;
        ViewGroup viewGroup = this.A00;
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        LayoutInflater from = LayoutInflater.from(context);
        ViewGroup A0I = C86644Kx.A0I(this.A0H, R.id.shimmer_items);
        A0I.removeAllViews();
        if (r10.A00) {
            from.inflate(R.layout.f8nameremoved, A0I, true);
        }
        if (r10.A01) {
            from.inflate(R.layout.f8nameremoved, A0I, true);
        }
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            i = C86664Kz.A0C(viewGroup.getChildAt(i2), i);
        }
        int round = Math.round(((float) (viewGroup.getHeight() - i)) / ((float) resources.getDimensionPixelSize(R.dimen.f6nameremoved)));
        for (int i3 = 0; i3 < round; i3++) {
            from.inflate(R.layout.f8nameremoved, A0I, true);
        }
    }

    public C96484wR(View view, ViewGroup viewGroup) {
        super(view);
        this.A00 = viewGroup;
    }
}
