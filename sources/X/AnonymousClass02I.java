package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: X.02I  reason: invalid class name */
public class AnonymousClass02I extends Property {
    public Rect A00 = AnonymousClass001.A0N();

    public AnonymousClass02I() {
        super(PointF.class, "boundsOrigin");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        Rect rect = this.A00;
        ((Drawable) obj).copyBounds(rect);
        return new PointF((float) rect.left, (float) rect.top);
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        Rect rect = this.A00;
        drawable.copyBounds(rect);
        rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(rect);
    }
}
