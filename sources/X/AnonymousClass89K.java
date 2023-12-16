package X;

import android.location.Location;
import android.location.LocationListener;

/* renamed from: X.89K  reason: invalid class name */
public final class AnonymousClass89K implements C180858lk {
    public final /* synthetic */ Location A00;

    public AnonymousClass89K(Location location) {
        this.A00 = location;
    }

    public final /* bridge */ /* synthetic */ void BLk(Object obj) {
        Location location = this.A00;
        LocationListener locationListener = (LocationListener) ((AnonymousClass8B2) ((C178668hu) obj)).A04.get();
        if (locationListener != null) {
            locationListener.onLocationChanged(location);
        }
    }
}
