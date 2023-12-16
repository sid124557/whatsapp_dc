package X;

import android.graphics.Point;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.5Ww  reason: invalid class name and case insensitive filesystem */
public class C105905Ww {
    public C106725a3 A00;
    public AnonymousClass5RL A01;

    public Point A00(LatLng latLng) {
        AnonymousClass5RL r0 = this.A01;
        if (r0 != null) {
            return r0.A00(latLng);
        }
        return this.A00.A04(C108975ds.A02(latLng));
    }

    public C105905Ww(AnonymousClass5RL r4) {
        this.A01 = r4;
        r4.A00(new LatLng(0.0d, 0.0d));
    }

    public C105905Ww(C106725a3 r4) {
        this.A00 = r4;
        r4.A04(new C108975ds(0.0d, 0.0d));
    }
}
