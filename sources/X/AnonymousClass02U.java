package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.02U  reason: invalid class name */
public class AnonymousClass02U extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C18240wy(7);
    public int A00;
    public int A01;
    public Parcelable A02;

    public AnonymousClass02U(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readParcelable(classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public AnonymousClass02U(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readParcelable((ClassLoader) null);
    }

    public AnonymousClass02U(Parcelable parcelable) {
        super(parcelable);
    }
}
