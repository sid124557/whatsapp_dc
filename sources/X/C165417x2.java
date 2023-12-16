package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7x2  reason: invalid class name and case insensitive filesystem */
public final class C165417x2 implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166147yD[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C166147yD(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readByte(), parcel.readLong());
    }
}
