package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xF  reason: invalid class name and case insensitive filesystem */
public final class C165547xF implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        C133806hy r2 = new C133806hy();
        r2.A0V(parcel);
        r2.A00 = parcel.readLong();
        r2.A01 = parcel.readString();
        return r2;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C133806hy[i];
    }
}
