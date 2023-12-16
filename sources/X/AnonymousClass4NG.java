package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.4NG  reason: invalid class name */
public class AnonymousClass4NG extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new AnonymousClass91V(78);
    public int A00;

    public AnonymousClass4NG(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass4NG(Parcelable parcelable) {
        super(parcelable);
    }
}
