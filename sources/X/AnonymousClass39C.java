package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.39C  reason: invalid class name */
public class AnonymousClass39C implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass4IW.A00(37);
    public long A00;
    public String A01;
    public boolean A02;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public AnonymousClass39C(long j, String str, boolean z) {
        this.A01 = str;
        this.A00 = j;
        this.A02 = z;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass39C(Parcel parcel) {
        String readString = parcel.readString();
        this.A01 = readString == null ? "UNKNOWN" : readString;
        this.A00 = parcel.readLong();
        this.A02 = AnonymousClass001.A1T(parcel.readInt());
    }
}
