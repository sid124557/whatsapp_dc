package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.1gl  reason: invalid class name and case insensitive filesystem */
public class C28371gl extends AnonymousClass6mM {
    public final ViewGroup A00;

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        ViewGroup viewGroup = this.A00;
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        LayoutInflater from = LayoutInflater.from(context);
        ViewGroup viewGroup2 = (ViewGroup) C06560Yg.A02(this.A0H, R.id.shimmer_items);
        viewGroup2.removeAllViews();
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            i += viewGroup.getChildAt(i2).getHeight();
        }
        int round = Math.round(((float) (viewGroup.getHeight() - i)) / ((float) resources.getDimensionPixelSize(R.dimen.f6nameremoved)));
        for (int i3 = 0; i3 < round; i3++) {
            from.inflate(R.layout.f8nameremoved, viewGroup2, true);
        }
    }

    public C28371gl(View view, ViewGroup viewGroup) {
        super(view);
        this.A00 = viewGroup;
    }
}
