package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.08q  reason: invalid class name and case insensitive filesystem */
public class C010708q extends AnonymousClass02J {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(25);
    public int A00;

    public C010708q(Parcelable parcelable, int i) {
        super(parcelable);
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public C010708q(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }
}
