package X;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.5Q9  reason: invalid class name */
public final class AnonymousClass5Q9 {
    public double A00 = Double.POSITIVE_INFINITY;
    public double A01 = Double.NEGATIVE_INFINITY;
    public double A02 = Double.NaN;
    public double A03 = Double.NaN;

    public LatLngBounds A00() {
        C162177rO.A04("no included points", !Double.isNaN(this.A02));
        return new LatLngBounds(AnonymousClass4L0.A0H(this.A00, this.A02), AnonymousClass4L0.A0H(this.A01, this.A03));
    }

    public void A01(LatLng latLng) {
        C162177rO.A03(latLng, "point must not be null");
        double d = this.A00;
        double d2 = latLng.A00;
        this.A00 = Math.min(d, d2);
        this.A01 = Math.max(this.A01, d2);
        double d3 = latLng.A01;
        double d4 = this.A02;
        if (Double.isNaN(d4)) {
            this.A02 = d3;
        } else {
            double d5 = this.A03;
            int i = (d4 > d3 ? 1 : (d4 == d3 ? 0 : -1));
            if (d4 <= d5) {
                if (i <= 0 && d3 <= d5) {
                    return;
                }
            } else if (i <= 0 || d3 <= d5) {
                return;
            }
            if (((d4 - d3) + 360.0d) % 360.0d < ((d3 - d5) + 360.0d) % 360.0d) {
                this.A02 = d3;
                return;
            }
        }
        this.A03 = d3;
    }
}
