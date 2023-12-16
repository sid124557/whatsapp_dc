package com.google.android.gms.maps.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass6C7;
import X.C151567Vh;
import X.C162177rO;
import X.C162417s1;
import X.C164237v8;
import X.C1695389r;
import X.C18310x6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class LatLngBounds extends C1695389r implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C164237v8();
    public final LatLng A00;
    public final LatLng A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LatLngBounds) {
                LatLngBounds latLngBounds = (LatLngBounds) obj;
                if (!this.A01.equals(latLngBounds.A01) || !this.A00.equals(latLngBounds.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean A00(LatLng latLng) {
        C162177rO.A03(latLng, "point must not be null.");
        double d = latLng.A00;
        LatLng latLng2 = this.A01;
        if (latLng2.A00 > d) {
            return false;
        }
        LatLng latLng3 = this.A00;
        if (d > latLng3.A00) {
            return false;
        }
        double d2 = latLng.A01;
        double d3 = latLng2.A01;
        double d4 = latLng3.A01;
        int i = (d3 > d2 ? 1 : (d3 == d2 ? 0 : -1));
        if (d3 <= d4) {
            if (i > 0) {
                return false;
            }
        } else if (i <= 0) {
            return true;
        }
        if (d2 <= d4) {
            return true;
        }
        return false;
    }

    public String toString() {
        C151567Vh r2 = new C151567Vh(this);
        r2.A00(this.A01, "southwest");
        r2.A00(this.A00, "northeast");
        return r2.toString();
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C162177rO.A03(latLng, "southwest must not be null.");
        C162177rO.A03(latLng2, "northeast must not be null.");
        double d = latLng2.A00;
        double d2 = latLng.A00;
        boolean A1U = AnonymousClass001.A1U((d > d2 ? 1 : (d == d2 ? 0 : -1)));
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = Double.valueOf(d2);
        A0M[1] = Double.valueOf(d);
        if (A1U) {
            this.A01 = latLng;
            this.A00 = latLng2;
            return;
        }
        throw AnonymousClass6C7.A0W("southern latitude exceeds northern latitude (%s > %s)", A0M);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = this.A01;
        return C18310x6.A08(this.A00, A0M, 1);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A00, 3, i, C1695389r.A06(parcel, this.A01, i));
        C162417s1.A06(parcel, A002);
    }
}
