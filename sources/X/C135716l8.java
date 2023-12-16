package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6l8  reason: invalid class name and case insensitive filesystem */
public class C135716l8 extends C106115Xr {
    public float A00;
    public int A01 = 0;
    public final float A02;
    public final long A03;
    public final long A04;
    public final C157647ie A05;
    public final AnonymousClass7U6 A06;
    public final List A07 = AnonymousClass001.A0s();
    public final float[] A08 = new float[4];

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C135716l8(android.graphics.Bitmap r10, android.graphics.Paint r11, android.graphics.PointF r12, android.graphics.PointF r13, float r14, float r15, int r16, long r17) {
        /*
            r9 = this;
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r16
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r9.A07 = r0
            r0 = 4
            float[] r0 = new float[r0]
            r9.A08 = r0
            r0 = 0
            r9.A01 = r0
            r0 = r17
            r9.A04 = r0
            X.7U6 r2 = new X.7U6
            r2.<init>(r12, r0)
            r9.A06 = r2
            X.7Tu r2 = r2.A01
            X.7ie r2 = r2.A03
            r9.A05 = r2
            r9.A02 = r15
            r9.A03 = r0
            float r2 = r9.A06(r8)
            r9.A00 = r2
            r9.A04(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135716l8.<init>(android.graphics.Bitmap, android.graphics.Paint, android.graphics.PointF, android.graphics.PointF, float, float, int, long):void");
    }

    public void A02(Canvas canvas) {
        A07(canvas, 0);
    }

    public void A03(PointF pointF, long j) {
        long max = Math.max(j, this.A03 + 1);
        this.A03.add(pointF);
        AnonymousClass6C8.A1G(this.A07, max - this.A04);
        AnonymousClass7U6 r5 = this.A06;
        C124506Cq r8 = r5.A03;
        r8.set(pointF);
        while (((double) r5.A00) + 3.0d < ((double) max)) {
            r5.A00();
        }
        C124506Cq r6 = r5.A04;
        float A002 = AnonymousClass6C8.A00(r6.y, r8.y, r6.x - r8.x);
        float f = A002;
        C124506Cq r3 = new C124506Cq();
        while (f > 0.0f && A002 > 0.0f) {
            r3.set(r6);
            r5.A00();
            A002 = AnonymousClass6C8.A00(r6.y, r3.y, r6.x - r3.x);
            f -= A002;
        }
        C151197Tu r4 = r5.A01;
        long j2 = r4.A02;
        C124506Cq r1 = r4.A00;
        if (r1 != r4.A01) {
            r4.A00(r1, j2);
            r4.A01 = r4.A00;
        }
        Canvas canvas = this.A00;
        if (canvas != null) {
            A07(canvas, this.A01);
        }
    }

    public void A04(PointF pointF, long j) {
        if (this.A03 <= j) {
            this.A03.add(pointF);
            AnonymousClass6C8.A1G(this.A07, j - this.A04);
            AnonymousClass7U6 r5 = this.A06;
            r5.A03.set(pointF);
            while (((double) r5.A00) + 3.0d < ((double) j)) {
                r5.A00();
            }
            Canvas canvas = this.A00;
            if (canvas != null) {
                A07(canvas, this.A01);
            }
        }
    }

    public final float A06(int i) {
        float f = (this.A01 * 0.03f) - 0.125f;
        if (f < 0.125f) {
            f = 0.125f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        return (f * this.A02) / ((float) i);
    }

    public final void A07(Canvas canvas, int i) {
        float A002;
        if (canvas != null) {
            C157647ie r4 = this.A05;
            float f = this.A00;
            r4.A03 = f;
            int floor = ((int) Math.floor((double) (r4.A02 / f))) + 1;
            while (true) {
                this.A01 = i;
                if (i < floor) {
                    float[] fArr = this.A08;
                    float f2 = ((float) i) * r4.A03;
                    if (f2 < r4.A01 || f2 > r4.A00) {
                        Map.Entry floorEntry = r4.A06.floorEntry(Float.valueOf(f2));
                        if (floorEntry == null) {
                            r4.A04 = null;
                            r4.A01 = 1.0f;
                            A002 = 0.0f;
                        } else {
                            r4.A04 = (C158177jY) floorEntry.getValue();
                            float A052 = AnonymousClass001.A05(floorEntry.getKey());
                            r4.A01 = A052;
                            A002 = A052 + r4.A04.A00();
                        }
                        r4.A00 = A002;
                    }
                    C158177jY r7 = r4.A04;
                    float f3 = 1.0f;
                    if (r7 != null) {
                        float A003 = r7.A00();
                        if (A003 != 0.0f) {
                            f3 = (f2 - r4.A01) / A003;
                        }
                    } else {
                        r7 = r4.A05;
                    }
                    r7.A01(fArr, f3);
                    PointF pointF = new PointF(fArr[2], fArr[3]);
                    float f4 = this.A01;
                    float f5 = pointF.x;
                    float f6 = pointF.y;
                    double sqrt = Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
                    float f7 = C1458577o.A00;
                    float f8 = 0.0f;
                    float sqrt2 = (((float) Math.sqrt(sqrt)) - 0.0f) / ((0.4f * f4) - 0.0f);
                    if (sqrt2 >= 0.0f) {
                        f8 = sqrt2;
                        if (sqrt2 > 1.0f) {
                            f8 = 1.0f;
                        }
                    }
                    int i2 = (int) (f4 * (1.0f - (f7 * ((f8 * f8) * (3.0f - (f8 * 2.0f))))));
                    float f9 = fArr[0];
                    float f10 = fArr[1];
                    Paint paint = this.A02;
                    paint.setStrokeWidth((float) i2);
                    canvas.drawPoint(f9, f10, paint);
                    i = this.A01 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public void A01(Bitmap bitmap, PointF pointF, int i) {
        super.A01(bitmap, pointF, i);
        this.A00 = A06(i);
    }

    public void A05(JSONObject jSONObject) {
        super.A05(jSONObject);
        JSONArray A1F = AnonymousClass0x9.A1F();
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            AnonymousClass0x7.A1L(it, A1F);
        }
        jSONObject.put("times", A1F);
    }
}
