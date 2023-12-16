package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yN  reason: invalid class name and case insensitive filesystem */
public class C166247yN implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(74);
    public int A00;
    public AnonymousClass6EM A01;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, 0);
    }

    public C166247yN(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (AnonymousClass6EM) C18280x3.A0C(parcel, getClass());
    }

    public C166247yN() {
    }
}
