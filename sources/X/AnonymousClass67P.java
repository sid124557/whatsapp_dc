package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.67P  reason: invalid class name */
public class AnonymousClass67P extends Drawable {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    public AnonymousClass67P(AnonymousClass5TP r2) {
        this.A01 = r2;
        this.A00 = C86604Kt.A0B();
    }

    public void draw(Canvas canvas) {
        int A04;
        float f;
        float f2;
        if (this.A02 != 0) {
            AnonymousClass5TP r4 = (AnonymousClass5TP) this.A01;
            if (r4.A00 > 0.0f) {
                C93294oH r0 = r4.A0D;
                A04 = AnonymousClass5Yj.A03(r0.getContext(), r0.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
                f = (float) (A04 >> 24);
                f2 = r4.A00;
            } else {
                return;
            }
        } else {
            AnonymousClass6FC r2 = (AnonymousClass6FC) this.A01;
            if (r2.A00 > 0.0f) {
                A04 = AnonymousClass0Y8.A04(r2.getContext(), R.color.f5nameremoved);
                f = (float) (A04 >> 24);
                f2 = r2.A00;
            } else {
                return;
            }
        }
        int i = (A04 & 16777215) | (((int) (f * f2)) << 24);
        Paint paint = (Paint) this.A00;
        paint.setColor(i);
        canvas.drawRect(getBounds(), paint);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass67P(AnonymousClass6FC r2) {
        this.A01 = r2;
        this.A00 = C86604Kt.A0B();
    }
}
