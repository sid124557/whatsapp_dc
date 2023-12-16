package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.02S  reason: invalid class name */
public class AnonymousClass02S extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(32);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public boolean A06;

    public AnonymousClass02S(Parcel parcel) {
        super(parcel);
        this.A04 = parcel.readString();
        this.A00 = parcel.readFloat();
        this.A06 = AnonymousClass001.A1T(parcel.readInt());
        this.A05 = parcel.readString();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
    }

    public AnonymousClass02S(Parcelable parcelable) {
        super(parcelable);
    }
}
