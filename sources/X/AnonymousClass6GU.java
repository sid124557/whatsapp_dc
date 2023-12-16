package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6GU  reason: invalid class name */
public class AnonymousClass6GU extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C1897092i(2);
    public boolean A00;

    public AnonymousClass6GU(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            getClass().getClassLoader();
        }
        this.A00 = AnonymousClass001.A1T(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public AnonymousClass6GU(Parcelable parcelable) {
        super(parcelable);
    }
}
