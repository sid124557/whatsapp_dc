package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.4NJ  reason: invalid class name */
public class AnonymousClass4NJ extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(97);
    public int A00;
    public int A01;
    public boolean A02;

    public AnonymousClass4NJ(Parcel parcel) {
        super(parcel);
        this.A02 = AnonymousClass001.A1T(parcel.readInt());
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public AnonymousClass4NJ(Parcelable parcelable) {
        super(parcelable);
    }
}
