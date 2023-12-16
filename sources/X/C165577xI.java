package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xI  reason: invalid class name and case insensitive filesystem */
public final class C165577xI implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C166167yF[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C166167yF(AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), parcel.readString());
    }
}
