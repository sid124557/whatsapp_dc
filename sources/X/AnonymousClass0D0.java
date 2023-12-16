package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.0D0  reason: invalid class name */
public class AnonymousClass0D0 extends AnonymousClass6NB {
    public static void A00(AnonymousClass03R r1, C153427bI r2, AnonymousClass84O r3) {
        AnonymousClass84O A0J = r3.A0K(35);
        if (A0J != null) {
            r1.setColorFilter(C154127ce.A00(r2, A0J));
        }
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, C153427bI r3, AnonymousClass84O r4, Object obj) {
        A00((AnonymousClass03R) view, r3, r4);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r2, AnonymousClass84O r3, Object obj, Object obj2) {
        ((ImageView) view).clearColorFilter();
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return new AnonymousClass03R(context);
    }

    public AnonymousClass0D0(C153427bI r1, AnonymousClass84O r2) {
        super(r1, r2);
    }
}
