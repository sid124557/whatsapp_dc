package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseIntArray;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;

/* renamed from: X.37R  reason: invalid class name */
public class AnonymousClass37R implements LocationListener {
    public long A00;
    public Location A01;
    public Location A02;
    public PowerManager.WakeLock A03;
    public final SparseIntArray A04 = new SparseIntArray();
    public final C159027ky A05;
    public final C29401il A06;
    public final C44882Xv A07;
    public final C620633i A08;
    public final C56612sH A09;
    public final AnonymousClass33p A0A;
    public final C179408j6 A0B;

    public final void A00() {
        long j = this.A00;
        if (j != 0) {
            int A082 = (int) C18280x3.A08(j, j % 3600000);
            SparseIntArray sparseIntArray = this.A04;
            sparseIntArray.put(A082, sparseIntArray.get(A082, 0) + ((int) AnonymousClass0x9.A05(j)));
            StringBuilder A0o = AnonymousClass001.A0o();
            for (int i = 0; i < sparseIntArray.size(); i++) {
                int keyAt = sparseIntArray.keyAt(i);
                int i2 = sparseIntArray.get(keyAt);
                if (i != 0) {
                    A0o.append(";");
                }
                A0o.append(keyAt);
                C18320x8.A1K(A0o);
                A0o.append(i2);
            }
            AnonymousClass33p r0 = this.A0A;
            C18270x1.A0j(C18270x1.A03(r0), "location_shared_duration", A0o.toString());
            this.A00 = 0;
        }
    }

    public final void A01(Location location) {
        String str;
        this.A02 = location;
        LocationSharingService locationSharingService = (LocationSharingService) this.A0B;
        if (locationSharingService.A0H) {
            locationSharingService.A08.A0P(location);
        }
        long A0H = locationSharingService.A05.A0H();
        long j = locationSharingService.A00;
        if (A0H > j) {
            str = AnonymousClass000.A0Z("LocationSharingService/onLocationUpdate/stop this service since passed maxEndTime; maxEndTime=", AnonymousClass001.A0o(), j);
        } else if (!locationSharingService.A08.A0b()) {
            str = "LocationSharingService/onLocationUpdate/stop this service, no longer sharing live location";
        } else if (locationSharingService.A0G) {
            locationSharingService.A08.A0P(location);
            if (!locationSharingService.A08.A0c()) {
                locationSharingService.A08.A0J();
                return;
            }
            return;
        } else {
            return;
        }
        Log.i(str);
        locationSharingService.A0G = false;
        locationSharingService.A05();
    }

    public void onLocationChanged(Location location) {
        Log.i("MyLocationUpdater/onLocationChanged");
        if (C622534h.A01(location, this.A02)) {
            A01(location);
            this.A01 = location;
            return;
        }
        if (location.getAccuracy() < 80.0f) {
            this.A01 = location;
        }
        if (this.A01 != null && this.A02.getTime() + 40000 < this.A01.getTime()) {
            A01(this.A01);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public AnonymousClass37R(C159027ky r2, C29401il r3, C44882Xv r4, C620633i r5, C56612sH r6, AnonymousClass33p r7, C179408j6 r8) {
        this.A09 = r6;
        this.A08 = r5;
        this.A0A = r7;
        this.A06 = r3;
        this.A05 = r2;
        this.A07 = r4;
        this.A0B = r8;
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
