package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wN  reason: invalid class name and case insensitive filesystem */
public final class C165007wN implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108685dO[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C108685dO(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString());
    }
}
