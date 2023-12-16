package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6JE  reason: invalid class name */
public abstract class AnonymousClass6JE extends AnonymousClass0R4 {
    public final Context A00;
    public final Resources A01;

    public Object A0D(ViewGroup viewGroup, int i) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        Pair A0G = A0G(i);
        AnonymousClass509 r0 = new AnonymousClass509(this.A00, this.A01, (String) A0G.first, (String) A0G.second);
        r0.setLayoutParams(layoutParams);
        viewGroup.addView(r0);
        A0H(r0, i);
        return r0;
    }

    public abstract Pair A0G(int i);

    public abstract void A0H(AnonymousClass509 r1, int i);

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
    }

    public AnonymousClass6JE(Context context, Resources resources) {
        this.A00 = context;
        this.A01 = resources;
    }
}
