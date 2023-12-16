package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37g  reason: invalid class name and case insensitive filesystem */
public final class C629237g implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C633238u[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A04 = C18310x6.A04(parcel);
        boolean booleanValue = AnonymousClass29S.A00(parcel).booleanValue();
        return new C633238u(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), A04, booleanValue);
    }
}
