package com.google.android.gms.common.api;

import X.C162177rO;
import X.C162417s1;
import X.C163467tr;
import X.C1695389r;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends C1695389r implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C163467tr();
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.A01.equals(((Scope) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        return this.A01;
    }

    public Scope(int i, String str) {
        C162177rO.A07(str, "scopeUri must not be null or empty");
        this.A00 = i;
        this.A01 = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A07(parcel, 1, this.A00);
        C1695389r.A04(parcel, this.A01, A002);
    }
}
