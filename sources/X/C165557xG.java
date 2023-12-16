package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xG  reason: invalid class name and case insensitive filesystem */
public final class C165557xG implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        C133816hz r1 = new C133816hz();
        r1.A0V(parcel);
        r1.A04 = parcel.readString();
        r1.A03 = parcel.readString();
        return r1;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C133816hz[i];
    }
}
