package com.whatsapp.businessdirectory.util;

import X.AnonymousClass08M;
import X.AnonymousClass0GH;
import X.AnonymousClass4FS;
import X.C15110qn;
import X.C159027ky;
import X.C54292oU;
import X.C620733j;
import X.C69263Wi;
import X.C71453c8;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;

public class LocationUpdateListener implements LocationListener, C15110qn {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final C159027ky A01;
    public final C69263Wi A02;
    public final C54292oU A03;
    public final C620733j A04;
    public final AnonymousClass4FS A05;

    @OnLifecycleEvent(AnonymousClass0GH.ON_RESUME)
    private void connectListener() {
        this.A01.A05(this, "user-location-picker", 800.0f, 3, 1000, 1000);
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_PAUSE)
    private void disconnectListener() {
        this.A01.A04(this);
    }

    public void onLocationChanged(Location location) {
        Location location2 = location;
        this.A05.BkM(new C71453c8(this.A03, this.A04, location2, this.A02, this.A00, 3));
    }

    public LocationUpdateListener(C159027ky r2, C69263Wi r3, C54292oU r4, C620733j r5, AnonymousClass4FS r6) {
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
    }

    public void A00() {
        disconnectListener();
        connectListener();
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
