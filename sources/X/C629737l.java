package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37l  reason: invalid class name and case insensitive filesystem */
public final class C629737l implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        boolean booleanValue = AnonymousClass29S.A00(parcel).booleanValue();
        return new C633738z(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), booleanValue);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C633738z[i];
    }
}
