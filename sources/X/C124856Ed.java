package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.6Ed  reason: invalid class name and case insensitive filesystem */
public class C124856Ed extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(113);
    public final float A00;
    public final int A01;

    public C124856Ed(Parcelable parcelable, float f, int i) {
        super(parcelable);
        this.A01 = i;
        this.A00 = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }

    public C124856Ed(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
    }
}
