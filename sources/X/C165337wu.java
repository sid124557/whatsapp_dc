package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wu  reason: invalid class name and case insensitive filesystem */
public final class C165337wu implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108775dX[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C108775dX(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readInt(), AnonymousClass29S.A00(parcel).booleanValue());
    }
}
