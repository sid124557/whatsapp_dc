package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37p  reason: invalid class name and case insensitive filesystem */
public final class C630137p implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1fI[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18300x5.A1I(parcel);
        return new AnonymousClass1fI(parcel.readString());
    }
}
