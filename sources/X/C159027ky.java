package X;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.7ky  reason: invalid class name and case insensitive filesystem */
public class C159027ky {
    public LocationManager A00;
    public C159087l6 A01;
    public Map A02;
    public final C29171iO A03;
    public final C55682qk A04;
    public final C620633i A05;
    public final C54292oU A06;
    public final AnonymousClass5ZR A07;
    public volatile boolean A08;

    public synchronized void A03() {
        if (this.A00 == null) {
            Context context = this.A06.A00;
            C159087l6 r0 = null;
            if (AnonymousClass000.A1T(C159787mS.A00(context))) {
                AnonymousClass898 r2 = new AnonymousClass898(this);
                this.A02 = AnonymousClass001.A0t();
                AnonymousClass7XI r1 = new AnonymousClass7XI(context);
                r1.A01(AnonymousClass79F.A02);
                r1.A06.add(r2);
                r1.A07.add(r2);
                r0 = r1.A00();
            } else {
                this.A02 = null;
            }
            this.A01 = r0;
            this.A00 = this.A05.A0F();
        }
    }

    public static LocationRequest A00(AnonymousClass8B2 r9) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.A08 = true;
        int i = r9.A01;
        int i2 = 100;
        if ((i & 1) == 0) {
            i2 = 105;
            if ((i & 2) != 0) {
                i2 = 102;
            }
        }
        locationRequest.A01 = i2;
        long j = r9.A03;
        if (j >= 0) {
            locationRequest.A03 = j;
            if (!locationRequest.A07) {
                locationRequest.A04 = (long) (((double) j) / 6.0d);
            }
            long j2 = r9.A02;
            if (j2 >= 0) {
                locationRequest.A07 = true;
                locationRequest.A04 = j2;
                float f = r9.A00;
                if (f >= 0.0f) {
                    locationRequest.A00 = f;
                    return locationRequest;
                }
                StringBuilder A0Y = AnonymousClass6CA.A0Y(37);
                A0Y.append("invalid displacement: ");
                A0Y.append(f);
                throw C18310x6.A0d(A0Y);
            }
            throw AnonymousClass6C7.A0V("invalid interval: ", AnonymousClass6CA.A0Y(38), j2);
        }
        throw AnonymousClass6C7.A0V("invalid interval: ", AnonymousClass6CA.A0Y(38), j);
    }

    public Location A02(String str, int i) {
        LocationManager locationManager;
        String str2;
        AnonymousClass5ZR r3 = this.A07;
        if (r3.A05()) {
            C18260x0.A0s("FusedLocationManager/getLocation:", str, AnonymousClass001.A0o());
            A03();
            A06(str);
            C159087l6 r0 = this.A01;
            if (r0 != null && r0.A04()) {
                return AnonymousClass79F.A03.B92(this.A01);
            }
            if (this.A00 != null) {
                if (i == 1) {
                    if (r3.A02("android.permission.ACCESS_FINE_LOCATION") == 0) {
                        locationManager = this.A00;
                        str2 = "gps";
                    }
                } else if (r3.A02("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    locationManager = this.A00;
                    str2 = "network";
                }
                return locationManager.getLastKnownLocation(str2);
            }
            return null;
        }
        C18260x0.A0t("FusedLocationManager/getLastKnownLocation/do not have location permissions context:", str, AnonymousClass001.A0o());
        return null;
    }

    public void A05(LocationListener locationListener, String str, float f, int i, long j, long j2) {
        AnonymousClass5ZR r3 = this.A07;
        if (r3.A05()) {
            A03();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("FusedLocationManager/requestUpdates/");
            String str2 = str;
            A0o.append(str2);
            LocationListener locationListener2 = locationListener;
            C18260x0.A1P(A0o, " ", locationListener2);
            A06(str2);
            float f2 = f;
            int i2 = i;
            long j3 = j;
            if (this.A01 != null) {
                if (this.A02.isEmpty()) {
                    this.A01.A05();
                }
                AnonymousClass8B2 r4 = new AnonymousClass8B2(locationListener2, f2, i2, j3, j2);
                this.A02.put(locationListener2, r4);
                if (this.A01.A04()) {
                    LocationRequest A002 = A00(r4);
                    C159087l6 r2 = this.A01;
                    C162177rO.A03(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    r2.A01(new C128616Wu(r2, r4, A002));
                    return;
                }
                return;
            }
            if ((i & 1) != 0) {
                try {
                    if (this.A00 == null || r3.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have fine location permission");
                    } else {
                        this.A00.requestLocationUpdates("gps", j3, f2, locationListener2);
                    }
                } catch (RuntimeException e) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e);
                }
            }
            if ((i & 2) != 0) {
                try {
                    if (this.A00 == null || r3.A02("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have coarse location permission");
                    } else {
                        this.A00.requestLocationUpdates("network", j3, f2, locationListener2);
                    }
                } catch (RuntimeException e2) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e2);
                }
            }
        }
    }

    public final void A06(String str) {
        if (Build.VERSION.SDK_INT == 29 && !this.A03.A00 && !this.A08 && !"group-chat-live-location-ui-oncreate".equals(str)) {
            this.A04.A0A("FusedLocationManager/logIfLocationAccessedInBackground", true, "background-location");
        }
    }

    public C159027ky(C29171iO r1, C55682qk r2, C620633i r3, C54292oU r4, AnonymousClass5ZR r5) {
        this.A06 = r4;
        this.A04 = r2;
        this.A07 = r5;
        this.A05 = r3;
        this.A03 = r1;
    }

    public Location A01(String str) {
        A03();
        Location A022 = A02(str, 1);
        Location A023 = A02(str, 2);
        if (A022 == null || (A023 != null && A022.getTime() <= A023.getTime() - 20000)) {
            A022 = A023;
            if (A023 == null) {
                return A022;
            }
        }
        if (A022.getTime() + 7200000 < System.currentTimeMillis()) {
            return null;
        }
        return A022;
    }

    public void A04(LocationListener locationListener) {
        C18260x0.A1P(AnonymousClass001.A0o(), "FusedLocationManager/removeUpdates/ ", locationListener);
        A03();
        if (this.A01 != null) {
            AnonymousClass8B2 r2 = (AnonymousClass8B2) this.A02.remove(locationListener);
            if (r2 != null) {
                if (this.A01.A04()) {
                    C159087l6 r1 = this.A01;
                    r1.A01(new C128606Wt(r1, r2));
                }
                if (this.A02.isEmpty()) {
                    this.A01.A02();
                }
            }
        } else if (this.A00 != null && this.A07.A05()) {
            this.A00.removeUpdates(locationListener);
        }
    }

    public boolean A07() {
        A03();
        LocationManager locationManager = this.A00;
        if (locationManager == null) {
            return false;
        }
        if (locationManager.isProviderEnabled("gps") || this.A00.isProviderEnabled("network")) {
            return true;
        }
        return false;
    }
}
