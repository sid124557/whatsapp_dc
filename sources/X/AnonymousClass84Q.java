package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.84Q  reason: invalid class name */
public class AnonymousClass84Q implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        ((AnonymousClass6N7) obj).setForegroundCompat(((AnonymousClass6ND) obj2).A05);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable = ((AnonymousClass6ND) obj).A05;
        Drawable drawable2 = ((AnonymousClass6ND) obj2).A05;
        if (drawable == null) {
            if (drawable2 != null) {
                return true;
            }
            return false;
        } else if (drawable2 == null || drawable.equals(drawable2)) {
            return false;
        } else {
            return true;
        }
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((AnonymousClass6N7) obj).setForegroundCompat((Drawable) null);
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }
}
