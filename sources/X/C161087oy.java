package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7oy  reason: invalid class name and case insensitive filesystem */
public final class C161087oy {
    public static final ClassLoader A00 = C161087oy.class.getClassLoader();

    public static void A01(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            AnonymousClass001.A15(parcel, parcelable, 0);
        }
    }

    public static void A00(IInterface iInterface, Parcel parcel) {
        IBinder asBinder;
        if (iInterface == null) {
            asBinder = null;
        } else {
            asBinder = iInterface.asBinder();
        }
        parcel.writeStrongBinder(asBinder);
    }
}
