package X;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7q1  reason: invalid class name and case insensitive filesystem */
public final class C161597q1 {
    public static final ClassLoader A00 = C161597q1.class.getClassLoader();

    public static void A01(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            AnonymousClass001.A15(parcel, parcelable, 0);
        }
    }

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(AnonymousClass000.A0Y("Parcel data not fully consumed, unread size: ", AnonymousClass001.A0o(), dataAvail));
        }
    }
}
