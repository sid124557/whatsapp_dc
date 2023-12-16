package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.924  reason: invalid class name */
public class AnonymousClass924 implements C181298mX {
    public Object A00;
    public final int A01;

    public AnonymousClass924(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object apply(Object obj) {
        if (this.A01 == 0) {
            return obj;
        }
        RectF rectF = (RectF) obj;
        C162457s7.A0J(rectF, 1);
        float A012 = C86664Kz.A01(((View) this.A00).getResources(), R.dimen.f6nameremoved);
        Path A06 = AnonymousClass002.A06();
        A06.moveTo(rectF.left, rectF.bottom);
        A06.lineTo(rectF.left, rectF.top + A012);
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = ((float) 2) * A012;
        A06.arcTo(new RectF(f, f2, f + f3, f2 + f3), 180.0f, 90.0f);
        A06.lineTo(rectF.right - A012, rectF.top);
        float f4 = rectF.right;
        float f5 = rectF.top;
        A06.addArc(new RectF(f4 - f3, f5, f4, f3 + f5), 270.0f, 90.0f);
        A06.lineTo(rectF.right, rectF.bottom);
        A06.lineTo(rectF.left, rectF.bottom);
        A06.close();
        return A06;
    }
}
