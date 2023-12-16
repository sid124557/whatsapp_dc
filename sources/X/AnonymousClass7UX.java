package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.7UX  reason: invalid class name */
public final class AnonymousClass7UX {
    public C07540bC A00;
    public C147157Da A01;
    public C147167Db A02;
    public AnonymousClass6F9 A03;
    public final Context A04;
    public final View.OnTouchListener A05 = new C159677mH(this, 7);
    public final View A06;
    public final C620733j A07;
    public final List A08;
    public final AnonymousClass66R A09 = AnonymousClass8P7.A00(new AnonymousClass8WH(this));

    public final void A00(Long l) {
        Long l2;
        AnonymousClass6F9 r1;
        AnonymousClass6F9 r0 = this.A03;
        if (r0 != null) {
            l2 = r0.A00;
        } else {
            l2 = null;
        }
        if (!C162457s7.A0P(l, l2) && (r1 = this.A03) != null && !C162457s7.A0P(l, r1.A00)) {
            r1.A00 = l;
            r1.notifyDataSetChanged();
        }
    }

    public AnonymousClass7UX(Context context, View view, C620733j r5, List list) {
        C18260x0.A0Q(r5, context);
        this.A07 = r5;
        this.A04 = context;
        this.A06 = view;
        this.A08 = list;
    }
}
