package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wt  reason: invalid class name and case insensitive filesystem */
public final class C165327wt implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166137yC[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C166137yC(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
