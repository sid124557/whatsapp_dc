package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37y  reason: invalid class name and case insensitive filesystem */
public final class C631037y implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C27991fJ[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18300x5.A1I(parcel);
        return new C27991fJ(parcel.readString());
    }
}
