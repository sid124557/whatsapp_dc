package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wm  reason: invalid class name and case insensitive filesystem */
public final class C165257wm implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C109045dz[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C109045dz(parcel.readLong(), AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString());
    }
}
