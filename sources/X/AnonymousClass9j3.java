package X;

import android.graphics.Point;

/* renamed from: X.9j3  reason: invalid class name */
public class AnonymousClass9j3 implements Runnable {
    public final /* synthetic */ C192379Jm A00;
    public final /* synthetic */ C194549Tj A01;
    public final /* synthetic */ float[] A02;

    public AnonymousClass9j3(C192379Jm r1, C194549Tj r2, float[] fArr) {
        this.A01 = r2;
        this.A02 = fArr;
        this.A00 = r1;
    }

    public void run() {
        C202329lq r5 = this.A01.A02;
        if (r5 != null) {
            float[] fArr = this.A02;
            C192379Jm r3 = this.A00;
            Point point = null;
            if (fArr != null) {
                point = new Point((int) fArr[0], (int) fArr[1]);
            }
            r5.BTf(point, r3);
        }
    }
}
