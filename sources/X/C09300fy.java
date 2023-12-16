package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.0fy  reason: invalid class name and case insensitive filesystem */
public class C09300fy implements C16230sg, C17350vO, C17360vP {
    public C04850Qx A00;
    public final Paint A01 = new AnonymousClass00u(1);
    public final Path A02;
    public final AnonymousClass01G A03;
    public final C04850Qx A04;
    public final C04850Qx A05;
    public final C09320g0 A06;
    public final String A07;
    public final List A08 = AnonymousClass001.A0s();
    public final boolean A09;

    public void Bm3(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            if (obj instanceof C17340vN) {
                this.A08.add(obj);
            }
        }
    }

    public void Aws(C05560Tz r3, Object obj) {
        C04850Qx r0;
        if (obj == C17150ue.A0R) {
            r0 = this.A04;
        } else if (obj == C17150ue.A0S) {
            r0 = this.A05;
        } else if (obj == C17150ue.A00) {
            C04850Qx r1 = this.A00;
            if (r1 != null) {
                this.A06.A0O.remove(r1);
            }
            if (r3 == null) {
                this.A00 = null;
                return;
            }
            AnonymousClass0BZ r02 = new AnonymousClass0BZ(r3, (Object) null);
            this.A00 = r02;
            C04850Qx.A06(r02, this);
            this.A06.A08(this.A00);
            return;
        } else {
            return;
        }
        r0.A0F(r3);
    }

    public void B2C(Canvas canvas, Matrix matrix, int i) {
        if (!this.A09) {
            Paint paint = this.A01;
            C01520Be r2 = (C01520Be) this.A04;
            paint.setColor(r2.A0G(AnonymousClass0K1.A00(r2), r2.A08()));
            int i2 = 0;
            paint.setAlpha(AnonymousClass001.A0D(255, (int) ((((((float) i) / 255.0f) * ((float) C04850Qx.A03(this.A05))) / 100.0f) * 255.0f), 0));
            AnonymousClass001.A11(paint, this.A00);
            Path path = this.A02;
            path.reset();
            while (true) {
                List list = this.A08;
                if (i2 < list.size()) {
                    AnonymousClass000.A0r(matrix, path, list, i2);
                    i2++;
                } else {
                    canvas.drawPath(path, paint);
                    AnonymousClass0K1.A01();
                    return;
                }
            }
        }
    }

    public void B4p(Matrix matrix, RectF rectF, boolean z) {
        Path path = this.A02;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.A08;
            if (i < list.size()) {
                AnonymousClass000.A0r(matrix, path, list, i);
                i++;
            } else {
                path.computeBounds(rectF, false);
                AnonymousClass000.A0s(rectF, rectF.left, 1.0f);
                return;
            }
        }
    }

    public void BfC() {
        this.A03.invalidateSelf();
    }

    public String getName() {
        return this.A07;
    }

    public C09300fy(AnonymousClass01G r5, C09490gH r6, C09320g0 r7) {
        Path A062 = AnonymousClass002.A06();
        this.A02 = A062;
        this.A06 = r7;
        this.A07 = r6.A03;
        this.A09 = r6.A05;
        this.A03 = r5;
        C01560Bi r1 = r6.A01;
        if (r1 != null) {
            C01620Bo r2 = r6.A02;
            A062.setFillType(r6.A00);
            C01520Be r0 = new C01520Be(r1.A00);
            this.A04 = r0;
            C04850Qx.A05(r0, r7, this);
            C01530Bf r02 = new C01530Bf(r2.A00);
            this.A05 = r02;
            C04850Qx.A05(r02, r7, this);
            return;
        }
        this.A04 = null;
        this.A05 = null;
    }

    public void Bk4(AnonymousClass0WB r1, AnonymousClass0WB r2, List list, int i) {
        C06100Wg.A01(this, r1, r2, list, i);
    }
}
