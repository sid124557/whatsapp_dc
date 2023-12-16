package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wV  reason: invalid class name and case insensitive filesystem */
public final class C165087wV implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166187yH[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C166187yH(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
