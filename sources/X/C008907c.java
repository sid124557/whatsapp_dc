package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.07c  reason: invalid class name and case insensitive filesystem */
public class C008907c extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C18240wy(1);
    public int A00;
    public boolean A01;

    public C008907c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
        this.A01 = AnonymousClass000.A1S(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public C008907c(Parcelable parcelable) {
        super(parcelable);
    }
}
