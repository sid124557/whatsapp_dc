package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.9Sn  reason: invalid class name and case insensitive filesystem */
public class C194349Sn {
    public int A00;
    public Camera A01;
    public C202329lq A02;
    public C192959Mk A03;
    public boolean A04;
    public final AnonymousClass9T8 A05;
    public final C194959Vh A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public final void A00(Point point, C192379Jm r7, C202329lq r8) {
        if (r8 != null) {
            C192959Mk r1 = this.A03;
            if (!(point == null || r1 == null)) {
                float[] fArr = {(float) point.x, (float) point.y};
                Matrix matrix = r1.A00;
                Matrix matrix2 = new Matrix();
                matrix.invert(matrix2);
                matrix2.mapPoints(fArr);
                point.set((int) fArr[0], (int) fArr[1]);
            }
            AnonymousClass9WU.A00(new AnonymousClass9j2(point, r7, r8));
        }
    }

    public C194349Sn(AnonymousClass9T8 r1, C194959Vh r2) {
        this.A06 = r2;
        this.A05 = r1;
    }
}
