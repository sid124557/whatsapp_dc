package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xa  reason: invalid class name and case insensitive filesystem */
public final class C165757xa implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108865dg[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C108865dg(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
