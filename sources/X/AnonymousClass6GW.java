package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6GW  reason: invalid class name */
public class AnonymousClass6GW extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C1897092i(5);
    public Bundle A00;

    public AnonymousClass6GW(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.A00);
    }

    public AnonymousClass6GW(Parcelable parcelable) {
        super(parcelable);
    }
}
