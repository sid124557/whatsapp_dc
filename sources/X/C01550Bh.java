package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.0Bh  reason: invalid class name and case insensitive filesystem */
public class C01550Bh extends AnonymousClass0BW {
    public final PointF A00 = new PointF();

    public PointF A0G(C06230Wt r7, float f, float f2) {
        Object obj;
        PointF pointF;
        Object obj2 = r7.A0F;
        if (obj2 == null || (obj = r7.A09) == null) {
            throw AnonymousClass001.A0e("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        C05560Tz r0 = this.A03;
        if (r0 != null && (pointF = (PointF) AnonymousClass0BW.A01(this, r7, r0, pointF2, pointF3)) != null) {
            return pointF;
        }
        PointF pointF4 = this.A00;
        pointF4.set(AnonymousClass001.A00(pointF3.x, pointF2.x, f), AnonymousClass001.A00(pointF3.y, pointF2.y, f2));
        return pointF4;
    }

    public C01550Bh(List list) {
        super(list);
    }

    public /* bridge */ /* synthetic */ Object A0B(C06230Wt r2, float f) {
        return A0G(r2, f, f);
    }

    public /* bridge */ /* synthetic */ Object A0C(C06230Wt r2, float f, float f2, float f3) {
        return A0G(r2, f2, f3);
    }
}
