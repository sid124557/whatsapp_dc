package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xN  reason: invalid class name and case insensitive filesystem */
public final class C165627xN implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166007xz[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C166007xz(AnonymousClass0x2.A0a(parcel), parcel.readString());
    }
}
