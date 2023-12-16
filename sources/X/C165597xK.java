package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7xK  reason: invalid class name and case insensitive filesystem */
public final class C165597xK implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C165897xo[i];
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new C165897xo((C165817xg) C18280x3.A0C(parcel, C165897xo.class), AnonymousClass0x2.A0a(parcel), parcel.readString(), parcel.readString(), AnonymousClass000.A1S(parcel.readInt()));
    }
}
