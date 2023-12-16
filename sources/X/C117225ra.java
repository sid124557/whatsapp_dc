package X;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import java.util.List;

/* renamed from: X.5ra  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117225ra implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ C184208rQ A02;
    public final /* synthetic */ AnonymousClass5OI A03;

    public final void run() {
        List<Address> list;
        String str;
        AnonymousClass5OI r6 = this.A03;
        double d = this.A00;
        double d2 = this.A01;
        C184208rQ r2 = this.A02;
        Address address = null;
        try {
            list = new Geocoder(r6.A02.A00, C620733j.A02(r6.A03)).getFromLocation(d, d2, 1);
        } catch (Exception e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DirectoryGeocoder/geocodeAddress Exception while trying to fetch address ");
            C18270x1.A17(e.getClass(), A0o);
            list = null;
        }
        r6.A01.removeCallbacks(r6.A05);
        if (list != null && !list.isEmpty()) {
            Address address2 = list.get(0);
            C162457s7.A0H(address2);
            address = address2;
        }
        AnonymousClass6B1 r22 = (AnonymousClass6B1) r2;
        if (r22.A02 != 0) {
            DirectoryGPSLocationManager directoryGPSLocationManager = (DirectoryGPSLocationManager) r22.A01;
            Location location = (Location) r22.A00;
            if (address != null) {
                String str2 = directoryGPSLocationManager.A0I;
                if (TextUtils.isEmpty(str2) || !C162457s7.A0P(str2, "CO")) {
                    str = C106445Za.A00(directoryGPSLocationManager.A0B.A00, address, location.getAccuracy());
                    directoryGPSLocationManager.A06.A0S(new C117715sN(directoryGPSLocationManager, location, str, 20));
                    return;
                }
                float accuracy = location.getAccuracy();
                if (!TextUtils.isEmpty(address.getSubLocality())) {
                    str = address.getSubLocality();
                } else {
                    str = address.getThoroughfare();
                    if (((double) accuracy) <= 200.0d && !TextUtils.isEmpty(str)) {
                        String subThoroughfare = address.getSubThoroughfare();
                        if (!TextUtils.isEmpty(subThoroughfare)) {
                            boolean startsWith = subThoroughfare.trim().startsWith("#");
                            StringBuilder A0l = AnonymousClass000.A0l(str);
                            if (startsWith) {
                                str = AnonymousClass000.A0V(" ", subThoroughfare, A0l);
                            } else {
                                str = AnonymousClass000.A0U(" ", "#", subThoroughfare, A0l);
                            }
                        }
                    } else if (!TextUtils.isEmpty(address.getLocality())) {
                        str = address.getLocality();
                    } else if (!TextUtils.isEmpty(address.getSubAdminArea())) {
                        str = address.getSubAdminArea();
                    }
                }
                directoryGPSLocationManager.A06.A0S(new C117715sN(directoryGPSLocationManager, location, str, 20));
                return;
            }
            str = null;
            directoryGPSLocationManager.A06.A0S(new C117715sN(directoryGPSLocationManager, location, str, 20));
            return;
        }
        String str3 = null;
        if (address != null) {
            str3 = address.getCountryCode();
        }
        AnonymousClass5TO r4 = (AnonymousClass5TO) r22.A01;
        if (r4.A0B.A00().contains(str3)) {
            AnonymousClass3Z6 r0 = (AnonymousClass3Z6) r22.A00;
            LatLng latLng = (LatLng) r0.first;
            double doubleValue = ((Number) r0.second).doubleValue();
            String A022 = r4.A0D.A02(r4.A0A, r4.A02());
            Double valueOf = Double.valueOf(doubleValue);
            Double valueOf2 = Double.valueOf(latLng.A00);
            Double valueOf3 = Double.valueOf(latLng.A01);
            AnonymousClass5ZO r7 = new AnonymousClass5ZO(valueOf, valueOf2, valueOf3, valueOf2, valueOf3, (Double) null, A022, (String) null, "approx_default");
            AnonymousClass4w0 r62 = r4.A05;
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass5NA r5 = r62.A04;
            C18270x1.A0i(AnonymousClass5NA.A00(r5), "default_location_last_updated", currentTimeMillis);
            C18270x1.A0j(AnonymousClass5NA.A00(r5), "default_search_location", C616731u.A01(r62.A00, r62.A03, r7.A06()));
            r4.A00 = r7;
            AnonymousClass5ZI r1 = r4.A0C;
            r1.A09("approx_default_geocoder_success");
            r1.A09("approx_default_location_end");
            r1.A04();
        }
    }

    public /* synthetic */ C117225ra(C184208rQ r1, AnonymousClass5OI r2, double d, double d2) {
        this.A03 = r2;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = r1;
    }
}
