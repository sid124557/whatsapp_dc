package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.393  reason: invalid class name */
public class AnonymousClass393 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(10);
    public final long A00;
    public final String A01;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }

    public AnonymousClass393(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass393(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }
}
