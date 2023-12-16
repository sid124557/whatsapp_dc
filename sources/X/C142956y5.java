package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6y5  reason: invalid class name and case insensitive filesystem */
public enum C142956y5 implements Parcelable {
    SUPPORTED("supported"),
    NOT_SUPPORTED("not-supported");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    /* access modifiers changed from: public */
    static {
        CREATOR = new C163837uS();
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
    C142956y5(String str) {
        this.zzb = str;
    }
}
