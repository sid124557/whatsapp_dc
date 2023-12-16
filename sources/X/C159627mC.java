package X;

import android.os.BadParcelableException;
import android.os.Parcel;

/* renamed from: X.7mC  reason: invalid class name and case insensitive filesystem */
public final class C159627mC {
    public static final ClassLoader A00 = C159627mC.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(AnonymousClass000.A0Y("Parcel data not fully consumed, unread size: ", AnonymousClass001.A0o(), dataAvail));
        }
    }
}
