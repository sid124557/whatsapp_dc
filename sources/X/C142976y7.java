package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6y7  reason: invalid class name and case insensitive filesystem */
public enum C142976y7 implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    /* access modifiers changed from: public */
    static {
        CREATOR = new C163887uX();
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
    C142976y7(String str) {
        this.zzb = str;
    }

    public static C142976y7 A00(String str) {
        for (C142976y7 r1 : values()) {
            if (str.equals(r1.zzb)) {
                return r1;
            }
        }
        throw new C143206yV(str);
    }
}
