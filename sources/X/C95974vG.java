package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.json.JSONObject;

/* renamed from: X.4vG  reason: invalid class name and case insensitive filesystem */
public class C95974vG extends C105425Uw {
    public static final C149907Oj[] A07 = {new C149907Oj(68.0f, 47.0f, 309.0f, 266.0f, 164.0f, 156.0f), new C149907Oj(246.0f, 17.0f, 419.0f, 142.0f, 196.0f, 124.0f), new C149907Oj(390.0f, 0.0f, 546.0f, 155.0f, 195.0f, 128.0f), new C149907Oj(507.0f, 1.0f, 686.0f, 179.0f, 208.0f, 146.0f), new C149907Oj(575.0f, 64.0f, 750.0f, 235.0f, 284.0f, 122.0f), new C149907Oj(530.0f, 141.0f, 769.0f, 357.0f, 324.0f, 118.0f), new C149907Oj(459.0f, 261.0f, 664.0f, 449.0f, 300.0f, 180.0f), new C149907Oj(275.0f, 316.0f, 510.0f, 512.0f, 0.0f, 164.0f), new C149907Oj(97.0f, 286.0f, 346.0f, 482.0f, 56.0f, 100.0f), new C149907Oj(17.0f, 279.0f, 174.0f, 419.0f, 67.0f, 152.0f), new C149907Oj(0.0f, 171.0f, 157.0f, 311.0f, 91.0f, 170.0f)};
    public final Matrix A00;
    public final Paint A01;
    public final Path A02;
    public final Path A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;

    public void A0G(float f) {
        super.A0G((f * 3.0f) / 5.0f);
    }

    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        RectF rectF2 = this.A05;
        if (f5 / f6 < rectF2.width() / rectF2.height()) {
            f6 = (rectF2.height() * f5) / rectF2.width();
        } else {
            f5 = (rectF2.width() * f6) / rectF2.height();
        }
        float f7 = (f + f3) / 2.0f;
        float f8 = (f2 + f4) / 2.0f;
        float f9 = f5 / 2.0f;
        float f10 = f6 / 2.0f;
        super.A0M(rectF, f7 - f9, f8 - f10, f7 + f9, f8 + f10);
    }

    public final void A0X(Canvas canvas, float f, float f2) {
        RectF rectF = this.A02;
        float width = rectF.width() / this.A05.width();
        float f3 = 60.0f * width * f2;
        float f4 = width * 30.0f * f2;
        float centerX = rectF.centerX() + (((float) ((Math.cos(Math.toRadians((double) this.A00)) * ((double) rectF.width())) / 2.0d)) * f);
        float centerY = rectF.centerY() + (f * ((float) ((Math.sin(Math.toRadians((double) this.A00)) * ((double) rectF.height())) / 2.0d)));
        RectF rectF2 = this.A06;
        rectF2.set(centerX - f3, centerY - f4, centerX + f3, centerY + f4);
        canvas.drawOval(rectF2, this.A01);
        canvas.drawOval(rectF2, this.A01);
    }

    public C95974vG(JSONObject jSONObject) {
        this();
        super.A0O(jSONObject);
    }

    public C95974vG() {
        this.A01 = C86664Kz.A0a(1);
        this.A00 = AnonymousClass002.A05();
        RectF A072 = AnonymousClass002.A07();
        this.A05 = A072;
        this.A04 = AnonymousClass002.A06();
        this.A06 = AnonymousClass002.A07();
        Path A062 = AnonymousClass002.A06();
        C149907Oj[] r10 = A07;
        for (C149907Oj r8 : r10) {
            A062.addArc(AnonymousClass4L0.A09(r8.A01, r8.A05, r8.A02, r8.A00), r8.A03, r8.A04);
        }
        this.A03 = A062;
        Path A063 = AnonymousClass002.A06();
        for (C149907Oj r0 : r10) {
            A063.addOval(AnonymousClass4L0.A09(r0.A01, r0.A05, r0.A02, r0.A00), Path.Direction.CW);
        }
        A063.addRect(120.0f, 80.0f, 580.0f, 430.0f, Path.Direction.CW);
        this.A02 = A063;
        A062.setFillType(Path.FillType.WINDING);
        A062.computeBounds(A072, true);
        this.A00 = 120.0f;
    }
}
