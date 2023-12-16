package X;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.74o  reason: invalid class name and case insensitive filesystem */
public class C1451974o {
    public static float A00(LatLng latLng, LatLng latLng2) {
        Location location = new Location("origin");
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
        Location location2 = new Location("destination");
        location2.setLatitude(latLng2.A00);
        location2.setLongitude(latLng2.A01);
        return location.distanceTo(location2);
    }
}
