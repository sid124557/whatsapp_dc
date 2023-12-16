package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.0Tb  reason: invalid class name and case insensitive filesystem */
public class C05370Tb {
    public PointF A00;
    public boolean A01;
    public final List A02;

    public C05370Tb(PointF pointF, List list, boolean z) {
        this.A00 = pointF;
        this.A01 = z;
        this.A02 = AnonymousClass002.A0J(list);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ShapeData{numCurves=");
        A0o.append(this.A02.size());
        A0o.append("closed=");
        A0o.append(this.A01);
        return AnonymousClass000.A0d(A0o);
    }

    public C05370Tb() {
        this.A02 = AnonymousClass001.A0s();
    }
}
