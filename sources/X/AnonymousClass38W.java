package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.38W  reason: invalid class name */
public final class AnonymousClass38W implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38H();
    public final String A00;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
    }

    public AnonymousClass38W(String str) {
        this.A00 = str;
    }

    public int describeContents() {
        return 0;
    }
}
