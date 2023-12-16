package X;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Ob  reason: invalid class name and case insensitive filesystem */
public class C103705Ob {
    public RectF A00;
    public C105425Uw A01;
    public final AnonymousClass7E9 A02;
    public final C104435Qy A03;
    public final AnonymousClass5Q2 A04;
    public final C104425Qx A05;
    public final C104255Qg A06;

    public final void A00() {
        C104435Qy r2 = this.A03;
        if (r2.A07 != null) {
            RectF A07 = AnonymousClass002.A07();
            r2.A09.mapRect(A07, r2.A07);
            int i = r2.A04;
            int i2 = r2.A03;
            float width = A07.width() / A07.height();
            float f = (float) i;
            float f2 = (float) i2;
            if (width > f / f2) {
                f2 = f / width;
            } else {
                f = f2 * width;
            }
            float f3 = (float) (i / 2);
            float f4 = (float) (i2 / 2);
            float f5 = f / 2.0f;
            float f6 = f2 / 2.0f;
            RectF A09 = AnonymousClass4L0.A09(f3 - f5, f4 - f6, f3 + f5, f4 + f6);
            RectF rectF = this.A00;
            if (rectF == null || !rectF.equals(A09)) {
                this.A00 = A09;
                C104425Qx r4 = this.A05;
                RectF rectF2 = r4.A02;
                rectF2.set(A09);
                Map map = r4.A05;
                Iterator A0v = AnonymousClass001.A0v(map);
                while (A0v.hasNext()) {
                    AnonymousClass5UA r0 = (AnonymousClass5UA) A0v.next();
                    View view = r0.A06;
                    if (view != null) {
                        r0.A07.removeView(view);
                    }
                }
                map.clear();
                Integer A0f = AnonymousClass001.A0f();
                Handler handler = r4.A09;
                ViewGroup viewGroup = r4.A0A;
                Vibrator vibrator = r4.A03;
                map.put(A0f, new AnonymousClass4v3(rectF2, handler, vibrator, viewGroup, 1));
                map.put(C18280x3.A0S(), new AnonymousClass4v3(rectF2, handler, vibrator, viewGroup, 2));
                map.put(C18290x4.A0a(), new C95914v4(rectF2, handler, vibrator, viewGroup));
            }
        }
    }

    public C103705Ob(AnonymousClass7E9 r2, C104435Qy r3, C104425Qx r4, C104255Qg r5) {
        this.A03 = r3;
        this.A04 = new AnonymousClass5Q2(r3);
        this.A06 = r5;
        this.A05 = r4;
        this.A02 = r2;
    }
}
