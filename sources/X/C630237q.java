package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.37q  reason: invalid class name and case insensitive filesystem */
public final class C630237q implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C28051fP[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C18300x5.A1I(parcel);
        return new C28051fP(parcel.readString());
    }
}
