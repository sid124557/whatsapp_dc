package X;

import android.location.Location;
import com.google.android.gms.location.LocationResult;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;

/* renamed from: X.89I  reason: invalid class name */
public final class AnonymousClass89I implements C180858lk {
    public final /* synthetic */ LocationResult A00;

    public AnonymousClass89I(LocationResult locationResult) {
        this.A00 = locationResult;
    }

    public final /* bridge */ /* synthetic */ void BLk(Object obj) {
        C155807fX r4 = (C155807fX) obj;
        LocationResult locationResult = this.A00;
        C162457s7.A0J(locationResult, 0);
        for (Location location : locationResult.A00) {
            if (location != null) {
                DirectoryGPSLocationManager directoryGPSLocationManager = r4.A00;
                directoryGPSLocationManager.A04(location);
                directoryGPSLocationManager.A03.removeCallbacks(directoryGPSLocationManager.A0G);
                return;
            }
        }
    }
}
