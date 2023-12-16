package com.google.android.gms.location;

import X.AnonymousClass000;
import X.AnonymousClass0x2;
import X.AnonymousClass6CA;
import X.C162417s1;
import X.C164177v0;
import X.C1695389r;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends C1695389r implements ReflectedParcelable {
    public static final List A01 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new C164177v0();
    public final List A00;

    public boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            List<Location> list = ((LocationResult) obj).A00;
            int size = list.size();
            List list2 = this.A00;
            if (size == list2.size()) {
                Iterator it = list2.iterator();
                for (Location time : list) {
                    if (((Location) it.next()).getTime() != time.getTime()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 17;
        for (Location time : this.A00) {
            i = AnonymousClass0x2.A00(i * 31, time.getTime());
        }
        return i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(valueOf.length() + 27);
        A0Y.append("LocationResult[locations: ");
        return AnonymousClass000.A0W(valueOf, A0Y);
    }

    public LocationResult(List list) {
        this.A00 = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0D(parcel, this.A00, 1, false);
        C162417s1.A06(parcel, A002);
    }
}
