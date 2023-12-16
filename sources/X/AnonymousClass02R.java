package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.02R  reason: invalid class name */
public class AnonymousClass02R extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(14);
    public boolean A00;

    public AnonymousClass02R(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass000.A1S(parcel.readByte());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
    }

    public AnonymousClass02R(Parcelable parcelable) {
        super(parcelable);
    }
}
