package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xY  reason: invalid class name and case insensitive filesystem */
public final class C165737xY implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        long readLong = parcel.readLong();
        return new C165887xn(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), readLong, parcel.readLong(), parcel.readLong());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C165887xn[i];
    }
}
