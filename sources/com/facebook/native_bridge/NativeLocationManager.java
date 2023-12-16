package com.facebook.native_bridge;

import X.AnonymousClass7S0;
import X.AnonymousClass7V7;
import X.AnonymousClass82P;
import X.C156187gB;
import X.C157597iZ;
import X.C177828gW;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public class NativeLocationManager {
    public static final double[] EMPTY = {0.0d, 0.0d};
    public static final String LOCATION_CALLER_CONTEXT = "NativeLocationManager";
    public C157597iZ mFbLocationCache;
    public final HybridData mHybridData = initHybrid();
    public final LocationManager mLocationManager;

    private synchronized C157597iZ getFbLocationCache(C156187gB r2, LocationManager locationManager, AnonymousClass7S0 r4, C177828gW r5) {
        C157597iZ r0;
        r0 = this.mFbLocationCache;
        if (r0 == null) {
            r0 = new C157597iZ(locationManager, r2, r5, r4);
            this.mFbLocationCache = r0;
        }
        return r0;
    }

    public static boolean hasPermission(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    private native HybridData initHybrid();

    public enum LocationDataIndices {
        LONGITUDE(0),
        LATITUDE(1);
        
        public final int index;

        /* access modifiers changed from: public */
        LocationDataIndices(int i) {
            this.index = i;
        }
    }

    static {
        SoLoader.A06("native_bridge");
    }

    public double[] getCurrentPosition() {
        AnonymousClass7V7 A00;
        C157597iZ r0 = this.mFbLocationCache;
        if (r0 == null || (A00 = r0.A00()) == null) {
            return EMPTY;
        }
        return convertToDoubleArray(A00.A00);
    }

    public NativeLocationManager(Context context) {
        LocationManager locationManager;
        if (hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        } else {
            locationManager = null;
        }
        this.mLocationManager = locationManager;
        this.mFbLocationCache = null;
        if (locationManager != null) {
            this.mFbLocationCache = getFbLocationCache(new C156187gB(context, locationManager), locationManager, new AnonymousClass7S0(AnonymousClass82P.A00, RealtimeSinceBootClock.A00), (C177828gW) null);
        }
    }

    private double[] convertToDoubleArray(Location location) {
        double[] dArr = new double[LocationDataIndices.values().length];
        dArr[LocationDataIndices.LONGITUDE.index] = location.getLongitude();
        dArr[LocationDataIndices.LATITUDE.index] = location.getLatitude();
        return dArr;
    }
}
