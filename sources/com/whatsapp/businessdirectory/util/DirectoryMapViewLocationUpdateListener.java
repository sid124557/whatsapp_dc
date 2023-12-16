package com.whatsapp.businessdirectory.util;

import X.AnonymousClass08M;
import X.AnonymousClass0GH;
import X.AnonymousClass4FS;
import X.C15110qn;
import X.C159027ky;
import X.C162457s7;
import X.C18260x0;
import X.C54292oU;
import X.C620733j;
import X.C69263Wi;
import X.C71453c8;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;

public final class DirectoryMapViewLocationUpdateListener implements LocationListener, C15110qn {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final C159027ky A01;
    public final C69263Wi A02;
    public final C54292oU A03;
    public final C620733j A04;
    public final AnonymousClass4FS A05;

    @OnLifecycleEvent(AnonymousClass0GH.ON_RESUME)
    private final void connectListener() {
        this.A01.A05(this, "directory_map_view_business_search", 0.0f, 3, 5000, 1000);
    }

    public void onLocationChanged(Location location) {
        C162457s7.A0J(location, 0);
        AnonymousClass4FS r0 = this.A05;
        C54292oU r2 = this.A03;
        C69263Wi r5 = this.A02;
        r0.BkM(new C71453c8(r2, this.A04, location, r5, this.A00, 3));
    }

    @OnLifecycleEvent(AnonymousClass0GH.ON_PAUSE)
    private final void disconnectListener() {
        this.A01.A04(this);
    }

    public DirectoryMapViewLocationUpdateListener(C159027ky r2, C69263Wi r3, C54292oU r4, C620733j r5, AnonymousClass4FS r6) {
        C18260x0.A0f(r3, r4, r6, r5, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void A00() {
        disconnectListener();
        connectListener();
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
