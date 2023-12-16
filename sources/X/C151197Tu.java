package X;

import android.graphics.PointF;

/* renamed from: X.7Tu  reason: invalid class name and case insensitive filesystem */
public class C151197Tu {
    public C124506Cq A00;
    public C124506Cq A01;
    public final long A02;
    public final C157647ie A03;
    public final C124506Cq A04;

    public void A00(PointF pointF, long j) {
        if (j >= this.A02) {
            C124506Cq r5 = this.A00;
            C124506Cq r4 = this.A01;
            if (r5 == r4) {
                this.A00 = new C124506Cq(pointF);
                return;
            }
            C124506Cq r3 = this.A04;
            float f = pointF.x - r4.x;
            r3.x = f;
            float f2 = pointF.y - r4.y;
            r3.y = f2;
            r3.x = f * 0.5f;
            r3.y = f2 * 0.5f;
            this.A03.A00(r5, r3);
            this.A01.set(this.A00);
            this.A00.set(pointF);
            return;
        }
        throw AnonymousClass001.A0e("events must deliver in order");
    }

    public C151197Tu(PointF pointF, long j) {
        C157647ie r2 = new C157647ie();
        this.A03 = r2;
        C124506Cq r1 = new C124506Cq();
        this.A04 = r1;
        C124506Cq r0 = new C124506Cq(pointF);
        this.A00 = r0;
        this.A01 = r0;
        this.A02 = j;
        r2.A00(r0, r1);
    }
}
