package com.google.android.gms.fido.common;

import X.AnonymousClass002;
import X.C143186yT;
import X.C163677uC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public enum Transport implements ReflectedParcelable {
    HYBRID("cable");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    /* access modifiers changed from: public */
    static {
        CREATOR = new C163677uC();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    /* access modifiers changed from: public */
    Transport(String str) {
        this.zzb = str;
    }

    public static Transport A00(String str) {
        for (Transport transport : values()) {
            if (str.equals(transport.zzb)) {
                return transport;
            }
        }
        if (str.equals("hybrid")) {
            return HYBRID;
        }
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = str;
        throw new C143186yT(String.format("Transport %s not supported", A0L));
    }
}
