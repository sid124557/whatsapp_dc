package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xX  reason: invalid class name and case insensitive filesystem */
public final class C165727xX implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108565dC[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C108565dC(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), AnonymousClass000.A1S(parcel.readInt()));
    }
}
