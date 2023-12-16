package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.0Bd  reason: invalid class name and case insensitive filesystem */
public class C01510Bd extends AnonymousClass0BW {
    public C01710Bx A00;
    public final PathMeasure A01 = new PathMeasure();
    public final PointF A02 = new PointF();
    public final float[] A03 = new float[2];

    public /* bridge */ /* synthetic */ Object A0B(C06230Wt r8, float f) {
        C01710Bx r6 = (C01710Bx) r8;
        Path path = r6.A00;
        if (path == null) {
            return r8.A0F;
        }
        C05560Tz r3 = this.A03;
        if (r3 != null) {
            r6.A08.floatValue();
            Object obj = r6.A0F;
            Object obj2 = r6.A09;
            A09();
            AnonymousClass0LM r0 = r3.A02;
            r0.A01 = obj;
            r0.A00 = obj2;
            Object A002 = r3.A00(r0);
            if (A002 != null) {
                return A002;
            }
        }
        if (this.A00 != r6) {
            this.A01.setPath(path, false);
            this.A00 = r6;
        }
        PathMeasure pathMeasure = this.A01;
        float[] fArr = this.A03;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), fArr, (float[]) null);
        PointF pointF = this.A02;
        pointF.set(fArr[0], fArr[1]);
        return pointF;
    }

    public C01510Bd(List list) {
        super(list);
    }
}
