package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.08n  reason: invalid class name and case insensitive filesystem */
public class C010408n extends AnonymousClass02J {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(21);
    public String A00;

    public C010408n(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }

    public C010408n(Parcelable parcelable) {
        super(parcelable);
    }
}
