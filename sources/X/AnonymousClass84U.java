package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.util.Objects;

/* renamed from: X.84U  reason: invalid class name */
public class AnonymousClass84U implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Rect rect = ((AnonymousClass6NE) obj2).A04;
        if (rect == null) {
            return null;
        }
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return !Objects.equals(((AnonymousClass6NE) obj).A04, ((AnonymousClass6NE) obj2).A04);
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setPadding(0, 0, 0, 0);
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }
}
