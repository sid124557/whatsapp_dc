package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xZ  reason: invalid class name and case insensitive filesystem */
public final class C165747xZ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108795dZ[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C108795dZ(C18310x6.A04(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
