package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: X.37Q  reason: invalid class name */
public class AnonymousClass37Q implements LocationListener {
    public final /* synthetic */ AnonymousClass33G A00;
    public final /* synthetic */ C29041iB A01;

    public AnonymousClass37Q(AnonymousClass33G r1, C29041iB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CompanionDevice/location/changed ");
            A0o.append(location.getTime());
            AnonymousClass001.A1L(A0o);
            A0o.append(location.getAccuracy());
            C18280x3.A14(A0o);
            C29041iB r3 = this.A01;
            C70343aL.A01(r3.A0O, this, this.A00, location, 14);
            r3.A09.A04(this);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
