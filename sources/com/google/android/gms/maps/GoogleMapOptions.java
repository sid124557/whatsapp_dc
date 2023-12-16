package com.google.android.gms.maps;

import X.AnonymousClass6C9;
import X.C151567Vh;
import X.C162417s1;
import X.C164297vE;
import X.C1695389r;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends C1695389r implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C164297vE();
    public int A00 = -1;
    public CameraPosition A01;
    public LatLngBounds A02 = null;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Float A0F = null;
    public Float A0G = null;

    public static byte A00(Boolean bool) {
        if (bool != null) {
            return AnonymousClass6C9.A1L(bool.booleanValue() ? 1 : 0) ? (byte) 1 : 0;
        }
        return -1;
    }

    public static Boolean A01(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public String toString() {
        C151567Vh r2 = new C151567Vh(this);
        r2.A00(Integer.valueOf(this.A00), "MapType");
        r2.A00(this.A0B, "LiteMode");
        r2.A00(this.A01, "Camera");
        r2.A00(this.A06, "CompassEnabled");
        r2.A00(this.A05, "ZoomControlsEnabled");
        r2.A00(this.A07, "ScrollGesturesEnabled");
        r2.A00(this.A08, "ZoomGesturesEnabled");
        r2.A00(this.A09, "TiltGesturesEnabled");
        r2.A00(this.A0A, "RotateGesturesEnabled");
        r2.A00(this.A0E, "ScrollGesturesEnabledDuringRotateOrZoom");
        r2.A00(this.A0C, "MapToolbarEnabled");
        r2.A00(this.A0D, "AmbientEnabled");
        r2.A00(this.A0F, "MinZoomPreference");
        r2.A00(this.A0G, "MaxZoomPreference");
        r2.A00(this.A02, "LatLngBoundsForCameraTarget");
        r2.A00(this.A03, "ZOrderOnTop");
        r2.A00(this.A04, "UseViewLifecycleInFragment");
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A04(parcel, A00(this.A03), 2);
        C162417s1.A04(parcel, A00(this.A04), 3);
        C162417s1.A07(parcel, 4, this.A00);
        C162417s1.A0A(parcel, this.A01, 5, i, false);
        C162417s1.A04(parcel, A00(this.A05), 6);
        C162417s1.A04(parcel, A00(this.A06), 7);
        C162417s1.A04(parcel, A00(this.A07), 8);
        C162417s1.A04(parcel, A00(this.A08), 9);
        C162417s1.A04(parcel, A00(this.A09), 10);
        C162417s1.A04(parcel, A00(this.A0A), 11);
        C162417s1.A04(parcel, A00(this.A0B), 12);
        C162417s1.A04(parcel, A00(this.A0C), 14);
        C162417s1.A04(parcel, A00(this.A0D), 15);
        Float f = this.A0F;
        if (f != null) {
            parcel.writeInt(262160);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.A0G;
        if (f2 != null) {
            parcel.writeInt(262161);
            parcel.writeFloat(f2.floatValue());
        }
        C162417s1.A0A(parcel, this.A02, 18, i, false);
        C162417s1.A04(parcel, A00(this.A0E), 19);
        C162417s1.A06(parcel, A002);
    }

    public GoogleMapOptions(CameraPosition cameraPosition, LatLngBounds latLngBounds, Float f, Float f2, byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, int i) {
        this.A03 = A01(b);
        this.A04 = A01(b2);
        this.A00 = i;
        this.A01 = cameraPosition;
        this.A05 = A01(b3);
        this.A06 = A01(b4);
        this.A07 = A01(b5);
        this.A08 = A01(b6);
        this.A09 = A01(b7);
        this.A0A = A01(b8);
        this.A0B = A01(b9);
        this.A0C = A01(b10);
        this.A0D = A01(b11);
        this.A0F = f;
        this.A0G = f2;
        this.A02 = latLngBounds;
        this.A0E = A01(b12);
    }

    public GoogleMapOptions() {
    }
}
