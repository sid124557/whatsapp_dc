package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.08o  reason: invalid class name and case insensitive filesystem */
public class C010508o extends AnonymousClass02J {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(22);
    public String A00;

    public C010508o(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public C010508o(Parcelable parcelable) {
        super(parcelable);
    }
}
