package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xl  reason: invalid class name and case insensitive filesystem */
public class C165867xl implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(23);
    public final long A00;
    public final long A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public C165867xl(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
