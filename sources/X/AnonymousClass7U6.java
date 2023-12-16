package X;

import android.graphics.PointF;

/* renamed from: X.7U6  reason: invalid class name */
public class AnonymousClass7U6 {
    public long A00;
    public final C151197Tu A01;
    public final C124506Cq A02;
    public final C124506Cq A03 = new C124506Cq();
    public final C124506Cq A04;
    public final C124506Cq A05;

    public final void A00() {
        C124506Cq r3 = this.A02;
        C124506Cq r2 = this.A03;
        C124506Cq r5 = this.A04;
        float f = r2.x - r5.x;
        r3.x = f;
        float f2 = r2.y - r5.y;
        r3.y = f2;
        float f3 = f * 0.05f;
        r3.x = f3;
        float f4 = f2 * 0.05f;
        r3.y = f4;
        C124506Cq r32 = this.A05;
        float f5 = r32.x + f3;
        r32.x = f5;
        float f6 = r32.y + f4;
        r32.y = f6;
        float f7 = f5 * 0.7f;
        r32.x = f7;
        float f8 = f6 * 0.7f;
        r32.y = f8;
        r5.x += f7;
        r5.y += f8;
        long j = (long) (((double) this.A00) + 3.0d);
        this.A00 = j;
        this.A01.A00(r5, j);
    }

    public AnonymousClass7U6(PointF pointF, long j) {
        C124506Cq r2 = new C124506Cq();
        this.A04 = r2;
        C124506Cq r1 = new C124506Cq();
        this.A05 = r1;
        this.A02 = new C124506Cq();
        this.A01 = new C151197Tu(pointF, j);
        this.A00 = j;
        r2.set(pointF);
        r1.set(0.0f, 0.0f);
    }
}
