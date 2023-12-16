package X;

import android.graphics.Point;
import android.graphics.Rect;

/* renamed from: X.7k5  reason: invalid class name and case insensitive filesystem */
public class C158507k5 {
    public static final C158507k5 A03 = new C158507k5((Point) null, (Rect) null, 3);
    public static final C158507k5 A04 = new C158507k5((Point) null, (Rect) null, 0);
    public final int A00;
    public final Point A01;
    public final Rect A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C158507k5 r5 = (C158507k5) obj;
            if (this.A00 != r5.A00 || !AnonymousClass75J.A00(this.A02, r5.A02) || !AnonymousClass75J.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C158507k5(Point point, Rect rect, int i) {
        this.A00 = i;
        this.A02 = rect;
        this.A01 = point;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, this.A00);
        A1X[1] = this.A02;
        return C18310x6.A08(this.A01, A1X, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FlexState{separationType=");
        A0o.append(this.A00);
        A0o.append(", bounds=");
        A0o.append(this.A02);
        A0o.append(", parentDimensions=");
        return AnonymousClass000.A0Q(this.A01, A0o);
    }
}
