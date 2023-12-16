package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.08r  reason: invalid class name */
public class AnonymousClass08r extends AnonymousClass02J {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(27);
    public boolean A00;

    public AnonymousClass08r(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass001.A1T(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public AnonymousClass08r(Parcelable parcelable) {
        super(parcelable);
    }
}
