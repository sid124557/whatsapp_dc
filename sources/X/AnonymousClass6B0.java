package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.6B0  reason: invalid class name */
public class AnonymousClass6B0 implements C181298mX {
    public final int A00;

    public AnonymousClass6B0(int i) {
        this.A00 = i;
    }

    public final Object apply(Object obj) {
        RectF rectF = (RectF) obj;
        if (this.A00 == 0) {
            float min = Math.min(rectF.width(), rectF.height());
            float width = (rectF.width() - min) * 0.5f;
            float height = (rectF.height() - min) * 0.5f;
            rectF.set(rectF.left + width, rectF.top + height, rectF.right - width, rectF.bottom - height);
        }
        Path A06 = AnonymousClass002.A06();
        A06.addOval(rectF, Path.Direction.CW);
        A06.close();
        return A06;
    }
}
