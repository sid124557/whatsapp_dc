package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38X  reason: invalid class name */
public final class AnonymousClass38X implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38R();
    public final long A00;
    public final String A01;
    public final String A02;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
    }

    public AnonymousClass38X(long j, String str, String str2) {
        C18260x0.A0Q(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    public int describeContents() {
        return 0;
    }
}
