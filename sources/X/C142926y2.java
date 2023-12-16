package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6y2  reason: invalid class name and case insensitive filesystem */
public enum C142926y2 implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zze;

    /* access modifiers changed from: public */
    static {
        CREATOR = new C163867uV();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.zze;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zze);
    }

    /* access modifiers changed from: public */
    C142926y2(String str) {
        this.zze = str;
    }
}
