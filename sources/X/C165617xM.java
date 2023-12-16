package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xM  reason: invalid class name and case insensitive filesystem */
public final class C165617xM implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166207yJ[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C166207yJ(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), AnonymousClass29S.A00(parcel).booleanValue());
    }
}
