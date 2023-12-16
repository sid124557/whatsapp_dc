package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* renamed from: X.6ZN  reason: invalid class name */
public class AnonymousClass6ZN extends AnonymousClass6ZD {
    public void A08(Canvas canvas) {
        RectF rectF = this.A00;
        if (rectF.isEmpty()) {
            super.A08(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(rectF);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        super.A08(canvas);
        canvas.restore();
    }

    public AnonymousClass6ZN(C161877ql r1) {
        super(r1);
    }
}
