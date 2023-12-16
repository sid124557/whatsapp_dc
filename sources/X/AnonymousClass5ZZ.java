package X;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5ZZ  reason: invalid class name */
public class AnonymousClass5ZZ {
    public static float A01(LatLng latLng, LatLng latLng2) {
        Location location = new Location("origin");
        C86624Kv.A0o(location, latLng);
        Location location2 = new Location("destination");
        C86624Kv.A0o(location2, latLng2);
        return location.distanceTo(location2);
    }

    public static float A00(C108975ds r1, C108975ds r2) {
        return A01(C108975ds.A04(r1), C108975ds.A04(r2));
    }

    public static String A02(Context context, int i) {
        int i2 = R.string.f11nameremoved;
        if (i != 0) {
            i2 = R.string.f11nameremoved;
            if (i != 1) {
                i2 = R.string.f11nameremoved;
                if (i != 2) {
                    return null;
                }
            }
        }
        return context.getString(i2);
    }

    public static void A03(AnonymousClass5ZO r7, List list) {
        if (!r7.A07()) {
            Double d = r7.A04;
            C626936e.A06(d);
            double doubleValue = d.doubleValue();
            Double d2 = r7.A05;
            C626936e.A06(d2);
            double doubleValue2 = d2.doubleValue();
            Location location = new Location("");
            location.setLatitude(doubleValue);
            location.setLongitude(doubleValue2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass4L0.A0K(it).AyI(location);
            }
        }
    }
}
