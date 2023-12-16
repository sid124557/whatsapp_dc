package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wR  reason: invalid class name and case insensitive filesystem */
public final class C165047wR implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C162457s7.A0J(parcel, 0);
        return new C131996eW(AnonymousClass59G.valueOf(parcel.readString()), (C109015dw) C18280x3.A0C(parcel, C131996eW.class), parcel.readInt());
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C131996eW[i];
    }
}
