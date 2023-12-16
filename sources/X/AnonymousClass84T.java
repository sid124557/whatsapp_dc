package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.84T  reason: invalid class name */
public class AnonymousClass84T implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        AnonymousClass6NE r5 = (AnonymousClass6NE) obj2;
        if (r5.A01 <= 0) {
            return null;
        }
        if (r5.A0D.A00 == 1) {
            view.setVerticalFadingEdgeEnabled(true);
        } else {
            view.setHorizontalFadingEdgeEnabled(true);
        }
        view.setFadingEdgeLength(r5.A01);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return AnonymousClass001.A1X(((AnonymousClass6NE) obj).A01, ((AnonymousClass6NE) obj2).A01);
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setVerticalFadingEdgeEnabled(false);
        view.setHorizontalFadingEdgeEnabled(false);
        view.setFadingEdgeLength(0);
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }
}
