package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wl  reason: invalid class name and case insensitive filesystem */
public final class C165247wl implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        return new C109035dy(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C109035dy[i];
    }
}
