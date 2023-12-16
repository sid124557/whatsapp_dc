package com.whatsapp.businessdirectory.util;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.AnonymousClass5OI;
import X.AnonymousClass5ZR;
import X.AnonymousClass6B1;
import X.C117125rQ;
import X.C126966Qc;
import X.C155807fX;
import X.C15910sA;
import X.C162457s7;
import X.C17290vH;
import X.C181698nB;
import X.C18260x0;
import X.C54292oU;
import X.C620633i;
import X.C620733j;
import X.C69263Wi;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;

public final class DirectoryGPSLocationManager implements C17290vH, LocationListener {
    public LocationManager A00;
    public C126966Qc A01;
    public Integer A02;
    public final Handler A03 = new Handler();
    public final Handler A04 = new Handler();
    public final AnonymousClass08M A05 = AnonymousClass08M.A01();
    public final C69263Wi A06;
    public final C181698nB A07;
    public final C155807fX A08 = new C155807fX(this);
    public final AnonymousClass5OI A09;
    public final C620633i A0A;
    public final C54292oU A0B;
    public final AnonymousClass5ZR A0C;
    public final C620733j A0D;
    public final AnonymousClass1VX A0E;
    public final AnonymousClass4FS A0F;
    public final Runnable A0G = new C117125rQ(this, 21);
    public final Runnable A0H = new C117125rQ(this, 22);
    public final String A0I;

    public void BQu(C15910sA r2) {
        C162457s7.A0J(r2, 0);
        A01();
    }

    public void BXj(C15910sA r2) {
        C162457s7.A0J(r2, 0);
        A01();
    }

    public void BaY(C15910sA r3) {
        C162457s7.A0J(r3, 0);
        if (this.A0C.A05()) {
            A03(0);
        }
    }

    public void onLocationChanged(Location location) {
        C162457s7.A0J(location, 0);
        this.A04.removeCallbacks(this.A0H);
        A04(location);
    }

    public static final LocationRequest A00() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.A08 = true;
        locationRequest.A03 = 1000;
        if (!locationRequest.A07) {
            locationRequest.A04 = (long) (((double) 1000) / 6.0d);
        }
        locationRequest.A07 = true;
        locationRequest.A04 = 1000;
        locationRequest.A01 = 100;
        return locationRequest;
    }

    public void A01() {
        LocationManager locationManager;
        C126966Qc r1 = this.A01;
        if (r1 != null) {
            r1.A04(this.A08);
        }
        if (this.A0C.A05() && (locationManager = this.A00) != null) {
            locationManager.removeUpdates(this);
        }
        this.A03.removeCallbacks(this.A0G);
        this.A04.removeCallbacks(this.A0H);
    }

    public final void A02() {
        Handler handler = this.A04;
        Runnable runnable = this.A0H;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 10000);
        try {
            if (this.A00 == null || this.A0C.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                A05("Fine location permission not granted");
            } else {
                LocationManager locationManager = this.A00;
                if (locationManager != null) {
                    locationManager.requestLocationUpdates("gps", 1000, 0.0f, this);
                }
            }
            if (this.A00 == null || this.A0C.A02("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                A05("Coarse location permission not granted");
                return;
            }
            LocationManager locationManager2 = this.A00;
            if (locationManager2 != null) {
                locationManager2.requestLocationUpdates("network", 1000, 0.0f, this);
            }
        } catch (RuntimeException e) {
            A05(AnonymousClass000.A0a("Updates from location services failed : ", AnonymousClass001.A0o(), e));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
        if (r1.isProviderEnabled("network") == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0074, code lost:
        A05("Location providers unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0055, code lost:
        if (r1 != null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int r20) {
        /*
            r19 = this;
            r4 = r19
            X.5ZR r0 = r4.A0C
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Location access not granted"
            r4.A05(r0)
            return
        L_0x0010:
            X.7BT r1 = new X.7BT
            r1.<init>()
            X.2oU r0 = r4.A0B
            android.content.Context r5 = r0.A00
            X.6QZ r6 = new X.6QZ
            r6.<init>(r5)
            java.util.ArrayList r3 = r1.A00
            r1 = 0
            r0 = 0
            X.6SM r2 = new X.6SM
            r2.<init>(r0, r3, r1, r1)
            X.7iN r1 = new X.7iN
            r1.<init>(r0)
            X.89Q r0 = new X.89Q
            r0.<init>(r2)
            r1.A01 = r0
            r0 = 2426(0x97a, float:3.4E-42)
            r1.A00 = r0
            X.7Sp r1 = r1.A00()
            r0 = 0
            com.google.android.gms.tasks.Task r1 = r6.A02(r1, r0)
            r14 = 0
            X.91z r0 = new X.91z
            r0.<init>(r4, r14)
            r1.addOnFailureListener(r0)
            android.location.LocationManager r1 = r4.A00
            if (r1 != 0) goto L_0x0057
            X.33i r0 = r4.A0A
            android.location.LocationManager r1 = r0.A0F()
            r4.A00 = r1
            if (r1 == 0) goto L_0x0074
        L_0x0057:
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 == 0) goto L_0x0074
        L_0x0067:
            r1 = r20
            if (r20 == 0) goto L_0x007a
            r0 = 1
            if (r1 == r0) goto L_0x015f
            java.lang.Runnable r0 = r4.A0H
            r0.run()
            return
        L_0x0074:
            java.lang.String r0 = "Location providers unavailable"
            r4.A05(r0)
            goto L_0x0067
        L_0x007a:
            int r0 = X.C159787mS.A00(r5)
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r0 == 0) goto L_0x015f
            android.os.Handler r3 = r4.A03
            java.lang.Runnable r2 = r4.A0G
            r3.removeCallbacks(r2)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.postDelayed(r2, r0)
            X.6Qc r3 = r4.A01
            if (r3 != 0) goto L_0x009b
            X.6Qc r3 = new X.6Qc
            r3.<init>(r5)
            r4.A01 = r3
        L_0x009b:
            com.google.android.gms.location.LocationRequest r7 = A00()
            X.7fX r2 = r4.A08
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r8 = 0
            java.util.List r11 = X.AnonymousClass6TG.A0B
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.6TG r6 = new X.6TG
            r10 = r8
            r16 = r14
            r17 = r14
            r18 = r14
            r9 = r8
            r15 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            if (r5 != 0) goto L_0x00ce
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "Can't create handler inside thread that has not called Looper.prepare()"
            X.C162177rO.A04(r0, r1)
            android.os.Looper r5 = android.os.Looper.myLooper()
        L_0x00ce:
            java.lang.Class<X.7fX> r0 = X.C155807fX.class
            java.lang.String r4 = r0.getSimpleName()
            java.lang.String r0 = "Listener must not be null"
            X.C162177rO.A03(r2, r0)
            java.lang.String r0 = "Looper must not be null"
            X.C162177rO.A03(r5, r0)
            java.lang.String r0 = "Listener type must not be null"
            X.C162177rO.A03(r4, r0)
            X.7Jn r1 = new X.7Jn
            r1.<init>(r5, r2, r4)
            X.89Z r0 = new X.89Z
            r0.<init>(r1, r3)
            X.89Y r9 = new X.89Y
            r10 = r1
            r11 = r6
            r12 = r3
            r13 = r0
            r14 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            X.7h6 r5 = new X.7h6
            r5.<init>(r8)
            r5.A02 = r9
            r5.A03 = r0
            r5.A01 = r1
            r0 = 2436(0x984, float:3.414E-42)
            r5.A00 = r0
            X.7Vg r2 = r1.A01
            java.lang.String r0 = "Key must not be null"
            X.C162177rO.A03(r2, r0)
            X.7Jn r1 = r5.A01
            int r0 = r5.A00
            X.7Jr r4 = new X.7Jr
            r4.<init>(r1, r5, r0)
            X.7GJ r1 = new X.7GJ
            r1.<init>(r2, r5)
            java.lang.Runnable r0 = r5.A04
            X.7Jo r2 = new X.7Jo
            r2.<init>(r4, r1, r0)
            X.7Jr r6 = r2.A00
            X.7Jn r0 = r6.A01
            X.7Vg r0 = r0.A01
            java.lang.String r1 = "Listener has already been released."
            X.C162177rO.A03(r0, r1)
            X.7GJ r4 = r2.A01
            X.7Vg r0 = r4.A00
            X.C162177rO.A03(r0, r1)
            X.7t7 r5 = r3.A07
            java.lang.Runnable r2 = r2.A02
            X.7Xf r1 = new X.7Xf
            r1.<init>()
            int r0 = r6.A00
            r5.A06(r3, r1, r0)
            X.7Jq r0 = new X.7Jq
            r0.<init>(r6, r4, r2)
            X.6RD r4 = new X.6RD
            r4.<init>(r0, r1)
            android.os.Handler r2 = r5.A06
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0D
            int r0 = r0.get()
            X.7Jp r1 = new X.7Jp
            r1.<init>(r3, r4, r0)
            r0 = 8
            X.AnonymousClass6C7.A10(r2, r1, r0)
            return
        L_0x015f:
            r4.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager.A03(int):void");
    }

    public final void A04(Location location) {
        this.A09.A00(new AnonymousClass6B1(location, 1, this), location.getLatitude(), location.getLongitude());
    }

    public /* synthetic */ void Bcn(C15910sA r1) {
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public DirectoryGPSLocationManager(C69263Wi r3, C181698nB r4, AnonymousClass5OI r5, C620633i r6, C54292oU r7, AnonymousClass5ZR r8, C620733j r9, AnonymousClass1VX r10, AnonymousClass4FS r11, String str) {
        C18260x0.A0f(r3, r10, r7, r11, r6);
        C162457s7.A0J(r9, 6);
        C162457s7.A0J(r8, 8);
        C162457s7.A0J(r4, 9);
        this.A06 = r3;
        this.A0E = r10;
        this.A0B = r7;
        this.A0F = r11;
        this.A0A = r6;
        this.A0D = r9;
        this.A09 = r5;
        this.A0C = r8;
        this.A07 = r4;
        this.A0I = str;
    }

    public final void A05(String str) {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("error_type", "location_error");
        A0t.put("error_description", str);
        Integer num = this.A02;
        if (num != null) {
            this.A07.BK9(A0t, num.intValue(), 51);
        }
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
