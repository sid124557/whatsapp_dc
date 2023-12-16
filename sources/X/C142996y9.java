package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6y9  reason: invalid class name and case insensitive filesystem */
public enum C142996y9 implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    /* access modifiers changed from: public */
    static {
        CREATOR = new C163827uR();
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
    C142996y9(String str) {
        this.zzb = str;
    }

    public static C142996y9 A00(String str) {
        for (C142996y9 r1 : values()) {
            if (str.equals(r1.zzb)) {
                return r1;
            }
        }
        throw new C143246yZ(str);
    }
}
