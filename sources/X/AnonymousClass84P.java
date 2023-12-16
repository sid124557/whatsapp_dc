package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.84P  reason: invalid class name */
public class AnonymousClass84P implements C185318tS {
    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setBackground(((AnonymousClass6ND) obj2).A04);
        return null;
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        Drawable drawable = ((AnonymousClass6ND) obj).A04;
        Drawable drawable2 = ((AnonymousClass6ND) obj2).A04;
        if (drawable != null) {
            return !drawable.equals(drawable2);
        }
        if (drawable2 == null) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setBackground((Drawable) null);
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }
}
