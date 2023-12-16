package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.08s  reason: invalid class name and case insensitive filesystem */
public class C010808s extends AnonymousClass02J {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(26);
    public int A00;
    public int A01;
    public int A02;

    public C010808s(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public C010808s(Parcelable parcelable) {
        super(parcelable);
    }
}
