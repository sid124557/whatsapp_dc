package com.google.android.gms.location;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass6CA;
import X.AnonymousClass6TD;
import X.C162417s1;
import X.C164157uy;
import X.C1695389r;
import X.C18310x6;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationAvailability extends C1695389r implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C164157uy();
    @Deprecated
    public int A00;
    @Deprecated
    public int A01;
    public int A02;
    public long A03;
    public AnonymousClass6TD[] A04;

    public int hashCode() {
        Object[] objArr = new Object[5];
        AnonymousClass000.A1L(objArr, this.A02);
        AnonymousClass000.A1M(objArr, this.A00);
        AnonymousClass000.A1N(objArr, this.A01);
        AnonymousClass0x2.A1V(objArr, this.A03);
        return C18310x6.A08(this.A04, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.A00 == locationAvailability.A00 && this.A01 == locationAvailability.A01 && this.A03 == locationAvailability.A03 && this.A02 == locationAvailability.A02 && Arrays.equals(this.A04, locationAvailability.A04)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        boolean A1Y = AnonymousClass001.A1Y(this.A02, 1000);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(48);
        A0Y.append("LocationAvailability[isLocationAvailable: ");
        A0Y.append(A1Y);
        return AnonymousClass000.A0f(A0Y);
    }

    public LocationAvailability(AnonymousClass6TD[] r1, int i, int i2, int i3, long j) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = j;
        this.A04 = r1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C162417s1.A07(parcel, 2, this.A01);
        C162417s1.A08(parcel, 3, this.A03);
        C162417s1.A07(parcel, 4, this.A02);
        C162417s1.A0F(parcel, this.A04, 5, i);
        C162417s1.A06(parcel, A002);
    }
}
