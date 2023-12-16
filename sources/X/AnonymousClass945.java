package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.945  reason: invalid class name */
public class AnonymousClass945 extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C204589pb(9);
    public float A00;
    public float A01;

    public AnonymousClass945(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public AnonymousClass945(Parcelable parcelable) {
        super(parcelable);
    }
}
