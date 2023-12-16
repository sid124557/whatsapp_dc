package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.07b  reason: invalid class name and case insensitive filesystem */
public class C008807b extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C18240wy(5);
    public Parcelable A00;

    public C008807b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? C06440Xs.class.getClassLoader() : classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, 0);
    }

    public C008807b(Parcelable parcelable) {
        super(parcelable);
    }
}
