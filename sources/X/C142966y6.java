package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6y6  reason: invalid class name and case insensitive filesystem */
public enum C142966y6 implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    /* access modifiers changed from: public */
    static {
        CREATOR = new C163687uD();
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
    C142966y6(String str) {
        this.zzb = str;
    }

    public static C142966y6 A00(String str) {
        for (C142966y6 r1 : values()) {
            if (str.equals(r1.zzb)) {
                return r1;
            }
        }
        throw new C143196yU(str);
    }
}
