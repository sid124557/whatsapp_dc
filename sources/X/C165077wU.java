package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wU  reason: invalid class name and case insensitive filesystem */
public final class C165077wU implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108815db[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C108815db(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
    }
}
