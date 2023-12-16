package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: X.89r  reason: invalid class name and case insensitive filesystem */
public abstract class C1695389r implements SafeParcelable {
    public static void A03(Parcel parcel, Parcelable parcelable, int i, int i2) {
        C162417s1.A0A(parcel, parcelable, 3, i, false);
        C162417s1.A06(parcel, i2);
    }

    public static void A04(Parcel parcel, String str, int i) {
        C162417s1.A0B(parcel, str, 2, false);
        C162417s1.A06(parcel, i);
    }

    public static boolean A06(Parcel parcel, Parcelable parcelable, int i) {
        C162417s1.A0A(parcel, parcelable, 2, i, false);
        return false;
    }

    public static boolean A07(Parcel parcel, String str) {
        C162417s1.A0B(parcel, str, 2, false);
        return false;
    }

    public static void A05(Parcel parcel, int[] iArr, int i) {
        if (iArr != null) {
            int A01 = C162417s1.A01(parcel, i);
            parcel.writeIntArray(iArr);
            C162417s1.A06(parcel, A01);
        }
    }

    public final int describeContents() {
        return 0;
    }
}
