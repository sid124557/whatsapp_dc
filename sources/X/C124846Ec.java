package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.6Ec  reason: invalid class name and case insensitive filesystem */
public class C124846Ec extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(77);
    public int A00;

    public C124846Ec(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public C124846Ec(Parcelable parcelable) {
        super(parcelable);
    }
}
