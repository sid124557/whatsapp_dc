package X;

import android.location.Location;
import android.location.LocationListener;
import java.util.List;

/* renamed from: X.829  reason: invalid class name */
public class AnonymousClass829 implements C185258tL, LocationListener {
    public C157627ic A00 = null;
    public final C159027ky A01;

    public void Bif(C157627ic r10, String str) {
        this.A00 = r10;
        this.A01.A05(this, str, 0.0f, 3, 5000, 1000);
    }

    public C185258tL Azl() {
        return new AnonymousClass829(this.A01);
    }

    public Location B6T() {
        return this.A01.A01("FbMaps");
    }

    public void BrO() {
        this.A01.A04(this);
    }

    public void onFlushComplete(int i) {
    }

    public void onLocationChanged(List list) {
        if (this.A00 != null && list.size() > 1) {
            C157627ic r2 = this.A00;
            Location location = (Location) C18290x4.A0k(list);
            if (C157627ic.A00(location, r2.A00)) {
                r2.A00 = location;
                AnonymousClass7AA r0 = r2.A01;
                if (r0 != null) {
                    r0.A00.A0R.invalidate();
                }
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public AnonymousClass829(C159027ky r2) {
        this.A01 = r2;
    }

    public void onLocationChanged(Location location) {
        C157627ic r1 = this.A00;
        if (r1 != null && C157627ic.A00(location, r1.A00)) {
            r1.A00 = location;
            AnonymousClass7AA r0 = r1.A01;
            if (r0 != null) {
                r0.A00.A0R.invalidate();
            }
        }
    }
}
