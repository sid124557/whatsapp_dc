package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wZ  reason: invalid class name and case insensitive filesystem */
public final class C165127wZ implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C165977xw[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C165977xw(AnonymousClass0x2.A0a(parcel), parcel.readString());
    }
}
